package com.qhit.sbm.account.service;

import com.qhit.sbm.common.bean.PageBean;

public interface AccountService {
	/**
	 * 分页业务
	 * @param pageBean
	 * @return
	 */
	public PageBean getPageBean(PageBean pageBean);

}
