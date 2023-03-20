//  62p까지 함
/*
        ex)
        Abstract_Animal => Abstract_Duck => Duck

        Abstract_Duck{
            abstract public void squack();
            abstract public void duckLikeWalk();
        }

        interface Squckable{
            void squack();
        }

        interface DuckLikeWalk{
            void duckLikeWalk();
        }   // 인터페이스는 필드를 아예 만들지 못함 (필드 : int a;)
            //  public final static 이 붙는 거임
     */

/*
    덕 타이핑   -   오리처럼 걷고 오리처럼 꽥꽥거리면 그것은 오리이다
    -   타입을 중시하는사람   =>  X (Person은 Duck이 아니니깐)
    -   행동을 중시하는 사람  =>  O  (Person이건 Duck이 하는 행동을 하니깐)
        =   squak   :   행동을 중시  (step이있으면 Duck이다)
 */

interface Payable{
    void pay(); //  결제를 할수 있는 기능을 제공
}

interface Cleanable{    //  interface는 행동을 작동 즉, 행동을 중시함
    void clean(); //  청소를 할수 있는 기능을 제공
}

interface Cookable{
    void cook(); //  요리를 해주는 기능을 제공
}
interface superMethered1{
    void Methered1();
}
interface superMethered2{
    void Methered2();
}

interface superMethered extends superMethered1, superMethered2{ //  implements는 사용 불가능

}
class EntertainmentDog implements Payable, Cleanable, Cookable {    //  implements  -  구현하다 -> 다중구현이 가능하다
    //  pay랑 clean, cook을 구현
    //  Cookable    -   "요리"를 할 수 있기를(= 행동) 요구함 => cook이라고 하는 추상 메서드를 구현함으로서 계약을 지킴
    //  Payable     -   "결제"를 해 줄수 있기를(= 행동) 요구함 => pay라고 하는 추상 메서드를 구현함으로서 계약을 지킴

    @Override
    public void pay() {
        System.out.println("결제합니다.");
    }

    @Override
    public void clean() {
        System.out.println("청소합니다.");
    }

    @Override
    public void cook() {
        System.out.println("요리를 합니다.");
    }
    //default void myMethered{

    //}
}
@FunctionalInterface
interface MyFuntionalInterface{
    void method();
}

class MyFuntionalInterfaceImpt implements MyFuntionalInterface{

    @Override
    public void method() {

    }
}

public class interface0320 {
    public static void main(String[] args){
        EntertainmentDog dog = new EntertainmentDog();
        Payable payable = dog;
        Cleanable cleanable = dog;
        payable.pay();
        cleanable.clean();
    }
}
/*  if  -
 */