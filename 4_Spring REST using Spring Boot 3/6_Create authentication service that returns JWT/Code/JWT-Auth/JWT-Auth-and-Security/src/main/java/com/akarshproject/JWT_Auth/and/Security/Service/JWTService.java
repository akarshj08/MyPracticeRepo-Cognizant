package com.akarshproject.JWT_Auth.and.Security.Service;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

@Service
public class JWTService
{
    private String secretKey = "";

    public JWTService()
    {
        try
        {
            KeyGenerator keyGen = KeyGenerator.getInstance("HmacSHA256");
            SecretKey sk = keyGen.generateKey();
            secretKey = Base64.getEncoder().encodeToString(sk.getEncoded());
        }
        catch (NoSuchAlgorithmException e)
        {
            throw new RuntimeException(e);
        }
    }

    public String generateToken(String username)
    {
        Map<String,Object> claims = new HashMap<>();
        return Jwts.builder()
                .claims()
                .add(claims)
                .subject(username)
                .issuedAt(new Date(System.currentTimeMillis()))
                .expiration(new Date(System.currentTimeMillis()+60*60*30))
                .and()
                .signWith(getKey())
                .compact();
    }

    private SecretKey getKey()
    {
        byte[] bytes = Decoders.BASE64.decode(secretKey);
        return Keys.hmacShaKeyFor(bytes);
    }

    public String extractUsername(String Token)
    {
        return extractClaim(Token, Claims::getSubject);
    }

    private <T> T extractClaim(String Token, Function<Claims, T> claimResolver)
    {
        final Claims claims = extractALlClaims(Token);
        return claimResolver.apply(claims);
    }

    private Claims extractALlClaims(String Token)
    {
        return Jwts.parser()
                .verifyWith(getKey())
                .build()
                .parseSignedClaims(Token)
                .getPayload();
    }

    public boolean validateToken(String Token, UserDetails userDetails)
    {
        final String username = extractUsername(Token);
        return (username.equals(userDetails.getUsername())&&!isTokenExpired(Token));
    }

    private boolean isTokenExpired(String Token)
    {
        return extractExpiration(Token).before(new Date());
    }

    private Date extractExpiration(String Token)
    {
        return extractClaim(Token,Claims::getExpiration);
    }
}