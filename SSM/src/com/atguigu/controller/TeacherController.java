package com.atguigu.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.atguigu.bean.Teacher;
import com.atguigu.service.TeacherService;

@Controller
public class TeacherController {
	@Autowired
	private TeacherService teacherService;
	
	
	@RequestMapping("/getTea")
	public String getTeacher(
			@RequestParam(value="id",defaultValue="1")Integer id,
			Model model
			)
	{
		Teacher teacher = teacherService.getTeacher(id);	
		model.addAttribute("teacher",teacher);
		return "success";
	}

}
