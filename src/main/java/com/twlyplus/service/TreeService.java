package com.twlyplus.service;

import java.util.List;
import java.util.Map;

import com.twlyplus.domain.Tree;

public interface TreeService {


	public List<Tree> getTreesByFatherOrIds(Map<String,Object> map);
	
	
	public Tree findById(Integer id);
	
	
}
