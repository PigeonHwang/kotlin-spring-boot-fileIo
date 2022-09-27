package com.example.kotlinspringbootfileio.model.files

import org.springframework.data.jpa.repository.JpaRepository

interface FileRepository: JpaRepository<FileInfo, Long> {
    fun findFileInfoById(id: Long): FileInfo
}