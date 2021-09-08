package com.macoloco.lotus.dao;

import com.macoloco.lotus.pojo.Users;

public interface UserDao {

    Users selectByUsername(Users user);

}
