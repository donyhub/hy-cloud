package io.dony.hycloud.uca;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
public class HyCloudUcaAppTest {

    @Test
    public void test(){
        System.out.println(new BCryptPasswordEncoder().encode("123"));
    }
}
