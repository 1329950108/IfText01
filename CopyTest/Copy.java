
import java.io.*;
public class Copy
{
	public static String beginForIteration= "";

	//复制目录到指定目录下
	public void copy(String begin,String end){
		
		if(beginForIteration == ""){
			beginForIteration= begin;
		}
		File file= new File(begin);
		StringBuffer temp= new StringBuffer(file.getAbsolutePath());
		temp.replace(0,beginForIteration.length(),end);

		if(file.isFile()){
			copyFile(file.getAbsolutePath(),temp.substring(0));
			System.out.println(file.getAbsolutePath()+"-->"+temp.substring(0));
			return;
		}
		File newFile= new File(temp.substring(0));
		if(!newFile.exists()){
			newFile.mkdir();
			}
		File[] files= file.listFiles();
		for(File subfile: files){
			copy(subfile.getAbsolutePath(),end);

		}
		
	}

	//复制文件到指定目录下
	private void  copyFile(String begin,String end){

		try{
			FileInputStream fis= new FileInputStream(begin);
			FileOutputStream fos= new FileOutputStream(end);
			int temp= 0;
			byte[] bytes= new byte[1024];
			while((temp= fis.read(bytes)) != -1){
				fos.write(bytes,0,temp);
			}

			fos.flush();
			fis.close();
			fos.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}