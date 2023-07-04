package com.testproject.swp.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testproject.swp.exception.custom.CustomBadReqEx;
import com.testproject.swp.exception.custom.CustomNotFoundEx;
import com.testproject.swp.model.dto.user.UserDTOCreate;
import com.testproject.swp.model.dto.user.UserDTOLoginRequest;
import com.testproject.swp.model.dto.user.UserDTOResponse;
import com.testproject.swp.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/api/ccg1")
public class UserController {

    private final UserService userService;

    @PostMapping("/login")
    public Map<String, UserDTOResponse> login(@RequestBody Map<String, UserDTOLoginRequest> userDTOLoginReqMap) throws CustomBadReqEx, CustomNotFoundEx {
        return userService.authenticate(userDTOLoginReqMap);
    }

    @PostMapping("/register")
    public Map<String, UserDTOResponse> registerUser(@RequestBody Map<String, UserDTOCreate> userDTOCreateReqMap) throws CustomBadReqEx, CustomNotFoundEx {
        return userService.registerUser(userDTOCreateReqMap);
    }
}
