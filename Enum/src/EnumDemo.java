import java.time.DayOfWeek;
import java.util.List;

public class EnumDemo {
	
	City city;
	
	public EnumDemo(City city) {
		this.city = city;
		
	}	
	
	public void cityAreLike() {
		switch(city) {
			case PUNE: System.out.println("City is" + City.PUNE);break;
			case MUMBAI: System.out.println("City is" + City.MUMBAI);break;
			case AHMEDABAD: System.out.println("City is" + City.AHMEDABAD);break;
			default :System.out.println("default city");break;
		}
	}
	
	enum City{
		PUNE(2){
			@Override
			public void printData() {
				System.out.println("pune");
			}
		}, 
		MUMBAI(3){
			@Override
			public void printData() {
				System.out.println("Mumbai");
			}
		}, AHMEDABAD(4){
			@Override
			public void printData() {
				System.out.println("Ahmedabad");
			}
		};
		
		private int number;
		private City(int n) {
			number = n;
		}
		
		public abstract void printData();
	}
	
	public static void main(String[] args) {
		//City c = City.PUNE;
		String c = "PUNE";
		EnumDemo demo = new EnumDemo(City.valueOf(c));
		
		City city = City.valueOf(City.class, "PUNE");
		city.printData();
		/*demo.cityAreLike();*/
		
		System.out.println(City.values());
	}
}
