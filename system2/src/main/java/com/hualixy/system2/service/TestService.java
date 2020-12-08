package com.hualixy.system2.service;

import com.hualixy.system2.mapper.TestMapper;
import com.hualixy.system2.domain.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @program: online
 * @description: 服务层
 * @author: GuiQingChen
 * @create: 2020-11-26 17:50
 **/
@Service
public class TestService {

    private static final Logger LOG= LoggerFactory.getLogger(TestService.class);

    @Autowired
    public TestMapper testMapper;

    public List<Test> list(){
        LOG.info("Service..");
        return testMapper.list();
    }

}
