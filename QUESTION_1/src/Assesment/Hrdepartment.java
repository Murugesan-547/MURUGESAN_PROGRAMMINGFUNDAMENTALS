package Assesment;

public class Hrdepartment extends Superdepartment {
	String departmentName () {
		return "HR Department";
	}
	
	String getTodaysWork() {
		return "Fill today’s timesheet and mark your attendance";
				
	}
	String getWorkDeadline () {
		return "Complete by EOD";
	}
	
	String  doActivity() {
		return "Team Lunch";

	}
}
