
/**
*ShoppingCard的接口类
*void add(IProduct obj,Integer quantity);
*void remove(Iproduct obj,Integer quantity);
*void list();
*/

public interface IShoppingCard
{
	void add(IProduct product,Integer quantity);
	void remove(IProduct product);
	void list();
}