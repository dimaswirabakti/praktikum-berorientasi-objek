package pertemuan5.tugas3;

public class Tank extends Entity {
    public Tank(String name) {
        super(name, 20, 5, 5, "Tank");
    }

    public void taunt() {
        this.defense += 5;
        System.out.println(this.name + ": TAUNTT!!, defense bertambah 5");
    }
}