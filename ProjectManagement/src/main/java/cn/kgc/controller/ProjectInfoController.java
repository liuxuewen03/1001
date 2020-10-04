package cn.kgc.controller;

import cn.kgc.pojo.ProjectInfo;
import cn.kgc.service.ProjectInfoService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * @author shkstart
 * @create 2020-10-04 17:14
 */
@Controller
public class ProjectInfoController {
    @RequestMapping("/")
    public String index(){
        return "jsp/index";
    }
    @Resource
    ProjectInfoService projectinfoService;
    @RequestMapping("/sel")
    @ResponseBody
    public Map<String,Object> sel(Integer pageindex,Integer  pagesize,Integer status){
        Map<String,Object> map=new HashMap<>();
        PageInfo<ProjectInfo> select = projectinfoService.select(pageindex, pagesize, status);
        map.put("select",select);
        return map;
    }
    @RequestMapping("/chuan/{id}/{projectname}/{startdate}/{enddate}/{status}")
    public String chuan(@PathVariable Integer id, @PathVariable String projectname, @PathVariable String startdate,@PathVariable String enddate, @PathVariable Integer status, HttpSession session){
        session.setAttribute("id",id);
        session.setAttribute("projectname",projectname);
        session.setAttribute("startdate",startdate);
        session.setAttribute("status",status);
        session.setAttribute("enddate",enddate);
        return "jsp/index2";
    }
    @RequestMapping("/upd")
    public String xiu(ProjectInfo projectinfo, Model model){
        int update = projectinfoService.update(projectinfo);
        if(update>0){
            model.addAttribute("msg","修改成功");
        }else {
            model.addAttribute("msg","修改失败");
        }
        return "jsp/index";
    }
}
