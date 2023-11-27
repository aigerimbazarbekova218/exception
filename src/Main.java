import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /*System.out.println("Hello world!");
        int a =0;
        if(a==0){
            throw new Error();
        }*/
       /* Scanner scanner = new Scanner(System.in);
        int san = scanner.nextInt();
        try {
            if (san < 0) {
                throw new RuntimeException("сан нолдон чон болуусу керек");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        // System.out.println(4);
        try {
            System.out.println(4 / 2);
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Hello Java");
        }
        System.out.println("Hello world");*/

        /*try{
            method();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

        public static void method() throws Exception {
            try {
                System.out.println(5 / 0);
            } catch (RuntimeException e) {
                System.out.println("санды 0го болгонго болбойт");
            }*/
        try{
            method1();
        }catch (Exception e){
            e.printStackTrace();
        }


        }
        public static void method1(){
            Scanner scanner= new Scanner(System.in);
            int a=scanner.nextInt();
            int result =1;
            try {
                if(a>1){
                    for (int i = 1; i <= a; i++) {
                            result*=i;
                            System.out.println(result);
                    }
                }else {
                    throw new RuntimeException();
                }
            }finally {
                System.out.println("Finish");
            }





    }
}