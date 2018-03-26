package com.zcodezone.accountcenter.domain;

import com.zcodezone.accountcenter.constant.AccountType;

import java.util.Objects;

/**
 * 帐号信息
 *
 * @author zhengweibao
 */
public class BindingAccount {

	/**
	 * 帐号类型
	 */
	private AccountType accountType;

	/**
	 * 用户名
	 */
	private String username;

	/**
	 * 密码
	 */
	private String password;

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
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

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}

		if (!(o instanceof BindingAccount)) {
			return false;
		}

		BindingAccount account = (BindingAccount) o;

		return accountType == account.accountType &&
				Objects.equals(username, account.username);
	}

	@Override
	public int hashCode() {
		return Objects.hash(accountType, username);
	}
}
