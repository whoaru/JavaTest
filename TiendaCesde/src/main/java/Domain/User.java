package Domain;

import java.util.Scanner;

public class User {

    int userId;

    String userName;

    String userLastName;

    String mail;

    String password;

    Scanner sc = new Scanner(System.in);

    public void createUser(){

        System.out.println("Ingrese Id");
        userId = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingrese el nombre");
        userName = sc.nextLine();

        System.out.println("Ingrese apellido");
        userLastName = sc.nextLine();

        System.out.println("Ingrese su correo");
        mail = sc.nextLine();

        System.out.println("Ingrese la contraseña");
        password = sc.nextLine();
    }

    public void listUser(){

        System.out.println("Id:" + userId + "\n" +
                "Nombre: " +  userName + "\n" +
                "Apellido: " +  userLastName + "\n" +
                "Correo: " + mail + "\n");
    }

    public void updateUser(){


    }

    public void deleteUser(){


    }
}
