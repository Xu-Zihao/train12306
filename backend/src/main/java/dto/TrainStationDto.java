package dto;

import com.xzh.model.TrainStation;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author name
 * @Date 2023/6/25 10:59
 * @Version 1.0
 * @Description:
 */
public class TrainStationDto extends TrainStation {

    @Setter
    @Getter
    private String cityName;

}
