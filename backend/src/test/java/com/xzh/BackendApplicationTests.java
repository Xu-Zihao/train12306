package com.xzh;


import org.junit.jupiter.api.Test;

class BackendApplicationTests {

    @Test
    void contextLoads() {
        Integer integer1 = new Integer(15);
        Integer integer2 = new Integer(15);
        System.out.println(integer1.intValue()==integer2.intValue());
    }

}
