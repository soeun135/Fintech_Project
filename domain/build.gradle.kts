
plugins {
    kotlin("plugin.jpa")
}//플러그인이 있으면 생성자를 굳이 만들어주지 않아도 됨.

version = "0.0.1"

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-jpa:2.7.6")
    implementation("org.springframework.boot:spring-boot-starter-data-redis")
    runtimeOnly("com.mysql:mysql-connector-j")
}