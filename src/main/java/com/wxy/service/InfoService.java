package com.wxy.service;

import java.util.List;
import java.util.Map;

import com.wxy.beans.Info;
import com.wxy.beans.Teacher;

public interface InfoService {
	
	//查询晾被信息
	public List<Info> queryAll(Map<String, Object> map);
	
	//查询所有老师
	public List<Teacher> queryTeacherAll();
	
	//添加
	public void insertInfo(Info info);
	
	//按id查询
	public Info queryById(Integer id);
	
	//修改晒被信息
	public void updateInfo(Info info);

}
