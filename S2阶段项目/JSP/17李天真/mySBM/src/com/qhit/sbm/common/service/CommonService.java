package com.qhit.sbm.common.service;

import java.util.List;
/**
 * 
 * @author S01
 *2017年11月20日
 */

public interface CommonService {
	/**
	 * @param tableName
	 * @param wheres
	 * @param values
	 * @return
	 * 总记录数的业务
	 */

	public int getCount(String tableName, List<String> wheres, List<String> values);

}
