package templatemethod;

import java.util.Random;

public class CreateIdCard extends CreateCardTemplate{
    Random r = new Random();
    String idCard;
    @Override
    public void insertData() {
        System.out.println("1. Insert ID Card Data Name: สมชาย ใจดี");
    }

    @Override
    public void generatorIdCard() {
        idCard = genIdCardNumber();
        System.out.println("2. Generate ID Card ID: "+idCard);
    }

    @Override
    public void printCard() {
        System.out.println("""
                5. Print ID Card
                Name: สมชาย ใจดี
                ID: """+idCard);
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
