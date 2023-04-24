package com.movie.mapper;

import java.util.List;
import com.movie.domain.User;

/**
 * userMapper接口
 * 
 * @author movie
 * @date 2023-04-23
 */
public interface UserMapper 
{
    /**
     * 查询user
     * 
     * @param userId user主键
     * @return user
     */
    public User selectUserByUserId(String userId);

    /**
     * 查询user列表
     * 
     * @param user user
     * @return user集合
     */
    public List<User> selectUserList(User user);

    /**
     * 新增user
     * 
     * @param user user
     * @return 结果
     */
    public int insertUser(User user);

    /**
     * 修改user
     * 
     * @param user user
     * @return 结果
     */
    public int updateUser(User user);

    /**
     * 删除user
     * 
     * @param userId user主键
     * @return 结果
     */
    public int deleteUserByUserId(String userId);

    /**
     * 批量删除user
     * 
     * @param userIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteUserByUserIds(String[] userIds);
}
