package adapter.OutApi;

public class PassportInfo {

    private final String firstName;
    private final String lastName;
    private final String titleName;
    private final String passportNumber;

    public PassportInfo(String passportNumber,String firstName, String lastName, String titleName) {
        this.passportNumber = passportNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.titleName = titleName;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTitleName() {
        return titleName;
    }

    public String getFullName(){
        return firstName + " " + lastName;
    }
}
