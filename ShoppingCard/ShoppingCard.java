
/**
*¹ØÁªIProduct
*/
import java.util.*;
public class ShoppingCard implements IShoppingCard
{
	public ShoppingCard(){
		shoppingCard= new HashMap<IProduct,Integer>();	
	}

	public static Map<IProduct,Integer> shoppingCard;	

	public void add(IProduct product,Integer quantity){
		shoppingCard.put(product,quantity);
	}

	public void remove(IProduct product){
		shoppingCard.remove(product);
	}

	public void list(){
		Iterator iter= shoppingCard.keySet().iterator();
		while(iter.hasNext()){
			Product product= (Product)iter.next();
			System.out.println(product.getName() + product.getPrise() + shoppingCard.get(product));
		}

	}
}