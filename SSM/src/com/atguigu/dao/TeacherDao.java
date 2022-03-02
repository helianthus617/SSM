package com.atguigu.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.atguigu.bean.Teacher;


public interface TeacherDao {
	public Teacher getTeacherById(Integer id);
}
