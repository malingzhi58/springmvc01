package com.bjpowernode.dao;

import com.bjpowernode.domain.Teacher;

import java.util.List;

public interface TeacherDao {
    public int insertTeacher(Teacher teacher);
    public List<Teacher> selectTeachers();
}
