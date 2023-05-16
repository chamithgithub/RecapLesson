public class Reverse {
    public static void main(String[] args) {
        //method 1
        //len and chartAt
        String name ="Chamith";
        String reverse="";

//        System.out.println(name.charAt(0));

        int length = name.length();

        for(int i=length-1; i>=0 ; i--){
            reverse =reverse+name.charAt(i);
        }
        System.out.println(reverse);


    }
}
