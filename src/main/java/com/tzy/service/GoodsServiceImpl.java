package com.tzy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tzy.domain.Goods;
import com.tzy.domain.Goodsort;
import com.tzy.mapper.GoodsMapper;

@Service
public class GoodsServiceImpl implements GoodsService {
@Autowired
private GoodsMapper goodsMapper;

@Override
public List<Goods> list() {
	// TODO Auto-generated method stub
	return goodsMapper.list();
}

@Override
public void toUpdate(Integer gid) {
	// TODO Auto-generated method stub
	goodsMapper.toUpdate(gid);
}


@Override
public void add(Goods goods) {
	// TODO Auto-generated method stub
	goodsMapper.add(goods);
}

@Override 
public List<Goodsort> toGetGlist() {
	// TODO Auto-generated method stub
    return	goodsMapper.toGetGlist();

}

@Override
public List<Goodsort> toTypeGlist() {
	// TODO Auto-generated method stub
	return goodsMapper.toTypeGlist();
}


@Override
public Goods toUp(Integer gid) {
	// TODO Auto-generated method stub
	return goodsMapper.toUp(gid);
}

@Override
public void update(Goods goods) {
	// TODO Auto-generated method stub
	goodsMapper.update(goods);
}


}
