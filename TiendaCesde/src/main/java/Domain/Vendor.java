package Domain;

public class Vendor extends User{

        String vendorType;

        String categoryVendor;

        boolean aviability;

        @Override
        public void createUser() {
            super.createUser();

            System.out.println("Ingrese el vendedor");
            vendorType = sc.nextLine();

            System.out.println("Ingrese la categoria del vendedor");
            categoryVendor = sc.nextLine();

            System.out.println("Ingrese la aviabilidad");
            aviability = sc.nextBoolean();
        }

        @Override
        public void listUser() {
            super.listUser();
            System.out.println("Tipo de vendedor: " + vendorType + "\n" +
                    "Categoria de vendedor " + categoryVendor + "\n" +
                    "Disponibilidad" + aviability );
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

