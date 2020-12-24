import java.util.Calendar;
import java.util.GregorianCalendar;
public class Citizen {
	
	//defining fields 
	String name;//Vorname des Bürgers
	String surname;//Nachname des Bürgers
	String phoneNumber;//PhoneNumber des Bürgers
	String emailAddress;//Email-Addresse des Bürgers 
	boolean sex;//Geschlecht des Bürgers. true = man, false = woman
	String familyStatus;//amilienstand des Bürgers (zb married, single, divorced...)
	Work workspace;//Arbeit
	boolean healthStatus; //Gesundheitszustand. true = able-bodied, false = disable
	Calendar birthday;//Geburtsdatum
	String status; //actuelle Status des Bürgers(zb "busy", "work", "relax")
	Location homeAddress;//Hausanschrift
	Location realLoc;//actuelle Location des Bürgers
	
	//Setters (Kommandos) 
	/**
	 * Create  new сitizen
	 * @param newName - Vorname des Bürgers
	 * @param newSurname - Nachname des Bürgers
	 * @param newPhoneNumber - PhoneNumber des Bürgers //moglich benutzen Regex für Überprufung 
	 * @param newEmailAddress - Email-Addresse des Bürgers  
	 * @param newSex - Geschlecht des Bürgers. true = man, false = woman
	 * @param newFamilyStatus - Familienstand des Bürgers (zb married, single, divorced...)
	 * @param newWorkspace - Arbeit 
	 * @param newHealthStatus - Gesundheitszustand. true = able-bodied, false = disable
	 * @param newDay - Tag des Geburstags
	 * @param newMonat - Monat des Geburstags
	 * @param newYear  - Jahr des Geburstags
	 * @param newHomeAddress - Hausanschrift
	 * @param newStatus - actuelle Status des Bürgers(zb "busy", "work", "relax")
	 * @param newRealLoc - actuelle Location des Bürgers
	 */
	void createСitizen(String newName, String newSurname,
			String newPhoneNumber, String newEmailAddress,
			boolean newSex, String newFamilyStatus, 
			Work newWorkspace, boolean newHealthStatus,
			int newDay, int newMonat, int newYear, Location newHomeAddress, String newStatus, Location newRealLoc) {
		this.setName(newName);
		this.setSurname(newSurname);
		this.setPhone(newPhoneNumber);
		this.setEmail(newEmailAddress);
		this.setSex(newSex);
		this.setFamilyStatus(newFamilyStatus);
		this.setWorkspace(newWorkspace);
		this.setHealthStatus(newHealthStatus);
		this.setBirthDate(newDay, newMonat, newYear);
		this.setHomeAddress(newHomeAddress);
		this.setStatus(newStatus);
		this.setRealLoc(newRealLoc);
	}
	
	/**
	 * Set name for citizen	
	 * @param newName
	 */
	void setName(String newName) {
		this.name = newName;
	}
	
	/**
	 * Set surname for citizen	
	 * @param newSurname
	 */
	void setSurname(String newSurname) {
		this.surname = newSurname;
	}
	
	/**
	 * Set phone number for citizen	
	 * @param newPhoneNumber
	 */
	void setPhone(String newPhoneNumber) {
		this.phoneNumber = newPhoneNumber;
	}
	
	/**
	 * Set email for citizen	
	 * @param newEmailAdress
	 */
	void setEmail(String newEmailAddress) {
		this.emailAddress = newEmailAddress;
	}
	
	/**
	 * Set sex for citizen
	 * @param newSex - true = man, false = woman
	 */
	void setSex(boolean newSex) {
		this.sex = newSex;
	}
	
	/**
	 * Set family status for citizen	
	 * @param newFamilyStatus "married", "single", "divorced"
	 */
	void setFamilyStatus(String newFamilyStatus) {
		this.familyStatus = newFamilyStatus;
	}
	
	/**
	 * Set workspace for citizen
	 * @requires newWorkspace.isInit()	
	 * @ensures workspace = newWorkspace
	 * @param newWorkspace
	 */
	void setWorkspace(Work newWorkspace) {
		this.workspace = newWorkspace;
	}
	
	/**
	 * Set health status for citizen	
	 * @param newHealthStatus true = able-bodied, false = disable 
	 */
	void setHealthStatus(boolean newHealthStatus) {
		this.healthStatus = newHealthStatus;
	}
	
	/**
	 * Set birth date for citizen
	 * @requires day>0 && day<=31 && monat>0 && monat<=12 && year>1910 && year<=2020
	 * @ensures birthday == birth
	 * @param day
	 * @param monat
	 * @param year
	 */
	void setBirthDate(int day, int monat, int year) {
		Calendar birth = new GregorianCalendar(year, monat, day); 
		this.birthday = birth;
	}
	
	/**
	 * Set actual status for citizen
	 * @param newStatus - "work", "relax", "sleep"
	 */
	void setStatus(String newStatus) {
		this.status = newStatus;
	}
	
	/**
	 * Set home address for citizen
	 * @requires newHomeAdress.isInit()
	 * @ensures homeAddress == newHomeAddress
	 * @param newHomeAdress
	 */
	void setHomeAddress(Location newHomeAddress) {
		this.homeAddress = newHomeAddress;
	}
	
	/**
	 * Set actual location for citizen
	 * @requires newRealLoc.isInit()
	 * @ensures realLoc == newRealLoc
	 * @param newRealLoc
	 */
	void setRealLoc(Location newRealLoc) {
		this.realLoc = newRealLoc;
	}
	
	//Getters - Abfragen
	/**
	 * @pure
	 * Get name of citizen	
	 */
	String getName() {
		return name;
	}
	
	/**
	 * @pure
	 * Get surname of citizen	
	 */
	String getSurname() {
		return surname;
	}
	
	/**
	 * @pure
	 * Get phone number of citizen	
	 */
	String getPhoneNumber() {
		return phoneNumber;
	}
	
	/**
	 * @pure
	 * Get email of citizen	
	 */
	String getEmail() {
		return emailAddress;
	}
	
	/**
	 * @pure
	 * Get sex of citizen	
	 */
	boolean getSex() {
		return sex;
	}
	
	/**
	 * @pure
	 * Get family status of citizen	
	 */
	String getFamilyStatus() {
		return familyStatus;
	}
	
	/**
	 * @pure
	 * Get workspace of citizen	
	 */
	Work getWork() {
		return workspace;
	}
	
	/**
	 * @pure
	 * Get health status of citizen	
	 */
	boolean getHealthStatus() {
		return healthStatus;
	}
	
	/**
	 * @pure
	 * Get birth date of citizen	
	 */
	Calendar getBirthDate() {
		return birthday;
	}
	
	/**
	 * @pure
	 * Get actual location of citizen	
	 */
	Location getLoc() {
		return realLoc;
	}
	
	/**
	 * @pure
	 * Get actual status of citizen	 
	 */
	String getStatus() {
		return status;
	}
	
	
	//Actions Kommandos
	
	/**
	 * Citizen works
	 * @requires this.getLoc() == workspace.workspace && workspace.isInit()
	 * @ensures this.status == "worked"
	 * @param workspace
	 */
	void work(Work workspace) {
		if(this.getLoc() == workspace.workspace) {
			this.status = "worked";
			System.out.println("I am working ");
		}
		else {
			System.out.println("I cannot work without being at my workplace. First, go to work ");
		}
	}
	
	/**
	 * Citizen arrives at the location
	 * @requires loc.isInit()
	 * @ensures realLoc == loc
	 * @param loc
	 */
	void drive(Location loc) {
		System.out.println("I came to " + loc);
		this.realLoc = loc;
	}
	
	/**
	 * Citizen falls asleep
	 * @requires this.getLoc() == this.homeAddress && homeAdress.isInit()
	 * @ensures status == "sleep"
	 */
	void sleep() {
		if(this.getLoc() == this.homeAddress) {
			this.status = "sleep";
			System.out.println("I am sleeping");
		}
		else {
			System.out.println("I can not fall asleep. In order to sleep I must first come home");
		}
		
	}
	/**
	 * Citizen relaxes
	 * @requires loc.isInit()
	 * @ensures status == "sleep"
	 * @param loc
	 */
	void relax(Location loc) {
		this.status = "relax";
		System.out.println("I am relaxing now at " + loc);
	}
	
	/**
	 * Reminder of how many days are left until the birthday(unfinished function)
	 * @requires birthday.isInit()
	 * @ensures d == days until the birthday
	 */
	void birthdayReminder() { 
		int day = 9; //default
		int birthDay = birthday.get(Calendar.DAY_OF_MONTH);
		int d = birthDay - day;
		System.out.println("until the birthday: " + d + " days");
	}	
}
