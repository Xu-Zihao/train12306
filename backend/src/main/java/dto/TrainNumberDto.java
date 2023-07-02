package dto;

import com.xzh.model.TrainNumber;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Author name
 * @Date 2023/6/25 17:22
 * @Version 1.0
 * @Description:
 */
@Getter
@Setter
@ToString
public class TrainNumberDto extends TrainNumber {

    private String fromStation;

    private String toStation;
}
