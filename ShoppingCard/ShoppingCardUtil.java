import java.util.*;
public class ShoppingCardUtil implements IShoppingCardUtil
{
	public ShoppingCardUtil(IShoppingCard shoppingCard){
		this.shoppingCard= shoppingCard;
	}
	private static IShoppingCard shoppingCard;
	public void clean(){
		Iterator iter=ShoppingCard.shoppingCard.keySet().iterator();
		while(iter.hasNext()){
			shoppingCard.remove((Product)iter.next());
		}
	}
}