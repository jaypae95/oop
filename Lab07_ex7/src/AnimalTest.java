
public class AnimalTest {
	public static void main(String[] args) {
		
		Dog dog1 = new Dog();
		Cat cat1 = new Cat();
		Sheep sheep1 = new Sheep();
		
		System.out.println("====processed non-polymorphically====");
		dog1.cry();
		cat1.cry();
		sheep1.cry();
	
		Animal dog2 = new Dog();
		Animal cat2= new Cat();
		Animal sheep2 = new Sheep();
		
		System.out.println();
		
		System.out.println("====processed polymorphically====");

		((Dog)dog2).cry();
		((Cat)cat2).cry();
		((Sheep)sheep2).cry();
		
		}
}
