//Address Book USECASE 6
package addressbook;

import java.util.HashMap;

public class AddressBook {
	
	private static HashMap<String,AddressRecord> addressBook;
	private static String addressBookName;
	
	public static HashMap<String, AddressRecord> getAddressBook() {
		return addressBook;
	}

	public static void setAddressBook(HashMap<String, AddressRecord> addressBook) {
		AddressBook.addressBook = addressBook;
	}

	public static String getAddressBookName() {
		return addressBookName;
	}

	public static void setAddressBookName(String addressBookName) {
		AddressBook.addressBookName = addressBookName;
	}

	public AddressBook(String addressBookName) {
		addressBook = new HashMap<String, AddressRecord>();	
		AddressBook.addressBookName = addressBookName;
	}

	public void add(String name, AddressRecord addressRecord) {
		//INserting in the Map
		
		addressBook.put(name,addressRecord);
		this.addressBookName = name;
		
	}
	
	public static void display() {
		
		System.out.println(" size" +addressBook.size());
		
		for(String bookName : addressBook.keySet()) {
			System.out.println("Address Book is :"+bookName);
			AddressRecord recordVariable = addressBook.get(bookName);
//			System.out.println(recordVariable);
			for(String recordName : recordVariable.getAddressRecordMap().keySet()) {
				System.out.println(recordName + " "+ recordVariable.getAddressRecordMap().get(recordName));
			}
		}
	}
	

		//Updating the AddressBook
		public static void addToExistingBook(String addBookName) {
			if(addressBook.containsKey(addBookName)) {
				System.out.println("Book Exists");
				AddressRecord recordsToUpdate = addressBook.get(addBookName);
//				
				//AddressBook Exists, Now Insert New Data in Existing AddressBook
			
				AddressRecord updatedAddressRecordV = recordsToUpdate.addContact();

				addressBook.put(addBookName, updatedAddressRecordV);
				System.out.println(addressBook.size());
			}
			else {
				System.out.println("AddressBook does Not Exists!");
			}
		}
}
