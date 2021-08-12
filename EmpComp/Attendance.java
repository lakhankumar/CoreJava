package EmpComp;

//import java.lang.Math;

public class Attendance {
	public static void main(String[] args) {
		int PRESENT = 1;
		int attendance = (int) (Math.floor(Math.random()*10)%2);
		if (attendance == PRESENT) {
			System.out.println("employee is present");
		}
		else {
			System.out.println("employee is absent");
		}
	}
}
