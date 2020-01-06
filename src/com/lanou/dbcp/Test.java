package com.lanou.dbcp;

import java.util.List;

public class Test {

	public static void main(String[] args) throws Exception {
		String sql = "select*from stu ";
		List<Student> list = jdbcUtils.query(sql, Student.class);
		for(Student student:list) {
			System.out.println(student);
		}

	}

}
