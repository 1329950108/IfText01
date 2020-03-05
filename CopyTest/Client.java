
/*
	copy demo;

*/
import java.util.Scanner;
import java.io.File;

public class Client
{

	//场景类
	public static void main(String[] args){

		Scanner reader= new Scanner(System.in);		
		Copy copy= new Copy();
		System.out.println("欢迎使用复制模拟系统！");
		String begin= copyBegin(reader);
		String end= copyEnd(reader);
		copy.copy(begin,end);

	}

	//输入开始文件
	private static String copyBegin(Scanner reader){
		
		System.out.print("请输入需要复制的文件位置（以/分隔）：");
		String begin= reader.next();
		File file= new File(begin);
		if(!file.exists()){
			System.out.println("无效的文件路径！");
			System.exit(0);
		}
		return begin;
	}	

	//输入结束位置
	private static String copyEnd(Scanner reader){

		System.out.print("请输入需要复制到的位置（以/分隔）：");
		String end= reader.next();
		return end;
	}

}