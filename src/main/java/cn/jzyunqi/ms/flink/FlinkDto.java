package cn.jzyunqi.ms.flink;

import cn.jzyunqi.common.model.BaseDto;
import cn.jzyunqi.constant.FlinkType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FlinkDto extends BaseDto<Long, Long> {
    public FlinkType type;
    public String url;
}
