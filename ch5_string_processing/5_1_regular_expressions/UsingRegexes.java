import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsingRegexes {

    public static void main(String[] args) {
    
        String searchString = "The rain in Spain falls mainly on the plane";
        String target = "\\S.*ain\\b"; // Should match rain and Spain but not mainly
        
        Pattern pattern = Pattern.compile(target); // Construct a pattern object compiling the regex defined in target
        Matcher matcher = pattern.matcher(searchString); // Construct matcher object specifying the string to attempt to match against
        
        String matched = "";
        String index = "";
        
        while(matcher.find()) {
            System.out.println(matcher.group());
            matched += "_"+matcher.group().trim();
            index += "_"+matcher.start()+"_"+matcher.end();
        }
        
        assert(matched.trim().equals("_rain_Spain")) : "Matched strings incorrect";
        assert(index.equals("_4_8_12_17")) : "Matched indexes incorrect";// Although rain ends at 8 and Spain at 17 we include spaces at the end
    
    
    
    }
}