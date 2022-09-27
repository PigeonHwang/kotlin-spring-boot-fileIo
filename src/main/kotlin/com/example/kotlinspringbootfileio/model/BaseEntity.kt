package com.example.kotlinspringbootfileio.model

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.io.Serializable
import java.time.LocalDateTime
import java.time.OffsetDateTime
import javax.persistence.Column
import javax.persistence.EntityListeners
import javax.persistence.MappedSuperclass

@MappedSuperclass
@EntityListeners(AuditingEntityListener::class)
abstract class BaseEntity : Serializable {
  @CreatedDate
  var createdAt: LocalDateTime = LocalDateTime.now()

  @LastModifiedDate
  var updatedAt: LocalDateTime = LocalDateTime.now()
}