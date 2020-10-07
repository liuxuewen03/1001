package cn.kgc.service.impl;

import cn.kgc.mapper.StudentInfoMapper;
import cn.kgc.pojo.StudentInfo;
import cn.kgc.service.StudentInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-09-24 9:59
 */
@Service("studentInfoService")
public class StudentInfoServiceImpl implements StudentInfoService {

    @Resource
    StudentInfoMapper studentInfoMapper;

    @Override
    public List<StudentInfo> selectAll() {
        List<StudentInfo> studentInfos = studentInfoMapper.selectByExample(null);
        return studentInfos;
    }

    @Override
    public StudentInfo selectById(int id) {
        StudentInfo studentInfo = studentInfoMapper.selectByPrimaryKey(id);
        return studentInfo;
    }

    @Override
    public void update(StudentInfo studentInfo) {
        studentInfoMapper.updateByPrimaryKeySelective(studentInfo);
    }
}
