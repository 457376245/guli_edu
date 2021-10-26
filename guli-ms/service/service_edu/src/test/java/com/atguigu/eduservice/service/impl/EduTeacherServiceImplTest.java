package com.atguigu.eduservice.service.impl;

import com.atguigu.eduservice.entity.EduTeacher;
import com.atguigu.eduservice.service.EduTeacherService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

import static org.junit.Assert.*;

/**
 * @Program: guli_parent
 * @ClassName: EduTeacherServiceImplTest
 * @Author: JH
 * @Date: 2021-10-16 09:44
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class EduTeacherServiceImplTest {
    @Autowired
    private EduTeacherService service;
    @Test
    public void test1(){
        Page<EduTeacher> page = new Page<>();
        page.setSize(5);
        page.setCurrent(1L);
        Map<String, Object> frontList = service.getTeacherFrontList(page);
    }
}