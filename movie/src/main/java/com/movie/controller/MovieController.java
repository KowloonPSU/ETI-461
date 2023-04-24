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
import com.movie.domain.Movie;
import com.movie.service.IMovieService;
/**
 * movieController
 * 
 * @author movie
 * @date 2023-04-23
 */
@RestController
@RequestMapping("/bus/Movie")
@CrossOrigin("*")
public class MovieController
{
    @Autowired
    private IMovieService movieService;

    /**
     * 查询movie列表
     */
    @GetMapping("/list")
    public Map<String,Object> list()
    {
        List<Movie> list = movieService.selectMovieList(new Movie());
        HashMap<String, Object> map = new HashMap<>();
        map.put("rows", list);
        return map;
    }
}
