package cn.kgc.service.impl;

import cn.kgc.mapper.BillTypeMapper;
import cn.kgc.pojo.BillType;
import cn.kgc.service.BillTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-03 16:52
 */
@Service("billTypeService")
public class BillTypeServiceImpl implements BillTypeService {
    @Resource
    BillTypeMapper billTypeMapper;


    @Override
    public List<BillType> selectAll() {
        List<BillType> types = billTypeMapper.selectByExample(null);
        return types;
    }
}
