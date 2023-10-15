package com.zerobase.api.config

import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaAuditing
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@Configuration
@EnableJpaAuditing
@ComponentScan(basePackages = ["com.zerobase"])
@EntityScan(basePackages = ["com.zerobase.domain"])
@EnableJpaRepositories(basePackages = ["com.zerobase.domain"])
class JpaAuditingConfiguration {
}