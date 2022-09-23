package com.example.usermanagementdemo.userRepo;

import com.example.usermanagementdemo.model.User;
import org.springframework.core.convert.Property;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UserRepo extends JpaRepository<User,Long> {
}
