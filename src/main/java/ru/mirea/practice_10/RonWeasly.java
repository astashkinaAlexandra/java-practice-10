package ru.mirea.practice_10;

import org.springframework.stereotype.Component;

@Component("ron weasly")
public class RonWeasly implements MagicianInterface {
    @Override
    public String doMagic() {
        return "wingardium leviosa";
    }
}
