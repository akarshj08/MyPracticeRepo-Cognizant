package com.akarshproject.JWT_Auth.and.Security.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class student
{
    @Id
    private int id;
    private String name;
    private int marks;
}