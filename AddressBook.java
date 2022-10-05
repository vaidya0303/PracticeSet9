class PersonDetails{
	String firstName, lastName,city, state,email;
	int dateOfBirth, phnNumber,zip;
//creating a Contacts in Address Book with first and last names, address,city, state, zip, phone number and email...
	PersonDetails(String first, String Last, int dob, int phnnum,String yourcity, String yourState,int pincode,String emal){
		this.firstName=first;
		this.lastName=Last;
		this.dateOfBirth=dob;
		this.phnNumber=phnnum;
		this.city=yourcity;
		this.state=yourState;
		this.zip=pincode;
		this.email=emal;
	}

	void printDetails() {
		System.out.println("First name is: "+this.firstName);
		System.out.println("Last name is: "+this.lastName);
		System.out.println("Date of birth is: "+this.dateOfBirth);
		System.out.println("Phone number is: "+this.phnNumber);
		System.out.println("City name is: "+ this.city);
		System.out.println("State name is: "+this.state);
		System.out.println("Zip is: "+this.zip);
		System.out.println("email is "+this.email);

	}
}
public class AddressBook{
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		PersonDetails P1 = new  PersonDetails( "saurabh", "vaidya", 03,  27823, "pune",  "Maharastra", 200112,"sv@gmail.com");
		P1.printDetails();
	}
}