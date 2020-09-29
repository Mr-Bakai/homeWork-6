public class Boss extends GameEntity {

    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Boss() {
    }

    public void printInfo() {
        System.out.println("Weapon type:" + getWeapon().getTypeOfWeapon() + "\nWeapon name "+getWeapon().getNameOfWeapon()
                + "\nBoss damage:" + getDamage() + "" +
                "\nBoss health:" + getHealth());
    }
}




