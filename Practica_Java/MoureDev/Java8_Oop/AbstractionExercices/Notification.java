package Java8_Oop.AbstractionExercices;

public class Notification {
    //Atributos


    //Constructor



    //Metodo
    public void send(){
        System.out.println("Enviando notificacion");
    }

    public void sendNotification(Notification n) {
        n.send();
    }
}
