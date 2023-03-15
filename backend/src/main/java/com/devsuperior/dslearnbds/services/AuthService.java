package com.devsuperior.dslearnbds.services;

import com.devsuperior.dslearnbds.entites.User;
import com.devsuperior.dslearnbds.repositories.UserRepository;
import com.devsuperior.dslearnbds.services.exceptions.ForbiddenException;
import com.devsuperior.dslearnbds.services.exceptions.UnauthorizedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    @Transactional(readOnly = true)
    public User userAuthenticated() {
        try {
            String userEmail = SecurityContextHolder.getContext().getAuthentication().getName();
            return userRepository.findByEmail(userEmail);
        } catch (Exception e) {
            throw new UnauthorizedException("Invalid User");
        }
    }

    public void validateSelfOrAdmin(Long userId) {
        User user = userAuthenticated();
        if (!user.getId().equals(userId) && !user.hasRole("ROLE_ADMIN"))
            throw new ForbiddenException("Access denied");


    }
}

