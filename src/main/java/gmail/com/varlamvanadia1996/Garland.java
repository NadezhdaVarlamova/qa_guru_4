package gmail.com.varlamvanadia1996;

public class Garland {
    String colour;
    int length;
    boolean included = false;

    int hangGarland (int countGarland) {
        if (countGarland == 2) {
            System.out.println("На ёлке нет места для гирлянды");
        } else {
            System.out.println(colour + " гирлянда, длиной " + length + " см повешена на ёлку");
            countGarland = countGarland + 1;
            System.out.println("Теперь на ёлке их " + countGarland + " шт");
        }
        return countGarland;
    }

    void turnOnGarland(){
        if (included == false){
            included = true;
            System.out.println(colour + " гирлянда, длиной " + length + " см включена");
        }
        else {
            System.out.println(colour + " гирляна, длиной " + length + " см уже включена");
        }

    }


}
