package school.management.system;

import java.math.BigDecimal;

public class Student {
	
	private int id;
	private String name;
	private int grade;
	private BigDecimal feesPaid;
	private BigDecimal feesTotal;
	
	public Student(int id, String name, int grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.feesPaid = new BigDecimal(0);
		this.feesTotal = new BigDecimal(50000);
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

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public BigDecimal getFeesPaid() {
		return feesPaid;
	}

	public void setFeesPaid(BigDecimal feesPaid) {
		this.feesPaid = feesPaid;
	}

	public BigDecimal getFeesTotal() {
		return feesTotal;
	}

	public void setFeesTotal(BigDecimal feedTotal) {
		this.feesTotal = feedTotal;
	}
	
	public void updateFeesPaid(BigDecimal fees) {
		BigDecimal total = this.getFeesPaid();
		total.add(fees);
		this.setFeesPaid(total);
	}
	
	public BigDecimal getRemainingFeed() {
		return feesTotal.subtract(feesPaid);
	}
	
	@Override
	public String toString() {
		return "Student's name :" + name +
				"Total feed paid so far $"+feesPaid;
	}

}
