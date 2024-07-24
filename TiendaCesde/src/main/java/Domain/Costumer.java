package Domain;

public class Costumer extends User{

    String costumerType;

    @Override
    public void createUser() {
        super.createUser();
        System.out.println("Tipo de cliente");
        costumerType = sc.nextLine();
    }

    @Override
    public void listUser() {
        super.listUser();

    }

    @Override
    public void updateUser() {
        super.updateUser();
    }

    @Override
    public void deleteUser() {
        super.deleteUser();
    }
}
