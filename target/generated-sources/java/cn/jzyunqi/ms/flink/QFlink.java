package cn.jzyunqi.ms.flink;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QFlink is a Querydsl query type for Flink
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QFlink extends EntityPathBase<Flink> {

    private static final long serialVersionUID = -1665514207L;

    public static final QFlink flink = new QFlink("flink");

    public final cn.jzyunqi.common.persistence.domain.QBaseDomain _super = new cn.jzyunqi.common.persistence.domain.QBaseDomain(this);

    public final NumberPath<Long> createdBy = createNumber("createdBy", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createTime = _super.createTime;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final EnumPath<cn.jzyunqi.constant.FlinkType> type = createEnum("type", cn.jzyunqi.constant.FlinkType.class);

    public final NumberPath<Long> updateBy = createNumber("updateBy", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updateTime = _super.updateTime;

    public final StringPath url = createString("url");

    //inherited
    public final NumberPath<Integer> version = _super.version;

    public QFlink(String variable) {
        super(Flink.class, forVariable(variable));
    }

    public QFlink(Path<? extends Flink> path) {
        super(path.getType(), path.getMetadata());
    }

    public QFlink(PathMetadata metadata) {
        super(Flink.class, metadata);
    }

}

