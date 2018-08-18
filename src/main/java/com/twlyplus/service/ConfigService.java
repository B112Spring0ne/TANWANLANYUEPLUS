package com.twlyplus.service;

import com.twlyplus.domain.Config;

public interface ConfigService {
	
	public Integer update(Config config);
	
	public Config findById(Integer id);
	
}
