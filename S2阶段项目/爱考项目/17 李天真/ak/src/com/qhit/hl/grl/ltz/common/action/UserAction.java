package com.qhit.hl.grl.ltz.common.action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.qhit.hl.grl.ltz.common.bean.User;
import com.qhit.hl.grl.ltz.common.service.UserService;
import com.qhit.hl.grl.ltz.common.service.UserServiceImpl;

public class UserAction extends ActionSupport {
	private UserService userService = new UserServiceImpl();
	
	private User user;
	
	/**
	 * 登录
	 * @return
	 */
	public String login(){
		user = userService.login(user);
		if(user != null){
			//登录成功
			System.out.println(user.toString());
			ServletActionContext.getRequest().getSession().setAttribute("user" ,user);
			return "loginSuccess";
		}else{
			super.addActionError("登录失败请重新输入");
			return "loginFile";
		}
	}
	
	/**
	 * 退出
	 * @return
	 */
	public String logout(){
		//获取session对象并销毁
		ServletActionContext.getRequest().getSession().invalidate();
		return "logout";
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	

}
