package com.deepesh.userservice;

import com.deepesh.userservice.entity.User;
import com.deepesh.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserServiceApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        this.userRepository.save(new User("Deepesh","Subedi","Deepesh@gmail.com"));
        this.userRepository.save(new User("Rama","Subedi","rama@gmail.com"));
        this.userRepository.save(new User("Ashmita","Subedi","ashmita@gmail.com"));

    }



}
