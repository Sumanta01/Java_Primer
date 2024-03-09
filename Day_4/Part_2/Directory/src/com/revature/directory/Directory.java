package com.revature.directory;

public class Directory {
    private String name;
    private String address;
    String telephoneNumber;
    private String mobNumber;
    String headOfFamily;
    private String uniqueId;

    public Directory(String name, String address, String telephoneNumber, String mobNumber, String headOfFamily, String uniqueId) {
        this.name = name;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
        this.mobNumber = mobNumber;
        this.headOfFamily = headOfFamily;
        this.uniqueId = uniqueId;
    }

    public  String getUniqueId(){
        return uniqueId;
    }

    public boolean matchKeyWord(String keyword){
        return name.toLowerCase().contains(keyword.toLowerCase()) ||
                address.toLowerCase().contains(keyword.toLowerCase())||
                (telephoneNumber !=null && telephoneNumber.toLowerCase().contains(keyword.toLowerCase()))||
                (mobNumber!=null && mobNumber.toLowerCase().contains(keyword.toLowerCase()))||
                headOfFamily.toLowerCase().contains(keyword.toLowerCase())||
                uniqueId.toLowerCase().contains(keyword.toLowerCase());
    }

    @Override
    public String toString() {
        return "Directory{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ", mobNumber='" + mobNumber + '\'' +
                ", headOfFamily='" + headOfFamily + '\'' +
                ", uniqueId='" + uniqueId + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public String getMobNumber() {
        return mobNumber;
    }

    public String getHeadOfFamily() {
        return headOfFamily;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public void setMobNumber(String mobNumber) {
        this.mobNumber = mobNumber;
    }

    public void setHeadOfFamily(String headOfFamily) {
        this.headOfFamily = headOfFamily;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }
}
