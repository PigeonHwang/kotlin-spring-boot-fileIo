package com.example.kotlinspringbootfileio.config

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "file")
class FileIoConfig {
    private lateinit var uploadDir: String

    fun getUploadDir(): String {
        return uploadDir
    }

    fun setUploadDir(uploadDir: String) {
        this.uploadDir = uploadDir
    }
}