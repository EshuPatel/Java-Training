package oopsDemo4;

/**
 * Author : Eshu.Patel
 * Date : Sep 6, 2025
 * Time :10:16:05 AM
 * Project :CoreJava
*/

public class AirlinePassenger implements Passenger{
	
	private String name;
    private String passportNumber;
    private String email;
    private String phone;
    
	public AirlinePassenger(String name, String passportNumber, String email, String phone) {
		this.name = name;
		this.passportNumber = passportNumber;
		this.email = email;
		this.phone = phone;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String getPassportNumber() {
		// TODO Auto-generated method stub
		return passportNumber;
	}

	@Override
	public String getContactInfo() {
		// TODO Auto-generated method stub
		return "Email:"+ email+ "   Phone:"+ phone;
	}    
}
