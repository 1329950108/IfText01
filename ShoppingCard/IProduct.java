
/**
*Product关于修改属性时的接口
*具有name和prise的set();get()
*/
public interface IProduct
{
	void setName(String name);
	String getName();
	void setPrise(double prise);
	double getPrise();
}