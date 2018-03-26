package com.zcodezone.accountcenter.domain;

import java.util.Map;
import java.util.Set;

/**
 * 用户信息
 *
 * @author zhengweibao
 */
public class RegisteredUser {

	/**
	 * 用户ID，
	 * 用户的唯一标识
	 */
	private String userId;

	private BasicProfile profile;

	private Token accessToken;

	private Token refreshToken;

	private Set<BindingAccount> bindingAccounts;

	/**
	 * 帐号附加信息，
	 * 允许自由更改
	 */
	private Map<String, Object> attachInfo;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public BasicProfile getProfile() {
		return profile;
	}

	public void setProfile(BasicProfile profile) {
		this.profile = profile;
	}

	public Token getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(Token accessToken) {
		this.accessToken = accessToken;
	}

	public Token getRefreshToken() {
		return refreshToken;
	}

	public void setRefreshToken(Token refreshToken) {
		this.refreshToken = refreshToken;
	}

	public Set<BindingAccount> getBindingAccounts() {
		return bindingAccounts;
	}

	public void setBindingAccounts(Set<BindingAccount> bindingAccounts) {
		this.bindingAccounts = bindingAccounts;
	}

	public Map<String, Object> getAttachInfo() {
		return attachInfo;
	}

	public void setAttachInfo(Map<String, Object> attachInfo) {
		this.attachInfo = attachInfo;
	}
}
