package com.zerobase.api.aop

import mu.KotlinLogging
import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Pointcut
import org.springframework.stereotype.Component
import org.springframework.util.StopWatch

@Component
@Aspect
class LogAspect {
    var logger = KotlinLogging.logger{}
    @Pointcut("within(com.zerobase.api..*)")
    private fun isApi() {}

    @Around("isApi()")
    fun loggingAspect(joinPoint: ProceedingJoinPoint) : Any {
        //위에서 해당 패키지의 메소드가 호출될 떄 여기 메소드도 계속 호출이 됨.
        //성능체크, 파라미터, 응답 등등 테스트를 해볼 수 잇음.
        val stopWatch = StopWatch()
        stopWatch.start()

        val result = joinPoint.proceed()

        stopWatch.stop()

        logger.info { "${joinPoint.signature.name} ${joinPoint.args[0]} ${stopWatch.lastTaskTimeMillis}"}

        return result
    }
}