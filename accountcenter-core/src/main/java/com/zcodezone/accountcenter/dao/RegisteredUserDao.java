package com.zcodezone.accountcenter.dao;

import com.zcodezone.accountcenter.constant.AccountType;
import com.zcodezone.accountcenter.domain.BasicProfile;
import com.zcodezone.accountcenter.domain.BindingAccount;
import com.zcodezone.accountcenter.domain.RegisteredUser;

import java.util.Map;

/**
 * 注册用户DAO
 *
 * TODO 防止缓存穿透
 * @author zhengweibao
 */
public interface RegisteredUserDao {

	/**
	 * 使用帐号信息查询用户信息
	 *
	 * @param account 帐号信息
	 * @return 注册用户实例
	 */
	RegisteredUser findByAccount(BindingAccount account);

	/**
	 * 根据帐号类型以及用户名查询用户信息
	 * @param accountType 帐号类型
	 * @param username 用户名
	 * @return 注册用户实例
	 */
	RegisteredUser findByAccount(AccountType accountType, String username);

	/**
	 * 根据用户ID查询用户信息
	 * @param userId 用户ID
	 * @return 注册用户实例
	 */
	RegisteredUser findByUserId(String userId);

	/**
	 * 根据access token查询用户信息
	 *
	 * @param accessToken access token
	 * @return 用户信息
	 */
	RegisteredUser findByAccessToken(String accessToken);

	/**
	 * 根据refresh token查询用户信息
	 *
	 * @param refreshToken refresh token
	 * @return 用户信息
	 */
	RegisteredUser findByRefreshToken(String refreshToken);

	/**
	 * 创建用户
	 *
	 * @param user 用户信息
	 */
	void createUser(RegisteredUser user);

	/**
	 * 更新用户attach_info信息
	 * updateData的所有更改默认在用户的attach_info域下
	 * 例如，有updateData：
	 * {
	 *     "test.a" : 123,
	 *     "other" : "abc",
	 *     "array" : ["a", "b", "c"]
	 * }
	 * 用户数据：
	 * {
	 *     "user_id" : "...",
	 *     "attach_info" : {
	 *         "nick_name" : "test_user",
	 *         "gender" : "M",
	 *         ...
	 *     }
	 * }
	 * 则更新后：
	 * {
	 *     "user_id" : "...",
	 *     "attach_info" : {
	 *         "nick_name" : "test_user",
	 *         "gender" : "M",
	 *         "test" : {
	 *             "a" : 123
	 *         },
	 *         "other" : "abc",
	 *         "array" : ["a", "b", "c"]
	 *         ...
	 *     }
	 * }
	 *
	 * @param userId 用户ID
	 * @param updateData 要进行的更新
	 */
	void updateAttachInfo(String userId, Map<String, Object> updateData);

	/**
	 * 更新用户基本信息
	 *
	 * @param userId 用户ID
	 * @param profile 用户基本信息
	 */
	void updateProfile(String userId, BasicProfile profile);
}
