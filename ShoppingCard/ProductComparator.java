

import java.util.*;
public class ProductComparator implements Comparator<Product>
{
	//@Override compareTo(T t);
	public int compare(Product p1,Product p2){
		if(p1 == p2){
			return 0;
		}
		return (p1.getPrise() - p2.getPrise())>0?1:-1;
	}
}