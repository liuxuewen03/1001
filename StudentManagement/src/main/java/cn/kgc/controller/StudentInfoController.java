package cn.kgc.controller;

import cn.kgc.pojo.StudentInfo;
import cn.kgc.service.StudentInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-09-24 9:19
 */
@Controller
public class StudentInfoController {

    @Resource
    StudentInfoService studentInfoService;

    @RequestMapping("/")
    public String toIndex(Model model) {
        List<StudentInfo> studentInfos = studentInfoService.selectAll();
        model.addAttribute("studentInfoList", studentInfos);
        return "jsp/index";
    }


    @RequestMapping("/update/{id}")
    public String toUpdate(@PathVariable int id,Model model) {
        StudentInfo studentInfo=studentInfoService.selectById(id);
        model.addAttribute("studentInfo",studentInfo);
        return "jsp/update";
    }

    @RequestMapping("update/doupdate")
    public String doUpdate(StudentInfo studentInfo) {
        studentInfoService.update(studentInfo);
        return "redirect:/";
    }
}
