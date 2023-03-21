abstract class Unit {
    protected int x, y;
    // 이동한다는 "개념(=설계)"만 제공
    abstract public void move(int x, int y);
    // 공격한다는 "개념(=설계)"만 제공
    abstract public void attack(String target);
    // 공통적으로 쓸 수 있는 개념이 있다면 추상 클래스에서 구현 가능
    public void stop() {
        System.out.println("유닛 멈춤");
    }
}

class Marine extends Unit {
    // 이동을 할 수 있는 "구체적인 행위, 방법"을 구현
    @Override
    public void move(int x, int y) {
        System.out.println("걸어서 이동");
    }
    // 공격을 할 수 있는 "구체적인 행위, 방법"을 구현
    @Override
    public void attack(String target) {
        System.out.println("총으로 " + target + "을 공격");
    }
    public void stimPack() {}
}

// 추상 클래스를 상속받는 다른 추상 클래스 정의 가능
abstract class Tank extends Unit {
    @Override
    public void move(int x, int y) {
        System.out.println("굴러서 이동");
    }
    // 필요한 추상 메서드를 하나 더 정의
    abstract public void siegeMode();
}

class RocketTank extends Tank {
    public void siegeMode() {
        System.out.println("로켓 발사 준비");
    }
    @Override
    public void attack(String target) {
        System.out.println("로켓으로 " + target + "을 공격");
    }
}

class NuclearTank extends Tank {
    public void siegeMode() {
        System.out.println("핵 공격 준비");
    }
    @Override
    public void attack(String target) {
        System.out.println("핵 미사일로 " + target + "을 공격");
    }
}

class DropShip extends Unit {
    @Override
    public void move(int x, int y) {
        System.out.println("날아서 이동");
    }
    // 별로 좋은 구현은 아님
    @Override
    public void attack(String target) {
        System.out.println("아무것도 안 함");
    }
    // 필요한 경우 미리 구현된 메서드도 재정의 가능
    @Override
    public void stop() {
        // 필요한 경우 부모 메서드 호출도 가능
        // super.stop();
        System.out.println("착륙 바퀴 빼내기");
    }
    public void loadUnload() {}
}


public class StarCreft {
    public static void main(String[] args) {
        Unit[] units = {
                new Marine(),
                new RocketTank(),
                new NuclearTank(),
                new DropShip()
        };

        String target = "적 군수시설";
        int targetX = 10;
        int targetY = 10;
        // 다형성을 활용하여 각각의 객체를 그룹으로 다루기
        for(Unit u : units) {
            u.move(targetX, targetY);
            u.attack(target);
        }
    }
}
