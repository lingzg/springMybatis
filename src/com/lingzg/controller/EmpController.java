package com.lingzg.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lingzg.entity.Emp;
import com.lingzg.service.EmpService;

@Controller
@RequestMapping("/emp")
public class EmpController {

	@Resource
	private EmpService service;
	
	@RequestMapping("/list")
	public String list(ModelMap model){
		List<Emp> emps = service.findAll();
		model.addAttribute("emps", emps);
		return "emp";
	}
}
