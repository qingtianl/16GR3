package com.qhit.sbm.user.dao;

import com.qhit.sbm.user.bean.User;

/**
 * 
 * @author S01
 *2017年11月20日
 */

public interface UserDao {
	/**
	 * 
	 * @param user
	 * @return
	 * 添加用户
	 */
	public int addUser(User user);
	
	/**
	 * 
	 * @param userName
	 * @param userPassword
	 * @return
	 * 登陆的数据访问
	 */
	public User doLogin(String userName, String userPassword);

}
