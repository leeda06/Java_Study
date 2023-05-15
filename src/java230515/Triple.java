package java230515;

public class Triple <T, V, M> {
    private T thing;
    private V value;;
    private M material;

    public Triple(T thing, V value, M material) {

        this.thing = thing;
        this.value = value;
        this.material = material;
    }
    public T getFirst() {
        return thing;
    }
    public V getSecond() {
        return value;
    }
    public M getThird() {
        return material;
    }
}