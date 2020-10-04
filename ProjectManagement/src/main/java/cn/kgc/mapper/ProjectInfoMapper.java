package cn.kgc.mapper;

import cn.kgc.pojo.ProjectInfo;
import cn.kgc.pojo.ProjectInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProjectInfoMapper {
    int countByExample(ProjectInfoExample example);

    int deleteByExample(ProjectInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProjectInfo record);

    int insertSelective(ProjectInfo record);

    List<ProjectInfo> selectByExample(ProjectInfoExample example);

    ProjectInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProjectInfo record, @Param("example") ProjectInfoExample example);

    int updateByExample(@Param("record") ProjectInfo record, @Param("example") ProjectInfoExample example);

    int updateByPrimaryKeySelective(ProjectInfo record);

    int updateByPrimaryKey(ProjectInfo record);
}