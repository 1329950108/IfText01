public class Re01
{
	public static int sum(int begain, int over) 
	{
		
		//�ж��ۼ��Ƿ����
		if (begain == over)
		{
			return begain;
		}
		//�ݹ��ۼӡ�*****��
		return over + sum(begain,over-1);

	}

}