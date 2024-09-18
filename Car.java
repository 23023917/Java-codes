
public class Car {
	
	String model;
	String brand;
	int year;
 private static int carCount = 0;

	Car() {
		System.out.println("This is the last year car brand");
		this.model = "SUV";
		this.brand = "Ranger";
		this.year = 2023;
		carCount++;
	}
	
	Car(String model,String brand, int year) {
		System.out.println("This is the car brand");
		this.model = model;
		this.brand = brand;
		this.year = year;
		carCount++;
		
	}
	
	public static int Count() {
		
		return carCount;
		
	}
	
	public  String Return() {
		
		return "Model" + model + " year" + year + " Brand" + brand;
	}
	
	public static void main(String[] args) {
		
	
	Car car1 = new Car("hgh", "hahhs",2024);
	Car car2 = new Car();
	car1.Return();
	
	System.out.println(Car.Count());
	System.out.println(car1.Return());
	System.out.println(car2.Return());
	
	}

}
