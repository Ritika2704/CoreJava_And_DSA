package Project;

public class Aadhaar {

    private String aadhaarNum;
    private String name;
    private String fatherName;
    private String address;

    public String getAadhaarNum() {
        return aadhaarNum;
    }

    public void setAadhaarNum(String aadhaarNum) {
        this.aadhaarNum = aadhaarNum;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getFatherName(){
        return fatherName;
    }

    public void setFatherName(String fatherName){
        this.fatherName= fatherName;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public Aadhaar(String aadhaarNum, String name, String fatherName, String address){
     this.aadhaarNum = aadhaarNum;
     this.name = name;
     this.fatherName = fatherName;
     this.address = address;

    }

    @Override
    public String toString() {
        return
                "aadhaarNum='" + aadhaarNum + '\'' +
                ", name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

