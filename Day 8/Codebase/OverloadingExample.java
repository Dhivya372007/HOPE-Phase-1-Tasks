class Add{
    int add(int a,int b){
        return a+b;
    }
    double add(double a,double b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
}

public class OverloadingExample {
    public static void main(String[] args) {
        Add a=new Add();
        System.out.println(a.add(2,3));
        System.out.println(a.add(2.0,3.0));
        System.out.println(a.add(1,2,3));
    }
}
