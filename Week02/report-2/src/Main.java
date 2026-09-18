//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
import java.util.Scanner;

void main() {
    Scanner keyboard = new Scanner(System.in);
    int radius;        // 원의 반지름
    int side;          // 정사각형의 한 변
    double boxArea;    // 정사각형 면적
    double circleArea; // 원의 면적
    double area;       // 구하는 면적

    System.out.print("원의 반지름 입력(정수형)? ");
    radius = keyboard.nextInt();

    side = radius * 2;
    boxArea = side * side;
    circleArea = 3.141592 * radius * radius;
    area = boxArea - circleArea;

    System.out.printf("정사각형 면적 : %,.2f\u33A0\n", boxArea);
    System.out.printf("원의 면적 : %,.2f\u33A0\n", circleArea);
    System.out.printf("구하는 면적 : %,.2f\u33A0\n", area);
}
