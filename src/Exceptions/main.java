package Exceptions;

public class main {
    static void main(String[] args) throws NumberNotAllowed, ClassNotFoundException {
        DivNumber d = new DivNumber();
        try {
            d.doSomething(1,1);
            d.findRollNumber(-1);
        } catch(ClassNotFoundException ex) {
            System.out.println("Class not found exception.."+ex);
        } catch (NumberNotAllowed ne) {
            System.out.println("Number not allowed.. "+ne);
        } catch (Exception e) {
            System.out.println("Exception");
        }
        finally {
            System.out.println("db connection closed");
        }

    }
}
