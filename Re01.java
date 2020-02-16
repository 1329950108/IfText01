public class Re01
{
	public static int sum(int begain, int over) 
	{
		//判断是否需要互换较大的数和较小的数
		if (begain > over)
		{
			int change = begain;
			begain = over;
			over = change;
		}
		//判断累加是否完成
		if (begain == over)
		{
			return begain;
		}
		//递归累加【*****】
		return over + sum(begain,over-1);

	}

}