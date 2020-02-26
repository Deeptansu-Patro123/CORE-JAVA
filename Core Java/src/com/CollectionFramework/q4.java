package com.CollectionFramework;


import java.util.HashMap;
import java.util.Iterator;

class Date 
{
	private int day,  month, year;

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	@Override

	public boolean equals(Object obj) {
        Date o= (Date)obj;
		if(o.day==this.day&&o.month==this.month)
			return true;
		else 
			return false;
        
	}
	
//	@Override
    public int hashCode() {
        return 9;
    }
}

public class q4 {
	
	public static void main(String[] args) 
	{
		HashMap<Date, String> map = new HashMap<>();
		map.put(new Date(2, 1,1998), "Deeptansu");
		map.put(new Date(2, 1,1999), "MEssi");
		map.put(new Date(3, 1,1998), "RoNaldo");
		
       	
		Iterator<Date> itr = map.keySet().iterator();
		while(itr.hasNext()) {
			Date d = itr.next();
			System.out.println(d);
		}
		 String s=map.get(new Date(3, 1,1998));
		 System.out.println("call : "+s);
	
		
	}

}