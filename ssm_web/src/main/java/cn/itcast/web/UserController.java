package cn.itcast.web;

import cn.itcast.pojo.User;
import cn.itcast.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

/**
 * @author Bluiven
 * @date 2018-06-27 20:54
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("{pageName}")
    public String PageName(@PathVariable("pageName")String pageName){

        return pageName;
    }

    @RequestMapping("list")
    @ResponseBody
    public List<User> queryUserList(){
        List<User> list = userService.queryUserList();
        return list;

    }

    @RequestMapping("save")
    @ResponseBody
    public HashMap<String,Integer> insertUser(User user){
        HashMap<String, Integer> map = new HashMap<>();
        boolean flag = userService.insertUser(user);
        if (flag){
            map.put("status",200);
            return map;
        }else{
            map.put("status",500);
        }
        return map;
    }
}
