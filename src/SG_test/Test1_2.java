//package SG_test;
//class TV {
//    private int size;
//    public TV(int size){
//        this.size = size;
//    }
//    protected int getSize(){
//        return size;
//    }
//}
//class ColorTV extends TV {
//    private int color;
//    public ColorTV(int size, int color) {
//        super(size);
//        this.color = color;
//    }
//    void printProperty(){
//        System.out.println(super.getSize()+ "인치 "+ color +"컬러");
//    }
//}
//class IPTV extends ColorTV{
//    private String id;
//    public IPTV(String id, int size, int color) {
//        super(size, color);
//        this.id = id;
//    }
//    void printProperty(){
//        System.out.println("인치 "+ id +"컬러");
//        super.printProperty();
//    }
//}
//public class Test1_2 {
//    public static void main(String[] args) {
//        IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
//
//        iptv.printProperty();
//    }
//}
