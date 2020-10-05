package cn.kgc.service;

import cn.kgc.pojo.MeetingRoom;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-05 15:19
 */
public interface MeetingRoomService {
    List<MeetingRoom> selectAll();

    void insert(MeetingRoom meetingRoom);
}
