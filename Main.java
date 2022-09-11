package core.lesson1.task1;

import core.lesson1.task1.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1,2);
        int b = calc.minus.apply(1,1);
        int aa = calc.multiply.apply(1,2);
        int aaa = calc.divide.apply(4,2);

        int c = calc.pow.apply(2);
        int x = calc.abs.apply(0);

        Boolean t = calc.isPositive.test(1);

        calc.println.accept(a);
        calc.println.accept(b);
        calc.println.accept(aa);
        calc.println.accept(aaa);
        calc.println.accept(c);
        calc.println.accept(x);
        calc.printlnForBool.accept(t);


    }
}
