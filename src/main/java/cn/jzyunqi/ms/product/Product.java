package cn.jzyunqi.ms.product;

import cn.jzyunqi.common.persistence.domain.BaseDomain;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "products")
public class Product extends BaseDomain<Long, Long> {
    public String title;
    public String description;
}
