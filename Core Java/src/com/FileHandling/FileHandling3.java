package com.FileHandling;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileHandling3 {

	public static void main(String[] args) throws Exception {
		
		File file=new File("D:\\IBM training\\abc.txt");
		FileOutputStream fos=new FileOutputStream(file);
		DataOutputStream dos=new DataOutputStream(fos);
		dos.writeInt(1234);
		dos.writeUTF("Deeptansu");
		dos.writeDouble(1000.0);
		dos.flush();
		fos.flush();
		
		File file1=new File("D:\\IBM training\\abc.txt");
		FileInputStream fis=new FileInputStream(file1);
		DataInputStream dis=new DataInputStream(fis);
		int account_no=dis.readInt();
		String name=dis.readUTF();
		double balance=dis.readDouble();
		
		dos.close();
		fos.close();
		dis.close();
		fis.close();
		System.out.println("Account no="+account_no+"Name="+name+"Balance="+balance);
	}


}
