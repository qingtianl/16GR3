package com.qhit.st2_4.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.qhit.st2_4.bean.User;
import com.qhit.st2_4.service.UserService;
import com.qhit.st2_4.util.DBManager;

public class UserServiceImpl implements UserService {
	private Connection con;
	private PreparedStatement ps;

	@Override
	public int addUser(User user) {
		con = DBManager.getConnection();
		String sql = "insert into t_user values(?,?,?,?)";
		
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, user.getUnaem());
			ps.setString(2, user.getUpwd());
			ps.setString(3, user.getEducation());
			ps.setInt(4, user.getSex());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

}
