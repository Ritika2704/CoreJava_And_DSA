package Project;

public class Pan {

    private String panNumber;
    private String aadhaarNum;
    private String bankDetails;
    private String investment;

    public String getPanNumber(){
        return panNumber;
    }

    public void setPanNumber(String panNumber){
        this.panNumber = panNumber;
    }

    public String getAadhaarNum(){
        return aadhaarNum;
    }

    public void setAadhaarNum(String aadhaarNum){
        this.aadhaarNum = aadhaarNum;
    }

    public String getBankDetails(){
        return bankDetails;
    }

    public void setBankDetails(String bankDetails){
        this.bankDetails = bankDetails;
    }
     public String getInvestment(){
        return investment;
     }

     public void setInvestment(String investment){
        this.investment = investment;
     }

     public Pan(String panNumber, String aadhaarNum, String bankDetails, String investment){
        this.panNumber = panNumber;
        this.aadhaarNum= aadhaarNum;
        this.bankDetails = bankDetails;
        this.investment = investment;
     }

    @Override
    public String toString() {
        return
                "panNumber='" + panNumber + '\'' +
                ", aadhaarNum='" + aadhaarNum + '\'' +
                ", bankDetails='" + bankDetails + '\'' +
                ", investment='" + investment + '\'' +
                '}';
    }
}
