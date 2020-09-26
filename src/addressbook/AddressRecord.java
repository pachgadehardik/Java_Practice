//Address Book USECASE 6
package addressbook;

import java.util.HashMap;
import java.util.Scanner;


public class AddressRecord {
	
	public static HashMap<String, ContactDetails> getAddressRecordMap() {
		return addressRecordMap;
	}

	public static void setAddressRecordMap(HashMap<String, ContactDetails> newAddressRecord) {
		AddressRecord.addressRecordMap = newAddressRecord;
	}

	private static HashMap<String,ContactDetails> addressRecordMap;
	
	public AddressRecord()
	{
		addressRecordMap = new HashMap<String, ContactDetails>();
		
	}
	
	public  AddressRecord addContact() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		ContactDetails contact = new ContactDetails();

		// Take user-input
		System.out.println("Enter the firstName:");
		contact.setFirstName(sc.next());
		System.out.println("Enter the lastName:");
		contact.setLastName(sc.next());
		System.out.println("Enter the Address:");
		contact.setAddress(sc.next());
		System.out.println("Enter the city:");
		contact.setCity(sc.next());
		System.out.println("Enter the state:");
		contact.setState(sc.next());
		System.out.println("Enter the zipcode:");
		contact.setZip(sc.next().trim());
		System.out.println("Phone Number");
		contact.setPhone_no(sc.next());
		System.out.println("Enter EmailID: ");
		contact.setEmail(sc.next());
		
		// Add to addressBook
		addressRecordMap.put(contact.getFirstName(),contact);
		
		
		//Returning the Instance
		return this;
	}



	
	
}
