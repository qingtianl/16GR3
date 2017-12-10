package com.qhit.sbm.account.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.qhit.sbm.account.bean.AccountDeta;
import com.qhit.sbm.account.dao.AccountDao;
import com.qhit.sbm.common.bean.PageBean;
import com.qhit.sbm.utils.DBManager;

public class AccountDaoImpl implements AccountDao {
	private Connection con = null;
	private PreparedStatement ps = null;
	
	

	@Override
	public PageBean getPageBean(PageBean pageBean) {
		AccountDeta accountDeta = null;
		con = DBManager.getConnection();
		String sql = "select top"
				+pageBean.getPagesize()
				+"a.accountId,g.goodsName,g.goodsNum,a.totalPrice,"
				+"a.isPayed,p.provederName,g.goodsIntro,a.accountDate"
				+"from tb_account a left join tb_goods g on a.goodsId = g.goodsId"
				+"left join tb_provider p on p.providerId = a.providerId"
				+"where a.accountId not in"
				+"(select top"
				+pageBean.getPagesize()*(pageBean.getP() - 1)
				+"a.accountId from tb_account a left join tb_goods g on a.goodsId = g.goodsId"
				+"left join tb_provider p on p.providerId = a.providerId);";
		System.out.println(sql);
		try {
			ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				accountDeta = new AccountDeta(
						rs.getInt("accountId"),
						rs.getString("goodsName"),
						rs.getInt("goodsNum"),
						rs.getFloat("totalPrice"),
						rs.getInt("isPated"),
						rs.getString("providerName"),
						rs.getString("goodsIntro"),
						rs.getDate("accountDate"));
				pageBean.addData(accountDeta);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return pageBean;
		
	}

}
