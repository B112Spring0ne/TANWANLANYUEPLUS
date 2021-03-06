package com.twlyplus.service;

import java.util.List;
import java.util.Map;

import com.twlyplus.domain.Client;


public interface ClientService {

	
	public Integer add(Client client);
	
	public Integer update(Client client);
	
	public List<Client> list(Map<String,Object> map);
	
	public Integer getTotal(Map<String,Object> map);

	public Client list_heji(Map<String,Object> map);
	
	public Integer delete(Integer id);
	
	public Client findByWXUserId(Integer wxId);
	
	public Client finbByOpenid(String openid);
	
	public Client findById(Integer id);
	
}
