package com.qhit.hl.grl.hbt1.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qhit.hl.grl.hbt1.dao.BaseDao;
import com.qhit.hl.grl.hbt1.util.HibernateSessionFactory;

public class BaseDaoImpl implements BaseDao {

	@Override
	public void add(Object obj) {
		//获取session对象
		Session session = HibernateSessionFactory.getSession();
		//打开事物
		Transaction ts = session.beginTransaction();
		//传入参数
		session.save(obj);
		//提交事物
		ts.commit();
		//释放资源
		HibernateSessionFactory.closeSession();

	}

	@Override
	public void delete(Object obj) {
		//获取session对象
		Session session = HibernateSessionFactory.getSession();
		//打开事物
		Transaction ts = session.beginTransaction();
		//执行
		session.save(obj);
		//提交事物
		ts.commit();
		//释放资源
		HibernateSessionFactory.closeSession();

	}

	@Override
	public void update(Object obj) {
		//获取session对象
		Session session = HibernateSessionFactory.getSession();
		//打开事物
		Transaction ts = session.beginTransaction();
		//执行
		session.save(obj);
		//提交事物
		ts.commit();
		//释放资源
		HibernateSessionFactory.closeSession();

	}

	@Override
	public List<Object> query(String fromObject) {
		//获取session对象
		Session session = HibernateSessionFactory.getSession();
		//打开事物
		Transaction ts = session.beginTransaction();
		//获取查询对像
		Query query = session.createQuery(fromObject);
		List<Object> list = query.list();
		
		//提交事物
		ts.commit();
		//释放资源
		HibernateSessionFactory.closeSession();
		return list;
	}

}
