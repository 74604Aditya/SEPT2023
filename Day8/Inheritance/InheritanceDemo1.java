class First{
        int a = 5;
        int b = 10;

        void myFun()
        {
                System.out.println("muFun of First");
        }

}

class Second extends First
{
        int c = 15;

        void anotherFun()
        {
                System.out.println("anotherFun of Second");
        }

        void print()
        {
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
        }
}


public class InheritanceDemo1
{
        public static void main(String args[])
        {
                //child class object
                Second s = new Second();
                s.print();
		s.myFun();
        }
}
