package com.tree.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tree.entity.Good;
import com.tree.service.GoodService;

@Controller  
@RequestMapping("/good")
public class GoodController extends BaseController {
	@Resource
	private GoodService goodService;
	@RequestMapping("/getGoods")
	public String getGoods(HttpServletRequest request,Model model) {
		List<Good> goodList=goodService.getGoodList();
		request.setAttribute("goods", goodList);
		return "good/goods";
	}
	
}
