
public class SupermarktApp {

	public static void main(String[] args) {
		Supermarkt albertheijn = new Supermarkt("Professor Bromstraat");
		albertheijn.openen();
		albertheijn.inkopen();
		albertheijn.assortimentTonen();
		Klant joost = new Klant();
		joost.geld = 400;
		albertheijn.productKopen(joost);
		albertheijn.productKopen(joost);
		albertheijn.productKopen(joost);
		albertheijn.productKopen(joost);
		albertheijn.productKopen(joost);
	}

}
class Supermarkt{
	String supermarktstraatnaam;
//	Product hetProduct1;
//	Product hetProduct2;
//	Product hetProduct3;
	Product[] supermarkt = new Product[15];
	
	Supermarkt(String straatnaam){
		supermarktstraatnaam = straatnaam;
	}
	void openen() {
		System.out.println("Welkom bij de Albert Heijn " + supermarktstraatnaam);
	}
	void assortimentTonen(){
		System.out.println("Wij van de Albert Heijn " + supermarktstraatnaam + " hebben " + supermarkt[0].deNaam + " " + supermarkt[1].deNaam + " " + supermarkt[2].deNaam);
	}
	void inkopen() {
		supermarkt[0] = new Product("Kaas", 230);
		supermarkt[1] = new Product("Worst", 160);
		supermarkt[2] = new Product("Pizza", 430);
	}
	void productKopen(Klant k) {
		if(k.geld >= supermarkt[0].prijsProduct) {
			System.out.println("Klant heeft kaas gekocht");
			k.geld = k.geld - supermarkt[0].prijsProduct;
		}
		else {
			System.out.println("Sorry, u heeft niet genoeg geld, ik kan u niks verkopen");
		}
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