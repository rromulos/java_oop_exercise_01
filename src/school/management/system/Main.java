package school.management.system;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Teacher john = new Teacher(1, "John", new BigDecimal(4000));
		Teacher mary = new Teacher(2, "Mary", new BigDecimal(4200));
		
		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(john);
		teacherList.add(mary);
		
		Student paul = new Student(1, "Paul", 2);
		Student noah = new Student(2, "Noah", 3);
		Student jude = new Student(3, "Jude", 4);
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(paul);
		studentList.add(noah);
		
		School schl = new School(teacherList, studentList);
		
		Teacher liam = new Teacher(3, "Liam", new BigDecimal(4500));
		schl.addTeachers(liam);
		
		paul.payFees(new BigDecimal(2500));
		noah.payFees(new BigDecimal(3500));
		jude.payFees(new BigDecimal(4000));
		
        System.out.println("School has earned $"+ School.getTotalMoneyEarned());

        System.out.println("------Making SCHOOL PAY SALARY----");
        john.receiveSalary(john.getSalary());
        System.out.println("Paying " + john.getName()
        +" and now the school has $" + School.getTotalMoneyEarned());

        mary.receiveSalary(mary.getSalary());
        System.out.println("Paying " + mary.getName()
                +" and now the school has $" + School.getTotalMoneyEarned());
	}

}
