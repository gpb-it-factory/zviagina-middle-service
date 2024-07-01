package com.middle_service.zviagina_middle_service.user.service;

import com.middle_service.zviagina_middle_service.user.dto.UserRegistrationRequest;
import com.middle_service.zviagina_middle_service.user.infrastructure.UserClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    private final UserClient userClient;

    public UserService(UserClient userClient) {
        this.userClient = userClient;
    }

    public void registerUser(UserRegistrationRequest request) {
        logger.info("Processing user registration for telegramId: {}", request.getTelegramId());
        userClient.registerUser(request);
        logger.info("User registered successfully: {}", request.getTelegramId());
    }
}
