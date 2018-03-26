package com.zcodezone.accountcenter.domain;

/**
 * @author zhengweibao
 */
public class Token {

	/**
	 * token
	 */
	private String value;

	/**
	 * 过期时间，JAVA时间戳
	 * -1 表示永不过期
	 */
	private Long expiredAt;

	public Token() {
	}

	public Token(String value, Long expiredAt) {
		this.value = value;
		this.expiredAt = expiredAt;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Long getExpiredAt() {
		return expiredAt;
	}

	public void setExpiredAt(Long expiredAt) {
		this.expiredAt = expiredAt;
	}

	public boolean isExpired(){
		return expiredAt != null
				&& expiredAt != -1
				&& expiredAt < System.currentTimeMillis();
	}
}
