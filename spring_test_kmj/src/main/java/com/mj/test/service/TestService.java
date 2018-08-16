package com.mj.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mj.test.daos.TestDao;
import com.mj.test.dtos.TestDto;





@Service
public class TestService implements ITestService {
	@Autowired
	public TestDao TestDaoImp;

	public List<TestDto> getAllData(){
		return TestDaoImp.getAllData();
	}
	
}
