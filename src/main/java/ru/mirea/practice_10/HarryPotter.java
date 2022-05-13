package ru.mirea.practice_10;

import org.springframework.stereotype.Component;

@Component("harry potter")
public class HarryPotter implements MagicianInterface {
    @Override
    public String doMagic() {
        return "Expelliarmus";
    }
}
