package problem3;


public enum State {

    NOCOINSTATE(0),
    CONTAINSONECOINSTATE(1),
    CONTAINSTWOCOINSSTATE(2),
    NOCHOCOBARSTATE(3);

    private int value;


    private State(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }
}