import java.util.Scanner;

public class laptop {
	Scanner sc=new Scanner(System.in);
	String name,colour,intel;
	double price,set,totalprice,weight;
	
	laptop() {
		System.out.print("Enter Laptops Brand ? :");
		this.name=sc.nextLine();
		System.out.print("Enter laptops Colour? : ");
		this.colour=sc.nextLine();
		System.out.print("Enter Laptops Weight ? : ");
		this.weight=sc.nextDouble();
		System.out.print("Enter CPU Model Intel (i3/i5/i7)?:");
		this.intel=sc.nextLine();
		this.intel=sc.nextLine();
			if (intel=="i3") {
				this.price= 2500;
			}
			else if (intel=="i5") {
				this.price= 3500;
			}
			else if (intel=="i7") {
				this.price= 5000;
			}
		this.set=70.0;
		this.totalprice=this.set+this.price;
	}
	laptop(String name,double weight,String colour,String intel, double set) {
		this.name=name;
		this.colour=colour;
		this.weight=weight;
		this.intel=intel;
			if (intel=="i3") {
				this.price= 2500;
			}
			else if (intel=="i5") {
				this.price= 3500;
			}
			else if (intel=="i7") {
				this.price= 5000;
			}
		this.set=set;
		this.totalprice=this.set+this.price;
	}

}
