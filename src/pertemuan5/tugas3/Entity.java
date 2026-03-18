package pertemuan5.tugas3;

public class Entity {
    protected String name;
    protected int health;
    protected int damage;
    protected int defense;
    protected String className;

    public Entity(String name, int health, int damage, int defense, String className) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.defense = defense;
        this.className = className;
    }

    public void attack(Entity target) {
        if (target.health <= 0) {
            System.out.println("Target (" + target.name + ") sudah mati");
            return;
        }

        int dmgDealt = this.damage - target.defense;
        if (dmgDealt < 0) dmgDealt = 0;

        target.health -= dmgDealt;
        System.out.println(this.name + ": Berhasil menyerang " + target.name + ", sisa health " + target.name + " = " + target.health);
    }

    public void heal() {
        this.health += 5;
        System.out.println(this.name + ": Berhasil melakukan heal, nyawamu sekarang " + this.health);
    }

    public void displayInfo() {
        System.out.println("Nama = " + this.name);
        System.out.println("Class = " + this.className);
        System.out.println("Health = " + this.health);
        System.out.println("Damage = " + this.damage);
        System.out.println("Defense = " + this.defense);
        System.out.println("===");
    }
}