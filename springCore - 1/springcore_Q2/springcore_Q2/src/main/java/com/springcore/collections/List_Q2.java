package com.springcore.collections;

import java.util.List;

public class List_Q2 {

	private int Id;
	private List<String> Username;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public List<String> getUsername() {
		return Username;
	}
	public void setUsername(List<String> username) {
		Username = username;
	}
	@Override
	public String toString() {
		return "List_Q2 [Id=" + Id + ", Username=" + Username + "]";
	}




}
