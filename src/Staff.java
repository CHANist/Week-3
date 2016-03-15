
public class Staff {
	private String name; 
	private int age; 
	private char gender; 
	private String title; 
	
	public Staff(String name, int age, char gender) {
		/* if gender != 'M' and 'm' and 'f' and 'F' return NULL */
		if (gender != 'M' && gender != 'm' && gender != 'f' && gender != 'F') {
			return; 
		}
		this.name = name; 
		this.age = age; 
		this.gender = gender; 
		this.age = age; 
		
		/* set title */
		if (gender == 'm' || gender == 'M') {
			this.title = "Mr."; 
		} // else must be female
		else if (age < 30) {
			this.title = "Ms.";
		} // else must be female and age >= 30
		else { 
			this.title = "Mrs."; 
		}
	}
	
	public String greeting(Staff obj) {
		return "Hello, " + obj.title + " " + obj.name + ". I am " + this.name + " aged " + this.age + "."; 
	}
}
