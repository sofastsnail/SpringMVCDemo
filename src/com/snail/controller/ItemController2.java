package com.snail.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.snail.po.Item;

@Controller
public class ItemController2 {
	@RequestMapping("queryItem4")
	public ModelAndView queryItem(){
		ModelAndView modelAndView = new ModelAndView();
		List<Item> list = new ArrayList<Item>();
		Date date1=new Date();
		Item item1 = new Item();
		item1.setName("冰霜之锤");
		item1.setPrice(3200f);
		item1.setCreatetime(date1);
		item1.setDetail("可以");
		Item item2 = new Item();
		item2.setName("大江东去");
		item2.setPrice(12.34f);
		item2.setDetail("随便写写");
		list.add(item1);
		list.add(item2);
		modelAndView.addObject("itemList", list);
		modelAndView.setViewName("item/itemList");
		return modelAndView;
	}
}
