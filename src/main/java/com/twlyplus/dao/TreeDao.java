package com.twlyplus.dao;


import java.util.List;
import java.util.Map;

import com.twlyplus.domain.Tree;




public interface TreeDao {
	
	
	/**
	 * 根据父节点找子树
	 * 授权窗口要用
	 * 
	 */
	public List<Tree> getTreesByFatherOrIds(Map<String,Object> map);
	
	
	public Tree findById(Integer id);
	
	
}