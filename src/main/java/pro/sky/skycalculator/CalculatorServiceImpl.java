package pro.sky.skycalculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String calculatorHello() {
        return "Добро пожаловать в калькулятор";
    }

    public String calculatorSum(double number1, double number2) {
        double sum = number1 + number2;
        return number1 + "+" + number2 + "=" + sum;
    }

    public String calculatorMinus(double number1, double number2) {
        double minus = number1 - number2;
        return number1 + "-" + number2 + "=" + minus;
    }

    public String calculatorDivide(double number1, double number2) {
        double divide = number1 / number2;
        if (number2 == 0) {
            return "На ноль делить нельзя";
        } else {
            return number1 + "/" + number2 + "=" + divide;
        }
    }

    public String calculatorMultiply(double number1, double number2) {
        double multiply = number1 * number2;
        return number1 + "*" + number2 + "=" + multiply;
    }
}
