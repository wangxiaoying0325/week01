package com.wxy.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wxy.beans.Info;
import com.wxy.beans.Teacher;
import com.wxy.mapper.InfoMapper;
@Service
public class InfoServiceImpl implements InfoService {
	
	@Resource
	private InfoMapper infoMapper;

	@Override
	public List<Info> queryAll(Map<String, Object> map) {
		return infoMapper.queryAll(map);
	}

	@Override
	public List<Teacher> queryTeacherAll() {
		return infoMapper.queryTeacherAll();
	}

	@Override
	public void insertInfo(Info info) {
		infoMapper.insertInfo(info);
	}

	@Override
	public Info queryById(Integer id) {
		return infoMapper.queryById(id);
	}

	@Override
	public void updateInfo(Info info) {
		infoMapper.updateInfo(info);
	}

}
