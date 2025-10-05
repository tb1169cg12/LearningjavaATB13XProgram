package OOPs;

public class constructor {
    public static void main(String[] args) {


baby b1 = new baby();//calling defult constructor
}
}
//----------------------------
class baby{              // new class

        String name;    //attributes
    baby(){             //defaut constructor(name same as  class)
        System.out.println("i am called default");
        System.out.println("your aadhar is ready");
    }
        void eat(){     //behaviour
            System.out.println("eating");
        }
        void sleep(){   //attribite
            System.out.println("sleeping");//behaviour
        }

          }
