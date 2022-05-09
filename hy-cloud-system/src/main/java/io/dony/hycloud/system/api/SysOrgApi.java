package io.dony.hycloud.system.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SysOrgApi {

    @GetMapping("info")
    public String info(){
        return this.getClass().getName();
    }
}
