class Demo
{
        int a;
        int b;
        static int c;

        Demo(){
        }

        Demo(int a,int b)
        {
                this.a = a;
                this.b = b;
        }

        void increment(){
                c++;
        }

        void print(){

                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
        }
}

class StaticDataDemo
{
        public static void main(String args[]){

                System.out.println("static c = " + Demo.c);
                Demo.c += 1;

                System.out.println("static c = " + Demo.c);

                Demo d1 = new Demo(2,4);
                System.out.println("static c = " + d1.c);
        }
}

