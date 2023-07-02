package com.xzh.param;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @Author name
 * @Date 2023/6/29 10:53
 * @Version 1.0
 * @Description:
 */
@Getter
@Setter
@ToString
public class TrainStationParam {

    private Integer id;

    @NotBlank(message = "站点名称不能为空")
    @Length(min = 2, max = 20, message = "站点名称长度需要在2-20个字之间")
    private  String name;

    @NotNull(message = "城市不能为空")
    @Min(value = 1, message = "城市id不合法")
    private Integer cityId;
}
