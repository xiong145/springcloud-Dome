package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.bean.BlogProperties;
import com.springboot.bean.ConfigBean;
import com.springboot.bean.TestConfigBean;

import java.util.HashMap;
import java.util.Map;


@RestController
public class IndexController {
	@Autowired
	private BlogProperties blogProperties;
	@Autowired
	private ConfigBean configBean;
	@Autowired
	private TestConfigBean testConfigBean;
	
	@RequestMapping("/")
	Map index() {
		HashMap hashMap = new HashMap();
		hashMap.put("testConfigBean", testConfigBean.getAge()+testConfigBean.getName());
		hashMap.put("blogProperties", blogProperties);
		hashMap.put("configBean", configBean);
		return hashMap;
	}
}
