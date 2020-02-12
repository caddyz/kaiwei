package com.kaiwei.project.handler;

import com.kaiwei.project.error.LeagueException;
import com.kaiwei.project.util.ResultBody;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartException;

/**
 * @ProjectName: league
 * @Package: com.tiqiu.league.handler
 * @ClassName: LeagueExceptionHandler
 * @Author: Kaiser
 * @Description: 全局异常处理类
 * @Date: 2020-01-19 13:27
 * @Version: 1.0
 */
@ControllerAdvice
@ResponseBody
public class LeagueExceptionHandler {
    private static final Logger logger = LoggerFactory.getLogger(LeagueExceptionHandler.class);
    @ExceptionHandler(LeagueException.class)
    public ResultBody leagueExceptionHandler(LeagueException le){
        logger.error("发生业务异常！原因是：{}",le.getErrorMsg());
        return ResultBody.fail(le.getErrorCode(),le.getErrorMsg());
    }
    @ExceptionHandler(MultipartException.class)
    public ResultBody multipartException(MultipartException m){
        logger.error("文件上传异常",m);
        return ResultBody.fail(m.getCause().getMessage());
    }
    @ExceptionHandler(NullPointerException.class)
    public ResultBody nullExceptionHandler(NullPointerException n){
        logger.error("出现空指针异常", n);
        return ResultBody.fail("空指针异常");
    }
    @ExceptionHandler(Exception.class)
    public ResultBody exceptionHandler(Exception e){
        logger.error("出现其他异常", e);
        return ResultBody.fail("出现异常");
    }
}
