

public class Client
{

	public static void main(String[] args){
		
		IShoppingCard s= new ShoppingCard();
		IProduct p1= new Product("����",1.0);
		IProduct p2= new Product("����",4.0);
		IProduct p3= new Product("����",2.0);
		s.add(p1,6);
		s.add(p2,5);
		s.add(p3,2);
		
		s.list();
	}
}