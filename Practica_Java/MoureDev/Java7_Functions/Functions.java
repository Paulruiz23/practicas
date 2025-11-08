package Java7_Functions;

import java.util.ArrayList;
import java.util.Arrays;

public class Functions {
    public static void main(String[] args) {

        //Funciones
        for(int i = 0 ; i < 5 ; i++){
            sendEmail();
        }

        //........
        sendEmail();
        sendEmailToUser("Paul");
        sendEmailToUser("paul_106@hotmail.com","Paul");
        sendEmailToUser(new ArrayList<>(Arrays.asList("Paul, Ruiz, Cabrera")));

        var users = (new ArrayList<>(Arrays.asList("Paul, Ruiz, Cabrera")));
        sendEmailToUser(users);

        var state = sendEmailWithState("Paul@gmail.com");
        System.out.println(state);
        System.out.println(sendEmailWithState(""));
    }

    // Función sin parámetros ni retorno
    public static void sendEmail(){
        System.out.println("Se envía el email");
    }

    // Función con parámetros
    public static void sendEmailToUser(String email) {

        System.out.println("Se envía el email a  " + email);
    }

    //Sobrecarga de funciones
    public static void sendEmailToUser(String email, String name){
        System.out.println("Se envía el email a " + name+ " (" + email  + ")" );
    }

    public static void sendEmailToUser(ArrayList<String> emails) {
        for (String email:emails){
            //System.out.println("Se envía el email a "+ email);
            sendEmailToUser(email);
        }
    }

    // Función con retorno
    public static boolean sendEmailWithState(String email){
        if (email.isEmpty()) {

            return false;
        }
        //System.out.println("Se envía el email a" + email);
        sendEmailToUser(email);
        return true;
    }

}


