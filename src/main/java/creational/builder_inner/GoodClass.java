package creational.builder_inner;

public class GoodClass {
    private final int reqFieldOne;
    private final int reqFieldTwo;
    private final int reqFieldThree;
    private final int optFieldOne;
    private final int optFieldTwo;
    private final int optFieldThree;

    public static class Builder {
        // Обязательные параметры
        private final int reqFieldOne;
        private final int reqFieldTwo;

        // Необязательные параметры
        private int reqFieldThree = 0;
        private int optFieldOne = 0;
        private int optFieldTwo = 0;
        private int optFieldThree = 0;

        public Builder(int reqFieldOne, int reqFieldTwo) {
            this.reqFieldOne = reqFieldOne;
            this.reqFieldTwo = reqFieldTwo;
        }

        public Builder reqFieldThree(int val) {
            this.reqFieldThree = val;
            return this;
        }

        public Builder optFieldOne(int val) {
            this.optFieldOne = val;
            return this;
        }

        public Builder optFieldTwo(int val) {
            this.optFieldTwo = val;
            return this;
        }

        public Builder optFieldThree(int val) {
            this.optFieldThree = val;
            return this;
        }

        public GoodClass build() {
            return new GoodClass(this);
        }
    }

    private GoodClass(Builder builder) {
        reqFieldOne = builder.reqFieldOne;
        reqFieldTwo = builder.reqFieldTwo;
        reqFieldThree = builder.reqFieldThree;
        optFieldOne = builder.optFieldOne;
        optFieldTwo = builder.optFieldTwo;
        optFieldThree = builder.optFieldThree;
    }
}
