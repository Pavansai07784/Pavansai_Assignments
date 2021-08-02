package com.springcore.collections;

import java.util.Map;
import java.util.Set;

public class Map_Q2 {
	private int Id;
	private Map<Integer,String> Username;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public Map<Integer, String> getUsername() {
		return Username;
	}
	public void setUsername(Map<Integer, String> username) {
		Username = username;
	}
	@Override
	public String toString() {
		return "Map_Q2 [Id=" + Id + ", Username=" + Username + "]";
	}




}
