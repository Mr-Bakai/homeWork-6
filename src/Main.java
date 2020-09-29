public class Main {

    public static void main(String[] args) {
	// write your code here

        Boss boss = new Boss();

        boss.setDamage(50);
        boss.setHealth(500);
        boss.setWeapon(new Weapon("Automat"," AK-47"));

        boss.printInfo();
    }
}
