package com.movie.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.movie.mapper.TVMapper;
import com.movie.domain.TV;
import com.movie.service.ITVService;

/**
 * TvService业务层处理
 * 
 * @author movie
 * @date 2023-04-23
 */
@Service
public class TVServiceImpl implements ITVService 
{
    @Autowired
    private TVMapper tVMapper;

    /**
     * 查询Tv
     * 
     * @param tvName Tv主键
     * @return Tv
     */
    @Override
    public TV selectTVByTvName(String tvName)
    {
        return tVMapper.selectTVByTvName(tvName);
    }

    /**
     * 查询Tv列表
     * 
     * @param tV Tv
     * @return Tv
     */
    @Override
    public List<TV> selectTVList(TV tV)
    {
        return tVMapper.selectTVList(tV);
    }

    /**
     * 新增Tv
     * 
     * @param tV Tv
     * @return 结果
     */
    @Override
    public int insertTV(TV tV)
    {
        return tVMapper.insertTV(tV);
    }

    /**
     * 修改Tv
     * 
     * @param tV Tv
     * @return 结果
     */
    @Override
    public int updateTV(TV tV)
    {
        return tVMapper.updateTV(tV);
    }

    /**
     * 批量删除Tv
     * 
     * @param tvNames 需要删除的Tv主键
     * @return 结果
     */
    @Override
    public int deleteTVByTvNames(String[] tvNames)
    {
        return tVMapper.deleteTVByTvNames(tvNames);
    }

    /**
     * 删除Tv信息
     * 
     * @param tvName Tv主键
     * @return 结果
     */
    @Override
    public int deleteTVByTvName(String tvName)
    {
        return tVMapper.deleteTVByTvName(tvName);
    }
}
