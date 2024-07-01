package com.middle_service.zviagina_middle_service.user.infrastructure;

import com.middle_service.zviagina_middle_service.user.dto.UserRegistrationRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.client.HttpClientErrorException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class UserClient {
    private static final Logger logger = LoggerFactory.getLogger(UserClient.class);
    private final RestTemplate restTemplate;
    private final String backendUrl = "http://158.160.13.4:8082"; // базовый URL бэкэнда

    public UserClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public void registerUser(UserRegistrationRequest request) {
        try {
            restTemplate.postForObject(backendUrl + "/users", request, Void.class);
            logger.info("Successfully registered user with telegramId: {}", request.getTelegramId());
        } catch (HttpClientErrorException e) {
            logger.error("Error while calling backend for user registration", e);
            throw e;
        }
    }
}
