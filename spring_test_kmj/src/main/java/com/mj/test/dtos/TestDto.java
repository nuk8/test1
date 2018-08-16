package com.mj.test.dtos;

public class TestDto {

	
	int test1;
	int test2;
	int test3;
	int test4;
	int test5;
	int test6;
	int test7;
	public TestDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TestDto(int test1, int test2, int test3, int test4, int test5, int test6, int test7) {
		super();
		this.test1 = test1;
		this.test2 = test2;
		this.test3 = test3;
		this.test4 = test4;
		this.test5 = test5;
		this.test6 = test6;
		this.test7 = test7;
	}
	public int getTest1() {
		return test1;
	}
	public void setTest1(int test1) {
		this.test1 = test1;
	}
	public int getTest2() {
		return test2;
	}
	public void setTest2(int test2) {
		this.test2 = test2;
	}
	public int getTest3() {
		return test3;
	}
	public void setTest3(int test3) {
		this.test3 = test3;
	}
	public int getTest4() {
		return test4;
	}
	public void setTest4(int test4) {
		this.test4 = test4;
	}
	public int getTest5() {
		return test5;
	}
	public void setTest5(int test5) {
		this.test5 = test5;
	}
	public int getTest6() {
		return test6;
	}
	public void setTest6(int test6) {
		this.test6 = test6;
	}
	public int getTest7() {
		return test7;
	}
	public void setTest7(int test7) {
		this.test7 = test7;
	}
	@Override
	public String toString() {
		return "TestDto [test1=" + test1 + ", test2=" + test2 + ", test3=" + test3 + ", test4=" + test4 + ", test5="
				+ test5 + ", test6=" + test6 + ", test7=" + test7 + "]";
	}
}
