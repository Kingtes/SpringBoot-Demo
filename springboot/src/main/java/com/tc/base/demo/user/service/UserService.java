package com.tc.base.demo.user.service;

import com.tc.base.demo.user.mapper.UserMapper;
import com.tc.base.demo.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "userService")
public class UserService {

    @Autowired
    private UserMapper userMapper;//这里会报错，但是并不会影响

    public int addUser(User user) {

        return userMapper.insertSelective(user);
    }

    /*
     * 这个方法中用到了我们开头配置依赖的分页插件pagehelper
     * 很简单，只需要在service层传入参数，然后将参数传递给一个插件的一个静态方法即可；
     * pageNum 开始页数
     * pageSize 每页显示的数据条数
     * */
    public List<User> findAllUser(int pageNum, int pageSize) {
        return userMapper.selectAllUser();
    }
}
