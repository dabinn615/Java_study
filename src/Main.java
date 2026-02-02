import java.awt.*;
import java.util.Scanner; //입력받기위해 꼭 필요

public class Main { //파일명과 일치하는 클래스는 반드시 있어야 하고 하나만 존재해야한다.
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in); //sc라는 객체를 만듦
        System.out.print("이름을 입력하세요: ");
        String name=sc.nextLine(); //글자를 입력받을 때 .nextLine()

        System.out.print("나이를 입력하세요: ");
        int age=sc.nextInt(); //정수 입력받을 때 .nextInt()

        System.out.println(name+"님, 안녕하세요! 나이는 "+age+"살이군요.");
        //println은 줄바꿈 댐, print는 줄바꿈 안댐
    }
}






