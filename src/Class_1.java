import java.util.Scanner;

class Student { //설계도 클래스 (학생 정보 정의)
    String name;
    int score;
}

public class Class_1{ //실행 클래스, public class는 하나만! + 파일 이름과 일치해야 함!
    public static void main(String[] std) {
        Scanner sc = new Scanner(System.in); //Scanner 객체 생성

        Student s1 = new Student(); // s1 객체 생성 (Student 클래스 이용)

        System.out.print("학생 이름을 입력하세요: ");
        s1.name = sc.nextLine(); //s1.name에 이름 저장

        System.out.print("학생의 점수를 입력하세요: ");
        s1.score = sc.nextInt(); //s1.score에 점수 저장

        System.out.println("\n--- 학생 정보 ---");
        System.out.println("이름: "+s1.name);
        System.out.println("점수: "+s1.score);

        if (s1.score>=80){
            System.out.println("합격입니다~!");
        }
        else {
            System.out.println("불합격입니다..");
        }

        System.out.println(" ");

        int k;
        System.out.print("학생 수를 입력하세요: ");
        k = sc.nextInt(); //입력된 숫자는 가져가고 숫자를 치고 누른 엔터값을 메모리에 남겨둠
        sc.nextLine(); //엔터값을 없애주는 역할
        /* 이렇게 안하려면 아래 학생 이름 입력받을 때
        .next() 사용하기 ( .next()는 공백이나 엔터 무시하고 입력된 글자만 가져옴 ) */

        Student[] students = new Student[k]; //학생 k명을 담을 공간 생성 (students 라는 길이 3인 배열 생성)
        for (int i=0;i<k;i++){
            students[i]=new Student(); //위에선 학생을 담을 공간을 생성한 것, 여기선 각 객체를 만드는 것

            System.out.print((i+1)+"번째 학생 이름: ");
            students[i].name = sc.nextLine();

        }

        for (int i=0;i<k;i++){
            System.out.print(students[i].name+"학생 점수: ");
            students[i].score = sc.nextInt();

        }

        System.out.println("\n--- 합격 여부 ---");

        for (int i=0;i<k;i++){
            if (students[i].score>=80){
                System.out.println(students[i].name+"은 "+students[i].score+"점 이므로 합격입니다.");
            }

            else {
                System.out.println(students[i].name+"은 "+students[i].score+"점 이므로 불합격입니다.");
            }
        }

        System.out.println("\n--- 전체 평균 ---");
        int total = 0;
        for (int i=0;i<k;i++){
            total += students[i].score;
        }

        System.out.print("전체 평균: " + (double)total/k); //형변환
    }
}

