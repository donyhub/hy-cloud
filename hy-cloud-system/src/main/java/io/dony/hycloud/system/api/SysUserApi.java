package io.dony.hycloud.system.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangdy
 */
@RestController
public class SysUserApi {

    @GetMapping("user/hi")
    public String user(){
        return "user";
    }

    @GetMapping("admin/hi")
    public String admin(){
        return "admin";
    }
}
