package in.ineuron.daofactoy;

import in.ineuron.persistance.*;

public class StudentDaoFactory {

	private StudentDaoFactory() {
		
	}
	
	private static IStudentDao studentDao=null;
	
	public static IStudentDao getStudentDao() {
		
		if(studentDao==null)
			studentDao=new StudentDaoImpl();
		
		return studentDao;
	}
	
}
