package ua.logos.formatter;

import org.springframework.format.Formatter;
import ua.logos.entity.Make;

import java.text.ParseException;
import java.util.Locale;

public class MakeFormatter implements Formatter<Make> {

    @Override
    public String print(Make make, Locale locale) {
        System.out.println("Print:" + make);
        return String.valueOf(make.getId());
    }
    @Override
    public Make parse(String s, Locale locale) throws ParseException {
        System.out.println("Parse:" + s);
        int makeid = Integer.valueOf(s);
        Make make = new Make();
        make.setId(makeid);
        return make;
    }


}
