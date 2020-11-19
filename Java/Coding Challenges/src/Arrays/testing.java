package Arrays;
import java.math.BigDecimal;
import java.util.*;
public class testing {

	public static void main(String[] args) {
		List<Developer> listDevs = getDevelopers();
		System.out.println("Before Sort");
        for (Developer developer : listDevs) {
            System.out.println(developer.toString());
        }
        
        System.out.println();
        System.out.println("After Sort");
        Collections.sort(listDevs, new Comparator<Developer>() {
        	@Override
        	public int compare(Developer one, Developer two) {
        		return one.getAge() - two.getAge();
        	}
        });
        for(Developer dev: listDevs) {
        	System.out.println(dev.toString());
        }

	}
	
	public static class Developer{
		private String name;
		private BigDecimal salary;
		private int age;
		
		public Developer() {
		}
		public Developer(String name, BigDecimal salary, int age) {
			this.name = name;
			this.salary = salary;
			this.age = age;
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
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
		@Override
		public String toString() {
			return ("name:" + getName() + " Salary: " + getSalary() + " age: " + getAge());
		}
	}
	public static List<Developer> getDevelopers(){
		List<Developer> result = new ArrayList<Developer>();
		result.add(new Developer("mkyong", new BigDecimal("70000"), 33));
        result.add(new Developer("alvin", new BigDecimal("80000"), 20));
        result.add(new Developer("jason", new BigDecimal("100000"), 10));
        result.add(new Developer("iris", new BigDecimal("170000"), 55));
        
        return result;
	}

}
