package com.movie.controller;

import com.movie.domain.Media;
import com.movie.domain.Movie;
import com.movie.domain.TV;
import com.movie.service.IMovieService;
import com.movie.service.ITVService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * movieController
 * 
 * @author movie
 * @date 2023-04-23
 */
@RestController
@RequestMapping("/bus/media")
@CrossOrigin("*")
public class MediaController
{
    @Autowired
    private IMovieService movieService;

    @Autowired
    private ITVService tVService;

    /**
     * 查询media列表
     */
    @PostMapping("/list")
    public Map<String,Object> list(@RequestBody Media mediaVo)
    {

        List<Movie> movieList = movieService.selectMovieList(new Movie());

        List<TV> tvList = tVService.selectTVList(new TV());

        List<Media> list = new ArrayList<>();

        /**
         * year: "",
         *                     language: "",
         *                     name: ""
         */
        for (Movie movie : movieList) {
            if (mediaVo.getYear()!= null){
                if (!movie.getMovieYear().equals(mediaVo.getYear())){
                    continue;
                }
            }
            if (mediaVo.getLanguage()!= null){
                if (!movie.getMovieLanguage().equals(mediaVo.getLanguage())){
                    continue;
                }
            }
            if (mediaVo.getName()!= null){
                if (!movie.getMovieName().contains(mediaVo.getName())){
                    continue;
                }
            }
            Media media = new Media();
            media.setCc(movie.getMovieCc());
            media.setDirector(movie.getMovieDirector());
            media.setLanguage(movie.getMovieLanguage());
            media.setGenre(movie.getMovieGenre());
            media.setName(movie.getMovieName());
            media.setYear(movie.getMovieYear());
            media.setLength(movie.getMovieLength());
            media.setType(1);
            list.add(media);
        }

        for (TV movie : tvList) {
            if (mediaVo.getYear()!= null){
                if (!movie.getTvYear().equals(mediaVo.getYear())){
                    continue;
                }
            }
            if (mediaVo.getLanguage()!= null){
                if (!movie.getTvLanguage().equals(mediaVo.getLanguage())){
                    continue;
                }
            }
            if (mediaVo.getName()!= null){
                if (!movie.getTvName().contains(mediaVo.getName())){
                    continue;
                }
            }
            Media media = new Media();
            media.setCc(movie.getTvCc());
            media.setDirector(movie.getTvDirector());
            media.setLanguage(movie.getTvLanguage());
            media.setGenre(movie.getTvGenre());
            media.setName(movie.getTvName());
            media.setYear(movie.getTvYear());
            media.setLength(movie.getTvLength());
            media.setType(0);
            list.add(media);
        }

        HashMap<String, Object> map = new HashMap<>();
        map.put("rows", list);
        return map;
    }
}
