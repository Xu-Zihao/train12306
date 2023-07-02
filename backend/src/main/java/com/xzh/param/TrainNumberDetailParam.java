package com.xzh.param;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Max;
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
public class TrainNumberDetailParam {

    @NotNull(message = "车次不能为空")
    private Integer trainNumberId;

    @NotNull(message = "出发站不能为空")
    private Integer fromStationId;

    @NotNull(message = "到达站不能为空")
    private Integer toStationId;

    @NotNull(message = "相对出发时间不能为空")
    private Integer relativeMinute;

    @NotNull(message = "等待时间不能为空")
    private Integer waitMinute;

    @NotBlank(message = "座位价格不能为空")
    private String money;

    @Min(0) //代表该车次详情还有详情需要添加
    @Max(1) //代表该车次详情全部添加完成
    private Integer end;
}
