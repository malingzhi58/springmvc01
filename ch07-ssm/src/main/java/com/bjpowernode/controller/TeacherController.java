package com.bjpowernode.controller;

import com.bjpowernode.domain.Teacher;
import com.bjpowernode.service.TeacherService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/teacher")
public class TeacherController {

    @Resource
    private TeacherService service;

    @RequestMapping("/addTeacher.do")
    public ModelAndView addTeacher(Teacher teacher){
        ModelAndView mv = new ModelAndView();
        String tips = "failure";
        //调用service处理student
        int nums = service.addTeacher(teacher);
        if( nums > 0 ){
            //注册成功
            tips = "teacher【" + teacher.getName() + "】注册成功";
        }
        //添加数据
        mv.addObject("tips",tips);
        //指定结果页面
        mv.setViewName("result");
        return mv;

    }

    //处理查询，响应ajax
    @RequestMapping("/queryTeacher.do")
    @ResponseBody
    public List<Teacher> queryTeacher(){
        //参数检查， 简单的数据处理
        List<Teacher> students = service.findTeachers();
        System.out.println("begin searching");
        students.forEach(teacher-> System.out.println(teacher));
        return students;
    }
}
