package com.movie.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.movie.mapper.UserMapper;
import com.movie.domain.User;
import com.movie.service.IUserService;

/**
 * userService业务层处理
 * 
 * @author movie
 * @date 2023-04-23
 */
@Service
public class UserServiceImpl implements IUserService 
{
    @Autowired
    private UserMapper userMapper;

    /**
     * 查询user
     * 
     * @param userId user主键
     * @return user
     */
    @Override
    public User selectUserByUserId(String userId)
    {
        return userMapper.selectUserByUserId(userId);
    }

    /**
     * 查询user列表
     * 
     * @param user user
     * @return user
     */
    @Override
    public List<User> selectUserList(User user)
    {
        return userMapper.selectUserList(user);
    }

    /**
     * 新增user
     * 
     * @param user user
     * @return 结果
     */
    @Override
    public int insertUser(User user)
    {
        return userMapper.insertUser(user);
    }

    /**
     * 修改user
     * 
     * @param user user
     * @return 结果
     */
    @Override
    public int updateUser(User user)
    {
        return userMapper.updateUser(user);
    }

    /**
     * 批量删除user
     * 
     * @param userIds 需要删除的user主键
     * @return 结果
     */
    @Override
    public int deleteUserByUserIds(String[] userIds)
    {
        return userMapper.deleteUserByUserIds(userIds);
    }

    /**
     * 删除user信息
     * 
     * @param userId user主键
     * @return 结果
     */
    @Override
    public int deleteUserByUserId(String userId)
    {
        return userMapper.deleteUserByUserId(userId);
    }
}
