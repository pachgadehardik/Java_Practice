//Address Book USECASE 6
package addressbook;

import java.util.HashMap;
import java.util.Scanner;

//Driver Class for 
public class DriverUseCase6 {

	/*
	 * @author Hardik
	 */

	public static void main(String args[]) {

		HashMap<String, AddressBook> bookRepo = new HashMap<>();
		System.out.println("Welcome to AddressBook System");

		Scanner sc = new Scanner(System.in);
		int inpOption = -1;

		while (inpOption != 0) {

			System.out.println("1-ADD AddressBook");
			System.out.println("2-Add data in AddressBook");
			System.out.println("3-Show AddressBooks");

			System.out.println("0-Exit!!");

			inpOption = sc.nextInt();
			switch (inpOption) {
			case 1:
				// Creating and Adding AddressBook
				System.out.println("Enter the Name of addressBook");
				String addressBookName = sc.next();
				AddressBook addressBook = new AddressBook(addressBookName);
				AddressRecord addressRecord = new AddressRecord();
				AddressRecord updatedAddressRecordV = addressRecord.addContact();
				addressBook.add(addressBookName, updatedAddressRecordV);
				bookRepo.put(addressBookName, addressBook);

//				System.out.println(addressBook);
				AddressBook.display();
				break;

			case 2:
				// Adding Details in any specific addressRecords Book
				System.out.println("Enter the Address Book Name: ");
				String addBookName = sc.next();
				AddressBook.addToExistingBook(addBookName);
				AddressBook.display();
				System.out.println(bookRepo);
				break;
//		
			case 3:
				// See the AddressBooks
				for(String repoName : bookRepo.keySet()) {
					System.out.println(repoName);
				}
			default:
				break;
			}

//			
//			System.out.println(contact.toString());
//		
		}
	}
}
