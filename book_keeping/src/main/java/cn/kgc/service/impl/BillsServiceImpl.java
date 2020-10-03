package cn.kgc.service.impl;

import cn.kgc.mapper.BillTypeMapper;
import cn.kgc.mapper.BillsMapper;
import cn.kgc.pojo.BillType;
import cn.kgc.pojo.Bills;
import cn.kgc.pojo.BillsExample;
import cn.kgc.service.BillsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-03 17:04
 */
@Service("billsService")
public class BillsServiceImpl implements BillsService {
    @Resource
    BillsMapper billsMapper;

    @Resource
    BillTypeMapper billTypeMapper;

    @Override
    public List<Bills> selectBy(int typeId) {
        List<Bills> bills;
        BillsExample billsExample = new BillsExample();
        BillsExample.Criteria criteria = billsExample.createCriteria();
        if (typeId == 1) {
            bills = billsMapper.selectByExample(null);
        } else {
            criteria.andTypeIdEqualTo(typeId);
            bills = billsMapper.selectByExample(billsExample);
        }
        /*   criteria.andBillTimeLessThanOrEqualTo(dbillTime);*/

        for (Bills bill : bills) {
            BillType billType = billTypeMapper.selectByPrimaryKey(bill.getTypeId());
            bill.setTypeName(billType.getName());
        }

        return bills;
    }

    @Override
    public void insert(Bills bills) {
        billsMapper.insertSelective(bills);
    }
}
