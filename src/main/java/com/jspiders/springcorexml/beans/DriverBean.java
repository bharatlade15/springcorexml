package com.jspiders.springcorexml.beans;

import lombok.Data;

@Data

public class DriverBean {

	//One To One Mapping
	private int id;
	private String name;
	private long contact;
}
