package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import dao.StudentDAO;
import daofactory.MYSQLDAOFactory;
import entity.Student;

public class StudentDatabaseDAO implements StudentDAO{
	
	Connection con;
	
	public StudentDatabaseDAO() {
		
	}
	
	@Override
	public String getSelectQuery() {
		return "SELECT id, fio FROM Students";
	}

	@Override
	public String getCreateQuery() {
		return "INSERT INTO Student (fio) \n" +
        "VALUES (?);";
	}

	@Override
	public String getUpdateQuery() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDeleteQuery() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Student entity) {

	}

	private Connection createConnection() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Student entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Student entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getStudSubjMarkById() {
		// TODO Auto-generated method stub
		
	}

}
