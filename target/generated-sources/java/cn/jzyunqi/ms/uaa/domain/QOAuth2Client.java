package cn.jzyunqi.ms.uaa.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QOAuth2Client is a Querydsl query type for OAuth2Client
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QOAuth2Client extends EntityPathBase<OAuth2Client> {

    private static final long serialVersionUID = -1183850394L;

    public static final QOAuth2Client oAuth2Client = new QOAuth2Client("oAuth2Client");

    public final cn.jzyunqi.common.persistence.domain.QBaseDomain _super = new cn.jzyunqi.common.persistence.domain.QBaseDomain(this);

    public final NumberPath<Integer> accessTokenValidity = createNumber("accessTokenValidity", Integer.class);

    public final StringPath additionalInformation = createString("additionalInformation");

    public final StringPath authorities = createString("authorities");

    public final StringPath authorizedGrantTypes = createString("authorizedGrantTypes");

    public final StringPath autoApprove = createString("autoApprove");

    public final StringPath clientId = createString("clientId");

    public final StringPath clientSecret = createString("clientSecret");

    public final NumberPath<Long> createdBy = createNumber("createdBy", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createTime = _super.createTime;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> refreshTokenValidity = createNumber("refreshTokenValidity", Integer.class);

    public final StringPath resourceIds = createString("resourceIds");

    public final StringPath scope = createString("scope");

    public final NumberPath<Long> updateBy = createNumber("updateBy", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updateTime = _super.updateTime;

    //inherited
    public final NumberPath<Integer> version = _super.version;

    public final StringPath webServerRedirectUri = createString("webServerRedirectUri");

    public QOAuth2Client(String variable) {
        super(OAuth2Client.class, forVariable(variable));
    }

    public QOAuth2Client(Path<? extends OAuth2Client> path) {
        super(path.getType(), path.getMetadata());
    }

    public QOAuth2Client(PathMetadata metadata) {
        super(OAuth2Client.class, metadata);
    }

}

