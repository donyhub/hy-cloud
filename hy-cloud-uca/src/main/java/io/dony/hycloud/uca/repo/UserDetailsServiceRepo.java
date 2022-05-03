package io.dony.hycloud.uca.repo;

import io.dony.hycloud.uca.entity.UserDetailsImpl;

import java.util.List;

/**
 * @author wangdy
 */
public interface UserDetailsServiceRepo {
    /**
     * 根据userName获取UserDetails
     * @param userName 用户标识
     * @return
     */
    UserDetailsImpl getUserByUsername(String userName);

    /**
     * 根据username获取角色code
     * @param username
     * @return
     */
    List<String> getRolesByUsername(String username);
}
