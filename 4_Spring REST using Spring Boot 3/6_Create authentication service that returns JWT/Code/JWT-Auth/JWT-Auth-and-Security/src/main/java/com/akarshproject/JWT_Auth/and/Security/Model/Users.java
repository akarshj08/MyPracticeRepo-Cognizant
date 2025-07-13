package com.akarshproject.JWT_Auth.and.Security.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Users
{
    @Id
    private int id;
    private String username;
    private String password;
}