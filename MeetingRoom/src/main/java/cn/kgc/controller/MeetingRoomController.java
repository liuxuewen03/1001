package cn.kgc.controller;

import cn.kgc.pojo.MeetingRoom;
import cn.kgc.service.MeetingRoomService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.jws.WebParam;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-05 15:20
 */
@Controller
public class MeetingRoomController {
    @Resource
    MeetingRoomService meetingRoomService;

    @RequestMapping("/")
    public String toIndex(Model model){
        List<MeetingRoom> meetingRooms=meetingRoomService.selectAll();
        model.addAttribute("meetingRooms",meetingRooms);
        return "jsp/index";
    }
    @RequestMapping("/toAdd")
    public String toAdd(Model model){
        return "jsp/add";
    }
    @RequestMapping("/doAdd")
    public String doAdd(MeetingRoom meetingRoom){
        meetingRoomService.insert(meetingRoom);
        return "redirect:/";
    }
}
