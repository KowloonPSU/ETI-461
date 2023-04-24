package com.movie.mapper;

import java.util.List;
import com.movie.domain.Movie;

/**
 * movieMapper接口
 * 
 * @author movie
 * @date 2023-04-23
 */
public interface MovieMapper 
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
     * 删除movie
     * 
     * @param movieName movie主键
     * @return 结果
     */
    public int deleteMovieByMovieName(String movieName);

    /**
     * 批量删除movie
     * 
     * @param movieNames 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMovieByMovieNames(String[] movieNames);
}
