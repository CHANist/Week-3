
public class MainClass {
	public static void main(String[] args) {
		/* create 100 staffs*/
		for (int i = 0; i < 100; i++) {
			Staff cur = MainClass.setStaff(i); 
			Staff prev = MainClass.setStaff(i-1); 
			System.out.println(cur.greeting(prev));  
		}
	}
	
	public static Staff setStaff (int i) {
		/* get name
		 * use of ASCII code to do conversion */
		String name; 
		if (i < 26) {
			name = String.valueOf((char) (i + 65)); 
		}
		else if (i < 52) {
			name = String.valueOf((char) ((i-26) + 97)); 
		}
		else if (i < 78) {
			name = String.valueOf((char) ((i-52) + 65)); 
		} else { // < 100
			name = String.valueOf((char) ((i-78) + 97)); 
		}
		
		/* get gender */
		char gender; 
		if (i < 50) {
			gender = 'm'; 
		} else {
			gender = 'f'; 
		}
		/* set age*/
		int age; 
		if (i%2 == 0) { // odd
			age = 30; 
		} else {
			age = 40; 
		}
		/* set Staff*/
		return new Staff(name, age, gender); 
	}
}
