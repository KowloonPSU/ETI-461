package com.movie.service;

import java.util.List;
import com.movie.domain.Movie;

/**
 * movieService接口
 * 
 * @author movie
 * @date 2023-04-23
 */
public interface IMovieService 
{
    /**
     * 查询movie
     * 
     * @param movieName movie主键
     * @return movie
     */
    public Movie selectMovieByMovieName(String movieName);

    /**
     * 查询movie列表
     * 
     * @param movie movie
     * @return movie集合
     */
    public List<Movie> selectMovieList(Movie movie);

    /**
     * 新增movie
     * 
     * @param movie movie
     * @return 结果
     */
    public int insertMovie(Movie movie);

    /**
     * 修改movie
     * 
     * @param movie movie
     * @return 结果
     */
    public int updateMovie(Movie movie);

    /**
     * 批量删除movie
     * 
     * @param movieNames 需要删除的movie主键集合
     * @return 结果
     */
    public int deleteMovieByMovieNames(String[] movieNames);

    /**
     * 删除movie信息
     * 
     * @param movieName movie主键
     * @return 结果
     */
    public int deleteMovieByMovieName(String movieName);
}
