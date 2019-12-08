package com.system.springcloud.service.impl;

import com.system.springcloud.dao.DeptDao;
import com.system.springcloud.entity.Dept;
import com.system.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: spring_cloud_demo
 * @since:JDK-1.8
 * @author: Star-GuoqingLi
 * @create: 2019-12-08 12:16
 * @version:第1版
 * @description:
 **/
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    @Override
    public boolean add(Dept dept)
    {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept get(Long id)
    {
        return deptDao.findById(id);
    }

    @Override
    public List<Dept> list()
    {
        return deptDao.findAll();
    }
}
