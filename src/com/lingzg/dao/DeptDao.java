package com.lingzg.dao;

import java.util.List;

import com.lingzg.annotation.MyBatisRepository;
import com.lingzg.entity.Dept;

//使用自定义注解声明Mapper接口，使得
//MapperScannerConfigurer只扫描带有
//这个注解的接口
@MyBatisRepository
public interface DeptDao {

	List<Dept> findAll();
	
}
