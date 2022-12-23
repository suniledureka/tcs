package com.tcs.course.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.tcs.course.entity.Course;

public class CourseDaoImpl implements CourseDao {
	private DataSource ds;
	
	public DataSource getDs() {
		return ds;
	}

	public void setDs(DataSource ds) {
		this.ds = ds;
	}

	public void saveCourse(Course course) {
		String sql = "INSERT INTO COURSE(COURSE_ID, COURSE_NAME, COURSE_PRICE) values(?,?,?)";
		Connection con = null;
		try {
			con = ds.getConnection();
			PreparedStatement pst = con.prepareStatement(sql);
			
			pst.setInt(1, course.getCourseId());
			pst.setString(2, course.getCourseName());
			pst.setFloat(3, course.getCoursePrice());
			
			Integer rowsInserted = pst.executeUpdate();
			
			System.out.println("###--- Course Saved ---###");
		}catch(Exception ex) {
			System.out.println(ex.toString());
		}finally {
			try {
				con.close();
			} catch (SQLException e) {			
				e.printStackTrace();
			}
		}
	}

	public List<Course> findAllCourses() {
		List<Course> courses = new ArrayList<Course>();
		
		String sql = "SELECT * FROM COURSE";
		
		Connection con = null;
		try {
			con = ds.getConnection();
			Statement st = con.createStatement();		
			
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				int cid = rs.getInt(1);
				String cname = rs.getString(2);
				float price = rs.getFloat(3);
				
				Course crs = new Course(cid, cname, price);
				
				courses.add(crs);
			}
			
		}catch(Exception ex) {
			System.out.println(ex.toString());
		}finally {
			try {
				con.close();
			} catch (SQLException e) {			
				e.printStackTrace();
			}
		}
		return courses;
	}

}
