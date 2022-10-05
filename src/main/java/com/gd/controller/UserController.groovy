package com.gd.controller

import com.gd.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/user")
class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUserNameById")
    def getUserNameById(String userId) {
        return userService.getNameById(userId)
    }

}
