public class Main {

    public static void main(String[] args) {
	// write your code here

        Boss boss = new Boss();
        boss.setWeapon("Random stone from ground");
        boss.setDamage(50);
        boss.setHealth(500);

        System.out.println( " Weapon:" + boss.getWeapon() + " " + "Boss damage:" + boss.getDamage() + "" +
                " Boss health:" + boss.getHealth());



    }
}
