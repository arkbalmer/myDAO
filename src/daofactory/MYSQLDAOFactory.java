package daofactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import dao.MarkDAO;
import dao.StudentDAO;
import dao.SubjectDAO;
import dao.impl.MarkDatabaseDAO;
import dao.impl.StudentDatabaseDAO;
import dao.impl.SubjectDatabaseDAO;

public class MYSQLDAOFactory extends DAOFactory{

	private static final String URL = "jdbc:mysql://localhost:3306/student_db";
	private static final String USER = "root";
	private static final String PASSWORD = "gr0M1t_repeaT";
	private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
		
	public static Connection getDBConnection() {
		Connection dbCon = null;
		try {
			Class.forName(DB_DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			dbCon = DriverManager.getConnection(URL, USER, PASSWORD);
			return dbCon;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return dbCon;
	}
	
	@Override
	public MarkDAO getMarkDAO() {
		return new MarkDatabaseDAO();
	}

	@Override
	public StudentDAO getStudentDAO() {
		return new StudentDatabaseDAO();
	}

	@Override
	public SubjectDAO getSubjectDAO() {
		return new SubjectDatabaseDAO();
	}

}
