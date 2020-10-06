package cn.kgc.controller;

import cn.kgc.pojo.Person;
import cn.kgc.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-01 12:15
 */
@Controller
public class PersonController {

    @Resource
    PersonService personService;

    @RequestMapping("/")
    public String toIndex(Model model) {
        List<Person> persons = personService.selectAll();
        model.addAttribute("persons", persons);
        return "jsp/index";
    }

    @RequestMapping("del/{id}")
    public String del(@PathVariable int id) {
        personService.delById(id);
        return "redirect:/";
    }

    @RequestMapping("toAdd")
    public String toAdd() {
        return "jsp/add";
    }

    @RequestMapping("doAdd")
    public String doAdd(Person person){
        personService.add(person);
        return "redirect:/";
    }
}
