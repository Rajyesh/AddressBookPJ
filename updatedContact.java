public static void updateContact() {
    System.out.print("Enter contact number to update: ");
    int index = scanner.nextInt();

    if (index > 0 && index <= contacts.size()) {
        Contact contact = contacts.get(index - 1);
        System.out.print("Enter new name: ");
        String name = scanner.next();
        contact.setName(name);
        System.out.print("Enter new ID: ");
        String id = scanner.next();
        contact.setId(id);
        System.out.print("Enter new mobile number: ");
        String mobileNumber = scanner.next();
        contact.setMobileNumber(mobileNumber);
        System.out.print("Enter new address: ");
        String address = scanner.next();
        contact.setAddress(address);
        System.out.print("Enter new pincode: ");
        String pincode = scanner.next();
        contact.setPincode(pincode);
    } else {
        System.out.println("Invalid contact number.");
    }
}