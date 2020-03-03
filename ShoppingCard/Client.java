

public class Client
{

	public static void main(String[] args){
		
		IShoppingCard s= new ShoppingCard();
		IProduct p1= new Product("Î÷¹Ï",1.0);
		IProduct p2= new Product("ÌÒ×Ó",4.0);
		IProduct p3= new Product("ºìÔæ",2.0);
		s.add(p1,6);
		s.add(p2,5);
		s.add(p3,2);
		
		s.list();
	}
}