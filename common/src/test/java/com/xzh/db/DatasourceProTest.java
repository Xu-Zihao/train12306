package com.xzh.db;



import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@ActiveProfiles("common")
public class DatasourceProTest {
    @Autowired
    private DatasourcePro ps;

    @Test
    public void test(){
        System.out.println(ps);
    }
}
