package com.tzy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.tzy.domain.Goods;
import com.tzy.domain.Goodsort;

public interface GoodsMapper {

	List<Goods> list();

	void toUpdate(@Param("gid")Integer gid);

     //添加
	void add(Goods goods);

	List<Goodsort> toGetGlist();

	List<Goodsort> toTypeGlist();

	Goods toUp(@Param("gid")Integer gid);
    //修改
	void update(Goods goods);


}
