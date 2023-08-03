package com.shopping.config;

import com.shopping.management.entity.Role;
import com.shopping.management.entity.User;
import com.shopping.management.repository.RoleRepository;
import com.shopping.management.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Startup implements CommandLineRunner {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    @Override
    public void run(String... args) throws Exception {
        addRoleDemoData();
        addUserDemoData();
    }

    public void addUserDemoData() {
        if (userRepository.findAll().isEmpty()) {
            userRepository.save(new User("Bashir", "J", "Bashir@gmail.com", "123456", roleRepository.findAll()));
        }
    }

    public void addRoleDemoData() {
        if (roleRepository.findAll().isEmpty()) {
            roleRepository.save(new Role("Admin"));
            roleRepository.save(new Role("User"));
        }
    }
}
