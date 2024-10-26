class AddressBook {

    static ArrayList<Contact> contacts = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void addContact() {
        System.out.print("Enter first name: ");
        String firstName = scanner.next();
        System.out.print("Enter last name: ");
        String lastName = scanner.next();
        String name = firstName + " " + lastName;
        System.out.print("Enter ID: ");
        String id = scanner.next();
        System.out.print("Enter mobile number: ");
        String mobileNumber = scanner.next();
        System.out.print("Enter address: ");
        String address = scanner.next();
        System.out.print("Enter pincode: ");
        String pincode = scanner.next();

        contacts.add(new Contact(id, name, mobileNumber, address, pincode));
    }
}