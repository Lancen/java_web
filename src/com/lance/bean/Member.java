package com.lance.bean;

import com.lance.annotation.Table;

@Table(tableName = "Member")
public class Member {

	private Integer id; // 主键

	private String username; // 用户名

	private String password; // 加密后的密码，加密方法md5(md5(pwd)+salt)

	private String salt; // 加密盐

	private Integer mobilephone; // 手机号码
	
	private String email ; // 邮件
	
	private String avatar; // 头像
	
	private Integer registertime; // 注册时间

	private Integer lasttime; // 最后登录时间

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public Integer getMobilephone() {
		return mobilephone;
	}

	public void setMobilephone(Integer mobilephone) {
		this.mobilephone = mobilephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public Integer getRegistertime() {
		return registertime;
	}

	public void setRegistertime(Integer registertime) {
		this.registertime = registertime;
	}

	public Integer getLasttime() {
		return lasttime;
	}

	public void setLasttime(Integer lasttime) {
		this.lasttime = lasttime;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", username=" + username + ", password=" + password + ", salt=" + salt
				+ ", mobilephone=" + mobilephone + ", email=" + email + ", avatar=" + avatar + ", registertime="
				+ registertime + ", lasttime=" + lasttime + ", getId()=" + getId() + ", getUsername()=" + getUsername()
				+ ", getPassword()=" + getPassword() + ", getSalt()=" + getSalt() + ", getMobilephone()="
				+ getMobilephone() + ", getEmail()=" + getEmail() + ", getAvatar()=" + getAvatar()
				+ ", getRegistertime()=" + getRegistertime() + ", getLasttime()=" + getLasttime() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
