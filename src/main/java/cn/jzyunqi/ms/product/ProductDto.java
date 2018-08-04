package cn.jzyunqi.ms.product;

import cn.jzyunqi.common.model.BaseDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDto extends BaseDto<Long, Long> {
    public String title;
    public String description;
}
