package com.twlyplus.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.twlyplus.dao.ConfigDao;
import com.twlyplus.dao.DepositTradeDao;
import com.twlyplus.domain.DepositTrade;
import com.twlyplus.service.DepositTradeService;



@Service("depositTradeService")
public class DepositTradeServiceImpl implements DepositTradeService {
	
	@Resource
	private DepositTradeDao depositTradeDao;
	
	@Override
	public Integer add(DepositTrade depositTrade) {
		// TODO Auto-generated method stub
		return depositTradeDao.add(depositTrade);
	}
	
	@Override
	public Integer update(DepositTrade depositTrade) {
		// TODO Auto-generated method stub
		return depositTradeDao.update(depositTrade);
	}
	
	@Override
	public List<DepositTrade> list(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return depositTradeDao.list(map);
	}
	
	@Override
	public Integer getTotal(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return depositTradeDao.getTotal(map);
	}

}
