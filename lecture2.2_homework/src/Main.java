
public class Main {

	public static void main(String[] args) {
		
	 Category category1 =new Category(); 
	 category1.id=1;
	 category1.name="Programlama";
		
	 Person person1=new Person();
	 person1.id=1;
	 person1.name="Şevval";
	 
	PersonManager personManager=new PersonManager();
	personManager.register(person1);
		
	}

}
