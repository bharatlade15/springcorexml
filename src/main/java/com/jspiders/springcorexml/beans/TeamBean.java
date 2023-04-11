package com.jspiders.springcorexml.beans;

import java.util.List;

import lombok.Data;

@Data
public class TeamBean {

	//One To Many Mapping
	private int id;
	private String name;
	private String city;
	List<PlayerBean> players;
}
