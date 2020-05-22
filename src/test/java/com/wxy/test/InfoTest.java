package com.wxy.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wxy.beans.Info;
import com.wxy.mapper.InfoMapper;

public class InfoTest {
	
	@Test
	public void test01(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//获取mapper
		InfoMapper infoMapper = ac.getBean(InfoMapper.class);
		
		Info info = new Info();
		info.setName("525");
		info.setTid(3);
		
		//调用添加
		infoMapper.insertInfo(info);
	}

	@Test
	public void test02(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//获取mapper
		InfoMapper infoMapper = ac.getBean(InfoMapper.class);
		
		Map<String, Object> map = new HashMap<String, Object>();
		//查询晾被信息
		List<Info> list = infoMapper.queryAll(map);
		
		for (Info info : list) {
			System.out.println(info);
			
		}
	}
	
	@Test
	public void test03(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//获取mapper
		InfoMapper infoMapper = ac.getBean(InfoMapper.class);
		
		Info info = new Info();
		info.setId(8);
		
		//收被
		infoMapper.updateInfo(info);
		
	}
}
