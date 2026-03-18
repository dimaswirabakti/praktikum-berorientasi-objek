package pertemuan5.tugas3;

public class Archer extends Entity {
    public Archer(String name) {
        super(name, 10, 15, 1, "Archer");
    }

    public void doubleShot(Entity target) {
        System.out.println(this.name + ": RASAKAN DOUBLE SHOT KU");
        this.attack(target);
        this.attack(target);
    }
}