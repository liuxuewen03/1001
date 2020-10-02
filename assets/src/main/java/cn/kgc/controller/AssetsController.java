package cn.kgc.controller;

import cn.kgc.pojo.Assets;
import cn.kgc.service.AssetsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-02 14:30
 */
@Controller
public class AssetsController {
    @Resource
    AssetsService assetsService;

    @RequestMapping("/")
    public String toIndex() {
        return "jsp/index";
    }

    @RequestMapping("/toAdd")
    public String toAdd() {
        return "jsp/add";
    }

    @RequestMapping("/toIndex2")
    public String toIndex2(Model model, String assetname, String assettype) {
        if (assetname == null) {
            assetname = "";
        }
        if (assettype == null) {
            assettype = "";
        }
        System.out.println(assetname);
        System.out.println(assettype);
        List<Assets> assets = assetsService.selectAll(assetname, assettype);
        System.out.println(assets);
        model.addAttribute("assets", assets);
        return "jsp/index2";
    }

    @RequestMapping("doAdd")
    public String doAdd(Assets assets) {
        assetsService.insert(assets);

        return "redirect:/toIndex2";
    }

}
