package com.middle_service.zviagina_middle_service.user.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class UserRegistrationRequest {
    @NotNull(message = "Telegram ID is mandatory")
    private Long telegramId;

    @NotBlank(message = "Username is mandatory")
    private String username;

    // Getters and Setters
    public Long getTelegramId() {
        return telegramId;
    }

    public void setTelegramId(Long telegramId) {
        this.telegramId = telegramId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "UserRegistrationRequest{" +
                "telegramId=" + telegramId +
                ", username='" + username + '\'' +
                '}';
    }
}
