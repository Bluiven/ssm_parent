package cn.itcast.service;

import cn.itcast.mapper.UserMapper;
import cn.itcast.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Bluiven
 * @date 2018-06-27 20:51
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User queryUserById(Long id){
        User user = userMapper.queryUserById(1L);
        return user;
    }

    public List<User> queryUserList() {
        List<User> list = userMapper.queryUserList();
        return list;
    }

    public boolean insertUser(User user) {
        int count = userMapper.insertUser(user);

        if (count == 1){
            return true;
        }
        return false;
    }
}
