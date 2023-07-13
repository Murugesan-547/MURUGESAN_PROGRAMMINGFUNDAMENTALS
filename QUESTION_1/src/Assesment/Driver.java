package Assesment;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Admindepartment AD=new Admindepartment();
		System.out.println("Welcome to "+AD.departmentName());
		System.out.println(AD.getTodaysWork());
		System.out.println(AD.getWorkDeadline());
		System.out.println(AD.isTodayAHoliday());
		System.out.println();
		
		Hrdepartment HR=new Hrdepartment();
		System.out.println("Welcome to "+HR.departmentName());
		System.out.println(HR.doActivity());
		System.out.println(HR.getTodaysWork());
		System.out.println(HR.getWorkDeadline());	
		System.out.println(AD.isTodayAHoliday());
		System.out.println();
		
		Techdepartment TD=new Techdepartment();
		System.out.println("Welcome to"+TD.departmentName());
		System.out.println(TD.getTodaysWork());
		System.out.println(TD.getWorkDeadline());
		System.out.println(TD.getTechStackInformation() );
		System.out.println(AD.isTodayAHoliday());
	}   

}
