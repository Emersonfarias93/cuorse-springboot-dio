package dio.diofirststep.example;

import org.springframework.stereotype.Component;

@Component
public class Calc {
    public int sum(int number1, int number2){
        return number1 + number2;
    }
}
