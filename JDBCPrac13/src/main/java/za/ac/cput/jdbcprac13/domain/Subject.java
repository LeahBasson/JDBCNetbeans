package za.ac.cput.jdbcprac13.domain;

public class Subject {

    // attributes
    private String subCode;
    private String subDesc;

    // constructor
    public Subject(String subCode, String subDesc) {
        this.subCode = subCode;
        this.subDesc = subDesc;
    }

    // getter and setter methods
    public String getSubCode() {
        return subCode;
    }

    public void setSubCode(String subCode) {
        this.subCode = subCode;
    }

    public String getSubDesc() {
        return subDesc;
    }

    public void setSubDesc(String subDesc) {
        this.subDesc = subDesc;
    }

}// end of class
