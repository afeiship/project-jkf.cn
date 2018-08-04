package cn.jzyunqi.ms.flink;

import cn.jzyunqi.common.persistence.domain.BaseDomain;
import cn.jzyunqi.constant.FlinkType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "flinks")
public class Flink extends BaseDomain<Long, Long> {
    public FlinkType type;
    public String url;
}
