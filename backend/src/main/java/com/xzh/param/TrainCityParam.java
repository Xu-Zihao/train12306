package com.xzh.param;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

/**
 * @Author name
 * @Date 2023/6/26 17:48
 * @Version 1.0
 * @Description:
 */
@Getter
@Setter
@ToString
public class TrainCityParam {

    private Integer id;

    @NotBlank(message = "城市名不可为空")
    @Length(min = 2, max = 20, message = "城市名称长度需要在2-20个字之间")
    private String name;
}
