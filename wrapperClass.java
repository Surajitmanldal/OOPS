public class wrapperClass {
    public static void main(String[] args) {
//
        int a=10;//this is a primitive data type
        int b=20;
        Integer x=10;// this is an object, this x lots of method , cause this is wrapper class
        Integer y=20;
        swap(a,b);// this will not swap, cause these are the  primitive data type , it's call by the only value not reference
        swap(x,y);// it should be swap , but it will also not swap , because these are assotiated with final keyword
        System.out.println(a + " " + b);
        System.out.println(x + " " + y);
    }
    static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
    }
}

