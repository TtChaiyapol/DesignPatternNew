package templatemethod;

public class CreateEmployeeCard extends CreateCardTemplate{
    int random = (int) (Math.random() * 10000);
    @Override
    public void insertData() {
        System.out.println("1. Insert Driver License Data Name: สมชาย ใจดี");
    }

    @Override
    public void generatorIdCard() {
        System.out.println("2. Generate Driver License ID: " + random);
    }

    @Override
    public void printCard() {
        System.out.println("""
                5. Print Employee Card
                Name: สมชาย
                SurName: ใจดี
                ID:""" + random);
    }



}
