void main() {
    Scanner keyboard = new Scanner(System.in);
    double weight, moon;

    System.out.print("지구에서의 몸무게(kg)를 입력 : ");
    weight = keyboard.nextDouble();

    moon = weight * 0.165;

    System.out.printf("지구에서의 몸무게 : %.2f kg\n", weight);
    System.out.printf("달에서의 몸무게 : %.2f kg\n", moon);
}
