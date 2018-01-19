package com.lingzg.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lingzg.dao.EmpDao;
import com.lingzg.entity.Emp;

@Service
public class EmpService {

	@Resource
	private EmpDao dao;
	
	public List<Emp> findAll(){
		return dao.findAll();
	}
}
