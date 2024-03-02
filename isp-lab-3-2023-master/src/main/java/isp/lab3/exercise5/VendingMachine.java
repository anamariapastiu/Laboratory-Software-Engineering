package isp.lab3.exercise5;

import java.util.Scanner;

public class VendingMachine {
    private static String[] product;
    private static int coin;
    private static int credit;
    public VendingMachine(String[] product, int credit) {
        this.product = product;
        this.credit = credit;
    }


    public static void displayProducts() {
        for (int i = 0; i < product.length; i++) {
            if (product[i] != null)
                System.out.println(i + product[i]);
        }


    }
        public static int insertCoins ( int value){
            coin += value;
        }

    public static int getCoin() {
        return coin;
    }

    public static String selectProduct (int id) {
         for(int i=0;i<=product.length;i++) {
             if (i == id) {
                 product[id] = product[i];
             }
             else System.out.println("There is no such product");
         }    return product[id];

    }
    public static void displayCredit(){
        credit=getCoin();
     System.out.println(credit);
    }
    public static void userMenu() {
        System.out.println("Insert value:");
        Scanner value=new Scanner(System.in);
        insertCoins(value.nextInt());
        displayCredit();
        System.out.println("Select product id:");
    Scanner id=new Scanner(System.in);
    displayProducts();
    selectProduct(id.nextInt());

    }

        public static void main (String[]args){
                VendingMachine machine=new VendingMachine(new String[]{"Pepsi", "Chips"},10000);
               machine.displayProducts();
               // insertCoins(5);
               //5 displayCredit();
              // userMenu(); //?
    }

}
