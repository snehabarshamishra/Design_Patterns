package com.company.app.model;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class UserService {
	
	private static UserService instance;
	
	private UserService(){}
	
	public static synchronized UserService getInstance(){
		if(instance == null){
			instance = new UserService();
		}
		return instance;
	}
	
	
	Map<Integer,User> db = new ConcurrentHashMap<>();
	AtomicInteger idCounter = new AtomicInteger(0);
	
	public int register(User u){
		int id = idCounter.incrementAndGet();
		u.setId(id);
		db.put(id, u);
		return u.getId();
	}
	
	public User cancelRegistration(int id){
		return db.remove(id);
	}
	
	public User getById(int id){
		return db.get(id);
	}

}
