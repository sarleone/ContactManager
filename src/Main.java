public class Main {
    public static void  main(String [] args) {
        // Create the ContactsManager object
        ContactsManager myContactsManager = new ContactsManager();
        // Create a new Contact object for Olivia
        Contact Olivia = new Contact();
        // Set the fields
        Olivia.name = "Olivia";
        Olivia.phoneNumber = "1234567234";
        // Add James Contact to the ContactsManager
        myContactsManager.addContact(Olivia);
        // Create a new Contact object for Carri
        Contact Carri = new Contact();
        // Set the fields
        Carri.name = "Carri";
        Carri.phoneNumber = "1234561234";
        // Add Carri Contact to the ContactsManager
        myContactsManager.addContact(Carri);
        // Create new Contact object for Nisha
        Contact Nisha = new Contact();
        // Set the fields
        Nisha.name  = "Nisha";
        Nisha.phoneNumber = "1234562345";
        // Add Nisha Contact to the ContactsManager
        myContactsManager.addContact(Nisha);

        // Try searching for a contact
        Contact result = myContactsManager.searchContact("Nisha");
        System.out.println(result.phoneNumber);
        // Find out how many contacts have been added
        int count = myContactsManager.friendsCount;
        System.out.println(count);
    }

}
