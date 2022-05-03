package io.dony.hycloud.uca.entity;

import io.dony.hycloud.mdl.core.SysUserEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author wangdy
 */
public class UserDetailsImpl extends SysUserEntity implements UserDetails {
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        if(super.getRoles()==null||super.getRoles().size()==0){
            return null;
        }

        List<GrantedAuthority> list=new ArrayList<>();
        super.getRoles().forEach(r->list.add(new SimpleGrantedAuthority(r)));
        return list;
    }

    @Override
    public String getPassword() {
        return super.getPassword();
    }

    @Override
    public String getUsername() {
        return super.getUserName();
    }

    @Override
    public boolean isAccountNonExpired() {
        return !super.isAccountExpired();
    }

    @Override
    public boolean isAccountNonLocked() {
        return !super.isAccountLocked();
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return !super.isCredentialsExpired();
    }

    @Override
    public boolean isEnabled() {
        return super.isEnabled();
    }
}
