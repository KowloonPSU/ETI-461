package com.movie.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.movie.domain.User;
import com.movie.service.IUserService;

/**
 * userController
 * 
 * @author movie
 * @date 2023-04-23
 */
@RestController
@RequestMapping("/bus/User")
@CrossOrigin("*")
public class UserController
{
    @Autowired
    private IUserService userService;

    /**
     * 查询user列表
     */
    @GetMapping("/list")
    public Map<String, Object> list(User user)
    {
        List<User> list = userService.selectUserList(user);
        HashMap<String, Object> map = new HashMap<>();
        map.put("rows", list);
        return map;
    }

}
