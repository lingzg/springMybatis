package com.lingzg.dao;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.lingzg.entity.Emp;

@Repository
public class EmpDaoImpl {

	@Resource
	private SqlSessionTemplate template;
	
	public List<Emp> findAll() {
		return template.selectList("com.lingzg.dao.EmpDao.findAll");
	}
}
