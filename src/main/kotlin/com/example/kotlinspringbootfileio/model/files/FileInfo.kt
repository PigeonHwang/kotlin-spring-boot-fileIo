package com.example.kotlinspringbootfileio.model.files

import com.example.kotlinspringbootfileio.model.BaseEntity
import javax.persistence.*

@Entity
@Table(name = "files")
class FileInfo : BaseEntity() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0
    @Column(name = "file_name")
    var fileName: String = ""
    @Column(name = "file_dir")
    var fileDir: String = ""
    @Column(name = "file_origin_name")
    var fileOriginName: String = ""
    @Column(name = "file_size")
    var fileSize: Int = 0
}