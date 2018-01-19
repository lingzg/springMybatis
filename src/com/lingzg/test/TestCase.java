package com.lingzg.test;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lingzg.dao.DeptDao;
import com.lingzg.dao.EmpDao;
import com.lingzg.dao.EmpDaoImpl;
import com.lingzg.entity.Dept;
import com.lingzg.entity.Emp;

public class TestCase {
	
	/**
	 * 测试声明的bean
	 */
//	@Test
	public void test1() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		//SqlSessionFactoryBean这种以"Bean"为后缀的bean，
		//Spring不会直接实例化它，而是调用该bean来创建
		//另外一个bean，即SqlSessionFactory
		SqlSessionFactory sf =ctx.getBean("sqlSessionFactory", SqlSessionFactory.class);
		System.out.println(sf);
		
		MapperScannerConfigurer cfg = ctx.getBean("mapperScannerConfigurer", MapperScannerConfigurer.class);
		System.out.println(cfg);
	}
	
	/**
	 * 测试使用MapperScannerConfigure整合MyBatis，
	 * 来访问员工表
	 */
//	@Test
	public void test2() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		//EmpDao是MapperScannerConfigure自动创建的，
		//并放在Spring容器中，其ID是类名（首字母小写）
		EmpDao dao = ctx.getBean("empDao", EmpDao.class);
		List<Emp> list = dao.findAll();
		for(Emp e : list) {
			System.out.println(e.getEmpno() + " " +e.getEname());
		}
	}
	
	/**
	 * 测试使用MapperScannerConfigure整合MyBatis，
	 * 来访问部门表，但是要指定注解。
	 */
//	@Test
	public void test3() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		DeptDao dao = ctx.getBean("deptDao", DeptDao.class);
		List<Dept> list = dao.findAll();
		for(Dept d : list) {
			System.out.println(d.getDeptno() + " " +d.getDname());
		}
	}
	
	/**
	 * 测试使用sessionTemplate整合MyBatis，来访问部门表。
	 */
	@Test
	public void test4() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmpDaoImpl dao = ctx.getBean("empDaoImpl", EmpDaoImpl.class);
		List<Emp> list = dao.findAll();
		for(Emp e : list) {
			System.out.println(e.getEmpno() + " " +e.getEname());
		}
	}

}
