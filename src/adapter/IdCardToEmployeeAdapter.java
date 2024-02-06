package adapter;

import adapter.OutApi.IdCardApi;

import java.util.Random;

public class IdCardToEmployeeAdapter implements IEmployeeAdapter{

    private IdCardApi adapter;
    public IdCardToEmployeeAdapter(IdCardApi idCardApi){
        this.adapter = idCardApi;
    }

    public EmployeeCard getEmployeeCard(){
        var idCardInfo = adapter.getInfo();
        Random r = new Random();
        String id = Integer.toString(r.nextInt(9999));
        return new EmployeeCard(id, idCardInfo.getFullName(), idCardInfo.getId());
    }

    public String getFullName(){
        return adapter.getInfo().getTitleName()+adapter.getInfo().getFirstName() + " " + adapter.getInfo().getLastName();
    }

}
