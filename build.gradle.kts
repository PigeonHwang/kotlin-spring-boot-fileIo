import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "2.7.3"
    id("io.spring.dependency-management") version "1.0.12.RELEASE"

    kotlin("jvm") version "1.7.10"
    kotlin("plugin.spring") version "1.7.10"
    kotlin("plugin.noarg") version "1.7.10"
    kotlin("plugin.jpa") version "1.7.10"
    kotlin("kapt") version "1.7.10"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    implementation("org.flywaydb:flyway-core:9.1.6")

    // Spring Boot dependencies
    implementation("org.springframework.boot:spring-boot-starter-web:2.7.3")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa:2.7.3")
    implementation("org.springframework.boot:spring-boot-configuration-processor")

    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.13.3")
    implementation("io.projectreactor.kotlin:reactor-kotlin-extensions:1.1.7")
    implementation("org.jetbrains.kotlin:kotlin-reflect:1.3.50")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.50")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactor:1.6.4")

    // Query DSL dependencies
    implementation("com.querydsl:querydsl-jpa:5.0.0")

    kapt("com.querydsl:querydsl-apt:5.0.0:jpa")
    kapt("org.springframework.boot:spring-boot-configuration-processor")

    implementation("com.vladmihalcea:hibernate-types-55:2.18.0")
    implementation("javax.servlet:javax.servlet-api:4.0.1")

    developmentOnly("org.springframework.boot:spring-boot-devtools:2.7.3")

    runtimeOnly("com.h2database:h2:2.1.214")
    runtimeOnly("org.postgresql:postgresql:42.4.2")

    testImplementation("org.springframework.boot:spring-boot-starter-test:2.7.3")
    testImplementation("io.projectreactor:reactor-test:3.4.22")
}

noArg {
    annotation("javax.persistence.Entity")
}

allOpen {
    annotation("javax.persistence.Entity")
    annotation("javax.persistence.MappedSuperclass")
    annotation("javax.persistence.Embeddable")
}

kotlin {
    sourceSets {
        main {
            setBuildDir("$buildDir")
        }
    }
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "11"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
