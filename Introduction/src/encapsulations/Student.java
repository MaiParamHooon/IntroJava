package encapsulations;

public class Student {

		
		// TODO Auto-generated method stub
		private int age;
		private String name;
		
		public int getAge() {
			
			return age;
		}
	
		
		public void setAge(int age) {
			if(age > 20) {
				System.out.println("Too Old");
		}
			else {
				this.age=age;
			}
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		

	}
