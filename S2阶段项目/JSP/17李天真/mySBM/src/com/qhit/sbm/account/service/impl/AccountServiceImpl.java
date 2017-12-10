package com.qhit.sbm.account.service.impl;

import com.qhit.sbm.account.dao.impl.AccountDaoImpl;
import com.qhit.sbm.account.service.AccountService;
import com.qhit.sbm.common.bean.PageBean;

public class AccountServiceImpl implements AccountService {

	@Override
	public PageBean getPageBean(PageBean pageBean) {
		// TODO Auto-generated method stub
		
		return new AccountDaoImpl().getPageBean(pageBean);
	}

}
