package com.akarshproject.JWT_Auth.and.Security.Service;
import com.akarshproject.JWT_Auth.and.Security.Model.UserPrincipal;
import com.akarshproject.JWT_Auth.and.Security.Model.Users;
import com.akarshproject.JWT_Auth.and.Security.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailService implements UserDetailsService
{

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
    {
        Users user = userRepo.findByUsername(username);
        if(user==null)
        {
            System.out.println("UserNotFound");
            throw new UsernameNotFoundException("User NotFound");
        }
        return new UserPrincipal(user);
    }
}