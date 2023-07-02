package com.xzh.common;

import lombok.Getter;

/**
 * @Author name
 * @Date 2023/6/29 14:31
 * @Version 1.0
 * @Description:
 */
@Getter
public enum TrainType {
    CRH2(1220),
    CRH5(1244);

    int count;

    TrainType(int count){
        this.count = count;
    }
}
