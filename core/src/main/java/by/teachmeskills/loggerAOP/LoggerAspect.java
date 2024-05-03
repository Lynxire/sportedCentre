package by.teachmeskills.loggerAOP;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class LoggerAspect {
    @Pointcut(value = "@annotation(by.teachmeskills.loggerAOP.LoggingAnnotation)")
    public void starterService(){

    }

    @Before(value = "starterService()")
    public void beforeService(){
        log.info("Start request");
    }

    @After(value = "starterService()")
    public void afterService(){
        log.info("End request");
    }
}
