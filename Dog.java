import java.awt.Color;

public class Dog {
	
	// State
	private String name;
	private Color color;
	private int age;

	// Constructor
	public Dog(String name, Color color, int age){
		setName(name);
		setColor(color);
		setAge(age);
	}

	// Behavior
	public void bark(){
		System.out.println("Woof!");
	}

	public void speak(){
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.age);
	}

	// Age Getter
	public int age(){
		return age;
	}

	// Age Setter
	public void setAge(int age){
		if (age >= 0) {
			this.age = age;
		}		
	}

	// Color Getter
	public Color color(){
		return color;
	}

	// Color Setter
	public void setColor(Color color){
		this.color = color;
	}

	// Name Getter
	public String name(){
		return name;
	} 

	// Name Setter
	public void setName(String name){
		if (name.length() >= 3 && name.length() <= 19) {
			this.name = name;
		}
	}


}