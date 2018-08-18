package com.twlyplus.dao;

import com.twlyplus.domain.Config;

public interface ConfigDao {
	
	public Integer update(Config config);
	public Config findById(Integer id);
	
	
}
