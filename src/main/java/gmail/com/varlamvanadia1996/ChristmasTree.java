package gmail.com.varlamvanadia1996;

public class ChristmasTree {

    public static void main (String[] args){
        int countBalls = 0;
        int countGarland = 0;
        ChristmasBall pink = new ChristmasBall();
        ChristmasBall gold = new ChristmasBall();
        ChristmasBall blue = new ChristmasBall();
        ChristmasBall white = new ChristmasBall();
        ChristmasBall red = new ChristmasBall();
        Garland yellow = new Garland();
        Garland multicolored = new Garland();
        Garland lightWhite = new Garland();
        pink.colour = "Розовый";
        pink.diameter = 10;
        countBalls = pink.hangChristmasBall(countBalls);
        countBalls = pink.hangChristmasBall(countBalls);
        gold.colour = "Золотой";
        gold.diameter = 6;
        countBalls = gold.hangChristmasBall(countBalls);
        countBalls = gold.hangChristmasBall(countBalls);
        blue.colour = "Голубой";
        blue.diameter = 12;
        countBalls = blue.hangChristmasBall(countBalls);
        countBalls = blue.hangChristmasBall(countBalls);
        white.colour = "Белый";
        white.diameter = 8;
        countBalls = white.hangChristmasBall(countBalls);
        countBalls = white.hangChristmasBall(countBalls);
        red.colour = "Красный";
        red.diameter = 10;
        countBalls = red.hangChristmasBall(countBalls);
        countBalls = red.hangChristmasBall(countBalls);
        countBalls = gold.hangChristmasBall(countBalls);
        yellow.colour = "Желтая";
        yellow.length = 2;
        countGarland = yellow.hangGarland(countGarland);
        multicolored.colour = "Разноцветная";
        multicolored.length = 10;
        countGarland = multicolored.hangGarland(countGarland);
        lightWhite.colour = "Светло-белая";
        lightWhite.length = 10;
        countGarland = lightWhite.hangGarland(countGarland);
        yellow.turnOnGarland();
        yellow.turnOnGarland();
        multicolored.turnOnGarland();
        multicolored.turnOnGarland();
        System.out.println("Всего на ёлке "+ (countBalls+countGarland) + " украшений");
    }
}
