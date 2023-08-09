package JakubT96.spring.models;
import org.springframework.stereotype.Service;

@Service
public class CalcService {
    public float calculate(CalculatorDTO calculator){
        if (calculator.getOperation().equals("+") && calculator.getOperation2().equals("+")) {
            return calculator.getNumber1() + calculator.getNumber2() + calculator.getNumber3();

        } else if (calculator.getOperation().equals("+")&& calculator.getOperation2().equals("-")) {
            return calculator.getNumber1() + calculator.getNumber2() - calculator.getNumber3();

        } else if (calculator.getOperation().equals("+")&& calculator.getOperation2().equals("*")) {
            return calculator.getNumber1() + calculator.getNumber2() * calculator.getNumber3();

        } else if (calculator.getOperation().equals("+")&& calculator.getOperation2().equals("/")) {
            return calculator.getNumber1() + calculator.getNumber2() / calculator.getNumber3();

        } else if (calculator.getOperation().equals("-")&& calculator.getOperation2().equals("+")) {
            return calculator.getNumber1() - calculator.getNumber2() + calculator.getNumber3();

        } else if (calculator.getOperation().equals("-")&& calculator.getOperation2().equals("-")) {
            return calculator.getNumber1() - calculator.getNumber2() - calculator.getNumber3();


        } else if (calculator.getOperation().equals("-")&& calculator.getOperation2().equals("*")) {
            return calculator.getNumber1() - calculator.getNumber2() * calculator.getNumber3();

        } else if (calculator.getOperation().equals("-")&& calculator.getOperation2().equals("/")) {
            return calculator.getNumber1() - calculator.getNumber2() / calculator.getNumber3();

        } else if (calculator.getOperation().equals("*")&& calculator.getOperation2().equals("+")) {
            return calculator.getNumber1() * calculator.getNumber2() + calculator.getNumber3();

        } else if (calculator.getOperation().equals("*")&& calculator.getOperation2().equals("-")) {
            return calculator.getNumber1() * calculator.getNumber2() - calculator.getNumber3();

        } else if (calculator.getOperation().equals("*")&& calculator.getOperation2().equals("*")) {
            return calculator.getNumber1() * calculator.getNumber2() * calculator.getNumber3();

        } else if (calculator.getOperation().equals("*")&& calculator.getOperation2().equals("/")) {
            return calculator.getNumber1() * calculator.getNumber2() / calculator.getNumber3();

//
        } else if (calculator.getOperation().equals("/")&& calculator.getOperation2().equals("-")) {
            return calculator.getNumber1() / calculator.getNumber2() - calculator.getNumber3();

        } else if (calculator.getOperation().equals("/")&& calculator.getOperation2().equals("*")) {
            return calculator.getNumber1() / calculator.getNumber2() * calculator.getNumber3();

        } else if (calculator.getOperation().equals("/")&& calculator.getOperation2().equals("/")) {
            return calculator.getNumber1() / calculator.getNumber2() / calculator.getNumber3();

        } else
            return calculator.getNumber1() / calculator.getNumber2() + calculator.getNumber3();


        }
    }


