public class Samsung extends BasePhoneManager {
    /**
     * @author Ahmet
     * To Aim the Samsung Class Brand being created extends BasePhoneManager Abstraction class
     * @Date 26.11.2022
     * @since 0.0.0.1
     *
     */
    public Samsung() {
        super();
        setPhoneBrand("Samsung");
        super.setModels(new String[]{"A20", "B20", "C30"});
    }

    /**
     * calculation method is overrided by BasePhoneManager, as known the discount and dataset according to the market data, last price indication is calculated.
     * @return getPrice() - samsungDiscount
     */

    @Override
    double calculation() {
        double samsungDiscount = 250;
        return getPrice() - samsungDiscount;
    }

    /**
     * setPhoneModelFromIndex method is aimed to the selection of the Phone Model information.
     * The shared the price information is updated and used via Market Data.
     * @param a is the turning into the integer value to access phoneModelPriceInfo
     */
    @Override
    public void setPhoneModelFromIndex(int a) {
        String phoneModel = super.getModels()[a];
        if (phoneModel.equals(super.getModels()[0])) {
            super.setPrice(2000);
        } else if (phoneModel.equals(super.getModels()[1])) {
            super.setPrice(3000);
        } else if (phoneModel.equals(super.getModels()[2])) {
            super.setPrice(4500);

        }
        super.setPhoneModel(phoneModel);
    }
}
