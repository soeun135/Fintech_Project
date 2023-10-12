import org.springframework.boot.gradle.tasks.bundling.BootJar

plugins {}

version = "0.0.1"

dependencies {}

val jar: Jar by tasks
val bootJar: BootJar by tasks

bootJar.enabled = false
jar.enabled = true