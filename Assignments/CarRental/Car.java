public class Car {

	private int carId;
	private String brandName;
	private String model;
	private double rentalRate;
	private boolean available;

	public Car( int carId, String brandName, String model, double rentalRate, boolean available) {

		this.carId = carId;
	        this.brandName = brandName;
	        this.model = model;
		this.rentalRate = rentalRate;
		this.available = available;
	}
	
	public Car( String brandName, String model, double rentalRate) {

		this.carId = -1;
		this.available = true;

                this.brandName = brandName;
                this.model = model;
                this.rentalRate = rentalRate;
        }

	public void getCarId( int carId) {

		this.carId = carId;
	}

	public void setCarId( int carId) {

		this.carId = carId;
	}

	public boolean isAvailable() {

		return available;
	}

	public void setAvailable(boolean available) {
		
		this.available = available;
	}

	public double calculateRentalCost(int rentDays) {

		return rentalRate * rentDays;
	}

	public void printInvoice( int rentDays) {
		
		if(available) {
			System.out.println("Car is not rented yet.");
		}else{
			double rentalCost = calculateRentalCost(rentDays);

			System.out.println("Car Rental Invoice");
			System.out.println("Car ID : " + carId);
			System.out.println("Brand : " + brandName);
			System.out.println("Model : " + model);
			System.out.println("Rental Rate : " + rentalRate + "per day");
			System.out.println("Rented for " + rentDays + "days");
			System.out.println("Total Rental Cost : " + rentalCost);
		}
	}

	public void displayDetails() {
		
		System.out.println("Car ID : " + carId);
                System.out.println("Brand : " + brandName);
                System.out.println("Model : " + model);
                System.out.println("Rental Rate : " + rentalRate + "per day");
                System.out.println("Available : " + (available ? "Yes" : "No"));
	}

	public static void main(String[] args) {

		Car[] cars = new Car[3];

		cars[0] = new Car("Dodge", "Challenger", 50.0);
		cars[0] = new Car("Honda", "Civic", 40.50);
		cars[0] = new Car("Mahindra", "Thar", 45.45);


		System.out.println("Available Cars for Rent : ");
		
		for(Car car : cars) {

			if(car != null && car.isAvailable()) {
				car.displayDetails();
				System.out.println();
			}
		}

		int rentDays = 7;

		cars[0].setAvailable(false);
		cars[0].setCarId(101);
		cars[0].printInvoice(rentDays);
	}
}
	        	
