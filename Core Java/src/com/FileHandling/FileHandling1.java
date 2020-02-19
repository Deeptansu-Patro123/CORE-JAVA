package com.FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileHandling1 {

	public static void main(String[] args) throws Exception {
	
		File file=new File("D:\\IBM training\\abc.txt");
		File file1=new File("D:\\IBM training\\def.txt");
		FileInputStream fis=new FileInputStream(file);
		FileOutputStream fos=new FileOutputStream(file1);
		
		StringBuilder sb=new StringBuilder("");
		int i=0;
		do
		{
			i=fis.read();
			if(i!=-1)
			sb.append((char)i);
		}while(i!=-1);
		System.out.println("File contents "+sb);
		String strData = sb.toString();
		fos.write(strData.getBytes());
		fos.flush();
		fos.close();
		fis.close();
	}

}
