//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() throws IOException {
    Scanner keyboard = new Scanner(System.in);
    int start;
    int last;
    int odd = 0;
    int even = 0;
    char ansewer;


    do {
        odd = 0;
        even = 0;
        while (true) {
            System.out.print("어디부터 더할까요 ? ");
            start = keyboard.nextInt();
            System.out.printf("어디까지 더할까요 (최솟값 : %d) ? ", start + 5);
            last = keyboard.nextInt();

            if (last >= start + 5)
                break;
            else {
                System.err.print("ERROR : 입력 오류\n");
                System.in.read();
            }
        }

        for (int i = start; i <= last; i++) {
            if (i % 2 == 0) {
                even += i;
            } else {
                odd += i;
            }
        }

        System.out.printf("%d ~ %d까지의 합\n", start, last);
        System.out.printf("\t짝수의 합 = %,d\n", even);
        System.out.printf("\t홀수의 합 = %,d\n", odd);

        System.out.print("계속할까요? (Yes/No) ");
        keyboard.nextLine();
        ansewer = keyboard.nextLine().charAt(0);
        if (ansewer == 'N' || ansewer == 'n')
            break;
    } while (true);
}

