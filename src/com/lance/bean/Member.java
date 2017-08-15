package com.lance.bean;

import com.lance.annotation.Column;
import com.lance.annotation.Table;

@Table(tableName = "Member")
public class Member {

	@Column(field = "id", type = "INT(10)", primaryKey = true, defaultNull = false, autoIncrement = true)
	private Integer	id;			  // 主键

	@Column(field = "username", type = "CHAR(20)")
	private String	username;	  // 用户名

	@Column(field = "password", type = "CHAR(32)")
	private String	password;	  // 加密后的密码，加密方法md5(md5(password)+salt)

	@Column(field = "salt", type = "CHAR(4)")
	private String	salt;		  // 加密盐

	@Column(field = "mobilephone", type = "CHAR(13)")
	private Integer	mobilephone;  // 手机号码

	@Column(field = "email", type = "CHAR(50)")
	private String	email;		  // 邮件

	@Column(field = "avatar", type = "CHAR(50)")
	private String	avatar;		  // 头像

	@Column(field = "registertime", type = "INT(10)")
	private Integer	registertime; // 注册时间

	@Column(field = "lasttime", type = "INT(10)")
	private Integer	lasttime;	  // 最后登录时间

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
