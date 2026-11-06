//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    final int LINE = 5;        // ★ 10 → 5
    final int STAR = 21;       // ★ 23 → 21 (위 별 개수와 맞춤)

    System.out.println("*********************");
    System.out.println("*********************");
    System.out.println("*********************");
    System.out.println("*********************");
    System.out.println("*********************");
    System.out.println();


    for (int i = 0; i < LINE; i++){
        System.out.println("*********************");
    }
    System.out.println();

    for (int i = 0; i < LINE; i++){
        int j = 0;
        while (j < STAR){
            System.out.print("*");     // ★ println → print
            j++;
        }
        System.out.println();
    }
}
