package entites.services;

import java.util.List;
import java.util.function.Predicate;

import entities.Employee;

public class SalaryCal   {
	
	public  double serviceCal(List<Employee> list, Predicate<Employee> Cal) {
		
		double sum = 0.0;
		for( Employee p : list) {
			if(Cal.test(p)) {
				sum += p.getSalary();
				
			}
			
		}
		return sum;
	}
}	
		
	


