package cn.kgc.service.impl;

import cn.kgc.mapper.ProjectInfoMapper;
import cn.kgc.pojo.ProjectInfo;
import cn.kgc.pojo.ProjectInfoExample;
import cn.kgc.service.ProjectInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-04 17:17
 */
@Service("projectInfoService")
public class ProjectInfoServiceImpl implements ProjectInfoService {
    @Resource
    ProjectInfoMapper projectinfoMapper;

    @Override
    public PageInfo<ProjectInfo> select(Integer pageIndex, int pageSize, Integer status) {
        ProjectInfoExample example = new ProjectInfoExample();
        ProjectInfoExample.Criteria criteria = example.createCriteria();
        if (status != 0) {
            criteria.andStatusEqualTo(status);
        }
        PageHelper.startPage(pageIndex, pageSize);
        List<ProjectInfo> projectinfos = projectinfoMapper.selectByExample(example);
        PageInfo<ProjectInfo> projectinfoPageInfo = new PageInfo<>(projectinfos);
        return projectinfoPageInfo;
    }

    @Override
    public int update(ProjectInfo projectinfo) {
        return projectinfoMapper.updateByPrimaryKeySelective(projectinfo);
    }
}
