public static void displayContacts() {
    System.out.println("\nContacts:");
    for (int i = 0; i < contacts.size(); i++) {
        System.out.println((i + 1) + ". " + contacts.get(i));
    }
}
