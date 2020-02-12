package com.kaiwei.project.controller;

import com.kaiwei.project.entity.KwSwipe;
import com.kaiwei.project.service.IKwSwipeService;
import com.kaiwei.project.util.ResultBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ProjectName: project
 * @Package: com.kaiwei.project.controller
 * @ClassName: KwSwipeController
 * @Author: Kaiser
 * @Description:
 * @Date: 2020/2/10 1:27 下午
 * @Version: 1.0
 */
@RestController
@RequestMapping("/swipe")
public class KwSwipeController {
    private final IKwSwipeService swipeService;
    @Autowired
    public KwSwipeController(IKwSwipeService swipeService) {
        this.swipeService = swipeService;
    }

    @GetMapping("/getSwipe")
    public ResultBody getSwipe(){
        List<KwSwipe> list = swipeService.list();
        if (list.size() > 0) {
            return ResultBody.success(list);
        }
        return ResultBody.fail("没有获取到数据");
    }
}
