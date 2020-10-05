package cn.kgc.service.impl;

import cn.kgc.mapper.MeetingRoomMapper;
import cn.kgc.pojo.MeetingRoom;
import cn.kgc.service.MeetingRoomService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-05 15:20
 */
@Service("meetingRoomService")
public class MeetingRoomServiceImpl implements MeetingRoomService {
    @Resource
    MeetingRoomMapper meetingRoomMapper;


    @Override
    public List<MeetingRoom> selectAll() {
        List<MeetingRoom> meetingRooms = meetingRoomMapper.selectByExample(null);
        return meetingRooms;
    }

    @Override
    public void insert(MeetingRoom meetingRoom) {
        meetingRoomMapper.insertSelective(meetingRoom);
    }
}
