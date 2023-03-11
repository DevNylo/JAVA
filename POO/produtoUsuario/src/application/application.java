package application;
import entities.*;
import enums.OrderStatus;

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class application {
    public static void main(String[] args) throws ParseException {

        Scanner input = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        OrderStatus orderStatus = new OrderStatus(PROCESSING);

        Client c1 = new Client();

        System.out.println("Enter client data: ");

        System.out.println("NAME: ");
        c1.setName(input.nextLine());

        System.out.println("E-MAIL: ");
        c1.setEmail(input.nextLine());

        System.out.println("BIRTH DATE: ");
        c1.setBirthDate(sdf.parse("11/03/2023"));
        
        System.out.println("Enter order data: ");
        
    }
}
