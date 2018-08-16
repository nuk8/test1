package com.mj.test.daos;

import java.util.List;

import org.json.JSONObject;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mj.test.dtos.TestDto;


@Repository
public class TestDao implements TestDaoImp{

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	private String namespace="com.mj.test.";
	
	public List<TestDto> getAllData(){
		return sqlSession.selectList(namespace+"getAllData");
	}

}
