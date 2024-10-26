class Contact {
    private String id;
    private String name;
    private String mobileNumber;
    private String address;
    private String pincode;

    public Contact(String id, String name, String mobileNumber, String address, String pincode) {
        this.id = id;
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.address = address;
        this.pincode = pincode;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getMobileNumber() { return mobileNumber; }
    public void setMobileNumber(String mobileNumber) { this.mobileNumber = mobileNumber; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getPincode() { return pincode; }
    public void setPincode(String pincode) { this.pincode = pincode; }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Phone: " + mobileNumber + ", Address: " + address + ", Pincode: " + pincode;
    }
}
