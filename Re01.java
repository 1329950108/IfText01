public class Re01
{
	public static int sum(int begain, int over) 
	{
		
		//判断累加是否完成
		if (begain == over)
		{
			return begain;
		}
		//递归累加【*****】
		return over + sum(begain,over-1);

	}

}