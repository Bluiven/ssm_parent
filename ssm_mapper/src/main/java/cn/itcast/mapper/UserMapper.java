package cn.itcast.mapper;

import cn.itcast.pojo.User;

import java.util.List;

/**
 * @author Bluiven
 * @date 2018-06-27 19:51
 */
public interface UserMapper {
    /**
     * 通过id查询用户
     * @param id
     * @return
     */
    User queryUserById(Long id);

    List<User> queryUserList();

    int insertUser(User user);
}
