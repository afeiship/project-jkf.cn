package cn.jzyunqi.ms.uaa.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QResourcePrivilege is a Querydsl query type for ResourcePrivilege
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QResourcePrivilege extends EntityPathBase<ResourcePrivilege> {

    private static final long serialVersionUID = 290038243L;

    public static final QResourcePrivilege resourcePrivilege = new QResourcePrivilege("resourcePrivilege");

    public final NumberPath<Long> privilegeId = createNumber("privilegeId", Long.class);

    public final NumberPath<Long> resourceId = createNumber("resourceId", Long.class);

    public QResourcePrivilege(String variable) {
        super(ResourcePrivilege.class, forVariable(variable));
    }

    public QResourcePrivilege(Path<? extends ResourcePrivilege> path) {
        super(path.getType(), path.getMetadata());
    }

    public QResourcePrivilege(PathMetadata metadata) {
        super(ResourcePrivilege.class, metadata);
    }

}

