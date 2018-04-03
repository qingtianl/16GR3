package com.qhit.hl.grl.ltz.common.dao;



import org.hibernate.Session;

import com.qhit.hl.grl.ltz.common.utils.HibernateSessionFactory;

public class BaseDao {
	
	public Session getSession(){
		
		return HibernateSessionFactory.getSession();
		
	}

}
