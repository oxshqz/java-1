//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    String name = "";
    int age = 0;



    System.out.print("당신의 이름은?");
    name = keyboard.nextLine();
    System.out.printf("당신의 나이는?");
    age = keyboard.nextInt();


    name = "홍길동";

    System.out.printf("이름 : %s, 나이 : %d 살\n", name,age);

}
