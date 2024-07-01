//package com.middle_service.zviagina_middle_service.user.usecase;
//
//import com.middle_service.zviagina_middle_service.user.dto.UserRegistrationRequest;
//import com.middle_service.zviagina_middle_service.user.dto.UserRegistrationResponse;
//import com.middle_service.zviagina_middle_service.user.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class RegisterUserUseCase {
//
//    private final UserService userService;
//
//    @Autowired
//    public RegisterUserUseCase(UserService userService) {
//        this.userService = userService;
//    }
//
//    public UserRegistrationResponse registerUser(UserRegistrationRequest request) {
//        return userService.registerUser(request);
//    }
//}
