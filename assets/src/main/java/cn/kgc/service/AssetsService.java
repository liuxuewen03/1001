package cn.kgc.service;

import cn.kgc.pojo.Assets;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-02 14:27
 */
public interface AssetsService {
    void insert(Assets assets);

    List<Assets> selectAll(String assetname, String assettype);
}
