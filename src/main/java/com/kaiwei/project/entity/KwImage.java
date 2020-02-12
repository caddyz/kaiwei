package com.kaiwei.project.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @ProjectName: project
 * @Package: com.kaiwei.project.entity
 * @ClassName: KwImage
 * @Author: Kaiser
 * @Description:
 * @Date: 2020/2/9 9:54 下午
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class KwImage implements Serializable {
    private static final long serialVersionUID = -6014365160871830238L;
    private Integer id;
    private String imageUrl;
    private Boolean deleted;
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;
    @TableField(fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;
}
