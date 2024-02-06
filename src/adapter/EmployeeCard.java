package adapter;

public class EmployeeCard {
    private String id;
    private String name;
    private String idCardNumber;

    public EmployeeCard(String id, String name, String idCardNumber) {
        this.id = id;
        this.name = name;
        this.idCardNumber = idCardNumber;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getIdCardNumber() {
        return idCardNumber;
    }


}
