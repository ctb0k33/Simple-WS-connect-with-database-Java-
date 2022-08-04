package main;

import java.io.FileInputStream;
import java.util.Properties;

import javax.xml.ws.Endpoint;
import ws.StudentWSimpl;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
public class Main {
	public static void main(String[] args) {
		final Logger logger = Logger.getLogger(Main.class.getName());
		try {
			Properties properties= new Properties();
			properties.load(new FileInputStream("./Log4J/log4j.properties"));
			PropertyConfigurator.configure(properties);
			Endpoint.publish("http://localhost:8005/ws/StudentWS", new StudentWSimpl());
			System.out.println("Done");
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}
}
