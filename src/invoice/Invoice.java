package invoice;

public class Invoice {

	public static void main(String[] args) {
		String sold = "C026-01-0957/2022";
		String Date  = "28/04/2020";
		String Address ="Brian Chege Mwangi";
		String text = "Adamson Computers Ltd";
		String contact = "0100100100";
		int totalWidth = 72;
		int padding = (totalWidth - text.length()) / 2;
		String result = "*".repeat(padding) + text + "*".repeat(padding);
		System.out.println(result);
		System.out.println("#99 ACS Building Gilmore Ave. New Mla.. Quezon City * Tel. No:123-4567");
		System.out.println("                 VAT REG. TIN 098-075-4321-0000                       ");
		System.out.println("                         SALES INVOICE                                ");
		System.out.println("Sold to:"+sold +"                            Date:"+Date);
		System.out.println("Address:"+Address +"                           Contact Number:"+contact);
		String doubleDottedLine = new String(new char[72]).replace('\0', '=');
		System.out.println(doubleDottedLine);    
		System.out.println("Qty     |         Item Description       |         Unit Price    |Amount");
		System.out.println(doubleDottedLine);
		System.out.println("4       |         Pencil                 |         20            |80.00");
		String line = new String(new char[72]).replace('\0', '-');
		System.out.println(line);
		System.out.println("10      |         Duster                 |         50            |500.00");
		System.out.println(line);
		System.out.println("9       |         Pens                   |         30            |270.00");
		System.out.println(line);
		System.out.println("10      |         crayon                 |         80            |800.00");
		System.out.println(doubleDottedLine);
		System.out.println("                                                  |Sub Total     |1650.00");
		String halfDottedLine = new String(new char[23]).replace('\0', '=');
		System.out.println("                                                  "+halfDottedLine);
		System.out.println("                                                  |VAT(16%)      |264.00");
		System.out.println("                                                  "+halfDottedLine);
		System.out.println("                                                  |Total Amount  |1914.00");
		System.out.println("                                                  "+halfDottedLine);
		
		
		
		

		
		
		
		
		
		
		
		

	}

}
