package cn.jzyunqi.ms.uaa.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QUserAuth is a Querydsl query type for UserAuth
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QUserAuth extends EntityPathBase<UserAuth> {

    private static final long serialVersionUID = 128822387L;

    public static final QUserAuth userAuth = new QUserAuth("userAuth");

    public final cn.jzyunqi.common.persistence.domain.QBaseDomain _super = new cn.jzyunqi.common.persistence.domain.QBaseDomain(this);

    public final NumberPath<Long> createdBy = createNumber("createdBy", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createTime = _super.createTime;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath password = createString("password");

    public final EnumPath<cn.jzyunqi.ms.uaa.common.enums.AuthType> type = createEnum("type", cn.jzyunqi.ms.uaa.common.enums.AuthType.class);

    public final NumberPath<Long> updateBy = createNumber("updateBy", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updateTime = _super.updateTime;

    public final NumberPath<Long> userId = createNumber("userId", Long.class);

    public final StringPath username = createString("username");

    public final BooleanPath verified = createBoolean("verified");

    //inherited
    public final NumberPath<Integer> version = _super.version;

    public QUserAuth(String variable) {
        super(UserAuth.class, forVariable(variable));
    }

    public QUserAuth(Path<? extends UserAuth> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUserAuth(PathMetadata metadata) {
        super(UserAuth.class, metadata);
    }

}

