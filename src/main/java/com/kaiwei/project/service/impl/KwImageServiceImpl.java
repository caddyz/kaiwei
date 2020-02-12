package com.kaiwei.project.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kaiwei.project.entity.KwImage;
import com.kaiwei.project.mapper.KwImageMapper;
import com.kaiwei.project.service.IKwImageService;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: project
 * @Package: com.kaiwei.project.service.impl
 * @ClassName: KwImageServiceImpl
 * @Author: Kaiser
 * @Description:
 * @Date: 2020/2/9 10:04 下午
 * @Version: 1.0
 */
@Service
public class KwImageServiceImpl extends ServiceImpl<KwImageMapper, KwImage> implements IKwImageService {
}
