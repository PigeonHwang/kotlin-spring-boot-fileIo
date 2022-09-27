package com.example.kotlinspringbootfileio.model.files;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QFileInfo is a Querydsl query type for FileInfo
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QFileInfo extends EntityPathBase<FileInfo> {

    private static final long serialVersionUID = -939736703L;

    public static final QFileInfo fileInfo = new QFileInfo("fileInfo");

    public final com.example.kotlinspringbootfileio.model.QBaseEntity _super = new com.example.kotlinspringbootfileio.model.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath fileDir = createString("fileDir");

    public final StringPath fileName = createString("fileName");

    public final StringPath fileOriginName = createString("fileOriginName");

    public final NumberPath<Integer> fileSize = createNumber("fileSize", Integer.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QFileInfo(String variable) {
        super(FileInfo.class, forVariable(variable));
    }

    public QFileInfo(Path<? extends FileInfo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QFileInfo(PathMetadata metadata) {
        super(FileInfo.class, metadata);
    }

}

