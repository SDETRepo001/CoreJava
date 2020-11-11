package Assignment;

public class VendingMachine {

	public static void main(String[] args) {

		System.out.println("                                            Vending Machine");

		char selectedCategory = 'A';
		int selectedOption = 1;
		if (selectedOption == 1 && selectedCategory == 'A') {
			System.out.println("ID:" + "\t" + "#WP11469062014406" + "\n" + "Date:" + "\t" + "Thursday 21 Jul, 2016"
					+ "\n" + "Cashier:" + "admin admin" + "\n" + "Time:" + "\t" + "14:46 PM" + "\n" + "\n" + "ITEM"
					+ "\t" + "       SKU     PRICE     QTY    SUBTOTAL" + "\n"
					+ "_____________________________________________" + "\n" + "Starburst" + "\t" + "24-MB06"
					+ "  $20.00  1      $20.00");
		} else {
			System.out.println("Item selection is not valid, Dude!");
		}

	}

}