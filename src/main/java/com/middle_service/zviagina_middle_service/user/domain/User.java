package com.middle_service.zviagina_middle_service.user.domain;

public class User {
    private Long telegramId;
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
        return "User{" +
                "telegramId=" + telegramId +
                ", username='" + username + '\'' +
                '}';
    }
}
