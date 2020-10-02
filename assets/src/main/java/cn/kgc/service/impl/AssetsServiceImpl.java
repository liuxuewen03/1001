package cn.kgc.service.impl;

import cn.kgc.mapper.AssetsMapper;
import cn.kgc.pojo.Assets;
import cn.kgc.pojo.AssetsExample;
import cn.kgc.service.AssetsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-02 14:28
 */
@Service("assetsService")
public class AssetsServiceImpl implements AssetsService {
    @Resource
    AssetsMapper assetsMapper;


    @Override
    public void insert(Assets assets) {
        assetsMapper.insertSelective(assets);
    }

    @Override
    public List<Assets> selectAll(String assetname, String assettype) {
        List<Assets> assets;
        AssetsExample assetsExample = new AssetsExample();
        AssetsExample.Criteria criteria = assetsExample.createCriteria();
        if (assetname != "") {
            criteria.andAssetnameEqualTo(assetname);
        }
        if (!"0".equals(assettype)) {
            criteria.andAssettypeEqualTo(assettype);
        }
        if (assetname == "" && assettype == "") {
            assets = assetsMapper.selectByExample(null);
            return assets;

        } else {
            assets = assetsMapper.selectByExample(assetsExample);
            return assets;

        }
    }
}
