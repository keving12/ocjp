import java.util.Locale;

public class UsingLocales {

    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        // Language of this locale
        System.out.println(locale.getLanguage());
        System.out.println(locale.getCountry());

        buildLocale();
        incorrectValues();
    
    }
    
    public static void buildLocale() {
        Locale.Builder builder = new Locale.Builder();
        builder.setLanguage("en");
        builder.setRegion("UK");
        Locale locale = builder.build();
        
        System.out.printf("Built Locale, language: %s, region: %s\n", locale.getLanguage(), locale.getCountry());
        System.out.printf("Display names of locale - Country : %s, Language : %s, Name : %s\n", 
                                locale.getDisplayCountry(), 
                                locale.getDisplayLanguage(),
                                locale.getDisplayName());
    }
    
    public static void incorrectValues() {
        Locale locale = new Locale("foo", "bar");
        System.out.printf("Country: %s, language: %s\n", locale.getCountry(), locale.getLanguage());
    }
}