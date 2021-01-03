package com.bjpowernode.service;


import com.bjpowernode.domain.Teacher;

import java.util.List;

public interface TeacherService {

    int addTeacher(Teacher teacher);
    List<Teacher> findTeachers();
}
