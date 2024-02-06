package adapter;

import adapter.OutApi.PassportApi;

import java.util.Random;

public class PassportToEmployeeAdapter implements IEmployeeAdapter {

    private PassportApi adapter = new PassportApi();
    @Override
    public EmployeeCard getEmployeeCard() {
        var adp = adapter.getInfo();
        Random r = new Random();
        String id = Integer.toString(r.nextInt(9999));
        return new EmployeeCard(id,adp.getTitleName()+adp.getFullName(), adp.getPassportNumber());
    }

    public String getFullName(){
        return adapter.getInfo().getTitleName()+adapter.getInfo().getFirstName() + " " + adapter.getInfo().getLastName();
    }
}
//adp.getTitleName()+adp.getFirstName() + " " + adp.getLastName()