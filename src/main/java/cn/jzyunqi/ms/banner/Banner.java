package cn.jzyunqi.ms.banner;

import cn.jzyunqi.common.persistence.domain.BaseDomain;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "banners")
public class Banner extends BaseDomain<Long, Long> {
    public String title;
    public String filepath;
    public Integer priority;
}
