package a1;

public class a1 {
    public static void main(String[] args) {

    }//only this will run
//below one are duplicates
    public static void main(String args) { //this is different function (called main method overloading)
        System.out.println("yes");
    }

    public static int main(int args) {
        return 10;
    }

    public static int main(float args) {
        return 10;
    }

    public static boolean main(boolean args) {
        return true;
    }

}

