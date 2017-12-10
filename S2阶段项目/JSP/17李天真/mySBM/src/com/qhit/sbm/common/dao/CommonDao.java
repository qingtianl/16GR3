package com.qhit.sbm.common.dao;

import java.util.List;
/**
 * 
 * @author S01
 *2017年11月20日
 */

public interface CommonDao {
	/**
	 * @param tableName
	 * @param wheres
	 * @param values
	 * @return
	 * 总记录数的业务
	 */
	public int getCount(String tableName, List<String> where, List<String> values);

}
