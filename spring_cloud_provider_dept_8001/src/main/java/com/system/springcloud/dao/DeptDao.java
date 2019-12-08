package com.system.springcloud.dao;

import com.system.springcloud.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @program: spring_cloud_demo
 * @since:JDK-1.8
 * @author: Star-GuoqingLi
 * @create: 2019-12-08 12:10
 * @version:第1版
 * @description:
 **/
@Mapper
public interface DeptDao {
    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}
