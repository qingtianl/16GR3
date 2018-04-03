package com.qhit.hl.grl.ltz.bigl.dao;

import java.util.List;

import com.qhit.hl.grl.ltz.bigl.bean.ClassInfo;
import com.qhit.hl.grl.ltz.common.dao.BaseDao;

public class ClazzDaoImpl extends BaseDao implements ClazzDao {

	@Override
	public List<ClassInfo> getClazzList() {
		// TODO Auto-generated method stub
		return getSession().createQuery("from ClassInfo").list();
	}

}
