package com.kaiwei.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ProjectName: project
 * @Package: com.kaiwei.project.entity
 * @ClassName: KwSwipe
 * @Author: Kaiser
 * @Description:
 * @Date: 2020/2/9 9:59 下午
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class KwSwipe implements Serializable {
    private static final long serialVersionUID = 7731958110780390791L;
    private Integer id;
    private String swipeImage;
}
