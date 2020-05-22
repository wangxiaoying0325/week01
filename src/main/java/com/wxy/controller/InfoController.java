package com.wxy.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wxy.beans.Info;
import com.wxy.beans.Teacher;
import com.wxy.service.InfoService;

@Controller
public class InfoController {

	@Resource
	private InfoService infoService;
	
	
	@RequestMapping("queryAll")
	public String queryAll(Model model,@RequestParam(defaultValue="1")Integer pageNum,
			String name,Integer status,String tname){
		//初始化分页参数
		PageHelper.startPage(pageNum, 4);
		//查询所有
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("name", name);
		map.put("status", status);
		map.put("tname", tname);
		
		List<Info> list = infoService.queryAll(map);
		//分页
		PageInfo<Info> page = new PageInfo<>(list);
		
		//查询所有老师
		List<Teacher> tlist = infoService.queryTeacherAll();
		
		//存储
		model.addAttribute("page", page);
		model.addAttribute("tlist", tlist);
		
		return "list";
		
	}
	
	
	@RequestMapping("queryTeacherAll")
	@ResponseBody
	public List<Teacher> queryTeacherAll(){
		//查询所有老师
		List<Teacher> tlist = infoService.queryTeacherAll();
		return tlist;
	}

	
	@RequestMapping("addInfo")
	public String insertInfo(Info info){
		try {
			//添加信息
			infoService.insertInfo(info);
			return "redirect:queryAll";
		} catch (Exception e) {
			e.printStackTrace();
			return "add";
		}
	}
	
	@RequestMapping("queryById")
	public String queryById(Integer id,Model model){
		//按id查询
		Info info = infoService.queryById(id);
		//查询所有老师
		List<Teacher> tlist = infoService.queryTeacherAll();
		
		//存储
		model.addAttribute("info", info);
		model.addAttribute("tlist", tlist);
		//页面分发
		return "show";
	}
	
	
	@RequestMapping("updateInfo")
	public String updateInfo(Integer id){
		//按id查询
		Info info = infoService.queryById(id);
		//修改信息
		infoService.updateInfo(info);
		return "redirect:queryAll";
	}
	
	
}
