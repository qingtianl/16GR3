package com.qhit.sbm.account.dao;

import com.qhit.sbm.common.bean.PageBean;

/**
 * 
 * @author 石桥
 *2017年11月13日
 */

public interface AccountDao {
	/**
	 * 分页的数据访问
	 */
	public PageBean getPageBean(PageBean pageBean);

}
