package Java8_Oop.PolymorphismExercices;

public class User {
    //Atributos
    private String username;
    private String password;

    //Constructor
    public User(String username , String password){
        this.setUsername(username);
        this.setPassword(password);
    }

    //Metodo

    public String getUsername() {
        return username;
    }
    public String getPassword(){
        return password;
    }

    public void setUsername(String username){
        this.username = username;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void checkPassword(String inputPassword){
        if (inputPassword.equals(password)){
            System.out.println("La contraseña es correcta.");
        }
        else {
            System.out.println("Contraseña incorrecta");
        }
    }
}