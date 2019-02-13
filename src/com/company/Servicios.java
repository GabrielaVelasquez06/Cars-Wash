package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Servicios {

        Scanner sc = new Scanner(System.in);


        public void listaServicios() {
            int total=0;

            int servicios, posicion, servicio, precio, codcliente;

            ArrayList<String> listServicios= new ArrayList<>();
            listServicios.add("Lavado    Premium");
            listServicios.add("Lavado    General");
            listServicios.add("Lavado & Aspirado");

            ArrayList<Integer> priceServicios = new ArrayList();
            priceServicios.add(350);
            priceServicios.add(150);
            priceServicios.add(250);



            ArrayList<String> Clientes = new ArrayList<>();

            Clientes.add("Carlos Herrera");
            Clientes.add("Samantha Bonilla");
            Clientes.add("Maria Rivera");
            Clientes.add("Angel aguilera");

            ArrayList<Integer> CodClientes = new ArrayList<>();

            CodClientes.add(0000);
            CodClientes.add(0001);
            CodClientes.add(0002);
            CodClientes.add(0003);

            String NombreCliente;

            System.out.println("Ingrese El Codigo De Cliente Para Registrar En Dicha Cuenta La Factura");

            codcliente = sc.nextInt();

            NombreCliente = Clientes.get(codcliente);

            System.out.println("\n\t ESTOS SON NUESTROS SERVICIOS Sr/Sra  " + NombreCliente);
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("||     Codigo        ||           Producto         ||        Precio       ||");
            System.out.println("----------------------------------------------------------------------------");

            for (int i = 0; i < listServicios.size(); i++) {
                System.out.println("||         " + i + "         ||      " +         listServicios.get(i)   + "     ||      " +      priceServicios.get(i) + "   LPS      ||     ");


            }
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("\t\n\tDijite La Cantidad De Servicios Que Lleva El Cliente");
            servicio = sc.nextInt();

            String []FacturaServ = new String[servicio];
            int []FacturaPrice = new int[servicio];


            for (int i = 0; i < servicio; i++) {

                System.out.println("\t\n Dijite El Codigo De El Servicio Que Utilizara  Para Agregarlo a La Factura.");

                posicion = sc.nextInt();

                FacturaServ[i] = listServicios.get(posicion);
                FacturaPrice[i] = priceServicios.get(posicion);


            }
            System.out.println("\n-------------------------------------------------");
            System.out.println("|\t  SU FACTURA HA SIDO GENERADA CON EXITO     |");
            System.out.println("-------------------------------------------------");
            System.out.println("|       Estos Son Los Sevicios Utilizados       |");
            System.out.println("-------------------------------------------------");
            for (int i = 0; i < servicio ; i++) {

                System.out.println("|            " + FacturaServ [i]+ "      " + FacturaPrice[i] + "  LPS    |     ");
                total+=FacturaPrice[i];

            }
            System.out.println("-------------------------------------------------");
            System.out.println("|        Sr / Sra   " + NombreCliente  +        "            | \n|         EL TOTAL DE SU FACTURA ES:   " + total +"      |");
            System.out.println("-------------------------------------------------");


        }




    }


