package com.twlyplus.service.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;

import com.twlyplus.dao.TreeDao;
import com.twlyplus.domain.Tree;
import com.twlyplus.service.TreeService;

import javax.annotation.Resource;



@Service("treeService")
public class TreeServiceImpl implements TreeService {

	@Resource
	private TreeDao  treeDao;



	public Tree findById(Integer id) {
		return treeDao.findById(id);
	}
	
	

	public List<Tree> getTreesByFatherOrIds(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return treeDao.getTreesByFatherOrIds(map);
	}
 
	


	 
}
