package com.zerobase.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.cache.annotation.EnableCaching
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@ComponentScan(basePackages = ["com.zerobase"])
@EntityScan(basePackages = ["com.zerobase.domain"])
@EnableJpaRepositories(basePackages = ["com.zerobase.domain.repository"])
class ApiApplication

fun main(args: Array<String>) {
    runApplication<ApiApplication>(*args)
}