import java.util.Scanner;

/**
 * @author Ahmet
 * To Aim the Customer being created the adding and making some metods and getting results are aimed.
 * @Date 26.11.2022
 * @since 0.0.0.1
 *
 */
public class CustomerManager {

    int selectedBrand;
    double clientAmount;
    String startInFill = "Welcome to the Calculation of the Phone Management System \n" +
            "1-Samsung \n" +
            "2-Apple \n" +
            "3-Huawei\n" +
            "Please selecting new Phone Brand = ";

    Scanner input = new Scanner(System.in);

    /**
     * startPannel is used to start the Program as planned.
     * As first, the given phoneBrand information is shared with the customer afterwards from the client requested wanted the Brand selection.
     * After opening the phoneBrand information, the phoneBrand information is requested by Customer to aim that the customer must select the information as requested.
     * Lastly, the customer banking account the check progress is followed.
     */
    void startPannel() {

        System.out.println(startInFill);

        BasePhoneManager selectedPhone = null;

        while (selectedBrand < 0 && selectedBrand > 4) {
            System.out.println("Please check your selection!");
            selectedBrand = input.nextInt();
        }
        selectedBrand = input.nextInt();


        if (selectedBrand == 1) {
            selectedPhone = new Samsung();

        } else if (selectedBrand == 2) {
            selectedPhone = new Apple();

        } else if (selectedBrand == 3) {
            selectedPhone = new Huawei();
        }

        printPhoneModel(selectedPhone.getModels());

        int modelSelection = input.nextInt() - 1;
        selectedPhone.setPhoneModelFromIndex(modelSelection);

        System.out.println("Selected Phone Brand : " + selectedPhone.getPhoneBrand() + "\n" +
                "Selected Phone Model : " + selectedPhone.getPhoneModel() + "\n" +
                "Indicated Price Without Discount = " + selectedPhone.getPrice() + "\n" +
                "Discounted Phone Price  = " + selectedPhone.calculation());

        while (true) {
            System.out.println("Please Fill in the Banking Account Amount!");
            clientAmount = input.nextDouble();
            if (clientAmount >= selectedPhone.calculation()) {
                System.out.println("You can easily buy new Phone");
                break;
            } else {
                System.out.println("Please check it out the Banking Amount, Unfortunately, you can not buy the selected phone");
            }
        }


    }

    /**
     * printPhoneModel is aimed to use creating the String [] Array phoneModels variable.
     * @param phoneModels is used the print the selectedphone models information
     * Using the for loop is aimed to writing the phone models according to the index value.
     */

    void printPhoneModel(String[] phoneModels) {
        System.out.println("Please indicate which phone model you would like to choose");
        for (int a = 0; a < phoneModels.length; a++) {
            System.out.println((a + 1) + " -  " + phoneModels[a]);
        }
    }

}