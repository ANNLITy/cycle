public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i= i+1) {
            System.out.println(i);
        }
        for (int a = 10; a >0; a= a-1) {
            System.out.println(a);
        }
        for (int b = 0; b< 18; b= b+2) {
            System.out.println(b);
        }
        for ( int c =10; c>-11; c=c-1) {
            System.out.println(c);
        }
        for (int d = 1904; d <2097; d=d+4) {
            System.out.println(d + " год является високосным");
        }
        for (int e = 7; e < 99; e=e+7) {
            System.out.println(e);
        }
        for (int f = 1; f < 513; f=f*2) {
            System.out.println(f);
        }
        int salary = 29000;
        int total = 0;
        for (int i = 1; i<13; i++) {
            total =total+ total/100;
            total =total+salary;
            System.out.println("Месяц "+i+" Итого "+ total);
        }
        int number=2;
        for (int g = 1; g<11; g++) {
            number= g*2;
            System.out.println("2"+"*"+g+"="+number);
        }


    }
}