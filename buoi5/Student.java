package btvn;

import java.util.List;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Student {
	private String name;
	private int age;
	private String subject;
	private String school;

	public Student(String name, int age, String subject, String school) {
		super();
		this.name = name;
		this.age = age;
		this.subject = subject;
		this.school = school;
	}

	public static Student getMyStudent() {
		List<String> name = Arrays.asList("Toàn", "Hoàng", "Long");
		List<Integer> age = Arrays.asList(20, 20, 20);
		List<String> subject = Arrays.asList("vat ly", "hoa", "toan");
		Student myStudent = new Student("Bill", 69, "vat ly", "Haverl");

		return myStudent;

	}

	public Student() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [name=");
		builder.append(name);
		builder.append(", age=");
		builder.append(age);
		builder.append(", subject=");
		builder.append(subject);
		builder.append(", school=");
		builder.append(school);
		builder.append("]");
		return builder.toString();
	}

}
