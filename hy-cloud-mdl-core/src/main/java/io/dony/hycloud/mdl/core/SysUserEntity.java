package io.dony.hycloud.mdl.core;

import lombok.Data;
import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

/**
 * @author wangdy
 */
@Data
public class SysUserEntity {
    private String id;
    private String userName;
    private String password;
    private String realName;
    private LocalDateTime birthday;
    private String tel;
    private String email;
    private String idCard;
    /**
     * 头像
     */
    private String avatar;
    /**
     * 性别
     */
    private UserGenders gender;
    /**
     * 租户ID
     */
    private String relTenantId;
    /**
     * 组织ID
     */
    private String relOrgId;
    private boolean accountExpired;
    private boolean accountLocked;
    private boolean credentialsExpired;
    private boolean enabled;

    private List<String> roles;

    @Getter
    static enum UserGenders{
        /**
         * 未知：0
         */
        Default(0),
        /**
         * 男性：1
         */
        Male(1),
        /**
         * 女性：2
         */
        Female(2);

        private int code;

        UserGenders(int code){
            this.code=code;
        }

    }
}
