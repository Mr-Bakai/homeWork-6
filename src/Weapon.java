public class Weapon {

    private String typeOfWeapon;
    private String nameOfWeapon;

    public Weapon(String s, String s1) {
        typeOfWeapon=s;
        nameOfWeapon=s1;
    }

    public String getTypeOfWeapon() {
        return typeOfWeapon;
    }

    public void setTypeOfWeapon(String typeOfWeapon) {
        this.typeOfWeapon = typeOfWeapon;
    }

    public String getNameOfWeapon() {
        return nameOfWeapon;
    }

    public void setNameOfWeapon(String nameOfWeapon) {
        this.nameOfWeapon = nameOfWeapon;
    }
}
