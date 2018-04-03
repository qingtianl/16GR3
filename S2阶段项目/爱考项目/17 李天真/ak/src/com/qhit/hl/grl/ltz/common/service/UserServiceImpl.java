package com.qhit.hl.grl.ltz.common.service;

import com.qhit.hl.grl.ltz.common.bean.User;
import com.qhit.hl.grl.ltz.common.dao.UserDao;
import com.qhit.hl.grl.ltz.common.dao.UserDaoImpl;

public class UserServiceImpl implements UserService {
	private UserDao userDao = new UserDaoImpl();
	@Override
	public User login(User user) {
		
		// TODO Auto-generated method stub
		return userDao.login(user);
	}

}
