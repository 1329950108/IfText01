public class Re01
{
	public static int sum(int begain, int over) 
	{
		//�ж��Ƿ���Ҫ�����ϴ�����ͽ�С����
		if (begain > over)
		{
			int change = begain;
			begain = over;
			over = change;
		}
		//�ж��ۼ��Ƿ����
		if (begain == over)
		{
			return begain;
		}
		//�ݹ��ۼӡ�*****��
		return over + sum(begain,over-1);

	}

}