class FDemo {
    int x;

    FDemo(int i) {
        x = i;
    }

    protected void finalize() {
        System.out.println("Finanlizing " + x);
    }

    void generator(int i) {
        FDemo o = new FDemo(i);
    }
}

public class Finalize {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int cnt;
        FDemo ob = new FDemo(0);

        for (cnt = 1; cnt < 10000000; cnt++) {
            ob.generator(cnt);
        }
    }

}
