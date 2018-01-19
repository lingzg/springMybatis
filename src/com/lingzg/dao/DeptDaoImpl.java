package com.lingzg.dao;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.lingzg.entity.Dept;

@Repository
public class DeptDaoImpl {
	
	@Resource
	private SqlSessionTemplate template;
	
	public List<Dept> findAll() {
		return template.selectList("com.lingzg.dao.MyBatisDeptDao.findAll");
	}
	
	public Dept findById(int id) {
		return template.selectOne("com.lingzg.dao.MyBatisDeptDao.findById", id);
	}
	
	public void save(Dept dept) {
		template.insert("com.lingzg.dao.MyBatisDeptDao.save", dept);
	}
	
	public void update(Dept dept) {
		template.update("com.lingzg.dao.MyBatisDeptDao.update", dept);
	}
	
	public void delete(int id) {
		template.delete("com.lingzg.dao.MyBatisDeptDao.delete", id);
	}

}
