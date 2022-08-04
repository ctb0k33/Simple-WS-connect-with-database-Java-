package ws;
import javax.jws.*;

@WebService

public interface StudentWS {
	
		@WebMethod		
		public String addStudentFake(@WebParam String username,@WebParam String password,
									 @WebParam String name,@WebParam int age,@WebParam String code,
									 @WebParam String className,@WebParam String address,@WebParam float mark); 
	}


