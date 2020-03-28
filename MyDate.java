package week3;

import java.util.ArrayList;
import java.util.Scanner;

public class MyDate {
	private int date, month, year;
	
	public void Nhap() {
		String Date;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap dd MM yy : ");
		Date = scanner.nextLine();
		System.out.println(Date);
		MyDate again = new MyDate(Date.toLowerCase());
		this.date = again.getDate();
		this.month = again.getMonth();
		this.year = again.getYear();
	}
	public MyDate() {
		Nhap();
	}
	public MyDate(int date, int month, int year) {
		super();
		this.date = date;
		this.month = month;
		this.year = year;
	}
	
	public MyDate(String date) {
		int i,j;
		int dem = 0;
		date.toLowerCase();
		ArrayList<String> ngay = new ArrayList<>();
		date += ' ';
		for(i=0;i<date.length();i++) {
			j=i;
			i = date.indexOf(" ",i+1);
			ngay.add(date.substring(j, i));
		}
		if(ngay.size() == 3) {
			if(setDate("",ngay.get(0)) == 0)
				return;
			if(setMonth(ngay.get(1)) == 0)
				return;
			setYear(ngay.get(2));
			
		}else if(ngay.size() != 4) {
			if(setDate(ngay.get(0),ngay.get(1)) == 0)
				return;
			if(setMonth(ngay.get(2)) == 0)
				return;
			setYear(ngay.get(3));
		}
		else {
			System.out.println("Dinh dang ngay thang sai");
			System.out.println("Nhap lai theo dinh dang dd MM yy");
			Nhap();
			return;
		}
		switch(month) {
			case 4: case 6: case 9: case 11:
				if(this.date == 31) {
					System.out.println("Thang"+month+"Khong co ngay"+this.date);
					System.out.println("Nhap lai : ");
					Nhap();
					return;
				}
				break;
			case 2:
				if(year%4 != 0 && this.date > 28 ) {
					System.out.println("Thang"+month+"Khong co ngay"+this.date);
					System.out.println("Nhap lai : ");
					Nhap();
					return;
				}else
					if(this.date > 29) {
						System.out.println("Thang"+month+"Khong co ngay"+this.date);
						System.out.println("Nhap lai : ");
						Nhap();
						return;
					}
				break;
			default:
				break;
		}
		
	}
	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int setDate(String date1, String date2) {
		switch(date1 + date2) {
			case "first": case "1":
				setDate(1);
				break;
			case "second": case "2":
				setDate(2);
				break;
			case "third": case "3":
				setDate(3);
				break;
			case "fourth": case "4":
				setDate(4);
				break;
			case "fifth": case "5":
				setDate(5);
				break;
			case "sixth": case "6":
				setDate(6);
				break;
			case "seventh": case "7":
				setDate(7);
				break;
			case "eighth": case "8":
				setDate(8);
				break;
			case "ninth": case "9":
				setDate(9);
				break;
			case "tenth": case "10":
				setDate(10);
				break;
			case "eleventh": case "11":
				setDate(11);
				break;
			case "twelfth": case "12":
				setDate(12);
				break;
			case "thirteenth": case "13":
				setDate(13);
				break;
			case "fourteenth": case "14":
				setDate(14);
				break;
			case "fifteenth": case "15":
				setDate(15);
				break;
			case "sixteenth": case "16":
				setDate(16);
				break;
			case "seventeenth": case "17":
				setDate(17);
				break;
			case "eighteenth": case "18":
				setDate(18);
				break;
			case "ninteenth": case "19":
				setDate(19);
				break;
			case "twentieth": case "20":
				setDate(20);
				break;
			case "twentyfirst": case "21":
				setDate(21);
				break;
			case "twentysecond": case "22":
				setDate(22);
				break;
			case "twentythird": case "23":
				setDate(23);
				break;
			case "twentyfourth": case "24":
				setDate(24);
				break;
			case "twentyfifth": case "25":
				setDate(25);
				break;
			case "twentysixth": case "26":
				setDate(26);
				break;
			case "twentyseventh": case "27":
				setDate(27);
				break;
			case "twentyeighth": case "28":
				setDate(28);
				break;
			case "twentyninth": case "29":
				setDate(29);
				break;
			case "thirtieth": case "30":
				setDate(30);
				break;
			case "thirtyfirst": case "31":
				setDate(31);
				break;
			default:
				System.out.println("Nhap lai ngay : ");
				Nhap();
				return 0;
		}
		return 1;
	}
	
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int setMonth(String month) {
		switch(month) {
		case "january": case "1": case "jan":
			this.setMonth(1); 
			break;
		case "february": case "2": case "feb":
			this.setMonth(2); 
			break;
		case "march": case "3": case "mar":
			this.setMonth(3); 
			break;
		 case "april": case "4": case "apr":
			 this.setMonth(4); break;
		case "may": case "5": 
			 this.setMonth(5);
			 break;
		case "june": case "jun": case "6":
			 this.setMonth(6);
			 break;
		case "july": case "jul": case "7":
			this.setMonth(7); 
			break;
	      case "august": case "8": case "aug":
	    	  this.setMonth(8); 
	    	  break;
	      case "september": case "9": case "sep":
	    	  this.setMonth(9);
	    	  break;
	      case "october": case "10": case "oct":
	    	  this.setMonth(10);
	    	  break;
	      case "november": case "11": case "nov":
	    	  this.setMonth(11); 
	    	  break;
	      case "december": case "12": case "dec":
	    	  this.setMonth(12);
	    	  break;
	      default:
	    	  System.out.println("Nhap lai thang : ");
	    	  Nhap();
	    	  return 0;
		}
		return 1;
	}
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void setYear(String year) {
		setYear(Integer.parseInt(year));
	}
	
	public String toString() {
		return (this.date+"-"+month+"-"+year);
	}
	public String toString(int a) {
		return (this.date+"/"+month+"/"+year);
	}
}
