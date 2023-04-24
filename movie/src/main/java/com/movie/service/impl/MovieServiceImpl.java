package com.movie.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.movie.mapper.MovieMapper;
import com.movie.domain.Movie;
import com.movie.service.IMovieService;

/**
 * movieService业务层处理
 * 
 * @author movie
 * @date 2023-04-23
 */
@Service
public class MovieServiceImpl implements IMovieService 
{
    @Autowired
    private MovieMapper movieMapper;

    /**
     * 查询movie
     * 
     * @param movieName movie主键
     * @return movie
     */
    @Override
    public Movie selectMovieByMovieName(String movieName)
    {
        return movieMapper.selectMovieByMovieName(movieName);
    }

    /**
     * 查询movie列表
     * 
     * @param movie movie
     * @return movie
     */
    @Override
    public List<Movie> selectMovieList(Movie movie)
    {
        return movieMapper.selectMovieList(movie);
    }

    /**
     * 新增movie
     * 
     * @param movie movie
     * @return 结果
     */
    @Override
    public int insertMovie(Movie movie)
    {
        return movieMapper.insertMovie(movie);
    }

    /**
     * 修改movie
     * 
     * @param movie movie
     * @return 结果
     */
    @Override
    public int updateMovie(Movie movie)
    {
        return movieMapper.updateMovie(movie);
    }

    /**
     * 批量删除movie
     * 
     * @param movieNames 需要删除的movie主键
     * @return 结果
     */
    @Override
    public int deleteMovieByMovieNames(String[] movieNames)
    {
        return movieMapper.deleteMovieByMovieNames(movieNames);
    }

    /**
     * 删除movie信息
     * 
     * @param movieName movie主键
     * @return 结果
     */
    @Override
    public int deleteMovieByMovieName(String movieName)
    {
        return movieMapper.deleteMovieByMovieName(movieName);
    }
}
