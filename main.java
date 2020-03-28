package week3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class main {
	public static void main(String args[]) {
		String ngay = "20 Dec 1999";
		ngay.trim();
		MyDate myDate1 = new MyDate(ngay.toLowerCase());
		System.out.println("Ngay 1 : "+myDate1.toString());
		
		ngay = "22 10 1998";
		ngay.trim();
		MyDate myDate2 = new MyDate(ngay.toLowerCase());
		System.out.println("Ngay 2 : "+myDate2.toString(1));
		
		ngay = "35 Dec 1999";
		ngay.trim();
		MyDate myDate3 = new MyDate(ngay.toLowerCase());
		System.out.println("Ngay 3 : "+myDate3.toString());
		
		ngay = "15 Dec 2000";
		ngay.trim();
		MyDate myDate4 = new MyDate(ngay.toLowerCase());
		System.out.println("Ngay 4 : "+myDate4.toString(1));
				
		MyDate[] list = {myDate1, myDate2,myDate3,myDate4};
		
		DateUtils da = new DateUtils();
		da.Sorting(list);
		System.out.println("Mang sau khi da sap xep thoi gian");
		System.out.println("Ngay 1 : "+myDate1.toString());
		System.out.println("Ngay 2 : "+myDate2.toString(1));
		System.out.println("Ngay 3 : "+myDate3.toString());
		System.out.println("Ngay 4 : "+myDate4.toString(1));
	}
}