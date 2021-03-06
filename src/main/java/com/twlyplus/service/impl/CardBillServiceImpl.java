package com.twlyplus.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.twlyplus.dao.CardBillDao;
import com.twlyplus.dao.ClientDao;
import com.twlyplus.domain.CardBill;
import com.twlyplus.domain.DepositTrade;
import com.twlyplus.service.CardBillService;


@Service("cardBillService")
public class CardBillServiceImpl implements CardBillService {

	@Resource
	private CardBillDao cardBillDao;

	@Override
	public Integer add(CardBill cardBill) {
		// TODO Auto-generated method stub
		return cardBillDao.add(cardBill);
	}

	@Override
	public Integer update(CardBill cardBill) {
		// TODO Auto-generated method stub
		return cardBillDao.update(cardBill);
	}
	
	@Override
	public List<CardBill> list(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return cardBillDao.list(map);
	}
	
	@Override
	public Integer getTotal(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return cardBillDao.getTotal(map);
	}
	
	
	@Override
	public CardBill list_heji(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return cardBillDao.list_heji(map);
	}
	
	
	 

}
