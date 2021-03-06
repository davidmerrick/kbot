group = "example.jbot"

repositories {
    mavenCentral()
    jcenter()
    maven("https://jitpack.io")
}

plugins {
    id("org.springframework.boot") version "2.0.5.RELEASE"
    kotlin("jvm") version "1.3.61"
    kotlin("plugin.spring") version "1.3.61"
}

dependencies {
    implementation("me.ramswaroop.jbot:jbot:4.1.2-rc.2")
    implementation("io.github.microutils:kotlin-logging:1.7.8")
    implementation("org.springframework.boot:spring-boot-dependencies:1.4.0.RELEASE")
    implementation("org.springframework.boot:spring-boot-starter-parent:1.4.0.RELEASE")
    implementation(kotlin("stdlib-jdk8"))

    testImplementation("org.springframework.boot:spring-boot-starter-test:2.2.4.RELEASE")
    testImplementation("junit:junit:4.12")
    testImplementation("junit:junit:4.12")
    testImplementation("org.mockito:mockito-core:3.2.4")
}

tasks {

    compileKotlin {
        kotlinOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict") // For Spring Boot
            jvmTarget = "1.8"
        }
    }

    compileTestKotlin {
        kotlinOptions {
            jvmTarget = "1.8"
        }
    }
}