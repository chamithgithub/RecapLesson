import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Reverse {
    public static void main(String[] args) {
        //method 1
        //len and chartAt
        String name ="Chamith";
        String reverse="";

//        System.out.println(name.charAt(0));

//        int length = name.length();
//
//        for(int i=length-1; i>=0 ; i--){
//            reverse =reverse+name.charAt(i);
//        }
//        System.out.println(reverse);

        //method 2
        //charactorArraybe li

//        char[] chars = name.toCharArray();
//        int length = chars.length;
//
//        for (int i=length-1 ; i>=0; i--){
//            reverse=reverse+chars[i];
//        }
//        System.out.println(reverse);

//        method 3
//        StringBuffer
//    StringBuffer stringBuffer=new StringBuffer(name);
//        System.out.println(stringBuffer.reverse());

//        method 4
//        using collection

        char[] chars = name.toCharArray();
        List<Character> list=new ArrayList<Character>();
        for (Character character: chars ){
        list.add(character);
        }
        Collections.reverse(list);

        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()){
            System.out.print(listIterator.next());  //println remove
        }
    }
}
