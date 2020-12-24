
public class Main {

	public static void main(String[] args) {

		Citizen markus = new Citizen();
		markus.setName("Markus");
		Work gooble = new Work();
		gooble.setCompanyName("gooble");
		gooble.addWorker(markus);
		Location workspaceLoc = new Location();
		gooble.setLoc(workspaceLoc);
		Location parkLocation = new Location();
		Location homeLocation = new Location();
		markus.homeAddress = homeLocation;
		
		
		markus.drive(homeLocation);
		markus.sleep();
		markus.drive(workspaceLoc);
		markus.work(gooble);
		markus.drive(parkLocation);
		markus.relax(parkLocation);
		markus.drive(homeLocation);
		markus.sleep();
		markus.setBirthDate(10, 12, 2000);
		markus.birthdayReminder();
	}

}
