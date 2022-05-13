package ru.mirea.practice_10;

import org.springframework.stereotype.Component;

@Component("voldemort")
public class Voldemort implements MagicianInterface {
    @Override
    public String doMagic() {
        return "AvadaKedavra!";
    }
}
