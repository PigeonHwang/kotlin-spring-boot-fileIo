package com.example.kotlinspringbootfileio.model.files;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0003H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/kotlinspringbootfileio/model/files/FileRepository;", "Lorg/springframework/data/jpa/repository/JpaRepository;", "Lcom/example/kotlinspringbootfileio/model/files/FileInfo;", "", "findFileInfoById", "id", "kotlin-spring-boot-fileIo"})
public abstract interface FileRepository extends org.springframework.data.jpa.repository.JpaRepository<com.example.kotlinspringbootfileio.model.files.FileInfo, java.lang.Long> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.kotlinspringbootfileio.model.files.FileInfo findFileInfoById(long id);
}