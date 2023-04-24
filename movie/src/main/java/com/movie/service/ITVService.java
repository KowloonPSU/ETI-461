package com.movie.service;

import java.util.List;
import com.movie.domain.TV;

/**
 * TvService接口
 * 
 * @author movie
 * @date 2023-04-23
 */
public interface ITVService 
{
    /**
     * 查询Tv
     * 
     * @param tvName Tv主键
     * @return Tv
     */
    public TV selectTVByTvName(String tvName);

    /**
     * 查询Tv列表
     * 
     * @param tV Tv
     * @return Tv集合
     */
    public List<TV> selectTVList(TV tV);

    /**
     * 新增Tv
     * 
     * @param tV Tv
     * @return 结果
     */
    public int insertTV(TV tV);

    /**
     * 修改Tv
     * 
     * @param tV Tv
     * @return 结果
     */
    public int updateTV(TV tV);

    /**
     * 批量删除Tv
     * 
     * @param tvNames 需要删除的Tv主键集合
     * @return 结果
     */
    public int deleteTVByTvNames(String[] tvNames);

    /**
     * 删除Tv信息
     * 
     * @param tvName Tv主键
     * @return 结果
     */
    public int deleteTVByTvName(String tvName);
}
