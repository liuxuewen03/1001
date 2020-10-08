package cn.kgc.service.impl;

import cn.kgc.mapper.GoodsMapper;
import cn.kgc.pojo.Goods;
import cn.kgc.pojo.GoodsExample;
import cn.kgc.service.GoodsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-08 15:36
 */
@Service("goodsService")
public class GoodsServiceImpl implements GoodsService {
    @Resource
    GoodsMapper goodsMapper;


    @Override
    public PageInfo<Goods> selectByGoodsDistrict(int pageNum, int pageSize, int goodsDistrict, String pageNumStr) {
        GoodsExample goodsExample = new GoodsExample();
        GoodsExample.Criteria criteria = goodsExample.createCriteria();
        criteria.andGoodsdistrictEqualTo(goodsDistrict);

        PageHelper.startPage(pageNum, pageSize);
        PageHelper.orderBy("id desc");
        List<Goods> goods = goodsMapper.selectByExample(goodsExample);
        PageInfo<Goods> goodsPageInfo = new PageInfo<>(goods);
        return goodsPageInfo;
    }

    @Override
    public Goods selectById(int id) {
        Goods goods = goodsMapper.selectByPrimaryKey((long) id);
        return goods;
    }

    @Override
    public void update(Goods goods) {
        goodsMapper.updateByPrimaryKeySelective(goods);
    }
}
