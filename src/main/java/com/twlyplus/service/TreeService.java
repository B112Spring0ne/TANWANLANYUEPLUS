package com.twlyplus.service;

import java.util.List;
import java.util.Map;

import com.twlyplus.entity.Tree;

public interface TreeService {

	
	/**
	 * ���ݸ��ڵ�  ������  �������������ids֮��
	 * map �� father��-1�� ��   ids(1.2.5.6.9.4.4.)
	 * 
	 * mapֻ���ids���������� ids(1.2.5.6.9.4.4.)    �������Ӧ�þ�������realm ���� shire ��Ȩ��� ����ids��tree
	 * 
	 * ���ݸ��ڵ� �ò˵�  û�й�������  ��Ȩ���ڵ�ʱ��Ҫ��
	 */
	public List<Tree> getTreesByFatherOrIds(Map<String,Object> map);
	
	
	public Tree findById(Integer id);
	
	
}
