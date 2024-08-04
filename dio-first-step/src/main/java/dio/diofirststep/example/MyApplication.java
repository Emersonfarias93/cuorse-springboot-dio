package dio.diofirststep.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApplication implements CommandLineRunner {

   @Autowired
   private Calc calc;

   @Override
   public void run(String... args) throws Exception {
      System.out.println("The result: " + calc.sum(2,9));
   }
}

