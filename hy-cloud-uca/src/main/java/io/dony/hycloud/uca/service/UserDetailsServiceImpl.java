package io.dony.hycloud.uca.service;

import io.dony.hycloud.uca.entity.UserDetailsImpl;
import io.dony.hycloud.uca.repo.UserDetailsServiceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wangdy
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    UserDetailsServiceRepo userDetailsServiceRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserDetailsImpl userDetails = this.userDetailsServiceRepo.getUserByUsername(username);

        if (userDetails == null) {
            return null;
        }

        List<String> roleCodeList = this.userDetailsServiceRepo.getRolesByUsername(username);
        userDetails.setRoles(roleCodeList);
        return userDetails;
    }
}
