package com.wode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.PrintWriter;

@Controller
//所有用户相关的操作都在HelloController
@RequestMapping("/user")
public class HelloController {

	@RequestMapping(path="/update/{id}",method=RequestMethod.PUT)
	public void upUser(@PathVariable("id")int id, String name, String location, PrintWriter pt){
		//用户的修改
		System.out.println("用户执行了更新"+id+" "+name+" "+location);
		pt.println("hello world");
	}

//	todo还没完成
	@RequestMapping(path="/del/{id}",method = RequestMethod.DELETE)
	public void delUser(@PathVariable("id") int id,PrintWriter pt) {
		System.out.println(id);
		pt.print("del successful");
	}
}
