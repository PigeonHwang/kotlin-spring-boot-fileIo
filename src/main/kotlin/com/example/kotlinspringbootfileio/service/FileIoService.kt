package com.example.kotlinspringbootfileio.service

import com.example.kotlinspringbootfileio.model.files.FileRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.core.io.InputStreamResource
import org.springframework.core.io.Resource
import org.springframework.http.ContentDisposition
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import org.springframework.web.multipart.MultipartFile
import java.nio.file.Files
import java.nio.file.Paths
import javax.transaction.Transactional

@Service
class FileIoService {
    @Autowired
    lateinit var fileRepository: FileRepository
    var fileIoUtil = FileIoUtil()

    @Transactional
    fun uploadFile(file: MultipartFile): Boolean {
        var fileInfo = fileIoUtil.uploadFileUtil(file)

        if(fileInfo.fileSize != 0) {
            fileRepository.save(fileInfo)
            return true
        }

        return false
    }

    fun downloadFile(fileId: Long): ResponseEntity<Any> {
        var fileInfo = fileRepository.findFileInfoById(fileId)
        var filePath = Paths.get(fileInfo.fileDir)
        var resource: Resource = InputStreamResource(Files.newInputStream(filePath))

        var headers = HttpHeaders()
        headers.contentDisposition = ContentDisposition.builder("attachment").filename(fileInfo.fileOriginName).build()

        return ResponseEntity<Any>(resource, headers, HttpStatus.OK)
    }
}