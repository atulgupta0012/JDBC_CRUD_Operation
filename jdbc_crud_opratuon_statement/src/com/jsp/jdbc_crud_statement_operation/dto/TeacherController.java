package com.jsp.jdbc_crud_statement_operation.dto;
//import com.jsp.jdbc_crud_statement_operation.dto.Teacher;
import java.sql.*;
//import com.jsp.jdbc_crud_statement_operation.dto.TeacherService;
public class TeacherController {
	public static void main(String[] args) {
		TeacherService service=new TeacherService();
		Teacher teacher=new Teacher();
		teacher.setTeacherId(124);
		teacher.setTeacherName("Atul gupta");
         teacher.setTeacherEmail("atul@gmal.com");
         teacher .setTeacherSubject("CSE");
         service.insertTeacher(teacher);
	}

}
