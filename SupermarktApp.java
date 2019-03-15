
public class SupermarktApp {

	public static void main(String[] args) {
		System.out.println("Welkom bij de Albert Heijn");
		Supermarkt albertheijn = new Supermarkt("Professor Bromstraat");
		albertheijn.openen();
		albertheijn.openen();
		Product kaas = new Product("Kaas");
		Product worst = new Product("Worst");
		Product pizza = new Product("Pizza");
		albertheijn.hetProduct1 = new Product("Kaas");
		albertheijn.hetProduct2 = new Product("Worst");
		albertheijn.hetProduct3 = new Product("Pizza");
		albertheijn.hetProduct1.prijs = 230;
		albertheijn.hetProduct2.prijs = 160;
		albertheijn.hetProduct3.prijs = 430;		
		albertheijn.assortimentTonen();
	}

}
class Supermarkt{
	String supermarktstraatnaam;
	Supermarkt(String straatnaam){
		supermarktstraatnaam = straatnaam;
	}
	void openen() {
		System.out.println("Welkom bij de Albert Heijn " + supermarktstraatnaam);
	}
	void assortimentTonen(){
		System.out.println("Wij van de Albert Heijn " + supermarktstraatnaam + " hebben " + hetProduct1.deNaam + " " + hetProduct2.deNaam + " " + hetProduct3.deNaam);
	}
	void productKopen(Klant k) {
		
	}
	Product hetProduct1;
	Product hetProduct2;
	Product hetProduct3;
}
class Product{
	String deNaam;
	int prijs;
	Product(String productNaam){
		System.out.println(productNaam);
		deNaam = productNaam;
	}
}
class Klant{
	int geld = 150;
}