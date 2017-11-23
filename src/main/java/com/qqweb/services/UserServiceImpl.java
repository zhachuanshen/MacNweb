package com.qqweb.services;

import com.qqweb.Model.User;
import com.qqweb.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by chuanshen on 2017/8/23.
 */
@Service("UserService")
public class UserServiceImpl implements UserService {

    private   UserDao userDao;
//    private  UserService userService;
//    public UserDao getUserDao() {
//        return userDao;
//    }
@Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
//    public UserService getUserService() {
//        return userService;
//    }
//
//    public void setUserService(UserService userService) {
//        this.userService = userService;
//    }

  public User userSelect(){

   return userDao.userSelect();
    }
}
