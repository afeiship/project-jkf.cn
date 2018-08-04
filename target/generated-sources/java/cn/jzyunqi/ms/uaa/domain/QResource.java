package cn.jzyunqi.ms.uaa.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QResource is a Querydsl query type for Resource
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QResource extends EntityPathBase<Resource> {

    private static final long serialVersionUID = 54792302L;

    public static final QResource resource = new QResource("resource");

    public final cn.jzyunqi.common.persistence.domain.QBaseDomain _super = new cn.jzyunqi.common.persistence.domain.QBaseDomain(this);

    public final NumberPath<Long> createdBy = createNumber("createdBy", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createTime = _super.createTime;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final BooleanPath leaf = createBoolean("leaf");

    public final StringPath msClientId = createString("msClientId");

    public final StringPath name = createString("name");

    public final NumberPath<Long> parentId = createNumber("parentId", Long.class);

    public final EnumPath<cn.jzyunqi.ms.uaa.common.enums.PermitType> permitType = createEnum("permitType", cn.jzyunqi.ms.uaa.common.enums.PermitType.class);

    public final NumberPath<Integer> priority = createNumber("priority", Integer.class);

    public final BooleanPath root = createBoolean("root");

    public final EnumPath<cn.jzyunqi.ms.uaa.common.enums.ResourceType> type = createEnum("type", cn.jzyunqi.ms.uaa.common.enums.ResourceType.class);

    public final NumberPath<Long> updateBy = createNumber("updateBy", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updateTime = _super.updateTime;

    public final StringPath url = createString("url");

    //inherited
    public final NumberPath<Integer> version = _super.version;

    public QResource(String variable) {
        super(Resource.class, forVariable(variable));
    }

    public QResource(Path<? extends Resource> path) {
        super(path.getType(), path.getMetadata());
    }

    public QResource(PathMetadata metadata) {
        super(Resource.class, metadata);
    }

}

