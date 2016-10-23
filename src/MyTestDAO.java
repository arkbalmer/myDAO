import dao.StudentDAO;
import daofactory.DAOFactory;
import daofactory.MYSQLDAOFactory;
import entity.Entity;
import entity.Student;

public class MyTestDAO {

	public static void main(String[] args) {
		
		MYSQLDAOFactory mysqldaoFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
		EntityDAO entityDAO = mysqldaoFactory.getStudentDAO();
	
		System.out.println("дратути)");

	}

}
