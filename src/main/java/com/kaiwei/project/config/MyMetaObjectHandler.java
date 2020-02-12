package com.kaiwei.project.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * @ProjectName: league
 * @Package: com.tiqiu.league.config
 * @ClassName: MyMetaObjectHandler
 * @Author: Kaiser
 * @Description: 自动注入功能
 * @Date: 2020/1/26 6:30 下午
 * @Version: 1.0
 */
@Slf4j
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        log.info("insert start fill...");
        // 起始版本 3.3.0(推荐使用)
        this.strictInsertFill(metaObject, "createTime", LocalDateTime.class, LocalDateTime.now());
//        this.setFieldValByName("createTime",TimeUtil.getNowTime(),metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        log.info("update start fill...");
        // 起始版本 3.3.0(推荐使用)
        this.strictUpdateFill(metaObject, "updateTime", LocalDateTime.class, LocalDateTime.now());
    }
}
