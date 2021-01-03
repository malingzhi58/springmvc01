package com.bjpowernode.service.impl;

import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.dao.TeacherDao;
import com.bjpowernode.domain.Teacher;
import com.bjpowernode.service.TeacherService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Resource
    private TeacherDao teacherDao;

    @Override
    public int addTeacher(Teacher teacher) {
        int num = teacherDao.insertTeacher(teacher);
        return num;
    }

    @Override
    public List<Teacher> findTeachers() {
        return teacherDao.selectTeachers();
    }
}
