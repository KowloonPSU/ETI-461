package com.movie.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.movie.domain.TV;
import com.movie.service.ITVService;

/**
 * TvController
 * 
 * @author movie
 * @date 2023-04-23
 */
@RestController
@RequestMapping("/bus/TV")
@CrossOrigin("*")
public class TVController
{
    @Autowired
    private ITVService tVService;

    /**
     * 查询Tv列表
     */
    @GetMapping("/list")
    public Map<String, Object> list()
    {
        List<TV> list = tVService.selectTVList(new TV());
        HashMap<String, Object> map = new HashMap<>();
        map.put("rows", list);
        return map;
    }
}
