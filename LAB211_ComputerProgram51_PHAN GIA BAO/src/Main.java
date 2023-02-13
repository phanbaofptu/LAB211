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
        while (true) {
            int choice = Manage.menu();
            switch (choice) {
                case 1:
                    Manage.caculator();
                    break;
                case 2:
                    Manage.BMICalculator();
                    break;
                case 3:
                    return;
            }
        }

    }
}
