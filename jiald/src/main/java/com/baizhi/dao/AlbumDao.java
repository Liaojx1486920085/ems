package com.baizhi.dao;

import com.baizhi.entity.Album;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AlbumDao {
    //分页专辑
    public List<Album> selectAlbum();
    //总条数
    public Integer selectAlbumCount();
    //增加专辑
    public void addAlbum(Album album);
    //删除专辑
    public void deleteAlbum(String id);
}
