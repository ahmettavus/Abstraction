public class Apple extends BasePhoneManager {
    public Apple() {
        super();
        setPhoneBrand("Apple");
        super.setModels(new String[]{"Iphone 3GS", "Iphone 11 Pro", "Iphone 14 Pro Max"});
    }

    @Override
    double calculation() {
        double appleDiscount = getPrice() * 0.2;
        return getPrice() + appleDiscount;
    }

    public void setPhoneModelFromIndex(int a) {
        String phoneModel = super.getModels()[a];
        if (phoneModel.equals(super.getModels()[0])) {
            super.setPrice(5000);
        } else if (phoneModel.equals(super.getModels()[1])) {
            super.setPrice(10000);
        } else if (phoneModel.equals(super.getModels()[2])) {
            super.setPrice(23200);

        }
        super.setPhoneModel(phoneModel);

    }
}

