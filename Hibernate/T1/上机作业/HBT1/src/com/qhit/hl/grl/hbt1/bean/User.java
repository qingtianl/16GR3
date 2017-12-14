/**
 * 
 */
package com.qhit.hl.grl.hbt1.bean;

/**
 * @author 李天真
 * TODO
 * 2017-12-12下午8:08:57
 */
public class User {
	public Integer  oid;
	public String username;
	public String address;
	
	public User(){}

	public Integer getOid() {
		return oid;
	}

	public void setOid(Integer oid) {
		this.oid = oid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [oid=" + oid + ", username=" + username + ", address="
				+ address + "]";
	}


	
	
}