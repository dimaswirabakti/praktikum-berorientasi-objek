package pertemuan5.tugas3;

public class Warrior extends Entity {
    public Warrior(String name) {
        super(name, 15, 10, 3, "Warrior");
    }

    public void berserk() {
        this.damage += 5;
        System.out.println(this.name + ": BERSERRKK!!, damage bertambah 5");
    }
}