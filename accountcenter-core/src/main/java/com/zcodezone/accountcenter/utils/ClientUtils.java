package com.zcodezone.accountcenter.utils;

import com.zcodezone.accountcenter.dto.RequestDetails;
import com.zcodezone.accountcenter.exception.ClientIdNotFoundException;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * @author zhengweibao
 */
public class ClientUtils {

	/**
	 * 从SecurityContext中获取客户端ID
	 *
	 * @return 客户端ID
	 * @throws AuthenticationCredentialsNotFoundException 当前请求的SecurityContext中不存在认证信息
	 * @throws ClientIdNotFoundException 无法从请求的认证信息中获取客户端ID
	 */
	public static String getClientId(){
		Authentication requestAuth = SecurityContextHolder.getContext().getAuthentication();

		if (requestAuth == null) {
			throw new AuthenticationCredentialsNotFoundException("Cannot get clientId without authentication inner SecurityContext.");
		}

		Object authDetails = requestAuth.getDetails();

		if (authDetails instanceof String) {
			return (String) authDetails;
		}

		if (authDetails instanceof RequestDetails) {
			return ((RequestDetails) authDetails).getClientId();
		}

		throw new ClientIdNotFoundException(String.format("Cannot found clientId with unknown request details : %s", authDetails));
	}
}
