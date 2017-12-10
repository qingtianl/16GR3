package com.qhit.sbm.user.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspsmart.upload.SmartUpload;
import com.jspsmart.upload.SmartUploadException;
import com.qhit.sbm.user.bean.User;
import com.qhit.sbm.user.service.UserService;
import com.qhit.sbm.user.service.impl.UserServiceimpl;
import com.qhit.sbm.utils.CommonUtil;

public class UserServle extends HttpServlet {
	private UserService usService = new UserServiceimpl();

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String cmd = request.getParameter("cmd");
		switch(cmd){
		case "login":
			doLogin(request, response);
			break;
		case "exit":
			doExit(request, response);
			break;
		case "uploadPic":
			uploadPic(request, response);
			break;
		case "addUser":
			addUser(request, response);
		}
	}
	/**
	 * 
	 * @param request
	 * @param response
	 */
	private void addUser(HttpServletRequest request,
			HttpServletResponse response) throws IOException{
		
		String userName = (String)request.getAttribute("userName");
		String userPassword = (String)request.getAttribute("userPassword");
		String userSex = (String)request.getAttribute("userSex");
		String userAge = (String)request.getAttribute("userAge");
		String telephone = (String)request.getAttribute("telephone");
		String address = (String)request.getAttribute("address");
		String type = (String)request.getAttribute("type");
		String pic = (String)request.getAttribute("pic");
		
		User user = new User(
							
							userName,
							userPassword,
							userSex,
							Integer.parseInt(userAge),
							telephone,
							address,
							pic,
							Integer.parseInt(type)
							);
		int row = usService.addUser(user);
		PrintWriter out = response.getWriter();
		if(row>0){
			//添加成功：应该重定向到user控制层重新查询所有的用户列表
			out.print("<script>alert('添加成功');</script>");
			response.sendRedirect("jsp/userinfo.jsp?pic="+pic);
		}else{
			//添加失败
			out.print("<script>alert('添加失败');</script>");
		}
	}
	
	/**
	 * 上传头像
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	private void uploadPic(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException{
		PrintWriter out = response.getWriter();
		//实例化对象
		SmartUpload smartUpload = new SmartUpload();
		//初始化上传文件对象
		smartUpload.initialize(getServletConfig(), request, response);
		//设置只允许上传图片
		smartUpload.setAllowedFilesList("png,jpg,JPEG,gif");
		//设置文件大小不超过5M
		smartUpload.setMaxFileSize(1024*1024*5);
		
		try {
			//上传
			smartUpload.upload();
			//保存    图片保存的文件路径
			String realPath = request.getRealPath("/")+"/";//项目路径
			String filePath = CommonUtil.FILE_USER_PIC_PHOTO_PATH;
		} catch (SmartUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private void doExit(HttpServletRequest request,
			HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	private void doLogin(HttpServletRequest request,
			HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

}
