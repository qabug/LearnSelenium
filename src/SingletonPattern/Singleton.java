package SingletonPattern;

public class Singleton {

	//In OOP, Singleton class can have only one object (or instance of the class) at a time
	//How to design Singleton class
	//1. make constructor as private
	//2. Write a public static method that has return type object of singleton class(lazy initialization)
	//Diff b/w Normal and singleton class
	//For normal class we use constructors where as for singleton class we use getInstance Method for instantiation
	
	private static Singleton singleton_instance = null;
	
	public String str;
	
	private Singleton() {
		str = "Hi this is a example for singleton pattern ";
	}
		
	public static Singleton getInstance() {
		if(singleton_instance == null) 
			singleton_instance = new Singleton();
			return singleton_instance;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Singleton x= Singleton.getInstance();
		Singleton y= Singleton.getInstance();
		Singleton z= Singleton.getInstance();
		
		x.str = (x.str).toUpperCase();
		
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		
		y.str = (y.str).toLowerCase();
		
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		
		
	}

}
