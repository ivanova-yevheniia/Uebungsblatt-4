
public class Work {
	String companyName;
	String[] activities;
	int[] workTime;
	String[] listWorkers;
	Location workspace;
	
	void setWork(String newCompanyName, String[] newActivities,
			int[] newWorkTime, String[] newListWorkers, Location newWorkspace) {
		this.companyName = newCompanyName;
		this.activities = newActivities;
		this.workTime = newWorkTime;
		this.listWorkers = newListWorkers;
		this.workspace = newWorkspace;
		
	}
	
	void setCompanyName(String newCompanyName) {
		this.companyName = newCompanyName;
	}
	
	void setLoc(Location newWorkspace) {
		this.workspace = newWorkspace;
	}
	
	String getCompanyName() {
		return companyName;
	}
	
	String[] getActivities() {
		return activities;
	}
	
	int[] getWorkTime() {
		return workTime;
	}
	
	Location getLocation() {
		return workspace;
	}
	void addWorker(Citizen human) {
		// TO DO
	}
	void delWorker(Citizen human) {
		// TO DO
	}
	boolean openCompany() {
		boolean value = false;
		//if company opened...
		//else company closed..
		return value;
	}
}
