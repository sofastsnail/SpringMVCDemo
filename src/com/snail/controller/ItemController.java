package com.snail.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.snail.po.Item;

public class ItemController implements Controller{

	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		List<Item> list = new ArrayList<Item>();
		Item item1 = new Item();
		item1.setName("冰霜之锤");
		item1.setPrice(3200f);
		item1.setDetail("可以");
		Item item2 = new Item();
		item2.setName("大江东去");
		item2.setPrice(12.34f);
		item2.setDetail("随便写写");
		list.add(item1);
		list.add(item2);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("itemList", list);
		modelAndView.setViewName("item/itemList");
		return modelAndView;
	}

}
