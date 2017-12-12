package com.tree.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.tree.dao.IGoodsDao;
import com.tree.entity.Good;
import com.tree.service.GoodService;
@Service("GoodService")
public class GoodServiceImpl implements GoodService{
	@Resource
	private IGoodsDao goodsDao;
	public List<Good> getGoodList() {
		return this.goodsDao.getGoodList();
	}

}
