package cn.jzyunqi.ms.uaa.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QRolePrivilege is a Querydsl query type for RolePrivilege
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QRolePrivilege extends EntityPathBase<RolePrivilege> {

    private static final long serialVersionUID = 315239035L;

    public static final QRolePrivilege rolePrivilege = new QRolePrivilege("rolePrivilege");

    public final NumberPath<Long> privilegeId = createNumber("privilegeId", Long.class);

    public final NumberPath<Long> roleId = createNumber("roleId", Long.class);

    public QRolePrivilege(String variable) {
        super(RolePrivilege.class, forVariable(variable));
    }

    public QRolePrivilege(Path<? extends RolePrivilege> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRolePrivilege(PathMetadata metadata) {
        super(RolePrivilege.class, metadata);
    }

}

