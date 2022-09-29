package com.cms.dao;

import java.util.List;

import com.cms.bean.Course;
import com.cms.bean.Faculty;
import com.cms.exceptions.FacultyException;

public interface FacultyDao {
	
	//login faculty
	public Faculty loginFaculty(String username,String password)throws FacultyException;
	
	
	//logout faculty
	public void logoutFaculty() throws FacultyException;
	
	
	//register faculty
	public String registerFaculty(Faculty faculty);
		
		
	//update faculty by id
	public String upadteFacultyById(int id) throws FacultyException;
		
		
	//view all faculty details
	public List<Faculty> viewAllFacultyDetails()throws FacultyException;

}
