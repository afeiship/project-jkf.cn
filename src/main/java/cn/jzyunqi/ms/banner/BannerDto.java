package cn.jzyunqi.ms.banner;

import cn.jzyunqi.common.model.BaseDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BannerDto extends BaseDto<Long, Long> {
    public String title;
    public String filepath;
    public Integer priority;
}
