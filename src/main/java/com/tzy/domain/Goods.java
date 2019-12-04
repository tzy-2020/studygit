package com.tzy.domain;

public class Goods {
private Integer gid;
private String gname;
private String datea;
private String price;
private Integer status;
private Goodsort goodsort;
private Type type;
private Integer id;
private Integer tid;
public Integer getGid() {
	return gid;
}
public void setGid(Integer gid) {
	this.gid = gid;
}
public String getGname() {
	return gname;
}
public void setGname(String gname) {
	this.gname = gname;
}
public String getDatea() {
	return datea;
}
public void setDatea(String datea) {
	this.datea = datea;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
public Integer getStatus() {
	return status;
}
public void setStatus(Integer status) {
	this.status = status;
}
public Goodsort getGoodsort() {
	return goodsort;
}
public void setGoodsort(Goodsort goodsort) {
	this.goodsort = goodsort;
}
public Type getType() {
	return type;
}
public void setType(Type type) {
	this.type = type;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public Integer getTid() {
	return tid;
}
public void setTid(Integer tid) {
	this.tid = tid;
}
public Goods() {
	super();
}
public Goods(Integer gid, String gname, String datea, String price, Integer status, Goodsort goodsort, Type type,
		Integer id, Integer tid) {
	super();
	this.gid = gid;
	this.gname = gname;
	this.datea = datea;
	this.price = price;
	this.status = status;
	this.goodsort = goodsort;
	this.type = type;
	this.id = id;
	this.tid = tid;
}


	
}
