package com.example.sprintuser;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringBootVersion;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SprintuserApplicationTests {

    @Test
    void contextLoads() {
        System.out.println(SpringBootVersion.getVersion());
    }

}
