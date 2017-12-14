package com.qhit.hl.grl.hbt1.service.impl;

import java.util.List;

import com.qhit.hl.grl.hbt1.dao.BaseDao;
import com.qhit.hl.grl.hbt1.dao.impl.BaseDaoImpl;
import com.qhit.hl.grl.hbt1.service.BaseService;

public class BaseServiceImpl implements BaseService {
	private BaseDao baseDao = new BaseDaoImpl();
	@Override
	public void add(Object obj) {
		baseDao.add(obj);

	}

	@Override
	public void delete(Object obj) {
		baseDao.delete(obj);

	}

	@Override
	public void update(Object obj) {
		baseDao.update(obj);

	}

	@Override
	public List<Object> query(String fromObject) {
		// TODO Auto-generated method stub
		return baseDao.query(fromObject);
	}

}
