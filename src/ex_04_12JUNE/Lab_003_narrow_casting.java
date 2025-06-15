package ex_04_12JUNE;

public class Lab_003_narrow_casting {
    public static void main(String[] args) {
        int course=100;
        float gst=18.45f;
        //int total=course +(int)gst; total will show 118 data loss
        //System.out.println(total);
        float total=course+ (float)gst;
        System.out.println(total);

    }
}
