package com.tzy.service;

import java.util.List;

import com.tzy.domain.Goods;
import com.tzy.domain.Goodsort;

public interface GoodsService {

	List<Goods> list();
    //删除
	void toUpdate(Integer gid);
	//添加下拉
	void add(Goods goods);
	
	List<Goodsort> toGetGlist();
	
	List<Goodsort> toTypeGlist();
	
	Goods toUp(Integer gid);
	//修改
	void update(Goods goods);
	
	

}
