package com.xzh.learn;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author name
 * @Date 2023/6/21 18:15
 * @Version 1.0
 * @Description:
 */

@Data

@NoArgsConstructor
@AllArgsConstructor
public class Actor {
    private String name;
    private int age;
}
