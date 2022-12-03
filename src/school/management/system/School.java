package school.management.system;

import java.math.BigDecimal;
import java.util.List;

public class School {
	
	private List<Teacher> teachers;
	private List<Student> students;
	private static BigDecimal totalMoneyEarned;
	private static BigDecimal totalMoneySpent;
	
	public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = new BigDecimal(0);
        totalMoneySpent = new BigDecimal(0);
	}
	
	public List<Teacher> getTeachers() {
		return teachers;
	}
	
	public void addTeachers(Teacher teacher) {
		teachers.add(teacher);
	}
	
	public List<Student> getStudents() {
		return students;
	}
	
	public void addStudents(Student student) {
		students.add(student);
	}
	
	public static BigDecimal getTotalMoneyEarned() {
		return totalMoneyEarned;
	}
	
	public static void updateTotalMoneyEarned(BigDecimal earned) {
		BigDecimal sum = totalMoneyEarned.add(earned);
		totalMoneyEarned = sum;
	}
	
	public static BigDecimal getTotalMoneySpent() {
		return totalMoneySpent;
	}
	
	public static void updateTotalMoneySpent(BigDecimal totalMoneySpent) {
		BigDecimal subtract = totalMoneyEarned.subtract(totalMoneySpent);
		totalMoneyEarned = subtract;
	}
}

