package com.lingzg.dao;

import java.util.List;

import com.lingzg.annotation.MyBatisRepository;
import com.lingzg.entity.Emp;

@MyBatisRepository
public interface EmpDao {
	
	List<Emp> findAll();
}
