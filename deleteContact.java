public static void deleteContact() {
    System.out.print("Enter contact number to delete: ");
    int index = scanner.nextInt();

    if (index > 0 && index <= contacts.size()) {
        contacts.remove(index - 1);
        System.out.println("Contact deleted successfully.");
    } else {
        System.out.println("Invalid contact number.");
    }
}
