package com.example.kotlinspringbootfileio.service

import com.example.kotlinspringbootfileio.model.files.FileInfo
import org.springframework.web.multipart.MultipartFile
import java.io.File
import java.io.IOException
import java.lang.StringBuilder
import java.nio.file.Files
import java.nio.file.Paths
import java.security.MessageDigest
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter

class FileIoUtil {
    val allowedFileTypes = listOf<String>("image", "application/zip")

    fun uploadFileUtil(file: MultipartFile): FileInfo {
        var fileInfo = FileInfo()

        if(!checkAllowedFileType(file.contentType)) {
            println("file type : ${file.contentType} is not allowed")
            return fileInfo
        }

        try {
            var uploadFolder = makeDir()
            fileInfo.fileName = MD5Generator(file.originalFilename.toString() + OffsetDateTime.now()) + "." + file.originalFilename?.substring(file.originalFilename!!.lastIndexOf('.') + 1)
            var path =  Paths.get("/Users/hwangjong-in/Documents/fileUploadTest/" + uploadFolder + "/" + fileInfo.fileName)
            fileInfo.fileDir = path.toString()
            fileInfo.fileOriginName = file.originalFilename.toString()
            var bytes = file.bytes
            fileInfo.fileSize = bytes.size

            Files.write(path, bytes)

            return fileInfo
        } catch (e: IOException) {
            e.printStackTrace()
        }

        return fileInfo
    }

    /*fun downloadFile(fileInfo: FileInfo, downloadPath: String): Resource {
        try {
            var file = Paths.get("/Users/hwangjong-in/Documents/fileUploadTest").resolve(fileInfo.fileName)
            var resource = UrlResource(file.toUri())
            if(resource.exists() || resource.isReadable) {
                return resource
            } else {
                throw RuntimeException("Could not read file: ${fileInfo.fileName}")
            }
        } catch (e: MalformedURLException) {
            throw RuntimeException("Could not read file: ${fileInfo.fileName}")
        }
    }*/

    private fun MD5Generator(input: String): String {
        var mdMD5 = MessageDigest.getInstance("MD5")
        mdMD5.update(input.toByteArray())

        var md5Hash = mdMD5.digest()
        var hexMD5hash = StringBuilder()

        md5Hash.forEach {
            var hexString = String.format("%02x", it)
            hexMD5hash.append(hexString)
        }

        return hexMD5hash.toString()
    }

    private fun makeDir(): String {
        var dirName: String = OffsetDateTime.now().format(DateTimeFormatter.ofPattern("yyyy_MM_dd"))
        var uploadFolder = File("/Users/hwangjong-in/Documents/fileUploadTest", dirName)
        if(!uploadFolder.exists()) {
            uploadFolder.mkdirs()
        }

        return dirName
    }

    private fun checkAllowedFileType(contentType: String?): Boolean {
        allowedFileTypes.forEach {
            if (contentType != null) {
                if(contentType.startsWith(it)) {
                    return true
                }
            }
        }

        return false
    }
}