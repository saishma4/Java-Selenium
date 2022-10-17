package abstractionDemo;

public class HRTeam extends ITDepartment{

	public static void main(String[] args) {
		//1st Scenario
		HRTeam hr = new HRTeam();
		hr.work();
		hr.salary();
		hr.bonus();
		
		//2nd Scenario
		
		ITDepartment it = new HRTeam();
		it.work();
		it.salary();
		
		//ITDepartment itOne = new ITDepartment();(class is not implemented fully)
		
	}


	public void salary() {
		System.out.println("24LPA");
		
	}
	
	public void bonus() {
		System.out.println("10%");
	}

}
