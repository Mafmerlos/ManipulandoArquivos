package org.example.application;

import org.example.entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);

       List<Product> products = new ArrayList<Product>();

        System.out.println("Entre com o caminho do arquivo: " );
        String sourceFileStr = sc.nextLine();

        File sourcefile = new File(sourceFileStr);
        String sourceFolderStr = sourcefile.getParent();

        boolean sucess = new File(sourceFolderStr + "\\out").mkdir();
        String targetFileStr = sourceFolderStr + "\\out.\\summary.csv";

        try(BufferedReader bf = new BufferedReader(new FileReader(sourceFileStr))){

            String line = bf.readLine();
            while (line != null) {
                String[] parts = line.split(",");
                String name = parts[0];
                double price = Double.parseDouble(parts[1]);
                int quantity = Integer.parseInt(parts[2]);
                products.add(new Product(name,price,quantity));
                line = bf.readLine();
            }

         try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))){
            for (Product item : products) {
                bw.write(item.getName() + "," + String.format("%.2f",item.total()));
                bw.newLine();
            }
             System.out.println(targetFileStr + "Created");
         } catch (IOException e) {
             System.out.println("Erro ao escrever o arquivo" + e.getMessage());
         }


        }catch (IOException e){
            System.out.println("Ocorreu um erro ao ler o arquivo" + e.getMessage());
        }

        sc.close();
    }
}