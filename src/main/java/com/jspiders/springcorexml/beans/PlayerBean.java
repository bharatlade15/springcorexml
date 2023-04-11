package com.jspiders.springcorexml.beans;

import lombok.Data;

@Data
public class PlayerBean {

	//One To Many Mapping
	private int id;
	private String name;
	private String role;
	private int jersy_no;
}
