//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);

    final float DON = 3.75f;   //1돈은 3.75g
    final int GOLD = 910000;  //금 1돈의 가격
    float weight;
    float don;

    System.out.print("당신의 체중은 ?");
    weight = keyboard.nextFloat();   //단위 : Kg 45.7 45 Kg 0.7

    int intweight = (int) weight;
    float remainder = weight - intweight;
    int gram1 = (int) (intweight * 1000 + remainder * 1000);

    int gram = (int) (weight * 1000);
    don = gram / DON;
    long price = (long) (don * GOLD);
    price /= 10000;
    price *= 10000;

    System.out.printf("%.2f Kg -> %,d ) g\n", weight, gram);
    System.out.printf("%.2f Kg -> %,.2f 돈\n", weight, don);
    System.out.printf("%.2f Kg -> %,d 원\n", weight, price);
}
