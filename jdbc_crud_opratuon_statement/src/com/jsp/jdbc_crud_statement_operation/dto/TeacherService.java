package com.jsp.jdbc_crud_statement_operation.dto;
import com.jsp.jdbc_crud_statement_operation.dto.Teacher;
import com.jsp.jdbc_crud_statement_operation.dto.TeacherDao;
public class TeacherService {
	TeacherDao teacherDao=new TeacherDao();
	public void insertTeacher(Teacher teacher)
	{
		if(teacher.getTeacherSubject().equalsIgnoreCase("CSE"))
		{
			
			teacherDao.insertTeacher(teacher);
		}
		
		else
		{
			System.out.println("hey check what we will paas");
		}
	}
	    public int getById(int id)
	    {
	    	int id2=teacherDao.getById(id);
	    	return id2;
	    }

}
