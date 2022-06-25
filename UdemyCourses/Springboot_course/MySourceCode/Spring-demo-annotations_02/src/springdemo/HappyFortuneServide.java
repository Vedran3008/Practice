package springdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneServide implements FortuneService{

    @Override
    public String getFortune() {
        return "Today is going to be a good day";
    }
}
