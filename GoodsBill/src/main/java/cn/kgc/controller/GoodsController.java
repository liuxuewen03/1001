package cn.kgc.controller;

import cn.kgc.pojo.Goods;
import cn.kgc.service.GoodsService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @author shkstart
 * @create 2020-10-08 15:40
 */
@Controller
public class GoodsController {
    @Resource
    GoodsService goodsService;

    @RequestMapping("/")
    public String toIndex() {
        return "jsp/index";
    }

    @RequestMapping("/toSelect/{goodsDistrict}")
    public String toSelect(@PathVariable int goodsDistrict, String pageNumStr, Model model) {
        Integer pageNum = 1;
        if (pageNumStr != null) {
            pageNum = Integer.parseInt(pageNumStr);
        }
        int pageSize = 5;
        PageInfo<Goods> goodsPageInfo = goodsService.selectByGoodsDistrict(pageNum, pageSize, goodsDistrict, pageNumStr);
        model.addAttribute("goodsPageInfo", goodsPageInfo);
        return "jsp/select";
    }

    @RequestMapping("toUpdate/{id}")
    public String toUpdate(@PathVariable int id, Model model) {
        Goods goods=goodsService.selectById(id);
        model.addAttribute("goods",goods);
        return "jsp/update";
    }


    @RequestMapping("doUpdate")
    public String doUpdate(Goods goods) {
        goodsService.update(goods);
        return "redirect:/";
    }
}
