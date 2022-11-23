import java.util.Scanner;

public class RunAnimal{
public static void main (String[] args) {
	String B = new String("B");
	String C = new String("C");
	String D = new String("D");
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Please choose an animal. Press B for Bird, Press C for Cat, Press D for Dog.");
	String input = scan.nextLine();
	
	if(input.equalsIgnoreCase("b")){
		Bird bird = new Bird();
		bird.eat();
		bird.sleep();
		bird.makeSound();
	}else
		if(input.equalsIgnoreCase("c")){
		Cat cat = new Cat();
		cat.eat();
		cat.sleep();
		cat.makeSound();
	}else
		if(input.equalsIgnoreCase("d")){
		Dog dog = new Dog();
		dog.eat();
		dog.sleep();
		dog.makeSound();
	}else{
		System.out.print("Invalid input!");
	}
	
}
}