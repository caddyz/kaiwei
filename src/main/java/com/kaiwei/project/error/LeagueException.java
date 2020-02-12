package com.kaiwei.project.error;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @ProjectName: league
 * @Package: com.tiqiu.league.handler
 * @ClassName: LeagueException
 * @Author: Kaiser
 * @Description: 自定义业务异常处理
 * @Date: 2020-01-19 12:16
 * @Version: 1.0
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class LeagueException extends RuntimeException implements Serializable {
    private static final long serialVersionUID = -9063351211488062449L;
    /**
     * 错误代码
     */
    protected Integer errorCode;
    /**
     * 错误信息
     */
    protected String errorMsg;

    public LeagueException(){
        super();
    }

    public LeagueException(BaseErrorInfoInterface baseErrorInfoInterface){
        super(String.valueOf(baseErrorInfoInterface.getResultCode()));
        this.errorCode = baseErrorInfoInterface.getResultCode();
        this.errorMsg = baseErrorInfoInterface.getResultMessage();
    }

    public LeagueException(BaseErrorInfoInterface baseErrorInfoInterface, Throwable cause){
        super(String.valueOf(baseErrorInfoInterface.getResultCode()),cause);
        this.errorCode = baseErrorInfoInterface.getResultCode();
        this.errorMsg = baseErrorInfoInterface.getResultMessage();
    }

    public LeagueException(String errorMsg){
        super(errorMsg);
        this.errorMsg = errorMsg;
    }

    public LeagueException(Integer errorCode,String errorMsg){
        super(String.valueOf(errorCode));
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public LeagueException(Integer errorCode,String errorMsg,Throwable cause){
        super(String.valueOf(errorCode),cause);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }
    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}
