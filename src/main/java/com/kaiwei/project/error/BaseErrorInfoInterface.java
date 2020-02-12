package com.kaiwei.project.error;

/**
 * @ProjectName: league
 * @Package: com.tiqiu.league
 * @ClassName: BaseErrorInfoInterface
 * @Author: Kaiser
 * @Description: 错误基础接口类
 * @Date: 2020-01-19 11:53
 * @Version: 1.0
 */
public interface BaseErrorInfoInterface {
    /**
     *  获取状态码
     * @return String （如200）
     */
    Integer getResultCode();

    /**
     * 获取错误信息
     * @return String 错误信息
     */
    String getResultMessage();
}
