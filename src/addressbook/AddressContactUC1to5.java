package addressbook;

import java.util.*;

//Consolidated AddressMain Class wherein USSCASE 1 to 5 are included
public class AddressContactUC1to5 {
	
	//For storing the Contact data
	static Map<String, Object> contacts;
	static int contact_id = 1;

	static Scanner sc = new Scanner(System.in);

	public static ContactDetails addContact() {
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

		contact.setId(contact_id++);
		// Add to addressBook
		return contact;
	}

	public static void editContact() {

		String input = "";
		System.out.println("Enter the firstName:");
		input += sc.next().toLowerCase().trim();
		System.out.println("Enter the lastName:");
		input += sc.next().toLowerCase().trim();
		// Check if the key exists if so take the whole input from user all-over
		if (contacts.containsKey(input)) {
			ContactDetails newContact = addContact();
			String comparingString = newContact.getFirstName().toLowerCase() + newContact.getLastName().toLowerCase();

			if (contacts.containsKey(comparingString)) {
				contacts.put(comparingString, newContact);
			} else {
				contacts.remove(input);
				contacts.put(comparingString, newContact);
			}
			System.out.println("SuccessFully Added");
		} else
			System.out.println("No contact found!!");
		System.out.println();
	}

	public static void deleteContact() {
//		String input = "";
		System.out.println("Enter the firstName:");
		String input = sc.next().toLowerCase();
		System.out.println("Enter the lastName:");
		input += sc.next().toLowerCase();
		// id key input exists then remove it from the Map
		if (contacts.containsKey(input)) {
			contacts.remove(input);
			System.out.println("SuccessFully Deleted");
		} else
			System.out.println("No contact found!!");
		System.out.println();
	}

	public static void bulkAddContacts() {
		System.out.println("Enter number of Contacts to insert");
		int count = sc.nextInt();
		if (count > 0) {
			for (int i = 0; i < count; i++) {
				System.out.println("Enter the contact details for person no. : " + (i + 1));
				ContactDetails contact = addContact();
				contacts.put(contact.getFirstName().toLowerCase() + contact.getLastName().toLowerCase(), contact);
			}
			System.out.println("Successfully Added " + count + " Contacts");
		}
	}

	public static void main(String[] args) {
		
		System.out.println("WELCOME TO ADDRESSBOOK SYSTEM!!!");
		contacts = new HashMap<>();
		// Adding contacts to address-book each with a unique id

		Scanner sc = new Scanner(System.in);
		int inpOption = -1;

		while (inpOption != 0) {
			
			
			System.out.println("1-ADD");
			System.out.println("2-EDIT");
			System.out.println("3-DELETE");
			System.out.println("4-Bulk ADD!");
			System.out.println("0-Exit!!");

			inpOption = sc.nextInt();
			switch (inpOption) {
			case 1:
				// Adding Details
				ContactDetails contact = addContact();
				contacts.put(contact.getFirstName().toLowerCase() + contact.getLastName().toLowerCase(), contact);
				System.out.println("SuccessFully Added");
				break;
			case 2:
				// Edit
				editContact();
				break;
			case 3:
				// Delete a contact
				deleteContact();
				break;
			case 4:
				// Bulk Contacts
				bulkAddContacts();
				break;
			case 5:
				//See the AddressBooks
				
			default:
				break;
			}
			
			System.out.println(contacts.toString());
		
		}
//		System.out.println(contacts.toString());
		// Print the addressBook
	}
	
}
