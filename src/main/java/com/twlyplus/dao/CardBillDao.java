package com.twlyplus.dao;

import java.util.List;
import java.util.Map;

import com.twlyplus.domain.CardBill;

public interface CardBillDao {
	
	public Integer add(CardBill cardBill);
	
	public Integer update(CardBill cardBill);
	
	public List<CardBill> list(Map<String,Object> map);
	
	public Integer getTotal(Map<String,Object> map);
	
	public CardBill list_heji(Map<String,Object> map);
	
}
