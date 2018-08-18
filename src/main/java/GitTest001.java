public class GitTest001 {
    public static void main(String[] args) {
        sop("12345");
        ForDemo();
    }
    public static void sop(String str){
        System.out.println(str);
    }
    public static void ForDemo(){
        int[] arr = {1,2,3,4,5};
        for(int a : arr){
            System.out.println(a);
        }
    }
}