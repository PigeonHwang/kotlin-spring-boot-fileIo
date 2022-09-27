package com.example.kotlinspringbootfileio.controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0017J\u0012\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0017R\u0012\u0010\u0003\u001a\u00020\u00048\u0012@\u0012X\u0093.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/kotlinspringbootfileio/controller/FileIoController;", "", "()V", "fileIoService", "Lcom/example/kotlinspringbootfileio/service/FileIoService;", "downloadScriptWithMultipartPOST", "Lorg/springframework/http/ResponseEntity;", "fileId", "", "uploadScriptWithMultipartPOST", "", "inputFile", "Lorg/springframework/web/multipart/MultipartFile;", "kotlin-spring-boot-fileIo"})
@org.springframework.web.bind.annotation.RestController()
public class FileIoController {
    @org.springframework.beans.factory.annotation.Autowired()
    private com.example.kotlinspringbootfileio.service.FileIoService fileIoService;
    
    public FileIoController() {
        super();
    }
    
    @org.springframework.web.bind.annotation.PostMapping(value = {"/upload"})
    public boolean uploadScriptWithMultipartPOST(@org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestParam()
    org.springframework.web.multipart.MultipartFile inputFile) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.PostMapping(value = {"/download"})
    public org.springframework.http.ResponseEntity<java.lang.Object> downloadScriptWithMultipartPOST(@org.springframework.web.bind.annotation.RequestParam()
    long fileId) {
        return null;
    }
}