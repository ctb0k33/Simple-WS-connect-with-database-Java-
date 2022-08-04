package main;

import java.util.LinkedList;
import java.util.Queue;

public class Student {
	private int id;
	private String name;
	private String code;
	private int age;
	private String className;
	private String address;
	private float mark;
	public static Queue<Student> studentList= new LinkedList<Student>();
	
	public Student(int id, String name, String code, int age, String className, String address, float mark) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
		this.age = age;
		this.className = className;
		this.address = address;
		this.mark = mark;
	}
	
	public Student(String name, int age, String code, String className, String address, float mark) {
		this.name=name;
		this.age=age;
		this.code=code;
		this.className=className;
		this.address=address;
		this.mark=mark;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public float getMark() {
		return mark;
	}
	public void setMark(float mark) {
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", code=" + code + ", age=" + age + ", className=" + className
				+ ", address=" + address + ", mark=" + mark + "]";
	}
	
	
}
