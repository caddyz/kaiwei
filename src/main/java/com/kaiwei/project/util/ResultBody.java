package com.kaiwei.project.util;

import com.alibaba.fastjson.JSONObject;
import com.kaiwei.project.error.BaseErrorInfoInterface;
import lombok.Data;

import java.io.Serializable;

/**
 * @ProjectName: league
 * @Package: com.tiqiu.league.handler
 * @ClassName: ResultBody
 * @Author: Kaiser
 * @Description: 响应实体类
 * @Date: 2020-01-19 13:03
 * @Version: 1.0
 */
@Data
public class ResultBody implements Serializable {
    private static final long serialVersionUID = -7724684360575813853L;
    private Integer code;
    private String message;
    private Object result;

    public ResultBody(){}

    public ResultBody(BaseErrorInfoInterface baseErrorInfoInterface){
        this.code = baseErrorInfoInterface.getResultCode();
        this.message = baseErrorInfoInterface.getResultMessage();
    }

    /**
     * 成功
     * @return
     */
    public static ResultBody success(){
        return success(null);
    }

    /**
     * 成功
     * @param data 结果数据
     * @return
     */
    public static ResultBody success(Object data){
        ResultBody rb = new ResultBody();
        rb.setCode(20000);
        rb.setMessage("成功");
        rb.setResult(data);
        return rb;
    }

    /**
     *  失败
     * @param message 失败信息
     * @return
     */
    public static ResultBody fail(String message){
        ResultBody rb = new ResultBody();
        rb.setCode(-1);
        rb.setMessage(message);
        rb.setResult(null);
        return rb;
    }

    /**
     * 失败
     * @param baseErrorInfoInterface 返回错误信息
     * @return
     */
    public static ResultBody fail(BaseErrorInfoInterface baseErrorInfoInterface){
        ResultBody rb = new ResultBody();
        rb.setCode(baseErrorInfoInterface.getResultCode());
        rb.setMessage(baseErrorInfoInterface.getResultMessage());
        rb.setResult(null);
        return rb;
    }

    /**
     * 失败
     * @param code 错误码
     * @param message 错误信息
     * @return
     */
    public static ResultBody fail(Integer code,String message){
        ResultBody rb = new ResultBody();
        rb.setCode(code);
        rb.setMessage(message);
        rb.setResult(null);
        return rb;
    }

    /**
     * 结果封装
     * @return
     */
    public static ResultBody getResult(boolean bo){
        if (bo) {
            return ResultBody.success();
        } else {
            return ResultBody.fail("失败，请检查");
        }
    }

    public static ResultBody getResult(boolean bo, Object success, String failMessage) {
        if (bo) {
            return ResultBody.success(success);
        } else {
            return ResultBody.fail(failMessage);
        }
    }
    public static ResultBody getResult(boolean bo,String failMessage) {
        if (bo) {
            return ResultBody.success();
        } else {
            return ResultBody.fail(failMessage);
        }
    }


    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}
