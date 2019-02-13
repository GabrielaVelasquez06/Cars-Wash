package com.company;

    import java.util.ArrayList;
    import java.util.Scanner;

    public class MenuPrincipal {

        public void Menu(){

            Scanner sn = new Scanner(System.in);
            boolean salir = false;
            int opcion, opcionmantenimiento;
            String compra;

            while (!salir) {

                System.out.println("\t\t\n\n\n\n\n BIENVENIDO AL CARS WAHS VELASQUEZ");
                System.out.println("\n\t\tQUE SERVICIO DESEA ");
                System.out.println("1. Lavado & Mas .");
                System.out.println("2. Mantenimiento Clientes & Servicios.");
                System.out.println("3. Salir.");

                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("\t\t SELECIONE EL TIPO DE LAVADO");
                        Servicios   servics = new Servicios();
                        servics.listaServicios();
                        break;
                    case 2:
                        int opcion1;
                        boolean salir2 = false;

                        while (!salir2){


                            System.out.println("\t\t\n\n BIENVENIDO AL MANTENIMIENTO DE CLIENTES Y SERVICIOS");
                            System.out.println("\t\t\n Que Cambios Desea Realizar ");
                            System.out.println("\t\t 1. Clientes ");
                            System.out.println("\t\t 2. Servicios ");
                            System.out.println("\t\t 3. salir ");

                            opcion1 = sn.nextInt();

                            switch (opcion1){

                                case 1:

                                    boolean salir3 = false;

                                    while(!salir3){

                                        System.out.println("\t\t\n QUE DESEA REALIZAR");
                                        System.out.println("\t\t1. Agregar Clientes. ");
                                        System.out.println("\t\t2. Eliminar Clientes. ");
                                        System.out.println("\t\t3. Regresar al Menu Principal. ");
                                        int opcioncliente = sn.nextInt();

                                        switch (opcioncliente){

                                            case 1:

                                                System.out.println("\n\n\t-------------------------------------------------");
                                                System.out.println("                  ESTE ES EL LISTADO DE CLIENTES");
                                                System.out.println("\t-------------------------------------------------");
                                                ArrayList<String> Clientes = new ArrayList<>();

                                                Clientes.add("  Carlos Herrera");
                                                Clientes.add("Samantha Bonilla");
                                                Clientes.add("    Maria Rivera");
                                                Clientes.add("  Angel aguilera");

                                                ArrayList<Integer> CodClientes = new ArrayList<>();

                                                CodClientes.add(0);
                                                CodClientes.add(1);
                                                CodClientes.add(2);
                                                CodClientes.add(3);

                                                System.out.println("\t|        Clientes           |     Codcliente    |");
                                                System.out.println("\t-------------------------------------------------");

                                                for (int i = 0; i < Clientes.size(); i++) {
                                                    System.out.println("    |        " + Clientes.get(i) + "   |        " + CodClientes.get(i) + "          |     ");

                                                }
                                                System.out.println("\t\n1. Para Agregar Clientes");
                                                System.out.println("\t\n2. Para Regresar Al Menu Anterior");
                                                int opcionminimenu = sn.nextInt();

                                                if (opcionminimenu == 1){
                                                    int cantidad, codigocliente;

                                                    String Nombrecliente;

                                                    System.out.println("\t\nIngrese La Cantidad de Clientes Que Va a Registrar ");
                                                    cantidad = sn.nextInt();

                                                    String separacion = sn.nextLine();

                                                    for (int i = 0; i <cantidad ; i++) {
                                                        System.out.println("\t\n Ingrese El Nombre Del Cliente Separado de ESPACIO.");
                                                        Nombrecliente = sn.nextLine();
                                                        Clientes.add(Nombrecliente);
                                                    }
                                                    for (int i = 0; i <cantidad ; i++) {

                                                        System.out.println("\t\nIngrese El Codigo De El Cliente");
                                                        codigocliente = sn.nextInt();
                                                        CodClientes.add(codigocliente);

                                                    }

                                                }
                                                System.out.println("------------------------------------------------------------");
                                                System.out.println("\t             ESTA ES LA NUEVA LISTA DE CLIENTES");
                                                System.out.println("------------------------------------------------------------");

                                                System.out.println("\t\t        Clientes         |        Codcliente");
                                                for (int i = 0; i < Clientes.size(); i++) {
                                                    System.out.println("  |       " + Clientes.get(i) + "       |             " + CodClientes.get(i) + "         |     ");

                                                }

                                                break;


                                            case 2:
                                                System.out.println("\t\n Esta Es La Lista De Clientes Cual Desea Eliminar");
                                                System.out.println("\t-----------------------------------------------------");
                                                ArrayList<String> Clientes1 = new ArrayList<>();

                                                Clientes1.add("  Carlos Herrera");
                                                Clientes1.add("Samantha Bonilla");
                                                Clientes1.add("    Maria Rivera");
                                                Clientes1.add("  Angel aguilera");
;
                                                ArrayList<Integer> CodClientes1 = new ArrayList<>();

                                                CodClientes1.add(0);
                                                CodClientes1.add(1);
                                                CodClientes1.add(2);
                                                CodClientes1.add(3);

                                                System.out.println("\t\t        Clientes         |        Codcliente");
                                                for (int i = 0; i < Clientes1.size(); i++) {
                                                    System.out.println("       |     " + Clientes1.get(i) + "       |      " + CodClientes1.get(i) + "     |     ");

                                                }

                                                System.out.println("\t\n Escriba El Codigo Del Cliente Que Desea Eliminar");

                                                int clienteeliminar = sn.nextInt();

                                                String respuestaalazar = sn.nextLine();

                                                boolean respuestaeliminar = CodClientes1.contains(clienteeliminar);
                                                if(respuestaeliminar==true){
                                                    System.out.println("\tEl Cliente Fue Encontrado Con Exito " +
                                                            "\n\t Escriba El Nombre De El Nuevo Cliente.");
                                                    String clientenuevo = sn.nextLine();
                                                    Clientes1.set(clienteeliminar, clientenuevo);

                                                }else{
                                                    System.out.println("\t\nEL CLIENTE NO PUSO SER ENCONTRADO DIJITE UN CODIGO VALIDO");
                                                }
                                                System.out.println("\t\n ESTA ES LA NUEVA LISTA DE CLIENTES");
                                                System.out.println("\t--------------------------------------------");

                                                System.out.println("\t\t |       Clientes         |        Codcliente |");
                                                for (int i = 0; i < Clientes1.size(); i++) {
                                                    System.out.println("       |     " + Clientes1.get(i) + "     | " + CodClientes1.get(i) + "   |     ");

                                                }



                                                break;

                                            case 3:
                                                salir3 = true;

                                                break;

                                            default:
                                                System.out.println("Ingrese Un Numero Entre 1 y 3");
                                        }

                                    }

                                    break;

                                case 2:

                                    boolean salir5 = false;
                                    while(!salir5) {
                                        System.out.println("\t\n QUE DESEA REALIZAR");
                                        System.out.println("\t 1. agregar.");
                                        System.out.println("\t 2. eliminar.");
                                        System.out.println("\t 3. salir.");

                                        int opcionServicios = sn.nextInt();
                                        switch (opcionServicios){

                                            case 1:
                                                ArrayList<String> listServicios = new ArrayList<>();
                                                listServicios.add("Manzana");
                                                listServicios.add("coca cola");
                                                listServicios.add("pera");
                                                listServicios.add("frijoles");

                                                ArrayList<Integer> priceServicios = new ArrayList();
                                                priceServicios.add(350);
                                                priceServicios.add(150);
                                                priceServicios.add(250);

                                                System.out.println("Esta Es La Lista de Servicios");

                                                System.out.println("codigo   ||    Producto     ||   Precio  ");

                                                for (int i = 0; i < listServicios.size(); i++) {
                                                    System.out.println("    " + i + "       |     " + listServicios.get(i) + "      " + priceServicios.get(i) + "  LPS    |     ");

                                                }
                                                String ashfbas = sn.nextLine();

                                                System.out.println("\t\nIngrese El Servicios Que Desea Ingresar.");
                                                String nuevoservicio = sn.nextLine();

                                                listServicios.add(nuevoservicio);

                                                System.out.println("\t\nIngrese El Precio De El Servicios Que Desea Ingresar.");
                                                int nuevoprecio = sn.nextInt();

                                                priceServicios.add(nuevoprecio);

                                                System.out.println("Esta Es La Nueva Lista De Servcios");

                                                System.out.println("Codigo   ||    Producto     ||   Precio  ");

                                                for (int i = 0; i < listServicios.size(); i++) {
                                                    System.out.println("    " + i + "       |     " + listServicios.get(i) + "      " + priceServicios.get(i) + "  LPS    |     ");

                                                }


                                                break;

                                            case 2:
                                                System.out.println("\t\n Esta Es La Lista De Servicios Cual Desea Eliminar");
                                                ArrayList<String> listServicios1 = new ArrayList<>();
                                                listServicios1.add("Lavado    Premium");
                                                listServicios1.add("Lavado    General");
                                                listServicios1.add("Lavado & Aspirado");

                                                ArrayList<Integer> priceServicios1 = new ArrayList();
                                                priceServicios1.add(350);
                                                priceServicios1.add(150);
                                                priceServicios1.add(250);

                                                System.out.println("\t\t   Servicios               Precio");
                                                for (int i = 0; i < listServicios1.size(); i++) {
                                                    System.out.println("       |     " + listServicios1.get(i) + "      " + priceServicios1.get(i) + "   |     ");

                                                }

                                                System.out.println("\t\n Escriba El Precio Del Servicios Que Desea Eliminar");

                                                int clienteeliminar = sn.nextInt();

                                                String respuestaalazar = sn.nextLine();

                                                boolean respuestaeliminar = priceServicios1.contains(clienteeliminar);
                                                if(respuestaeliminar==true){
                                                    System.out.println("\tEl Producto Fue Encontrado Con Exito " +
                                                            "\n\t Escrba El Nombre De El Nuevo .");
                                                    String clientenuevo = sn.nextLine();
                                                    listServicios1.set(clienteeliminar, clientenuevo);

                                                }else{
                                                    System.out.println("\t\nEL Servicios NO PUSO SER ENCONTRADO DIJITE UN CODIGO VALIDO");
                                                }
                                                System.out.println("\t\n Esta Es La Nueva Lista De Servicios");

                                                System.out.println("\t\t   Clientes          Codcliente");
                                                for (int i = 0; i < listServicios1.size(); i++) {
                                                    System.out.println("       |     " + listServicios1.get(i) + "      " + priceServicios1.get(i) + "   |     ");

                                                }

                                                break;

                                            case 3:
                                                salir5 = true;
                                                break;

                                            default:
                                                System.out.println("Ingrese Un Dato ENntre 1 y 3");
                                        }

                                    }

                                    break;

                                case 3:
                                    System.out.println("Regresando Al Menu Principal");
                                    salir2 = true;
                                    break;

                                default:
                                    System.out.println("Ingrese Una Opcion Entre 1 y 3");

                            }


                        }

                        break;
                    case 3:
                        System.out.println("GRACIAS POR SI VISITA LO ESPERAMOS PRONTO!");
                        salir = true;
                        break;
                    default:
                        System.out.println("\n\n\t\t ESCOJA ENTRE LAS OPCIONES 1 Y 2");
                }

            }
        }
    }

