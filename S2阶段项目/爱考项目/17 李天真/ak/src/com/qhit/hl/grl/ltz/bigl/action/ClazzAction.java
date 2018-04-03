package com.qhit.hl.grl.ltz.bigl.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.qhit.hl.grl.ltz.bigl.bean.ClassInfo;
import com.qhit.hl.grl.ltz.bigl.service.ClazzService;
import com.qhit.hl.grl.ltz.bigl.service.ClazzServiceImpl;

public class ClazzAction extends ActionSupport{
	private ClazzService clazzService = new ClazzServiceImpl();
	private List<ClassInfo> listClazz;
	
	public String getClazzList() {
		listClazz = clazzService.getClazzList();
		return "getClazzList";
		
	}
	public List<ClassInfo> getListClazz(){
		return listClazz;
		
	}
	public void setListClazz(List<ClassInfo> listClazz) {
		this.listClazz = listClazz;
	}
	
}	
