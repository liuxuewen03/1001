package cn.kgc.service;

import cn.kgc.mapper.BillsMapper;
import cn.kgc.pojo.Bills;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-03 17:04
 */
public interface BillsService {
    List<Bills> selectBy(int typeId);

    void insert(Bills bills);
}
