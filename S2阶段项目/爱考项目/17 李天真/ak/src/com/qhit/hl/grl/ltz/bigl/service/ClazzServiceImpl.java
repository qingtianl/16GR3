package com.qhit.hl.grl.ltz.bigl.service;

import java.util.List;

import com.qhit.hl.grl.ltz.bigl.bean.ClassInfo;
import com.qhit.hl.grl.ltz.bigl.dao.ClazzDao;
import com.qhit.hl.grl.ltz.bigl.dao.ClazzDaoImpl;

public class ClazzServiceImpl implements ClazzService {
	ClazzDao clazzDao = new ClazzDaoImpl();

	@Override
	public List<ClassInfo> getClazzList() {
	
		return clazzDao.getClazzList();
	}

}
