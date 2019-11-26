package com.viavarejo.appLog.LogScreen.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "log")
public class RecuperaLog {

	@Id
	private String id;

	private Integer protocolo;
	private String msgLog;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getProtocolo() {
		return protocolo;
	}

	public void setProtocolo(Integer protocolo) {
		this.protocolo = protocolo;
	}

	public String getMsgLog() {
		return msgLog;
	}

	public void setMsgLog(String msgLog) {
		this.msgLog = msgLog;
	}

	
}
