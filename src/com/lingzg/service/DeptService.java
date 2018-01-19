package com.lingzg.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lingzg.dao.DeptDaoImpl;
import com.lingzg.entity.Dept;

@Service
public class DeptService {

	@Resource
	private DeptDaoImpl dao;
	
	public List<Dept> findAll(){
		return dao.findAll();
	}
}
