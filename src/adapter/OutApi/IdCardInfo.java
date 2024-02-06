package adapter.OutApi;

import java.util.Random;

public class IdCardInfo {
    private final String firstName;
    private final String lastName;
    private final String titleName;
    private final String id;
    protected Random r = new Random();

    public IdCardInfo(String idCardNumber,String firstName, String lastName, String titleName) {
        this.id = idCardNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.titleName = titleName;
    }

    public String getId() {
        return id;
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
        return titleName+firstName + " " + lastName;
    }
}
