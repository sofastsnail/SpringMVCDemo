package com.snail.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.HttpRequestHandler;

import com.snail.po.Item;

public class ItemController1 implements HttpRequestHandler{

	@Override
	public void handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Item> list = new ArrayList<Item>();
		Date date1=new Date();
	//	date1.getTime();
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
		
		request.setAttribute("itemList", list);
		request.getRequestDispatcher("item/itemList").forward(request, response);
	}

}
