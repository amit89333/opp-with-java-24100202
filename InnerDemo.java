 class Demo {
    int a, b;

    public void get(int x, int y) {
        a = x;
        b = y;
    }

    public void put() {
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }
}

public class InnerDemo 
{
    public static void main(String[] args) 
    {
        Demo obi = new Demo();
        obi.get(10, 20);
        obi.put();
    }
}
