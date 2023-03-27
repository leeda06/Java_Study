package java230327;

import java.util.Iterator;

interface Payable {
    // public final static
    int a = 3000;
    void pay();
    default void myMethod() {
        System.out.println("impl");
    }
}

interface Cleanable {
    void clean();
}

class EntertainmentDog implements Payable, Cleanable {
    @Override
    public void pay() {
        System.out.println("결제를 합니다.");
    }
    @Override
    public void clean() {
        System.out.println("청소를 합니다.");
    }
}

interface SuperInterface {
    void superMethod();
}
interface SubInterface extends SuperInterface {
    void subMethod();
}

class SubInterfaceImpl implements SubInterface {
    @Override
    public void superMethod() {}
    @Override
    public void subMethod() {}
}

@FunctionalInterface
interface MyFunctionalInterface {
    void method();
}

class MyFunctionalInterfaceImpl implements MyFunctionalInterface {
    @Override
    public void method() {
        System.out.println("구현 완료");
    }
}

class FruitsIterable implements Iterable<String> {
    @Override
    public Iterator<String> iterator() {
        String[] fruits = { "apple", "banana", "orange" };

        return new Iterator<String>() {
            private int currentIndex = 0;
            @Override
            public boolean hasNext() {
                return fruits.length > currentIndex;
            }

            @Override
            public String next() {
                String fruit = fruits[currentIndex];
                currentIndex++;
                return fruit;
            }
        };
    }
}

class IntRange implements Iterable<Integer>{ //  <> 인티저를 순회
    private int start, end;
    public IntRange(int start, int end){
        this.start = start;
        this.end = end;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return start <= end;
            }

            @Override
            public Integer next() {
                return start ++;
            }
        };

    }
}

public class interface0327 {
    public static void main(String[] args) {

    }
}