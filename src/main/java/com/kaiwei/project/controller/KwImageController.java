package com.kaiwei.project.controller;

import com.kaiwei.project.entity.KwImage;
import com.kaiwei.project.service.IKwImageService;
import com.kaiwei.project.util.ResultBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ProjectName: project
 * @Package: com.kaiwei.project.controller
 * @ClassName: KwImageController
 * @Author: Kaiser
 * @Description:
 * @Date: 2020/2/9 10:07 下午
 * @Version: 1.0
 */
@RestController
@RequestMapping("/image")
public class KwImageController {
    private final IKwImageService imageService;
    @Autowired
    public KwImageController(IKwImageService imageService) {
        this.imageService = imageService;
    }

    @GetMapping("/getListImage")
    public ResultBody getListImages(){
        List<KwImage> list = imageService.list();
        if (list.size() > 0) {
            return ResultBody.success(list);
        }
        return ResultBody.fail("没有获取到数据");
    }
}
