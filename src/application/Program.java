package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();


        System.out.print("Enter the number of products:");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println("Product #"+i+" data:");
            System.out.print("Common, used or imported?");
            char ch = sc.next().charAt(0);
            System.out.print("Name:");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price:");
            Double price = sc.nextDouble();
            if(ch == 'i'){
                System.out.print("Customs free:");
                Double customFree = sc.nextDouble();
                list.add(new ImportedProduct(name,price,customFree));
            }else if(ch == 'c'){
                list.add(new Product(name,price));
            }else if(ch == 'u'){
                System.out.print("Manufacture data (DD/MM/YYYY):");
                sc.nextLine();
                String data = sc.nextLine();
                list.add(new UsedProduct(name,price,data));
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS");
        for(Product product : list){
            System.out.println(product.priceTag());
        }

        sc.close();
    }
}
