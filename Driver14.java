package airlinepackage;

import java.util.Scanner;
import java.util.ArrayList;





//Registration  Abstraction
abstract class Register
{
	abstract void signup();
	abstract void login();
}

class Registration extends Register
{
	String firstname;
	String lastname;
	int age;
	String gender;
	private long contactnumber;
	String email = "admin";
	String password = "admin";
	
	public long getContactnumber()
	{
		return contactnumber;
	}
	
	public void setContactnumber()
	{
		this.contactnumber = contactnumber;
	}
	
	public void signup() // Method Overriding
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println(" ");
		System.out.println("Enter the first name");
		firstname = sc.nextLine();
		System.out.println("Enter the last name");
		lastname = sc.nextLine();
		System.out.println("Enter the gender");
		gender = sc.nextLine();
		contact();
		System.out.println("Enter the Email");
		email = sc.nextLine();
		System.out.println("Enter the Password");
		password = sc.nextLine();
		login();
	}
	
	public void login() // Method Overriding
	{
		System.out.println(" ");
		try {
		System.out.println("Please enter the credentials to login");
		}
		catch(Exception e)
		{
			System.out.println("please enter correct input !(range 1 to 3)");
		}
		Scanner sc = new Scanner(System.in);
		System.out.println(" ");
		System.out.println("Enter the email");
		String email = sc.nextLine();
		System.out.println(" ");
		System.out.println("Enter the password");
		String pass = sc.nextLine();
		
		
		
		System.out.println(" ");
		if (email.equals(this.email) && pass.equals(this.password)) {
			System.out.println("Successful");
		} else {
			System.out.println("not successful");
			login();
		}
		
		
	}
	
	public void contact() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the mobile number");
		long contactnumber = sc.nextLong();
		if (contactnumber > 999999999l && contactnumber < 10000000000L) {
			this.contactnumber = contactnumber;
		} else {
			System.out.println("Enter 10 digit number");
			contact();

		}
	}
}
	
	
class main extends Airline
{
	
	public static void menu() {
		System.out.println("  " );
		System.out.println(
				" |------------------------------------------------------------------------------------------| " );
		System.out.println("  " );
	    System.out.println(
	    		 " |                                   Please fill the details                                            | " );
	    System.out.println("  " );
	    System.out.println(
				" |------------------------------------------------------------------------------------------| " );
	    
	}




}


//Driver class
public class Driver14 {
	
	static
	{
		System.out.println(
				" |------------------------------------------------------------------------------------------| " );
		System.out.println(
				" |------------------------------------------------------------------------------------------| " );
		System.out.println("  " );
		System.out.println(
				" | ================================WELCOME TO RKAIRLINES====================================|  ");               
		System.out.println("  " );
		System.out.println(
				" |------------------------------------------------------------------------------------------| " );
		System.out.println(
				" |------------------------------------------------------------------------------------------| " );
	}
	
	static
	{
		System.out.println("  " );
		System.out.println("  " );
		System.out.println(
				" |------------------------------------------------------------------------------------------| " );
		System.out.println("  " );
		System.out.println(
				" |                                          FLIGHT BOOOKING                                 | " );                                    
		System.out.println("  " );
		System.out.println(
				" |------------------------------------------------------------------------------------------| " );
		System.out.println("  " );
	}
	public static void main(String[]args)
	{
		
		try {
		Scanner sc = new Scanner(System.in);
		main af = new main();
		af.menu();
        System.out.println(" ");
 
		System.out.println("Enter 1 for Signup");
		System.out.println("Enter 2 for Login");
		System.out.println("Enter 3 for Exit");
        
    
		System.out.println(" ");
		Register r1 = new Registration(); //Upcasting
		
		Airline al = new Airline();
		
		int n = sc.nextInt();
		switch (n) {
		case 1:
			r1.signup();
			al.airline_rk();
			
			break;
		case 2:
			r1.login();
			al.airline_rk();
			
			break;
		case 3:
			System.exit(0);
			break;
		default:
			System.out.println("Please enter the valid input");
			main(null);
			break;
		}
		}
		catch(Exception e)
		{
			System.out.println("handled");
		}
		
	}

}

//Super class or Generalized class
class Airline
{
	public static void airline_rk()
	{
		
		System.out.println(
				"---------------------------------------------------------------------------------------------------  ");
		System.out.println(" ");
		System.out.println("                 *     Explore your Travel     *                                          ");
		System.out.println(
				"---------------------------------------------------------------------------------------------------  ");
		System.out.println(" ");
		 

		    System.out.println(" ");
			System.out.println("Press 1 for Domestic Flights ");
			System.out.println("Press 2 for International Flights");
			System.out.println("Press 3 for Booking Domestic Flights");
			System.out.println("Press 4 for Booking Internaional Flights");
			System.out.println("Press 5 for Airport Information");
			System.out.println("Press 6 for Exit");
			System.out.println(
					"--------------------------------------------------------------------------------------------------- ");
			System.out.println(" ");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			switch (n) {
			case 1:
				System.out.println(" ");
				System.out.println(
						"------------------------Domestic Airlines from Origin:Mumbai------------------------------------");
				System.out.println(" ");
				System.out.println("Press 1 Mumbai to Delhi");
				System.out.println("Press 2 Mumbai to Bangalore");
				System.out.println("Press 3 Mumbai to Hyderabad");
				System.out.println("Press 4 Mumbai to Chennai");
				System.out.println("Press 5 Mumbai to Kolkata");
				
				
				
				int n1 = sc.nextInt();
				switch (n1) {
				case 1:
					System.out.println("====---- Mumbai to Delhi Flights ----====");
					MumDel md = new MumDel();
					md.bomdel();
					airline_rk();
				    
					
					
					break;
					
				case 2:
					System.out.println("====---- Mumbai to Bangalore Flights ----====");
					MumBlore mb = new MumBlore();
					mb.bomban();
					airline_rk();
					
					break;
					
				case 3:
					System.out.println("====---- Mumbai to Hyderabad Flights ----====");
					MumHybad mh = new MumHybad();
					mh.bomhyd();
					airline_rk();
					
					break;
					
				case 4:
					System.out.println("====---- Mumbai to Chennai Flights ----====");
					MumChn mc = new MumChn();
					mc.bomchn();
					airline_rk();
					
					break;
					
				case 5:
					System.out.println("====---- Mumbai to Kolkata Flights ----====");
					MumKol mk = new MumKol();
					mk.bomkol();
					airline_rk();
					
					break;
					
				case 6:
					System.out.println("====---- Main Menu ----====");
					airline_rk();
					
					break;
					
				default:
			     airline_rk();
					break;
				}
				break;
			
			
			case 2:
				System.out.println("International Airlines from Origin:Mumbai");
				InternationalAirline fi = new InternationalAirline();
				fi.international_airline();
				
				

				break;
				
				
			case 3:
				System.out.println(" ");
				System.out.println(
						"------------------------------------------------------------------------");
				System.out.println("Domestic Flights Seats Booking");
				System.out.println(
						"------------------------------------------------------------------------");
				System.out.println(" ");
				Seats1 se = new Seats1();
				se.domestic_seats();
				airline_rk();

				break;
				
			case 4:
				System.out.println(" ");
				System.out.println(
						"----------------------------------------------------------------------- ");
				System.out.println("International Flights Seats Booking");
				System.out.println(
						"------------------------------------------------------------------------");
				System.out.println(" ");
				Seats2 sf = new Seats2();
				sf.international_seats();
				airline_rk();

				break;
				
			case 5:
				System.out.println(" ");
				System.out.println(
						"------------------------------------------------------------------------");
				System.out.println("Airport Information");
				System.out.println(
						"----------------------------------------------------------------------- ");
				System.out.println(" ");
				Allairports ref = new Allairports();
				ref.airport();
				airline_rk();
				
				break;
				
			case 6:
				System.exit(0);
				
			default:
				System.out.println("   Please enter valid input!   ");
				airline_rk();
				break;

			}
		}

		
			
		}
		

		
	
	

class DomesticAirline extends Airline
{
	public void domestic()
	{
		DomesticAirline ref2 = new DomesticAirline();
		System.out.println("---------- Enter 1 for Domestic Travel----------");
		ref2.domestic();
	}
}

class MumDel extends DomesticAirline
{
	public void bomdel()
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println(" ");
		System.out.println("Press 1 For Indigo Flights");
		System.out.println("Press 2 For Air India Flights");
		System.out.println("Press 3 For Vistara Flights");
		System.out.println("Press 4 For Spicejet Flights");
		int m = s1.nextInt();
		switch(m){
		case 1:
			System.out.println("=====---- Indigo Flights ----====");
			DomesticFlights df = new DomesticFlights();
			df.indigo();
			airline_rk();
			
			break;
		
		case 2:
			System.out.println("====---- Air India Flights ----====");
			DomesticFlights df1 = new DomesticFlights();
			df1.air_india();
			airline_rk();
			
			break;
		
		case 3:
			System.out.println("====---- Vistara Flights ----====");
			DomesticFlights df2 = new DomesticFlights();
			df2.vistara();
			airline_rk();
			
			break;
		
		case 4:
			System.out.println("====---- SpiceJet Flights ----====");
			DomesticFlights df3 = new DomesticFlights();
			df3.spicejet();
			airline_rk();
			
			break;
		
			
		
		}
		
	}
	}

class MumBlore extends DomesticAirline
{
	public void bomban()
	{
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Press 1 For Indigo Flights");
		System.out.println("Press 2 For Air India Flights");
		System.out.println("Press 3 For Vistara Flights");
		System.out.println("Press 4 For Spicejet Flights");
		int m = s1.nextInt();
		switch(m){
		case 1:
			System.out.println("====---- Indigo Flights ----====");
			DomesticFlights1 dfd = new DomesticFlights1();
			dfd.indigo1();
			airline_rk();
			
			break;
		
		case 2:
			System.out.println("====---- Air India Flights ----====");
			DomesticFlights1 dfd1 = new DomesticFlights1();
			dfd1.air_india1();
			airline_rk();
			
			break;
		
		case 3:
			System.out.println("====---- Vistara Flights ----====");
			DomesticFlights1 dfd2 = new DomesticFlights1();
			dfd2.vistara1();
			airline_rk();
			
			break;
		
		case 4:
			System.out.println("====---- SpiceJet Flights ----====");
			DomesticFlights1 dfd3 = new DomesticFlights1();
			dfd3.spicejet1();
			airline_rk();
			
			break;
		
		default:airline_rk();
		break;
		
	}
}
	
	}


class MumHybad extends DomesticAirline
{
	
	public void bomhyd()
	{
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Press 1 For Indigo Flights");
		System.out.println("Press 2 For Air India Flights");
		System.out.println("Press 3 For Vistara Flights");
		System.out.println("Press 4 For Spicejet Flights");
		int m = s1.nextInt();
		switch(m){
		case 1:
			System.out.println("====---- Indigo Flights ----====");
			DomesticFlights2 dfh= new DomesticFlights2();
			dfh.indigo2();
			airline_rk();
			
			break;
		
		case 2:
			System.out.println("====---- Air India Flights ----====");
			DomesticFlights2 dfh1 = new DomesticFlights2();
			dfh1.air_india2();
			airline_rk();
			
			break;
			
		
		case 3:
			System.out.println("====---- Vistara Flights ----====");
			DomesticFlights2 dfh2 = new DomesticFlights2();
			dfh2.vistara2();
			airline_rk();
			
			break;
		
		case 4:
			System.out.println("====---- SpiceJet Flights ----====");
			DomesticFlights2 dfh3 = new DomesticFlights2();
			dfh3.spicejet2();
			airline_rk();
			
			break;
			
			default:airline_rk();
			break;
		
			
		
	}
}
	
}

class MumChn extends DomesticAirline
{
	
	public void bomchn()
	{
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Press 1 For Indigo Flights");
		System.out.println("Press 2 For Air India Flights");
		System.out.println("Press 3 For Vistara Flights");
		System.out.println("Press 4 For Spicejet Flights");
		int m = s1.nextInt();
		switch(m){
		case 1:
			System.out.println("====---- Indigo Flights ----====");
			DomesticFlights3 dfc= new DomesticFlights3();
			dfc.indigo3();
			airline_rk();
			
			break;
		
		case 2:
			System.out.println("====---- Air India Flights ----====");
			DomesticFlights3 dfc1 = new DomesticFlights3();
			dfc1.air_india3();
			airline_rk();
			
			break;
		
		case 3:
			System.out.println("====---- Vistara Flights ----====");
			DomesticFlights3 dfc2 = new DomesticFlights3();
			dfc2.vistara3();
			airline_rk();
			
			break;
		
		case 4:
			System.out.println("====---- SpiceJet Flights ----====");
			DomesticFlights3 dfc3 = new DomesticFlights3();
			dfc3.spicejet3();
			airline_rk();
			
			break;
			
		default:airline_rk();
		break;
		
			
		
	}
}
	
	
}

class MumKol extends DomesticAirline
{
	
	public void bomkol()
	{
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Press 1 For Indigo Flights");
		System.out.println("Press 2 For Air India Flights");
		System.out.println("Press 3 For Vistara Flights");
		System.out.println("Press 4 For Spicejet Flights");
		int m = s1.nextInt();
		switch(m){
		case 1:
			System.out.println("====---- Indigo Flights ----====");
			DomesticFlights4 dfk= new DomesticFlights4();
			dfk.indigo4();
			airline_rk();
			
			break;
		
		case 2:
			System.out.println("====---- Air India Flights ----====");
			DomesticFlights4 dfk1 = new DomesticFlights4();
			dfk1.air_india4();
			airline_rk();
			
			break;
		
		case 3:
			System.out.println("====---- Vistara Flights ----====");
			DomesticFlights4 dfk2 = new DomesticFlights4();
			dfk2.vistara4();
			airline_rk();
			
			break;
		
		case 4:
			System.out.println("====---- SpiceJet Flights ----====");
			DomesticFlights4 dfk3 = new DomesticFlights4();
			dfk3.spicejet4();
			airline_rk();
			
			break;
			
		case 5:
			System.out.println("==-- Main Menu --==");
			airline_rk();
			
		default:airline_rk();
		break;
		
			
		
	}
}
	
	
}


//Domestic flights for MUM-DEL

class DomesticFlights extends DomesticAirline
{
	
	
	public void indigo()
	{
		System.out.println(" ");
		System.out.println("Flightid=6E1777 ");
		System.out.println("Mumbai to Delhi ");
		System.out.println(" Departure time: 0700 hrs");
		System.out.println(" Arrival time  : 0900 hrs");
		
		System.out.println(" ");
		System.out.println("Flightid=6E1908 ");
		System.out.println("Mumbai to Delhi ");
		System.out.println(" Departure time: 1600 hrs");
		System.out.println(" Arrival time  : 1800 hrs");
		System.out.println(" ");
		airline_rk();
		
	}
	
	public void air_india()
	{
		System.out.println(" ");
		System.out.println("Flightid=AI1337 ");
		System.out.println("Mumbai to Delhi ");
		System.out.println(" Departure time: 0800 hrs");
		System.out.println(" Arrival time  : 1000 hrs");
		
		System.out.println(" ");
		System.out.println("Flightid=AI2987 ");
		System.out.println("Mumbai to Delhi ");
		System.out.println(" Departure time: 1400 hrs");
		System.out.println(" Arrival time  : 1600 hrs");
		System.out.println(" ");
		airline_rk();
		
		
		
	}
	
	public void vistara()
	{
		System.out.println(" ");
		System.out.println("Flightid=UK6834 ");
		System.out.println("Mumbai to Delhi ");
		System.out.println(" Departure time: 0900 hrs");
		System.out.println(" Arrival time  : 1100 hrs");
		
		System.out.println(" ");
		System.out.println("Flightid=UK1825 ");
		System.out.println("Mumbai to Delhi ");
		System.out.println(" Departure time: 1700 hrs");
		System.out.println(" Arrival time  : 1900 hrs");
		System.out.println(" ");
		airline_rk();
	}
	
	public void spicejet()
	{
		System.out.println(" ");
		System.out.println("Flightid=SG5341 ");
		System.out.println("Mumbai to Delhi ");
		System.out.println(" Departure time: 1200 hrs");
		System.out.println(" Arrival time  : 1400 hrs");
		
		System.out.println(" ");
		System.out.println("Flightid=SG1825 ");
		System.out.println("Mumbai to Delhi ");
		System.out.println(" Departure time: 2000 hrs");
		System.out.println(" Arrival time  : 2200 hrs");
		System.out.println(" ");
		airline_rk();
	}
}


//Domestic flights for MUM-B'LORE

class DomesticFlights1 extends DomesticAirline
{
	
	public void indigo1()
	{
		System.out.println(" ");
		System.out.println("Flightid=6E1888 ");
		System.out.println("Mumbai to Bangalore ");
		System.out.println(" Departure time: 1100 hrs");
		System.out.println(" Arrival time  : 1300 hrs");
		
		System.out.println(" ");
		System.out.println("Flightid=6E1908 ");
		System.out.println("Mumbai to Bangalore ");
		System.out.println(" Departure time: 2200 hrs");
		System.out.println(" Arrival time  : 0100 hrs");
		System.out.println(" ");
		airline_rk();
	}
	
	public void air_india1()
	{
		System.out.println(" ");
		System.out.println("Flightid=AI14447 ");
		System.out.println("Mumbai to Bangalore ");
		System.out.println(" Departure time: 0900 hrs");
		System.out.println(" Arrival time  : 1100 hrs");
		
		System.out.println(" ");
		System.out.println("Flightid=AI3098 ");
		System.out.println("Mumbai to Bangalore ");
		System.out.println(" Departure time: 1500 hrs");
		System.out.println(" Arrival time  : 1700 hrs");
		System.out.println(" ");
		airline_rk();
		
	}
	
	public void vistara1()
	{
		System.out.println(" ");
		System.out.println("Flightid=UK7945 ");
		System.out.println("Mumbai to Bangalore ");
		System.out.println(" Departure time: 1000 hrs");
		System.out.println(" Arrival time  : 1200 hrs");
		
		System.out.println(" ");
		System.out.println("Flightid=UK2938 ");
		System.out.println("Mumbai to Bangalore ");
		System.out.println(" Departure time: 1800 hrs");
		System.out.println(" Arrival time  : 2000 hrs");
		System.out.println(" ");
		airline_rk();
	}
	
	public void spicejet1()
	{
		System.out.println(" ");
		System.out.println("Flightid=SG6452 ");
		System.out.println("Mumbai to Bangalore ");
		System.out.println(" Departure time: 1300 hrs");
		System.out.println(" Arrival time  : 1500 hrs");
		
		System.out.println(" ");
		System.out.println("Flightid=SG2936 ");
		System.out.println("Mumbai to Bangalore ");
		System.out.println(" Departure time: 2100 hrs");
		System.out.println(" Arrival time  : 2300 hrs");
		System.out.println(" ");
		airline_rk();
	}
	
}


//Domestic flights for Mum-Hyd

class DomesticFlights2 extends DomesticAirline
{
	
	public void indigo2()
	{
		System.out.println(" ");
		System.out.println("Flightid=6E1999 ");
		System.out.println("Mumbai to Hyderabad ");
		System.out.println(" Departure time: 1200 hrs");
		System.out.println(" Arrival time  : 1400 hrs");
		
		System.out.println(" ");
		System.out.println("Flightid=6E1908 ");
		System.out.println("Mumbai to Hyderabad ");
		System.out.println(" Departure time: 2300 hrs");
		System.out.println(" Arrival time  : 0200 hrs");
		System.out.println(" ");
		airline_rk();
	}
	
	public void air_india2()
	{
		System.out.println(" ");
		System.out.println("Flightid=AI2558 ");
		System.out.println("Mumbai to Hyderabad ");
		System.out.println(" Departure time: 0900 hrs");
		System.out.println(" Arrival time  : 1100 hrs");
		
		System.out.println(" ");
		System.out.println("Flightid=AI4109 ");
		System.out.println("Mumbai to Hyderabad ");
		System.out.println(" Departure time: 1500 hrs");
		System.out.println(" Arrival time  : 1700 hrs");
		System.out.println(" ");
		airline_rk();
		
	}
	
	public void vistara2()
	{
		System.out.println(" ");
		System.out.println("Flightid=UK7945 ");
		System.out.println("Mumbai to Hyderabad ");
		System.out.println(" Departure time: 1000 hrs");
		System.out.println(" Arrival time  : 1200 hrs");
		
		System.out.println(" ");
		System.out.println("Flightid=UK2938 ");
		System.out.println("Mumbai to Hyderabad ");
		System.out.println(" Departure time: 1800 hrs");
		System.out.println(" Arrival time  : 2000 hrs");
		System.out.println(" ");
		airline_rk();
	}
	
	public void spicejet2()
	{
		System.out.println(" ");
		System.out.println("Flightid=SG6452 ");
		System.out.println("Mumbai to Hyderabad ");
		System.out.println(" Departure time: 1300 hrs");
		System.out.println(" Arrival time  : 1500 hrs");
		
		System.out.println(" ");
		System.out.println("Flightid=SG2936 ");
		System.out.println("Mumbai to Hyderabad ");
		System.out.println(" Departure time: 2100 hrs");
		System.out.println(" Arrival time  : 2300 hrs");
		System.out.println(" ");
		airline_rk();
	}
	
}



//Domestic flights for Mum-Chn

class DomesticFlights3 extends DomesticAirline
{
	
	public void indigo3()
	{
		System.out.println(" ");
		System.out.println("Flightid=6E2000 ");
		System.out.println("Mumbai to Chennai ");
		System.out.println(" Departure time: 1300 hrs");
		System.out.println(" Arrival time  : 1500 hrs");
		
		System.out.println(" ");
		System.out.println("Flightid=6E2019 ");
		System.out.println("Mumbai to Chennai ");
		System.out.println(" Departure time: 0100 hrs");
		System.out.println(" Arrival time  : 0300 hrs");
		System.out.println(" ");
		airline_rk();
	}
	
	public void air_india3()
	{
		System.out.println(" ");
		System.out.println("Flightid=AI3669 ");
		System.out.println("Mumbai to Chennai ");
		System.out.println(" Departure time: 1000 hrs");
		System.out.println(" Arrival time  : 1200 hrs");
		
		System.out.println(" ");
		System.out.println("Flightid=AI4109 ");
		System.out.println("Mumbai to Chennai ");
		System.out.println(" Departure time: 1600 hrs");
		System.out.println(" Arrival time  : 1800 hrs");
		System.out.println(" ");
		airline_rk();
		
	}
	
	public void vistara3()
	{
		System.out.println(" ");
		System.out.println("Flightid=UK8056 ");
		System.out.println("Mumbai to Chennai ");
		System.out.println(" Departure time: 1100 hrs");
		System.out.println(" Arrival time  : 1300 hrs");
		
		System.out.println(" ");
		System.out.println("Flightid=UK3049 ");
		System.out.println("Mumbai to Chennai ");
		System.out.println(" Departure time: 1900 hrs");
		System.out.println(" Arrival time  : 2100 hrs");
		System.out.println(" ");
		airline_rk();
	}
	
	public void spicejet3()
	{
		System.out.println(" ");
		System.out.println("Flightid=SG67563 ");
		System.out.println("Mumbai to Chennai ");
		System.out.println(" Departure time: 1400 hrs");
		System.out.println(" Arrival time  : 1600 hrs");
		
		System.out.println(" ");
		System.out.println("Flightid=SG3037 ");
		System.out.println("Mumbai to Chennai ");
		System.out.println(" Departure time: 2200 hrs");
		System.out.println(" Arrival time  : 2400 hrs");
		System.out.println(" ");
		airline_rk();
	}
	
	
}

//Domestic flights for  Mum-Kol

class DomesticFlights4 extends DomesticAirline
{
	
	public void indigo4()
	{
		System.out.println(" ");
		System.out.println("Flightid=6E3111 ");
		System.out.println("Mumbai to Kolkata ");
		System.out.println(" Departure time: 1400 hrs");
		System.out.println(" Arrival time  : 1600 hrs");
		
		System.out.println(" ");
		System.out.println("Flightid=6E3120 ");
		System.out.println("Mumbai to Kolkata ");
		System.out.println(" Departure time: 0200 hrs");
		System.out.println(" Arrival time  : 0400 hrs");
		System.out.println(" ");
		airline_rk();
	}
	
	public void air_india4()
	{
		System.out.println(" ");
		System.out.println("Flightid=AI4770 ");
		System.out.println("Mumbai to Kolkata ");
		System.out.println(" Departure time: 1100 hrs");
		System.out.println(" Arrival time  : 1300 hrs");
		
		System.out.println(" ");
		System.out.println("Flightid=AI5210 ");
		System.out.println("Mumbai to Kolkata ");
		System.out.println(" Departure time: 1700 hrs");
		System.out.println(" Arrival time  : 1900 hrs");
		System.out.println(" ");
		airline_rk();
		
	}
	
	public void vistara4()
	{
		System.out.println(" ");
		System.out.println("Flightid=UK9167 ");
		System.out.println("Mumbai to Kolkata ");
		System.out.println(" Departure time: 1200 hrs");
		System.out.println(" Arrival time  : 1400 hrs");
		
		System.out.println(" ");
		System.out.println("Flightid=UK4150 ");
		System.out.println("Mumbai to Kolkata ");
		System.out.println(" Departure time: 2000 hrs");
		System.out.println(" Arrival time  : 2200 hrs");
		System.out.println(" ");
		airline_rk();
	}
	
	public void spicejet4()
	{
		System.out.println(" ");
		System.out.println("Flightid=SG7684 ");
		System.out.println("Mumbai to Kolkata ");
		System.out.println(" Departure time: 1500 hrs");
		System.out.println(" Arrival time  : 1700 hrs");
		
		System.out.println(" ");
		System.out.println("Flightid=SG3037 ");
		System.out.println("Mumbai to Kolkata ");
		System.out.println(" Departure time: 2300 hrs");
		System.out.println(" Arrival time  : 0100 hrs");
		System.out.println(" ");
		airline_rk();
	}
	
	
	
}

//International Flights
class InternationalAirline extends Airline
{
	public void international_airline()
	{
		
		System.out.println("For International Flights form Origin:Mumbai");
		System.out.println("Press 1 Mumbai to Dubai");
		System.out.println("Press 2 Mumbai to New York");
		System.out.println("Press 3 Mumbai to London");
		System.out.println("Press 4 Mumbai to Paris");
		System.out.println("Press 5 Mumbai to Tokyo");
		Scanner sc = new Scanner(System.in);
		int m1 = sc.nextInt();
		switch (m1) {
		case 1:
			System.out.println("Mumbai to Dubai Flights");
			MumbaiDubai mumd = new MumbaiDubai();
			mumd.mumdxb();
			airline_rk();
			
		    
			
			
			break;
			
		case 2:
			System.out.println("Mumbai to New York Flights");
			MumbaiNewyork mumn = new  MumbaiNewyork ();
			mumn.mumny();
			airline_rk();
			
			
			break;
			
		case 3:
			System.out.println("Mumbai to London Flights");
			MumbaiLondon mumlo = new MumbaiLondon ();
			mumlo.mumlon();
			airline_rk();
			
			break;
			
		case 4:
			System.out.println("Mumbai to Paris Flights");
			MumbaiParis mump = new MumbaiParis ();
			mump.mumpar();
			airline_rk();
			
		    break;
		   
		case 5:
			System.out.println("Mumbai to Tokyo Flights");
			MumbaiTokyo mumto = new MumbaiTokyo ();
			mumto.mumtok();
			airline_rk();
			
		    break;
		    
		 default:airline_rk();
		 break;
			
		}
	}
}


//International Flights

class MumbaiDubai extends InternationalAirline
{
	public void mumdxb()
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Press 1 For Emirates Flights");
		System.out.println("Press 2 For Air India Flights");
		System.out.println("Press 3 For Etihad Flights");
		System.out.println("Press 4 For Qatar Flights");
		System.out.println("Press 5 For Lufthansa Flights");
		int m = s1.nextInt();
		switch(m){
		case 1:
			System.out.println("====----- Emirates Flights -----====");
			InternationalFlights ifh = new InternationalFlights();
			ifh.emirates();
			airline_rk();
			
			break;
		
		case 2:
			System.out.println("====----- Air India Flights -----====");
			InternationalFlights ifh1 = new InternationalFlights();
			ifh1.air_India();
			airline_rk();
			
			
			break;
		
		case 3:
			System.out.println("====----- Etihad Flights -----====");
			InternationalFlights ifh2 = new InternationalFlights();
			ifh2.etihad();
			airline_rk();
			
			break;
		
		case 4:
			System.out.println("====----- Qatar Flights -----====");
			InternationalFlights ifh3 = new InternationalFlights();
			ifh3.qatar();
			airline_rk();
			
			break;
			
		case 5:
			System.out.println("====----- Lufthansa Flights -----====");
			InternationalFlights ifh4 = new InternationalFlights();
			ifh4.lufthansa();
			airline_rk();
			
			break;
			
		default:airline_rk();
		break;
		
			
		
	}
}
	
	}
	

//International flights for mum-Dxb

class InternationalFlights extends InternationalAirline
{
	
	public void emirates()
	{
		System.out.println(" ");
		System.out.println("Flightid=EK1055 ");
		System.out.println("Mumbai to Dubai ");
		System.out.println(" Departure time: 0600 hrs");
		System.out.println(" Arrival time  : 1400 hrs");
		
		System.out.println(" ");
		System.out.println("Flightid=EK3120 ");
		System.out.println("Mumbai to Dubai ");
		System.out.println(" Departure time: 0800 hrs");
		System.out.println(" Arrival time  : 1600 hrs");
		System.out.println(" ");
		airline_rk();
	}
	
	public void air_India()
	{
		System.out.println(" ");
		System.out.println("Flightid=AI5880 ");
		System.out.println("Mumbai to Dubai ");
		System.out.println(" Departure time: 1100 hrs");
		System.out.println(" Arrival time  : 1700 hrs");
		
		System.out.println(" ");
		System.out.println("Flightid=AI6321 ");
		System.out.println("Mumbai to Dubai ");
		System.out.println(" Departure time: 1700 hrs");
		System.out.println(" Arrival time  : 2300 hrs");
		System.out.println(" ");
		airline_rk();
		
	}
	
	public void etihad()
	{
		System.out.println(" ");
		System.out.println("Flightid=EY9167 ");
		System.out.println("Mumbai to Dubai ");
		System.out.println(" Departure time: 1200 hrs");
		System.out.println(" Arrival time  : 1800 hrs");
		
		System.out.println(" ");
		System.out.println("Flightid=EY5250 ");
		System.out.println("Mumbai to Dubai ");
		System.out.println(" Departure time: 2000 hrs");
		System.out.println(" Arrival time  : 0200 hrs");
		System.out.println(" ");
		airline_rk();
	}
	
	public void qatar()
	{
		System.out.println(" ");
		System.out.println("Flightid=QR8795 ");
		System.out.println("Mumbai to Dubai ");
		System.out.println(" Departure time: 1600 hrs");
		System.out.println(" Arrival time  : 2200 hrs");
		
		System.out.println(" ");
		System.out.println("Flightid=QR3037 ");
		System.out.println("Mumbai to Dubai ");
		System.out.println(" Departure time: 2300 hrs");
		System.out.println(" Arrival time  : 0500 hrs");
		System.out.println(" ");
		airline_rk();
	}
	
	
	
	public void lufthansa()
	{
		System.out.println(" ");
		System.out.println("Flightid=LH9890 ");
		System.out.println("Mumbai to Dubai ");
		System.out.println(" Departure time: 1700 hrs");
		System.out.println(" Arrival time  : 2300 hrs");
		
		System.out.println(" ");
		System.out.println("Flightid=LH3037 ");
		System.out.println("Mumbai to Dubai ");
		System.out.println(" Departure time: 2400 hrs");
		System.out.println(" Arrival time  : 0600 hrs");
		System.out.println(" ");
		airline_rk();
	}
	
	
	
}

//International flight for mum-new york

class MumbaiNewyork extends InternationalAirline
{
	public void mumny()
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Press 1 For Emirates Flights");
		System.out.println("Press 2 For Air India Flights");
		System.out.println("Press 3 For Etihad Flights");
		System.out.println("Press 4 For Qatar Flights");
		System.out.println("Press 5 For Lufthansa Flights");
		int m = s1.nextInt();
		switch(m){
		case 1:
			System.out.println("====----- Emirates Flights -----====");
			InternationalFlights1 ifh = new InternationalFlights1();
			ifh.emirates1();
			airline_rk();
			
			break;
		
		case 2:
			System.out.println("====----- Air India Flights -----====");
			InternationalFlights1 ifh1 = new InternationalFlights1();
			ifh1.air_India1();
			airline_rk();
			
			
			break;
		
		case 3:
			System.out.println("====----- Etihad Flights -----====");
			InternationalFlights1 ifh2 = new InternationalFlights1();
			ifh2.etihad1();
			airline_rk();
			
			break;
		
		case 4:
			System.out.println("====----- Qatar Flights -----====");
			InternationalFlights1 ifh3 = new InternationalFlights1();
			ifh3.qatar1();
			airline_rk();
			
			break;
			
		case 5:
			System.out.println("====----- Lufthansa Flights -----====");
			InternationalFlights1 ifh4 = new InternationalFlights1();
			ifh4.lufthansa1();
			airline_rk();
			
			break;
			
	   default:airline_rk();
	   break;
		
			
		
	}
}
	
	}
	

//International flights for mum-ny

class InternationalFlights1 extends InternationalAirline
{
	
	public void emirates1()
	{
		System.out.println(" ");
		System.out.println("Flightid=EK1055 ");
		System.out.println("Mumbai to New York ");
		System.out.println(" Departure time: 0700 hrs");
		System.out.println(" Arrival time  : 2200 hrs");
		
		System.out.println(" ");
		System.out.println("Flightid=EK3120 ");
		System.out.println("Mumbai to New York ");
		System.out.println(" Departure time: 0800 hrs");
		System.out.println(" Arrival time  : 2300 hrs");
		System.out.println(" ");
		airline_rk();
	}
	
	public void air_India1()
	{
		System.out.println(" ");
		System.out.println("Flightid=AI8550 ");
		System.out.println("Mumbai to New York ");
		System.out.println(" Departure time: 1200 hrs");
		System.out.println(" Arrival time  : 0300 hrs");
		
		System.out.println(" ");
		System.out.println("Flightid=AI1236 ");
		System.out.println("Mumbai to New York ");
		System.out.println(" Departure time: 1700 hrs");
		System.out.println(" Arrival time  : 0800 hrs");
		System.out.println(" ");
		airline_rk();
		
	}
	
	public void etihad1()
	{
		System.out.println(" ");
		System.out.println("Flightid=EY7619 ");
		System.out.println("Mumbai to New York ");
		System.out.println(" Departure time: 1200 hrs");
		System.out.println(" Arrival time  : 0300 hrs");
		
		System.out.println(" ");
		System.out.println("Flightid=EY2550 ");
		System.out.println("Mumbai to New York");
		System.out.println(" Departure time: 2100 hrs");
		System.out.println(" Arrival time  : 1200 hrs");
		System.out.println(" ");
		airline_rk();
		
	}
	
	public void qatar1()
	{
		System.out.println(" ");
		System.out.println("Flightid=QR5987 ");
		System.out.println("Mumbai to New York ");
		System.out.println(" Departure time: 1700 hrs");
		System.out.println(" Arrival time  : 0800 hrs");
		
		System.out.println(" ");
		System.out.println("Flightid=QR3037 ");
		System.out.println("Mumbai to New York ");
		System.out.println(" Departure time: 2400 hrs");
		System.out.println(" Arrival time  : 0300 hrs");
		System.out.println(" ");
		airline_rk();
	}
	
	
	
	public void lufthansa1()
	{
		System.out.println(" ");
		System.out.println("Flightid=LH8990 ");
		System.out.println("Mumbai to New York ");
		System.out.println(" Departure time: 1700 hrs");
		System.out.println(" Arrival time  : 0800 hrs");
		
		System.out.println(" ");
		System.out.println("Flightid=LH7037 ");
		System.out.println("Mumbai to New York ");
		System.out.println(" Departure time: 2400 hrs");
		System.out.println(" Arrival time  : 0600 hrs");
		System.out.println(" ");
		airline_rk();
	}
	
	
	
}

//International flight for mum=-lon

class MumbaiLondon extends InternationalAirline
{
	public void mumlon()
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Press 1 For Emirates Flights");
		System.out.println("Press 2 For Air India Flights");
		System.out.println("Press 3 For Etihad Flights");
		System.out.println("Press 4 For Qatar Flights");
		System.out.println("Press 5 For Lufthansa Flights");
		int m = s1.nextInt();
		switch(m){
		case 1:
			System.out.println("====----- Emirates Flights -----====");
			InternationalFlights1 ifh = new InternationalFlights1();
			ifh.emirates1();
			airline_rk();
			
			break;
		
		case 2:
			System.out.println("====----- Air India Flights -----====");
			InternationalFlights1 ifh1 = new InternationalFlights1();
			ifh1.air_India1();
			airline_rk();
			
			
			break;
		
		case 3:
			System.out.println("====----- Etihad Flights -----====");
			InternationalFlights1 ifh2 = new InternationalFlights1();
			ifh2.etihad1();
			airline_rk();
			
			break;
		
		case 4:
			System.out.println("====----- Qatar Flights -----====");
			InternationalFlights1 ifh3 = new InternationalFlights1();
			ifh3.qatar1();
			airline_rk();
			
			break;
			
		case 5:
			System.out.println("====----- Lufthansa Flights -----====");
			InternationalFlights1 ifh4 = new InternationalFlights1();
			ifh4.lufthansa1();
			airline_rk();
			
			break;
		
	   default:airline_rk();
	   break;
		
	}
}
	
	}
	

//International flights for mum-lon

class InternationalFlights2 extends InternationalAirline
{
	
	public void emirates2()
	{
		System.out.println(" ");
		System.out.println("Flightid=EK2066 ");
		System.out.println("Mumbai to London  ");
		System.out.println(" Departure time: 0800 hrs");
		System.out.println(" Arrival time  : 2100 hrs");
		
		System.out.println(" ");
		System.out.println("Flightid=EK1320 ");
		System.out.println("Mumbai to London ");
		System.out.println(" Departure time: 1200 hrs");
		System.out.println(" Arrival time  : 0200 hrs");
		System.out.println(" ");
		airline_rk();
		
	}
	
	public void air_India2()
	{
		System.out.println(" ");
		System.out.println("Flightid=AI5650 ");
		System.out.println("Mumbai to London  ");
		System.out.println(" Departure time: 1300 hrs");
		System.out.println(" Arrival time  : 0300 hrs");
		
		System.out.println(" ");
		System.out.println("Flightid=AI2457 ");
		System.out.println("Mumbai to London  ");
		System.out.println(" Departure time: 1800 hrs");
		System.out.println(" Arrival time  : 0700 hrs");
		System.out.println(" ");
		airline_rk();
		
		
	}
	
	public void etihad2()
	{
		System.out.println(" ");
		System.out.println("Flightid=EY8790 ");
		System.out.println("Mumbai to London  ");
		System.out.println(" Departure time: 1300 hrs");
		System.out.println(" Arrival time  : 0200 hrs");
		
		System.out.println(" ");
		System.out.println("Flightid=EY5150 ");
		System.out.println("Mumbai to London ");
		System.out.println(" Departure time: 2100 hrs");
		System.out.println(" Arrival time  : 1000 hrs");
		System.out.println(" ");
		airline_rk();
		
	}
	
	public void qatar2()
	{
		System.out.println(" ");
		System.out.println("Flightid=QR6985 ");
		System.out.println("Mumbai to London  ");
		System.out.println(" Departure time: 1500 hrs");
		System.out.println(" Arrival time  : 0400 hrs");
		
		System.out.println(" ");
		System.out.println("Flightid=QR1067 ");
		System.out.println("Mumbai to London ");
		System.out.println(" Departure time: 2400 hrs");
		System.out.println(" Arrival time  : 1300 hrs");
		System.out.println(" ");
		airline_rk();
		
	}
	
	
	
	public void lufthansa2()
	{
		System.out.println(" ");
		System.out.println("Flightid=LH9890 ");
		System.out.println("Mumbai to London ");
		System.out.println(" Departure time: 1800 hrs");
		System.out.println(" Arrival time  : 0700 hrs");
		
		System.out.println(" ");
		System.out.println("Flightid=LH1797 ");
		System.out.println("Mumbai to London  ");
		System.out.println(" Departure time: 0100 hrs");
		System.out.println(" Arrival time  : 1400 hrs");
		System.out.println(" ");
		airline_rk();
		
	}
	
	
	
}

//international flights for mum-par

class MumbaiParis extends InternationalAirline
{
	public void mumpar()
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Press 1 For Emirates Flights");
		System.out.println("Press 2 For Air India Flights");
		System.out.println("Press 3 For Etihad Flights");
		System.out.println("Press 4 For Qatar Flights");
		System.out.println("Press 5 For Lufthansa Flights");
		int m = s1.nextInt();
		switch(m){
		case 1:
			System.out.println(" Emirates Flights");
			InternationalFlights3 ifh = new InternationalFlights3();
			ifh.emirates3();
			airline_rk();
			
			break;
		
		case 2:
			System.out.println(" Air India Flights");
			InternationalFlights3 ifh1 = new InternationalFlights3();
			ifh1.air_India3();
			airline_rk();
			
			break;
		
		case 3:
			System.out.println(" Etihad Flights");
			InternationalFlights3 ifh2 = new InternationalFlights3();
			ifh2.etihad3();
			airline_rk();
			
			break;
		
		case 4:
			System.out.println(" Qatar Flights");
			InternationalFlights3 ifh3 = new InternationalFlights3();
			ifh3.qatar3();
			airline_rk();
			
			break;
			
		case 5:
			System.out.println(" Lufthansa Flights");
			InternationalFlights3 ifh4 = new InternationalFlights3();
			ifh4.lufthansa3();
			airline_rk();
			
			break;
		
		default:airline_rk();
		break;
		
	}
}
	
	}
	

//International flights for mum-par

class InternationalFlights3 extends InternationalAirline
{
	
	public void emirates3()
	{
		System.out.println(" ");
		System.out.println("Flightid=EK4086 ");
		System.out.println("Mumbai to Paris  ");
		System.out.println(" Departure time: 0900 hrs");
		System.out.println(" Arrival time  : 0200 hrs");
		
		System.out.println(" ");
		System.out.println("Flightid=EK2075 ");
		System.out.println("Mumbai to Paris ");
		System.out.println(" Departure time: 1200 hrs");
		System.out.println(" Arrival time  : 0500 hrs");
		System.out.println(" ");
		airline_rk();
		
	}
	
	public void air_India3()
	{
		System.out.println(" ");
		System.out.println("Flightid=AI6150 ");
		System.out.println("Mumbai to Paris  ");
		System.out.println(" Departure time: 1500 hrs");
		System.out.println(" Arrival time  : 0800 hrs");
		
		System.out.println(" ");
		System.out.println("Flightid=AI4357 ");
		System.out.println("Mumbai to Paris ");
		System.out.println(" Departure time: 1900 hrs");
		System.out.println(" Arrival time  : 1200 hrs");
		System.out.println(" ");
		airline_rk();
		
		
	}
	
	public void etihad3()
	{
		System.out.println(" ");
		System.out.println("Flightid=EY7890 ");
		System.out.println("Mumbai to Paris  ");
		System.out.println(" Departure time: 1400 hrs");
		System.out.println(" Arrival time  : 0700 hrs");
		
		System.out.println(" ");
		System.out.println("Flightid=EY2050 ");
		System.out.println("Mumbai to Paris ");
		System.out.println(" Departure time: 2300 hrs");
		System.out.println(" Arrival time  : 1400 hrs");
		System.out.println(" ");
		airline_rk();
		
	}
	
	public void qatar3()
	{
		System.out.println(" ");
		System.out.println("Flightid=QR7085 ");
		System.out.println("Mumbai to Paris  ");
		System.out.println(" Departure time: 1600 hrs");
		System.out.println(" Arrival time  : 0900 hrs");
		
		System.out.println(" ");
		System.out.println("Flightid=QR2067 ");
		System.out.println("Mumbai to Paris ");
		System.out.println(" Departure time: 0100 hrs");
		System.out.println(" Arrival time  : 1600 hrs");
		System.out.println(" ");
		airline_rk();
		
	}
	
	
	
	public void lufthansa3()
	{
		System.out.println(" ");
		System.out.println("Flightid=LH9770 ");
		System.out.println("Mumbai to Paris ");
		System.out.println(" Departure time: 0700 hrs");
		System.out.println(" Arrival time  : 2400 hrs");
		
		System.out.println(" ");
		System.out.println("Flightid=LH3407 ");
		System.out.println("Mumbai to Paris  ");
		System.out.println(" Departure time: 0100 hrs");
		System.out.println(" Arrival time  : 1700 hrs");
		System.out.println(" ");
		airline_rk();
		
	}
	
	
	
}

//international flights for mum-tok

class MumbaiTokyo extends InternationalAirline
{
	public void mumtok()
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Press 1 For Emirates Flights");
		System.out.println("Press 2 For Air India Flights");
		System.out.println("Press 3 For Etihad Flights");
		System.out.println("Press 4 For Qatar Flights");
		System.out.println("Press 5 For Lufthansa Flights");
		int m = s1.nextInt();
		switch(m){
		case 1:
			System.out.println("====----- Emirates Flights -----====");
			InternationalFlights4 ifh = new InternationalFlights4();
			ifh.emirates4();
			airline_rk();
			
			break;
		
		case 2:
			System.out.println("====----- Air India Flights -----====");
			InternationalFlights4 ifh1 = new InternationalFlights4();
			ifh1.air_India4();
			airline_rk();
			
			
			break;
		
		case 3:
			System.out.println("====----- Etihad Flights -----====");
			InternationalFlights4 ifh2 = new InternationalFlights4();
			ifh2.etihad4();
			airline_rk();
			
			break;
		
		case 4:
			System.out.println("====----- Qatar Flights -----====");
			InternationalFlights4 ifh3 = new InternationalFlights4();
			ifh3.qatar4();
			airline_rk();
			
			break;
			
		case 5:
			System.out.println("====----- Lufthansa Flights -----====");
			InternationalFlights4 ifh4 = new InternationalFlights4();
			ifh4.lufthansa4();
			airline_rk();
			
			break;
			
		default:airline_rk();
		break;
		
			
		
	}
}
	
	}
	

//International flights for mum-par

class InternationalFlights4 extends InternationalAirline
{
	
	public void emirates4()
	{
		System.out.println(" ");
		System.out.println("Flightid=EK4526 ");
		System.out.println("Mumbai to Tokyo  ");
		System.out.println(" Departure time: 1000 hrs");
		System.out.println(" Arrival time  : 2000 hrs");
		
		System.out.println(" ");
		System.out.println("Flightid=EK3565 ");
		System.out.println("Mumbai to Tokyo ");
		System.out.println(" Departure time: 1300 hrs");
		System.out.println(" Arrival time  : 2300 hrs");
		System.out.println(" ");
		airline_rk();
		
	}
	
	public void air_India4()
	{
		System.out.println(" ");
		System.out.println("Flightid=AI7250 ");
		System.out.println("Mumbai to Tokyo  ");
		System.out.println(" Departure time: 1600 hrs");
		System.out.println(" Arrival time  : 0200 hrs");
		
		System.out.println(" ");
		System.out.println("Flightid=AI6957 ");
		System.out.println("Mumbai to Tokyo ");
		System.out.println(" Departure time: 2000 hrs");
		System.out.println(" Arrival time  : 0600 hrs");
		System.out.println(" ");
		airline_rk();
		
		
	}
	
	public void etihad4()
	{
		System.out.println(" ");
		System.out.println("Flightid=EY9690 ");
		System.out.println("Mumbai to Tokyo  ");
		System.out.println(" Departure time: 1500 hrs");
		System.out.println(" Arrival time  : 0100 hrs");
		
		System.out.println(" ");
		System.out.println("Flightid=EY3850 ");
		System.out.println("Mumbai to Tokyo ");
		System.out.println(" Departure time: 2400 hrs");
		System.out.println(" Arrival time  : 1000 hrs");
		System.out.println(" ");
		airline_rk();
		
	}
	
	public void qatar4()
	{
		System.out.println(" ");
		System.out.println("Flightid=QR6185 ");
		System.out.println("Mumbai to Tokyo  ");
		System.out.println(" Departure time: 1700 hrs");
		System.out.println(" Arrival time  : 1500 hrs");
		
		System.out.println(" ");
		System.out.println("Flightid=QR4187 ");
		System.out.println("Mumbai to Tokyo ");
		System.out.println(" Departure time: 0200 hrs");
		System.out.println(" Arrival time  : 1200 hrs");
		System.out.println(" ");
		airline_rk();
		
	}
	
	
	
	public void lufthansa4()
	{
		System.out.println(" ");
		System.out.println("Flightid=LH6540 ");
		System.out.println("Mumbai to Tokyo ");
		System.out.println(" Departure time: 0800 hrs");
		System.out.println(" Arrival time  : 1800 hrs");
		
		System.out.println(" ");
		System.out.println("Flightid=LH4207 ");
		System.out.println("Mumbai to Tokyo  ");
		System.out.println(" Departure time: 0200 hrs");
		System.out.println(" Arrival time  : 2200 hrs");
		System.out.println(" ");
		airline_rk();
	}
	
	
	
}

//seats for Domestic flights

class Seats1 extends DomesticAirline
{
	
	public void domestic_seats()
	{
		
		System.out.println(" ");
		System.out.println("press 1 to book 1 seat");
		System.out.println("press 2 to book 2 seats");
		System.out.println("press 3 to book 3 seats");
		System.out.println("press 4 to book 4 seats");

	Scanner sc = new Scanner(System.in);
	int sgo = sc.nextInt();
	switch (sgo){
	case 1:
		System.out.println(" ");
		System.out.println("   Booking for 1 seat      ");
		System.out.println("   Fare for 1 seat :5000   ");
		System.out.println("   Thank you               ");
		break;
		
	case 2:
		System.out.println(" ");
		System.out.println("   Booking for 2 seats     ");
		System.out.println("   Fare for 2 seat :9000   ");
		System.out.println("   Thank you               ");
		System.out.println(" ");
		break;	
	
	case 3:
		System.out.println(" ");
		System.out.println("   Booking for 3 seats     ");
		System.out.println("   Fare for 3 seat :14000  ");
		System.out.println("   Thank you               ");
		System.out.println(" ");
		break;	
	
	case 4:
		System.out.println(" ");
		System.out.println("   Booking for 4 seats     ");
		System.out.println("   Fare for 4 seat :18000  ");
		System.out.println("   Thank you               ");
		System.out.println(" ");
		break;	
		
		
	default:System.out.println("       !!!!!!! Invalid input,Please Seats number in range from 1 to 4 for Booking  !!!!!!!      ");	
	    domestic_seats();
	    break;
	}
}
}


//Seatsbooking for International flights

class Seats2 extends InternationalAirline
{
	
	public void international_seats()
	{
		
		System.out.println(" ");
		System.out.println("press 1 to book 1 seat");
		System.out.println("press 2 to book 2 seats");
		System.out.println("press 3 to book 3 seats");
		System.out.println("press 4 to book 4 seats");

	Scanner sc = new Scanner(System.in);
	int sgo = sc.nextInt();
	switch (sgo){
	case 1:
		System.out.println(" ");
		System.out.println("   Booking for 1 seat      ");
		System.out.println("   Fare for 1 seat :15000   ");
		System.out.println("   Thank you               ");
		break;
		
	case 2:
		System.out.println(" ");
		System.out.println("   Booking for 2 seats     ");
		System.out.println("   Fare for 2 seat :29000   ");
		System.out.println("   Thank you               ");
		System.out.println(" ");
		break;	
	
	case 3:
		System.out.println(" ");
		System.out.println("   Booking for 3 seats     ");
		System.out.println("   Fare for 3 seat :44000  ");
		System.out.println("   Thank you               ");
		System.out.println(" ");
		break;	
	
	case 4:
		System.out.println(" ");
		System.out.println("   Booking for 4 seats     ");
		System.out.println("   Fare for 4 seat :105000  ");
		System.out.println("   Thank you               ");
		System.out.println(" ");
		break;	
		

		
	default:System.out.println("       !!!!!!! Invalid input,Please Seats number in range from 1 to 4 for Booking  !!!!!!!      ");	
	    international_seats();
	    break;
	}
}
}

//Airports

interface Mumbai_airport
{
	void mumbai_airport();
}


interface Delhi_airport
{
	void airport();
}

interface Bangalore_airport
{
	void airport();
}

interface Hyderabad_airport
{
	void airport();
}

interface Kolkata_airport
{
	void airport();
}

interface Chennai_airport
{
	void airport();
}

//international airports

interface Dubai_airport
{
	void airport();
}

interface NewYork_airport
{
	void airport();
}

interface London_airport
{
	void airport();
}

interface Paris_airport
{
	void airport();
}

interface Tokyo_airport
{
	void airport();
}

class Allairports extends Airline
{
	public void airport()
	{
		Allairports ref = new Allairports();
	System.out.println("[--------------------------All Airports-----------------------------------------");
	System.out.println();
	System.out.println(
			"--------------------------DOMESTIC AIRPORTS------------------------------------------------");
			System.out.println(" ");
			System.out.println("MUMBAI :     [   Chhatrapati Shivaji Maharaj International Airport ]    ");
			System.out.println("DELHI  :     [   Indira Gandhi International Airport               ]    ");
			System.out.println("BANGALORE  : [   KempeGowda International Airport                  ]    ");
			System.out.println("HYDERABAD  : [   Rajiv Gandhi International Airport                ]    ");
			System.out.println("KOLKATA :    [   Netaji Subhash ChandraBose International Airport  ]    ");
			System.out.println("CHENNAI :    [   Chennai International Airport                     ]    ");
			System.out.println(" ");
			
			System.out.println(
			"--------------------------INTERNATIONAL AIRPORTS------------------------------------------ ");
			System.out.println(" ");
			System.out.println("DUBAI  :     [    Dubai  International Airport                     ]    ");
			System.out.println("NEWYORK  :   [    John .F .Kennedy International Airport           ]    ");
			System.out.println("LONDON :     [    London Heathrow International Airport            ]    ");
			System.out.println("PARIS  :     [    Charles de Gaulle International Airport          ]    ");
			System.out.println("TOKYO  :     [    Haneda International Airport                     ]    ");
			System.out.println(" ");
			
}
}

//abstraction
 abstract class Airports extends Allairports implements Mumbai_airport,Delhi_airport,Bangalore_airport,Hyderabad_airport,Kolkata_airport,Chennai_airport,Dubai_airport,NewYork_airport,London_airport,Paris_airport,Tokyo_airport
{
	public void airport() 
	{
		System.out.println(" ");
		System.out.println(
		"--------------------------DOMESTIC AIRPORTS------------------------------------------------");
		System.out.println(" ");
		System.out.println("MUMBAI :     [   Chhatrapati Shivaji Maharaj International Airport ]    ");
		System.out.println("DELHI  :     [    Indira Gandhi International Airport              ]    ");
		System.out.println("BANGALORE  : [    KempeGowda International Airport                 ]    ");
		System.out.println("HYDERABAD  : [    Rajiv Gandhi International Airport               ]    ");
		System.out.println("KOLKATA :    [    Netaji Subhash ChandraBose International Airport ]    ");
		System.out.println("CHENNAI :    [    Chennai International Airport                    ]    ");
		System.out.println(" ");
		
		System.out.println(
		"--------------------------INTERNATIONAL AIRPORTS------------------------------------------ ");
		System.out.println(" ");
		System.out.println("DUBAI  :     [    Dubai  International Airport                     ]    ");
		System.out.println("NEWYORK  :   [    John .F .Kennedy International Airport           ]    ");
		System.out.println("LONDON :     [    London Heathrow International Airport            ]    ");
		System.out.println("PARIS  :     [    Charles de Gaulle International Airport          ]    ");
		System.out.println("TOKYO  :     [    Haneda International Airport                     ]    ");
		System.out.println(" ");
		
	}
}


// ==============================End of Program================================================================










