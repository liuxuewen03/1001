package cn.kgc.service;

import cn.kgc.pojo.Goods;
import com.github.pagehelper.PageInfo;

/**
 * @author shkstart
 * @create 2020-10-08 15:36
 */
public interface GoodsService {


    PageInfo<Goods> selectByGoodsDistrict(int pageNum,int pageSize,int goodsDistrict,String pageNumStr);

    Goods selectById(int id);

    void update(Goods goods);
}
