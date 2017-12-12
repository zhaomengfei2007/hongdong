package com.tree.dao;

import java.util.List;

import com.tree.entity.Good;

public interface IGoodsDao {
	public int getGoodById(int id);
	public List<Good> getGoodList();
}
