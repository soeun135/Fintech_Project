import org.springframework.boot.gradle.tasks.bundling.BootJar

plugins {}

version = "0.0.1"

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-jpa:2.7.6")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation(project(":domain"))
}

val jar: Jar by tasks
val bootJar: BootJar by tasks

bootJar.enabled = false
jar.enabled = true