import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
public class FormatNumberForLocale {

    public static void main(String[] args) {
        NumberFormat frenchLocaleInstance = NumberFormat.getInstance(Locale.FRANCE);
        Locale.setDefault(Locale.UK);
        NumberFormat defaultLocaleInstance = NumberFormat.getInstance();
        NumberFormat integerInstance = NumberFormat.getIntegerInstance();
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        
        // This will print the number with a space between thousands and a comma where we would have a decimal place
        System.out.println(defaultLocaleInstance.format(12345.6789));
        System.out.println(frenchLocaleInstance.format(12345.6789));
        // Integer instance only prints out whole number rounding any floating point value
        System.out.println(integerInstance.format(12345.6789));
        System.out.println(numberInstance.format(12345.6789));
        // Formats the number with a percent sign on the end
        System.out.println(percentInstance.format(0.12));
        // Formats the number to two decimal places and prefixes the currency symbol appropriate for the locale
        System.out.println(currencyInstance.format(123.1234));
        
        
        try {
            System.out.println(defaultLocaleInstance.parse("12345.6789"));    
        }
        catch(ParseException e) {
            
        }
        
    }
}