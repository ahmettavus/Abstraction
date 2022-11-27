/**
 * @author Ahmet
 * To Aim the BasePhoneManager being created the Abstract Class to create phoneBrand,phoneModel,price and models
 * Within this class, have tried to explain the Phone manager system in Java Package
 * @Date 26.11.2022
 * @since 0.0.0.1
 *
 */
abstract class BasePhoneManager {
    private String phoneBrand;
    private String phoneModel;
    private double price = 0;
    private String[] models;

    /**
     * Within concept of using this metod, tried to aim the setting the creating the PhoneModel information
     * @param a is the turning into the integer value to access phoneModelPriceInfo
     *
     */
    public void setPhoneModelFromIndex(int a) {
    }

    public BasePhoneManager() {

    }

    /**
     * Using this metod aimed to reach model array information.
     * @return models is used to reach out the models information that brand used.
     */
    public String[] getModels() {
        return models;
    }

    /**
     * setModels is used to reach out the model information
     * @param models
     */
    public void setModels(String[] models) {
        this.models = models;
    }

    /**
     * getPrice is used to filled out price of the phoneModel.
     * @return price is retured by programmer
     */
    public double getPrice() {
        return price;
    }

    /**
     * setPrice is used setting of phoneModel price.
     * @param i is turning into the double variable.
     */
    public void setPrice(double i) {

        this.price = i;
    }

    /**
     * getPhoneBrand is used getting of the PhoneBrand
     * @return is returning into the phoneBrand variable.
     */
    public String getPhoneBrand() {
        return phoneBrand;
    }
    /**
     * setPhoneBrand is used setting of the PhoneBrand
     * @return is equals the phoneBrand variable.
     */
    public void setPhoneBrand(String phoneBrand) {
        this.phoneBrand = phoneBrand;
    }

    /**
     * getPhoneModel is used getting of the PhoneModel
     * @return is returning into the phoneModel variable.
     */
    public String getPhoneModel() {
        return phoneModel;
    }

    /**
     * setPhoneModel is used setting of the PhoneModel
     * @return is  is equals the phoneModel variable.
     */
    public void setPhoneModel(String phoneModel) {
        this.phoneModel = phoneModel;
    }

    /**
     * calculation method is used to making final sum of the price indication
     * @return is not used.
     */
    abstract double calculation();


}
