package week3;

public class DateUtils {
	public int compare(MyDate date1, MyDate date2) {
		if(date1.getYear() > date2.getYear()) {
			return 1;
		}
		if(date1.getYear() < date2.getYear()) {
			return -1;
		}
		if(date1.getMonth() > date2.getMonth()) {
			return 1;
		}
		if(date1.getMonth() < date2.getMonth()) {
			return -1;
		}
		if(date1.getDate() > date2.getDate()) {
			return 1;
		}
		if(date1.getDate() < date2.getDate()) {
			return -1;
		}
		return 0;
	}
	public void swap(MyDate date1, MyDate date2) {
		MyDate tmp = new MyDate(date1.getDate(),date1.getMonth(),date1.getYear());
		date1.setDate(date2.getDate());
		date1.setMonth(date2.getMonth());
		date1.setYear(date2.getYear());
		
		date2.setDate(tmp.getDate());
		date2.setMonth(tmp.getMonth());
		date2.setYear(tmp.getYear());
		
	}
	public void Sorting(MyDate[] list) {
		int i,j;
		for(i=0;i<list.length-1;i++) {
			for(j=i+1;j<list.length;j++) {
				if(compare(list[i],list[j]) > 0) {
					swap(list[i],list[j]);
				}
			}
		}
	}
}
