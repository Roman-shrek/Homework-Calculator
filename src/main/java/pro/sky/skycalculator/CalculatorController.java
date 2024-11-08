package pro.sky.skycalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorService calculatorServiceImpl;

    public CalculatorController(CalculatorService calculatorServiceImpl) {
        this.calculatorServiceImpl = calculatorServiceImpl;
    }

    @GetMapping(path = "/calculator")
    public String calculatorHello() {
        return calculatorServiceImpl.calculatorHello();
    }

    @GetMapping(path = "/calculator/plus")
    public String calculatorSum(@RequestParam("num1") double number1,
                                @RequestParam("num2") double number2) {
        return calculatorServiceImpl.calculatorSum(number1, number2);
    }

    @GetMapping(path = "/calculator/minus")
    public String calculatorMinus(@RequestParam("num1") double number1,
                                  @RequestParam("num2") double number2) {
        return calculatorServiceImpl.calculatorMinus(number1, number2);
    }

    @GetMapping(path = "/calculator/divide")
    public String calculatorDivide(@RequestParam("num1") double number1,
                                   @RequestParam("num2") double number2) {
        return calculatorServiceImpl.calculatorDivide(number1, number2);
    }

    @GetMapping(path = "/calculator/multiply")
    public String calculatorMultiply(@RequestParam("num1") double number1,
                                     @RequestParam("num2") double number2) {
        return calculatorServiceImpl.calculatorMultiply(number1, number2);
    }
}