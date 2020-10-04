package cn.kgc.service;

import cn.kgc.pojo.ProjectInfo;
import com.github.pagehelper.PageInfo;

/**
 * @author shkstart
 * @create 2020-10-04 17:16
 */
public interface ProjectInfoService {
    PageInfo<ProjectInfo> select(Integer pageIndex, int pageSize, Integer status);
    int update(ProjectInfo projectinfo);
}
