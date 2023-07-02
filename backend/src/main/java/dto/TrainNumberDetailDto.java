package dto;

import com.xzh.model.TrainNumberDetail;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Author name
 * @Date 2023/6/26 9:38
 * @Version 1.0
 * @Description:
 */

@Setter
@Getter
@ToString
public class TrainNumberDetailDto extends TrainNumberDetail {

    private String trainNumber;

    private String fromStation;

    private String toStation;
}
