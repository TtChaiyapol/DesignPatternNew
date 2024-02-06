import CreateCard.CreateEmployeeCardOld;
import CreateCard.CreateIdCardOld;
import adapter.EmployeeCard;
import adapter.IdCardToEmployeeAdapter;
import adapter.OutApi.IdCardApi;
import adapter.OutApi.IdCardInfo;
import adapter.OutApi.PassportApi;
import adapter.OutApi.PassportInfo;
import adapter.PassportToEmployeeAdapter;
import templatemethod.CreateCardTemplate;
import templatemethod.CreateEmployeeCard;
import templatemethod.CreateIdCard;

import java.util.Random;
import java.util.logging.Logger;


public class Main {

    static Logger logger = Logger.getLogger(Main.class.getName());
    Random r = new Random();


    public static void main(String[] args) {
        Main main = new Main();
//        main.showPersonInfo();
//        main.showAdapter();
        main.showPersonInfoOld();
    }

//    public static void showRedDuck(){
//        Duck redDuck = new RedDuck();
//        redDuck.perfromFly();
//        redDuck.perfromQuack();
//        redDuck.display();
//    }
//
//    public static void showModelDuck(){
//        Duck model = new ModelDuck();
//        model.perfromFly();
//        model.setFlyBehavior(new FlyRocketPowerd());
//        model.perfromFly();
//    }

    public void showPersonInfo(){
        System.out.println("--------------------------------------------------------------");
        CreateCardTemplate info = new CreateIdCard();
        info.makeCard();
        System.out.println("--------------------------------------------------------------");
        CreateCardTemplate info2 = new CreateEmployeeCard();
        info2.makeCard();
        System.out.println("--------------------------------------------------------------");
    }

    public void showPersonInfoOld(){
        System.out.println("--------------------------------------------------------------");
        CreateIdCardOld info = new CreateIdCardOld();
        info.makeCard();
        System.out.println("--------------------------------------------------------------");
        CreateEmployeeCardOld info2 = new CreateEmployeeCardOld();
        info2.makeCard();
        System.out.println("--------------------------------------------------------------");
    }

    public void showAdapter(){
        // Data from API
        IdCardApi idCardApi = new IdCardApi();
        IdCardInfo info = idCardApi.getInfo();
        System.out.println("------------------------Data from API-------------------------");
        System.out.println("รหัสประชาชน: "+info.getId() + "\nคำนำหน้า: " + info.getTitleName()  + "\nชื่อ: " + info.getFirstName() + "\nนามสกุล: " + info.getLastName() + "\nชื่อเต็ม: " + info.getFullName());
        System.out.println("--------------------------------------------------------------");
//        Data from API
        PassportApi passportApi = new PassportApi();
        PassportInfo info2 = passportApi.getInfo();
        System.out.println("----------------------Data from Passport API------------------");
        System.out.println("รหัสประชาชน: "+info2.getPassportNumber() + "\nคำนำหน้า: " + info2.getTitleName()  + "\nชื่อ: " + info2.getFirstName() + "\nนามสกุล: " + info2.getLastName() + "\nชื่อเต็ม: " + info2.getFullName());
        System.out.println("--------------------------------------------------------------");
        // Data from Adapter
        IdCardToEmployeeAdapter adapter = new IdCardToEmployeeAdapter(idCardApi);
        EmployeeCard emp = adapter.getEmployeeCard();
        System.out.println("----------------------Data from IdCardAdapter------------------");
        System.out.println("รหัสพนักงาน: "+emp.getId()+ "\nชื่อพนักงาน: " + emp.getName() + "\nเลขบัตรประชาชน: " +emp.getIdCardNumber());
        System.out.println("--------------------------------------------------------------");
        // Data from Adapter
        PassportToEmployeeAdapter adapter2 = new PassportToEmployeeAdapter();
        EmployeeCard emp2 = adapter2.getEmployeeCard();
        System.out.println("--------------------Data from PassportAdapter------------------");
        System.out.println("รหัสพนักงาน: "+emp2.getId()+ "\nชื่อพนักงาน: " + emp2.getName() + "\nเลขบัตรประชาชน: " +emp2.getIdCardNumber());
        System.out.println("--------------------------------------------------------------");

    }

    public String genIdCardNumber(){
        StringBuilder id12 = new StringBuilder();
        for(int i = 0; i < 12; i++){
            id12.append(this.r.nextInt(10));
        }
        Long findId12 = Long.parseLong(id12.toString());
        return id12+(findDigit(findId12));
    }

    public String findDigit(Long id){
        long base = 100000000000L;
        long basenow;
        long sum = 0L;
        for(int i = 13; i > 1; i--){
            basenow = (long) Math.floor((double) id /base);
            id = id - basenow*base;
            sum += basenow*i;
            base = base/10;
        }
        long digit = (11- (sum%11))%10;
        return Long.toString(digit);
    }
}