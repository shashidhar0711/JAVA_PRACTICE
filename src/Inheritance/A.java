package Inheritance;

public class A implements Runnable {
    public String name;
    public int user_id;
    protected String email;
    private String password;

    A(){
        System.out.println("Printing A");
    }


    @Override
    public void eat() {
        System.out.println("Class A eats");
    }
}
