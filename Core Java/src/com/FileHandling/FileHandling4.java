package com.FileHandling;

import java.io.FileInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class FileHandling4 {

	public static void main(String[] args) throws Exception {
		FileInputStream fin1=new FileInputStream("D:\\IBM training\\abc.txt");
		FileInputStream fin2=new FileInputStream("D:\\IBM training\\def.txt");
		FileInputStream fin3=new FileInputStream("D:\\IBM training\\ghi.txt");
		Vector v =new Vector();
		v.add(fin1);
		v.add(fin2);
		v.add(fin3);
		
		Enumeration e=v.elements();
		
		SequenceInputStream sis=new SequenceInputStream(e);
		int i;
		while((i=sis.read())!=-1)
		{
			System.out.println((char)i);
		}
		sis.close();
		fin1.close();
		fin2.close();
		fin3.close();
	}

}
