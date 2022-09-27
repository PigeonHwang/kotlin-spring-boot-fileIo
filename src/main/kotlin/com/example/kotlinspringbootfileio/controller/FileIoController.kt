package com.example.kotlinspringbootfileio.controller

import com.example.kotlinspringbootfileio.config.FileIoConfig
import com.example.kotlinspringbootfileio.service.FileIoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.multipart.MultipartFile

@RestController
class FileIoController {
    @Autowired
    private lateinit var fileIoService: FileIoService

    @PostMapping("/upload")
    fun uploadScriptWithMultipartPOST(@RequestParam inputFile: MultipartFile): Boolean {
        return fileIoService.uploadFile(inputFile)
    }

    @PostMapping("/download")
    fun downloadScriptWithMultipartPOST(@RequestParam fileId: Long): ResponseEntity<Any> {
        return fileIoService.downloadFile(fileId)
    }
}