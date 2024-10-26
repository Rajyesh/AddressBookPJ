public static void main(String[] args) {
    while (true) {
        System.out.println("1. Add Contact");
        System.out.println("2. Display Contacts");
        System.out.println("3. Update Contact");
        System.out.println("4. Delete Contact");
        System.out.println("5. Exit");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> addContact();
            case 2 -> displayContacts();
            case 3 -> updateContact();
            case 4 -> deleteContact();
            case 5 -> System.exit(0);
            default -> System.out.println("Invalid option. Try again.");
        }
    }
}
