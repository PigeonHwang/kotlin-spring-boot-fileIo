package com.example.kotlinspringbootfileio.model.files;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\u00048\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001e\u0010\u000f\u001a\u00020\u00108\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006\u001b"}, d2 = {"Lcom/example/kotlinspringbootfileio/model/files/FileInfo;", "Lcom/example/kotlinspringbootfileio/model/BaseEntity;", "()V", "fileDir", "", "getFileDir", "()Ljava/lang/String;", "setFileDir", "(Ljava/lang/String;)V", "fileName", "getFileName", "setFileName", "fileOriginName", "getFileOriginName", "setFileOriginName", "fileSize", "", "getFileSize", "()I", "setFileSize", "(I)V", "id", "", "getId", "()J", "setId", "(J)V", "kotlin-spring-boot-fileIo"})
@javax.persistence.Table(name = "files")
@javax.persistence.Entity()
public class FileInfo extends com.example.kotlinspringbootfileio.model.BaseEntity {
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @javax.persistence.Id()
    private long id = 0L;
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.Column(name = "file_name")
    private java.lang.String fileName = "";
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.Column(name = "file_dir")
    private java.lang.String fileDir = "";
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.Column(name = "file_origin_name")
    private java.lang.String fileOriginName = "";
    @javax.persistence.Column(name = "file_size")
    private int fileSize = 0;
    
    public FileInfo() {
        super();
    }
    
    public long getId() {
        return 0L;
    }
    
    public void setId(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getFileName() {
        return null;
    }
    
    public void setFileName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getFileDir() {
        return null;
    }
    
    public void setFileDir(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getFileOriginName() {
        return null;
    }
    
    public void setFileOriginName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public int getFileSize() {
        return 0;
    }
    
    public void setFileSize(int p0) {
    }
}