package com.tzy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tzy.domain.Goods;
import com.tzy.domain.Goodsort;
import com.tzy.service.GoodsService;

@Controller
public class GoodController {
@Autowired
private GoodsService goodsService;
/**
 * 
 * @Title: list 
 * @Description: TODO
 * @param model
 * @param pageNum 页面展示
 * @return
 * @return: String
 */
@RequestMapping("list")
public String list(Model model,@RequestParam(defaultValue ="1")Integer pageNum) {
	 PageHelper.startPage(pageNum, 3);
	 List<Goods>list=goodsService.list();
	 PageInfo<Goods> pageInfo = new PageInfo<>(list);
	 model.addAttribute("page", pageInfo);
	 return "list";
	
}

/**
 * 
 * @Title: toUpdate 
 * @Description: TODO
 * @param gid 删除
 * @return
 * @return: String
 */
@RequestMapping("toUpdate")
public String toUpdate(Integer gid) {
	goodsService.toUpdate(gid);
	return "redirect:list";
	
}

/**
 * 
 * @Title: glist 
 * @Description: TODO
 * @return
 * @return: String
 */
@RequestMapping("ToAdd")
public String glist(Model model) {
   List<Goodsort>glist=goodsService.toGetGlist();
   model.addAttribute("glist", glist);
   List<Goodsort>typelist=goodsService.toTypeGlist();
   model.addAttribute("glist", glist);
   model.addAttribute("typelist", typelist);
   return "add";
	
}

/**
 * 
 * @Title: glist 修改
 * @Description: TODO
 * @param model
 * @return
 * @return: String
 */
@RequestMapping("toUp")
public String  toUp(Model model,Integer gid) {
    Goods goods= goodsService.toUp(gid);
   model.addAttribute("goods", goods);

   List<Goodsort>glist=goodsService.toGetGlist();
   model.addAttribute("glist", glist);
   List<Goodsort>typelist=goodsService.toTypeGlist();
   model.addAttribute("glist", glist);
   model.addAttribute("typelist", typelist);
   return "update";
	
}


@RequestMapping("chakan")
public String  chakan(Model model,Integer gid) {
    Goods goods= goodsService.toUp(gid);
   model.addAttribute("goods", goods);

   List<Goodsort>glist=goodsService.toGetGlist();
   model.addAttribute("glist", glist);
   List<Goodsort>typelist=goodsService.toTypeGlist();
   model.addAttribute("glist", glist);
   model.addAttribute("typelist", typelist);
   return "chakan";
	
}



/**
 * 
 * @Title: add  添加
 * @Description: TODO
 * @param goods
 * @return
 * @return: String
 */
@RequestMapping("add")
public String add(Goods goods) {
	goodsService.add(goods);
	return "redirect:list";
	
}


/**
 * 
 * @Title: add  添加
 * @Description: TODO
 * @param goods
 * @return
 * @return: String
 */
@RequestMapping("update")
public String update(Goods goods) {
	goodsService.update(goods);
	return "redirect:list";
	
}


}
