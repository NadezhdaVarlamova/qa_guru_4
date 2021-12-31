package gmail.com.varlamvanadia1996;

public class ChristmasBall {
    String colour;
    int diameter;

    int hangChristmasBall(int countBalls) {
        if (countBalls == 10) {
            System.out.println("На ёлке нет места для шаров");
        } else {
            System.out.println(colour + " шар, диаметром " + diameter + " см повесили на ёлку");
            countBalls = countBalls + 1;
            System.out.println("Теперь на ёлке их " + countBalls + " шт");
        }
        return countBalls;
    }
}
