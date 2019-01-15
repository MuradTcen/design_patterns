package creational.builder_inner;

public class Main {
    public static void main(String[] args) {
        GoodClass goodClass = new GoodClass.Builder(40, 20)
                .reqFieldThree(2)
//                .optFieldOne(10)
                .optFieldTwo(20)
                .optFieldThree(30)
                .build();
    }
}
