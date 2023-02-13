/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author phangiabao
 */
public class Main {
    public static void main(String[] args) {
        //loop until user want to exit
        while (true) {
            int choice = Caculate.menu();
            switch (choice) {
                case 1:
                    String binary = Validation.checkInputBinary();
                    Caculate.convertFromBinary(binary);
                    break;
                case 2:
                    String decimal = Validation.checkInputDecimal();
                    Caculate.convertFromDecimal(decimal);
                    break;
                case 3:
                    String hexa = Validation.checkInputHexaDecimal();
                    Caculate.convertFromHexa(hexa);
                    break;
                case 4:
                    return;
            }
        }
    }
}
