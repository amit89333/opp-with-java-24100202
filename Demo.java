class Superclass {
    int a, b;

    public void get(int x, int y) {
        a = x;
        b = y;
    }
}

class SubClass extends Superclass {
    int a, b; 

    public void set() {
        this.a = super.a; 
        this.b = super.b; 
    }

    public void put() {
        System.out.println("a = " + this.a); 
        System.out.println("b = " + this.b); 
    }
}
class Demo 
{
    public static void main(String[] args) {
         SubClass obi = new SubClass();
        obi.get(10,20);
        obi.set();
        obi.put();
    }
}
