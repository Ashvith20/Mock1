package Object_OP;

public class Overload1 {
        void operation(int a, int b){
            System.out.println(a+b);
        }
        void operation (int a, int b, int x){
            System.out.println(a+b-x);

        }
        public static void main(String[] args){
            Overload1 z=new Overload1();
            z.operation(2,3);
            z.operation(3,2,1);
        }

    }

