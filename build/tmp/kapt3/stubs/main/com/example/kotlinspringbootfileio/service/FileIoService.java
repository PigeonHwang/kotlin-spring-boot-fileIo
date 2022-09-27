package com.example.kotlinspringbootfileio.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0017R\u001a\u0010\u0003\u001a\u00020\u0004X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0017"}, d2 = {"Lcom/example/kotlinspringbootfileio/service/FileIoService;", "", "()V", "fileIoUtil", "Lcom/example/kotlinspringbootfileio/service/FileIoUtil;", "getFileIoUtil", "()Lcom/example/kotlinspringbootfileio/service/FileIoUtil;", "setFileIoUtil", "(Lcom/example/kotlinspringbootfileio/service/FileIoUtil;)V", "fileRepository", "Lcom/example/kotlinspringbootfileio/model/files/FileRepository;", "getFileRepository", "()Lcom/example/kotlinspringbootfileio/model/files/FileRepository;", "setFileRepository", "(Lcom/example/kotlinspringbootfileio/model/files/FileRepository;)V", "downloadFile", "Lorg/springframework/http/ResponseEntity;", "fileId", "", "uploadFile", "", "file", "Lorg/springframework/web/multipart/MultipartFile;", "kotlin-spring-boot-fileIo"})
@org.springframework.stereotype.Service()
public class FileIoService {
    @org.springframework.beans.factory.annotation.Autowired()
    public com.example.kotlinspringbootfileio.model.files.FileRepository fileRepository;
    @org.jetbrains.annotations.NotNull()
    private com.example.kotlinspringbootfileio.service.FileIoUtil fileIoUtil;
    
    public FileIoService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.example.kotlinspringbootfileio.model.files.FileRepository getFileRepository() {
        return null;
    }
    
    public void setFileRepository(@org.jetbrains.annotations.NotNull()
    com.example.kotlinspringbootfileio.model.files.FileRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.example.kotlinspringbootfileio.service.FileIoUtil getFileIoUtil() {
        return null;
    }
    
    public void setFileIoUtil(@org.jetbrains.annotations.NotNull()
    com.example.kotlinspringbootfileio.service.FileIoUtil p0) {
    }
    
    @javax.transaction.Transactional()
    public boolean uploadFile(@org.jetbrains.annotations.NotNull()
    org.springframework.web.multipart.MultipartFile file) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.springframework.http.ResponseEntity<java.lang.Object> downloadFile(long fileId) {
        return null;
    }
}