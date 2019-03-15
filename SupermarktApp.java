
public class SupermarktApp {

	public static void main(String[] args) {
		Supermarkt albertheijn = new Supermarkt("Professor Bromstraat");
		albertheijn.openen();
		albertheijn.inkopen();
		albertheijn.assortimentTonen();
	}

}
class Supermarkt{
	String supermarktstraatnaam;
	Product hetProduct1;
	Product hetProduct2;
	Product hetProduct3;
	
	Supermarkt(String straatnaam){
		supermarktstraatnaam = straatnaam;
	}
	void openen() {
		System.out.println("Welkom bij de Albert Heijn " + supermarktstraatnaam);
	}
	void assortimentTonen(){
		System.out.println("Wij van de Albert Heijn " + supermarktstraatnaam + " hebben " + hetProduct1.deNaam + " " + hetProduct2.deNaam + " " + hetProduct3.deNaam);
	}
	void inkopen() {
		hetProduct1 = new Product("Kaas", 230);
		hetProduct2 = new Product("Worst", 160);
		hetProduct3 = new Product("Pizza", 430);
	}
	void productKopen(Klant k) {	
	}
}
class Product{
	int prijsProduct;
	String deNaam;
	Product(String productNaam, int prijs){
		deNaam = productNaam;
		prijsProduct = prijs;
	}
}
class Klant{
	int geld = 150;
}