public class Main {
    public static void main(String[] args) {System.out.println ("Задание 1");

    var dog = 8.0;
    System.out.println (dog);

    float cat = 3.6F;
    System.out.println (cat);

    var paper = 763789;
    System.out.println (paper);

    System.out.println ("Задание 2");

    dog = dog + 2;
    System.out.println (dog);

    cat = cat + 2;
    System.out.println (cat);

    paper = paper + 2;
    System.out.println (paper);

    System.out.println ("Задание 3");

    dog = dog - 3.5;
    System.out.println (dog);

    cat = (cat - 1.6f);
    System.out.println (cat);

    paper = paper - 7639;
    System.out.println (paper);

    System.out.println ("Задание 4");

    var friend = 19;
    System.out.println (friend);

    friend = friend + 2;
    System.out.println (friend);

    friend = friend / 7;
    System.out.println (friend);

    System.out.println ("Задание 5");

    var frog = 3.5;
    System.out.println (frog);

    frog = frog * 10;
    System.out.println (frog);

    frog = frog / 3.5;
    System.out.println (frog);

    frog = frog + 4;
    System.out.println (frog);

    System.out.println ("Задание 6");

    var weight1Boxer = 78.2;
    var weight2Boxer = 82.7;
    var totalMassFighters = weight1Boxer + weight2Boxer;
    System.out.println ("Общая масса бойцов " + totalMassFighters + " кг");

    var differenceFighters = 82.7 - 78.2;
    System.out.println ("Разница между массами бойцов " + differenceFighters + " кг");

    System.out.println ("Задание 7");

    var weight1Boxer1 = 78.2;
    var weight2Boxer2 = 82.7;
    var differenceFighters2 = weight2Boxer2 % weight1Boxer1;
    System.out.println ("Разница между массами бойцов " + differenceFighters2 + " кг");

    System.out.println ("Задание 8");

    var totalHours = 640;
    var hourWorker = 8;
    var totalEmployees = totalHours / hourWorker;
    System.out.println ("Всего работников в компании — " + totalEmployees + " человек");

    var morePeople94 = totalEmployees + 94;
    System.out.println ("Если в компании работает " + morePeople94 + " человек, то всего " + morePeople94 * 8 + " часов работы может быть поделено между сотрудниками");
    }
}




