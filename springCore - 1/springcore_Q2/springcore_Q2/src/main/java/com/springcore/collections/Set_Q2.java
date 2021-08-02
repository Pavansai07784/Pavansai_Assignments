package com.springcore.collections;

import java.util.Set;

public class Set_Q2 {

	private int Id;
	private Set<String> Username;
	@Override
	public String toString() {
		return "Set_Q2 [Id=" + Id + ", Username=" + Username + "]";
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public Set<String> getUsername() {
		return Username;
	}
	public void setUsername(Set<String> username) {
		Username = username;
	}
}
