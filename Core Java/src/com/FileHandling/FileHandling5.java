package com.FileHandling;

import java.io.*;

public class FileHandling5
{
	
	public static class Date implements Serializable
	{
		private static final long serialVersionUID= 2L;
		private int day;
		private int month;
		private int year;
		public Date(int day, int month, int year) 
		{
			super();
			this.day = day;
			this.month = month;
			this.year = year;
		}
		public Date() 
		{
			this.day = 10;
			this.month = 4;
			this.year = 2020;
		}
		@Override
		public String toString()
		{
			return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
		}
	}

    public static class Account implements Serializable 
    {
    	private static final long serialVersionUID= 2L;
    	
        public String name = "Deep";
        public int id = 0;
        public  double balance = 0;
        public  Date date = new Date(6,8,2020);
        
        @Override
        public String toString()
        {
			return this.name +"_"+this.id +"_"+this.balance +"_" +this.date;
        	
        }
    }


    public static void main(String[] args) throws IOException, ClassNotFoundException 
    {

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("D:\\IBM training\\abc.txt"));

        Account acc = new Account();
        acc.name  = "Deeptansu Patro";
        acc.id = 999;
        acc.balance= 1000;
        acc.date=new Date(8,03,1999);

        Account acc1 = new Account();
        acc1.name = "Lionel Messi";
        acc1.id  = 285;
        acc1.balance= 2000 ;
        acc.date=new Date(19,05,2020);

        objectOutputStream.writeObject(acc);
        objectOutputStream.writeObject(acc1);
        objectOutputStream.close();


        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("D:\\IBM training\\abc.txt"));
         
        for (int i=0;i<2 ;i++ ) 
        {
        System.out.println((Account) objectInputStream.readObject());
        }
        objectInputStream.close();
    }
}