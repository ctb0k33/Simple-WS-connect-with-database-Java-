package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.apache.log4j.Logger;
import ws.StudentWSimpl;

public class Thread1 extends Thread{
	public static final Logger logger = Logger.getLogger(StudentWSimpl.class.getName());
	Student student;
	public static String result;
	
	public Thread1(Student student) {
		this.student=student;
	}
	
	public void insertDataBase(Student student) {
		String name=student.getName();
		String code=student.getCode();
		int age=student.getAge();
		String className= student.getClassName();
		String address=student.getAddress();
		float mark=student.getMark();
		try {
			Student.studentList.offer(student);
			Connection conn = null;
			conn = JDBCConnection.getJDBCConnection();	
			String sql= "INSERT INTO student_information(name,code,age,class_name,address,mark) VALUES(?,?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, code);
			ps.setInt(3, age);
			ps.setString(4, className);
			ps.setString(5, address);
			ps.setFloat(6, mark);	
			ps.addBatch();
			int isUpdated = ps.executeUpdate();
		    if (isUpdated > 0) {
		    	result="Success";
		    	logger.info("Success!");
		    } 
		    else {
		    	result="Fail";
		    	logger.info("Fail!");
		    }
			ps.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	@Override
	public void start() {
		insertDataBase(student);
	}
}
