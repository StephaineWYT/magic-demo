package wen.magic.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"wen.magic.demo"})
public class MagicDemoApplication {
  public static void main(String[] args) {
    SpringApplication.run(MagicDemoApplication.class, args);
  }
}
