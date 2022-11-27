public class Huawei extends BasePhoneManager {
    public Huawei() {
        super();
        setPhoneBrand("Huawei");
        super.setModels(new String[]{"P20 LITE", "P90 Ultra", "XC66"});
    }
    @Override
    double calculation() {
        double huaweiDiscount = -getPrice() * 0.25;
        return getPrice() + huaweiDiscount;
    }
    public void setPhoneModelFromIndex(int a) {
        String phoneModel = super.getModels()[a];
        if (phoneModel.equals(super.getModels()[0])) {
            super.setPrice(1000);
        } else if (phoneModel.equals(super.getModels()[1])) {
            super.setPrice(4500);
        } else if (phoneModel.equals(super.getModels()[2])) {
            super.setPrice(9090);
        }
        super.setPhoneModel(phoneModel);
    }
}


