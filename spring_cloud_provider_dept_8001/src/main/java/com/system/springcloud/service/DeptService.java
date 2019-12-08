package com.system.springcloud.service;

import com.system.springcloud.entity.Dept;

import java.util.List;

/**
 * @program: spring_cloud_demo
 * @since:JDK-1.8
 * @author: Star-GuoqingLi
 * @create: 2019-12-08 12:15
 * @version:第1版
 * @description:
 **/
public interface DeptService {
    public boolean add(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();
}
