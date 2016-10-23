package daofactory;

import dao.MarkDAO;
import dao.StudentDAO;
import dao.SubjectDAO;

public abstract class DAOFactory {
	
	public static final int MYSQL = 1;
	public static final int ORACLE = 2;

	public abstract MarkDAO getMarkDAO();
	public abstract StudentDAO getStudentDAO();
	public abstract SubjectDAO getSubjectDAO();
	
	public static DAOFactory getDAOFactory(int whichFactory) {
		
		switch (whichFactory) {
			case MYSQL : return new MYSQLDAOFactory();
			case ORACLE : return new ORACLEDAOFactory();
			default : return null;
		}
	}
}
