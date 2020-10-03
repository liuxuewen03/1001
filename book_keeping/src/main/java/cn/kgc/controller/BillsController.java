package cn.kgc.controller;

import cn.kgc.pojo.BillType;
import cn.kgc.pojo.Bills;
import cn.kgc.service.BillTypeService;
import cn.kgc.service.BillsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-03 16:53
 */
@Controller
public class BillsController {
    @Resource
    BillTypeService billTypeService;

    @Resource
    BillsService billsService;

    @RequestMapping("/")
    public String toIndex(Model model, String typeId) {
        if (typeId == "" || typeId == null) {
            typeId = "1";
        }

        List<BillType> types = billTypeService.selectAll();
        model.addAttribute("types", types);

        List<Bills> bills = billsService.selectBy(Integer.valueOf(typeId));
        model.addAttribute("bills", bills);
        return "jsp/index";
    }

    @RequestMapping("toAdd")
    public String toAdd() {
        return "jsp/add";
    }

    @RequestMapping("doAdd")
    public String doAdd(Bills bills) {
        billsService.insert(bills);
        return "redirect:/";
    }
}
