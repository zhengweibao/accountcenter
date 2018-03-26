package com.zcodezone.accountcenter.domain;

import com.zcodezone.accountcenter.constant.Gender;

/**
 * 用户基本信息
 *
 * @author zhengweibao
 */
public class BasicProfile {

	/**
	 * 用户昵称
	 */
	private String nickname;

	/**
	 * 用户头像
	 */
	private String avatar;

	/**
	 * 用户性别
	 */
	private Gender gender;

	/**
	 * 用户生日
	 */
	private String birthday;

	/**
	 * 地区
	 */
	private String region;

	/**
	 * 邮箱
	 */
	private String email;

	/**
	 * 电话号码
	 */
	private String mobile;

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
}
