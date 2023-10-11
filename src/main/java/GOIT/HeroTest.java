package GOIT;

public class HeroTest {
    public static void main(String[] args) {
        Hero hero = new Hero();

        //Expect Paratrooper
        System.out.println(hero.getName());

        //Expect 100
        System.out.println(hero.getHp());
    }
}

class Hero {

    private String name;
    private int hp;


    public Hero(String name, int hp) {
        this.name = name;
        setHp(hp);
    }

    public Hero() {
        this("Paratrooper", 100);
    }


    private void setHP(int hp){
        if (hp >= 0 && hp <= 250){
            this.hp = hp;
        }else
            this.hp = Math.min(0,Math.max(hp,200));
            this.hp = Math.max(0, Math.min(hp, 200));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

}