package ws;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import org.apache.log4j.Logger;
import javax.jws.WebService;
import main.Student;
import main.Thread1;

@WebService(endpointInterface = "ws.StudentWS")
public class StudentWSimpl implements StudentWS{
	public static final Logger logger = Logger.getLogger(StudentWSimpl.class.getName());
	@Override
	public String addStudentFake(String username, String password, String name, int age, String code,
			 String className, String address, float mark) {
		String message= null;
		try {
			FileReader file = new FileReader("app.conf");
			Properties properties = new Properties();
			properties.load(file);
			if(username.equals(properties.getProperty("username")) && password.equals(properties.getProperty("password"))) {
				Student newStudent = new Student(name, age, code, className, address, mark);
				Thread thread1= new Thread1(newStudent);
				thread1.start();
				message= Thread1.result;
			}
			else {
				message="Invalid username or password!";
				logger.info(message);
			}
		} catch (FileNotFoundException e) {
			logger.error(e.getMessage());
		} catch (IOException e) {
			logger.error(e.getMessage());
		}
		return message;
	}
}
