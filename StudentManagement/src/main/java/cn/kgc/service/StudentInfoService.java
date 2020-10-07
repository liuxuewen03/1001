package cn.kgc.service;

import cn.kgc.pojo.StudentInfo;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-09-24 9:58
 */
public interface StudentInfoService {
    List<StudentInfo> selectAll();

    StudentInfo selectById(int id);

    void update(StudentInfo studentInfo);
}
