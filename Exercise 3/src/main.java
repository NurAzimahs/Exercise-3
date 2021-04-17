
public class main {

	public static void main(String[] args) {
		laptop a=new laptop();
		
		System.out.println();
		System.out.println("Laptops Name : "+a.name);
		System.out.println("Laptops Weight : "+a.weight);
		System.out.println("Laptops Colour : "+a.colour);
		System.out.println("CPU Model Intel : Intel "+a.intel);
		System.out.println("Price Laptops : "+a.price);
		System.out.println("Set price: RM"+a.set);
		System.out.println("Total price : RM"+a.totalprice);
	
		laptop b=new laptop("Hp",3.5,"Blue","i5",70.00);
		
		System.out.println();
		System.out.println("Laptops Name : "+b.name);
		System.out.println("Laptops Model : "+b.weight+"kg");
		System.out.println("Laptops Colour : "+b.colour);
		System.out.println("CPU Model Intel : Intel "+b.intel);
		System.out.println("Price Laptops : "+b.price);
		System.out.println("Set price: RM"+b.set);
		System.out.println("Total price : RM"+b.totalprice);
	}
}
