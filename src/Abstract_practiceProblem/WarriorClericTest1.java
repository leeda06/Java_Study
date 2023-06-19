// 구현할 인터페이스들
interface Attackable {
    void attack(Unit u);
}

interface Curable {
    void cure(Unit u);
}

// base로 사용할 추상클래스
abstract class Unit {
    private int health;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}

// Warrior 클래스
class Warrior extends Unit implements Attackable {
    private int attackPower;

    public Warrior(int health, int attackPower) {
        setHealth(health);
        this.attackPower = attackPower;
    }

    public void attack(Unit u) {
        int currentHealth = u.getHealth();
        int damage = attackPower;
        u.setHealth(currentHealth - damage);
        System.out.println("Warrior attacks! Damage dealt: " + damage);
    }
}

// Cleric 클래스
class Cleric extends Unit implements Curable {
    private int healingPower;

    public Cleric(int health, int healingPower) {
        setHealth(health);
        this.healingPower = healingPower;
    }

    public void cure(Unit u) {
        int currentHealth = u.getHealth();
        int healAmount = healingPower;
        u.setHealth(currentHealth + healAmount);
        System.out.println("Cleric cures! Health restored: " + healAmount);
    }
}

// WarriorCleric 클래스
class WarriorCleric extends Unit implements Attackable, Curable {
    private int attackPower;
    private int healingPower;

    public WarriorCleric(int health, int attackPower, int healingPower) {
        setHealth(health);
        this.attackPower = attackPower;
        this.healingPower = healingPower;
    }

    public void attack(Unit u) {
        int currentHealth = u.getHealth();
        int damage = attackPower;
        u.setHealth(currentHealth - damage);
        System.out.println("WarriorCleric attacks! Damage dealt: " + damage);
    }

    public void cure(Unit u) {
        int currentHealth = u.getHealth();
        int healAmount = healingPower;
        u.setHealth(currentHealth + healAmount);
        System.out.println("WarriorCleric cures! Health restored: " + healAmount);
    }
}

public class Main {
    public static void main(String[] args) {
        Warrior w = new Warrior(100, 20);
        Cleric c = new Cleric(150, 10);
        WarriorCleric wc = new WarriorCleric(200, 20, 10);

        // 예시: Warrior가 Cleric을 공격하고, Cleric이 WarriorCleric을 치료함
        w.attack(c);
        c.cure(wc);

        System.out.println("Warrior Health: " + w.getHealth());
        System.out.println("Cleric Health: " + c.getHealth());
        System.out.println("WarriorCleric Health: " + wc.getHealth());
    }
}
