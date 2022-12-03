package school.management.system;

import java.math.BigDecimal;

public class Teacher {
	
	private int id;
	private String name;
	private BigDecimal salary;
	private BigDecimal salaryEarned;
	
	public Teacher(int id, String name, BigDecimal salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = new BigDecimal(0);
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
	
    public void receiveSalary(BigDecimal salary){
        BigDecimal sum = salaryEarned.add(salary);
        School.updateTotalMoneySpent(sum);
    }
	
	
}
