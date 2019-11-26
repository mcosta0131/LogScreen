package com.viavarejo.appLog.LogScreen.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.viavarejo.appLog.LogScreen.model.RecuperaLog;

public interface LogRepository extends MongoRepository<RecuperaLog,Long>{

	RecuperaLog findByProtocolo(Integer protocolo);
	
	
}
