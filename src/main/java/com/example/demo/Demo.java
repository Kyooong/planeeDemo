package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name="demo")
@Data
public class Demo {
	@Column(name="demo_id")
	@Id
	String id;
	
	@Column(name="content")
	String content;
	
	
}
