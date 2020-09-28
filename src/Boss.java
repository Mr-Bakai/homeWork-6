public class Boss  extends GameEntity{
    String weapon;

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public Boss(){}

    public  void printInfo(){
        System.out.println(" Weapon:" + getWeapon() + " " + "Boss damage:" + getDamage() + "" +
                " Boss health:" + getHealth());
    }
    }




