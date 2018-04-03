package com.qhit.hl.grl.ltz.bigl.dao;

import java.util.List;

import com.qhit.hl.grl.ltz.bigl.bean.ClassInfo;

public interface ClazzDao {
	/**
	 * 获取班级集合
	 * @return
	 */
	public List<ClassInfo> getClazzList();

}
