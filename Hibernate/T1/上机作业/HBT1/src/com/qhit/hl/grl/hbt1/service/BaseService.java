package com.qhit.hl.grl.hbt1.service;

import java.util.List;

public interface BaseService {
	/**
	 * @param obj
	 * 增
	 */
	public void add(Object obj);
	
	/*
	 * @param obj
	 * 删
	 */
	public void delete(Object obj);
	
	/**
	 * @param obj
	 * 改
	 */
	public void update(Object obj);
	
	/**
	 * @param fromObject
	 * @return
	 * 查
	 */
	public List<Object> query(String fromObject);

}
