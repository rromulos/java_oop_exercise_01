package school.management.system;

import java.math.BigDecimal;

public class Teacher {
	
	private int id;
	private String name;
	private BigDecimal salary;
	
	public Teacher(int id, String name, BigDecimal salary) {
		this.setId(id);
		this.setName(name);
		this.setSalary(salary);
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
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	
	
}
