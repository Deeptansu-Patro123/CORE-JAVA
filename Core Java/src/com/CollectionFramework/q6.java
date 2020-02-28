package com. CollectionFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
/*class User
{
	private String f_name;
	private String s_name;
	private String password;
	public User(String f_name, String s_name, String password) {
		super();
		this.f_name = f_name;
		this.s_name = s_name;
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [f_name=" + f_name + ", s_name=" + s_name + ", password=" + password + "]";
	}
	
}*/
public class q6 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		HashMap<String, String> usermap = new HashMap<>();
		HashMap<String,String> msgmap = new HashMap<>();
		HashMap<String,String> passwordmap = new HashMap<>();
		Set<String> userList = new TreeSet<String>();
		while(true) 
		{
			System.out.println("Option:\nA.Create a chatroom.\n"
					+ "B. Add the user.\n"
					+ "C.User login\n"
					+ "D.Send a message\n"
					+ "E.Display the messages from a specific chatroom\n"
					+ "F.List down all users belonging to the specified chat room\n"
					+ "G.Logout\n"
					+ "H.Delete an user\n"
					+ "I.Delete the chat room.");
			System.out.println("Please Enter your Option");
			@SuppressWarnings("resource")
			Scanner sc= new Scanner(System.in);
			String opt=sc.next();
			System.out.println(opt);
			switch(opt)
			{
			case "A":
					System.out.println("Enter The name of the chat room:");
					String chartroom_name=sc.next();
					
					if(usermap.containsKey(chartroom_name))
					{
						System.out.println("User Already exits");
					}
					usermap.put(chartroom_name,null);
					break;
			case "B":
				    System.out.println("Enter the Chat Room name Where you want :");
				    String chartroom_name1=sc.next();
					System.out.println("Enter the user name:");
					String user_name=sc.next();
					System.out.println("Enter the password:");
					String password=sc.next();
					passwordmap.put(user_name,password);
					if(usermap.containsValue(user_name))
					{
						System.out.println("User Already exits");
					}
					else {
						usermap.put(chartroom_name1,user_name);
						System.out.println("User Created");
					}
						usermap.forEach((k, v) -> {
				            System.out.println("ChatRoom: " + k + ", USER: " + v);
				        });
					break;
			case "C":
					System.out.println("Enter the user name:");
					String user_name1=sc.next();
					System.out.println("Enter the password:");
					String password1=sc.next();
					if(passwordmap.containsKey(user_name1) && passwordmap.containsValue(password1))
					{
						System.out.println("Login Completed");
					}
					else
						System.out.println("Incorrect Credential");
					break;
			case "D":
				System.out.println("Enter any message");
				String message=sc.next();
				break;
			case "E":
			}
		}
	}

}