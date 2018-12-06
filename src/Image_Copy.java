import java.io.*;

public class Image_Copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long time1,time2,time3;
		time1=System.currentTimeMillis();
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			fis=new FileInputStream("src/abstract1.txt");
			fos=new FileOutputStream("src/abstract2.txt");
				int flag = 0; 
			while((flag=fis.read())!=-1) {
				fos.write(flag);
			}
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		finally {
			if(fis != null) {
				try {
					fis.close();
					} catch (IOException e) {				
						e.printStackTrace();	
					}
			}
			if(fos!=null){
				try{
					fos.close();
			} catch (IOException e) {				
				e.printStackTrace();	
				System.out.println("檔案複製失敗");
			}finally {
				System.out.println("檔案以複製完成");
			}
				
			}
			time2=System.currentTimeMillis();
			System.out.println("doSomething()花了：" + (time2-time1)/1000 + "秒");
		}
	}
}
