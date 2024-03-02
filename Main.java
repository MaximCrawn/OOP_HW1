package hw_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int vol = 0;
        int t = 0;

        // HotDrink tea = new HotDrink("Tea", 200, 80);
        // HotDrink coffee = new HotDrink("Coffee", 300, 90);


        // HotDrinksVendingMachine vendingMachine = new HotDrinksVendingMachine();


        // HotDrink drink = (HotDrink) vendingMachine.getProduct("Tea", 200, 80);

        // System.out.println("Product: " + tea.getName() + ", Volume: " + tea.getVolume() + ", Temperature: " + tea.getTemperanure());
        // System.out.println("Product: " + coffee.getName() + ", Volume: " + coffee.getVolume() + ", Temperature: " + coffee.getTemperanure());

        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        while (work) {

            System.out.println("Введите желаемый напиток напитка ");
            System.out.println("1.Coffe ");
            System.out.println("2.Tea ");
            String line = scanner.nextLine();
            System.out.print("\033[H\033[J");
            switch (line) {
                case "Coffe":
                    System.out.println("Введите номер желаемого обьема ");
                    System.out.println("1.200мл ");
                    System.out.println("2.300мл ");
                    System.out.println("3.400мл ");
                    String line1 = scanner.nextLine();
                    System.out.print("\033[H\033[J");
                    switch (line1) {
                        case "1":
                            vol = 200;
                            break;
                        case "2":
                            vol = 300;
                            break;
                        case "3":
                            vol = 400;
                            break;
                        default:
                            break;
                    }
                    System.out.println("Введите номер желаемой температуры напитка ");
                    System.out.println("1.70C");
                    System.out.println("2.80C ");
                    System.out.println("3.90C ");
                    String line2 = scanner.nextLine();
                    System.out.print("\033[H\033[J");
                    switch (line2) {
                        case "1":
                            t = 70;
                            break;
                        case "2":
                            t = 80;
                            break;
                        case "3":
                            t = 90;
                            break;
                        default:
                            break;
                    }
                    System.out.print("\033[H\033[J");
                    System.out.println("Напиток готов!!!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.print("\033[H\033[J");

                    break;
                case "Tea":
                System.out.println("Введите номер желаемого обьема ");
                System.out.println("1.200мл ");
                System.out.println("2.300мл ");
                System.out.println("3.400мл ");
                String line3 = scanner.nextLine();
                System.out.print("\033[H\033[J");
                switch (line3) {
                    case "1":
                        vol = 200;
                        break;
                    case "2":
                        vol = 300;
                        break;
                    case "3":
                        vol = 400;
                        break;
                    default:
                        break;
                }
                System.out.println("Введите номер желаемой температуры напитка ");
                System.out.println("1.70C");
                System.out.println("2.80C ");
                System.out.println("3.90C ");
                String line4 = scanner.nextLine();
                System.out.print("\033[H\033[J");
                switch (line4) {
                    case "1":
                        t = 70;
                        break;
                    case "2":
                        t = 80;
                        break;
                    case "3":
                        t = 90;
                        break;
                    default:
                        break;
                }
                System.out.print("\033[H\033[J");
                System.out.println("Напиток готов!!!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.print("\033[H\033[J");
                    break;     
                default:
                    System.out.println("Введен не корректный символ");
            }
            HotDrink drink = new HotDrink((String)line, vol, t);
            System.out.println("Product: " + drink.getName() + ", Volume: " + drink.getVolume() + ", Temperature: " + drink.getTemperanure());
        }

    }
}
