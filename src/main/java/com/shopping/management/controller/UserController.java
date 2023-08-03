package com.shopping.management.controller;

import com.shopping.management.dto.UserDto;
import com.shopping.management.entity.User;
import com.shopping.management.mapper.UserMapper;
import com.shopping.management.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    private final UserMapper userMapper;


    @GetMapping("/all")
    public ResponseEntity<List<UserDto>> all() {
        List<UserDto> userDtos = userMapper.map(userService.findAll());
        List<User> users = userMapper.unMap(userDtos);
        System.out.println(users.get(0));
        return  ResponseEntity.ok(userDtos);
    }
}
