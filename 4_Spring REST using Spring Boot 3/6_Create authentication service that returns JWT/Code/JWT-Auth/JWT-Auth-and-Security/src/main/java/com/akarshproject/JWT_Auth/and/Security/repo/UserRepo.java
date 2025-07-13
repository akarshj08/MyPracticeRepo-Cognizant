package com.akarshproject.JWT_Auth.and.Security.repo;
import com.akarshproject.JWT_Auth.and.Security.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Users,Integer>
{
    Users findByUsername(String username);
}