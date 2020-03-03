
/**
*商品类，IProduct的实现类
*具有private name;private prise;
*@Override setName();getName();hashCode();equals();
*/
public class Product implements IProduct
{
	public Product(String name,double prise){
		this.name= name;
		this.prise= prise;
	}
	private String name;
	private double prise;

	//name和prise的set()get();
	public void setName(String name){
		this.name= name;
	}
	public String getName(){
		return name;
	}
	public void setPrise(double prise){
		this.prise= prise;
	}
	public double getPrise(){
		return prise;
	}
	
	//@Override hashCode();
	public int hashCode(){
		return name.hashCode();
	}

	//@Override equals();
	public boolean equals(IProduct product){
		if(product == null){
			return false;
		}else if(product.getName().equals(this.name)){
			return true;
		}
		return false;
	}
}