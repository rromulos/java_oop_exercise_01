package school.management.system;

import java.math.BigDecimal;
import java.util.List;

public class School {
	
	private List<Teacher> teachers;
	private List<Student> students;
	private BigDecimal totalMoneyEarned;
	private BigDecimal totalMoneySpent;
	
	public School(List<Teacher> teachers, List<Student> students, BigDecimal totalMoneyEarned, BigDecimal totalMoneySpent) {
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
	
	public BigDecimal getTotalMoneyEarned() {
		return totalMoneyEarned;
	}
	
	public void updateTotalMoneyEarned(BigDecimal totalMoneyEarned) {
		totalMoneyEarned.add(totalMoneyEarned);
	}
	
	public BigDecimal getTotalMoneySpent() {
		return totalMoneySpent;
	}
	
	public void updateTotalMoneySpent(BigDecimal totalMoneySpent) {
		totalMoneyEarned.subtract(totalMoneySpent);
	}
}

