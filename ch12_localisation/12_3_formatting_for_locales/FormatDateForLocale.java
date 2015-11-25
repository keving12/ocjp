import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Calendar;

public class FormatDateForLocale {

    public static void main(String[] args) {
        formatDate();
        formatDateTime();
        formatTime();    
    }
    
    public static void formatDate() {
        // This one formates the date and time
        DateFormat format = DateFormat.getInstance();
        System.out.println(format.format(new Date()));
        // Only formats the date
        format = DateFormat.getDateInstance();
        System.out.println(format.format(new Date()));
        // Format in short form - dd/mm/yy
        format = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println(format.format(new Date()));
        // Format in medium form - MON dd, yyyy
        format = DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println(format.format(new Date()));
        // Format in long form - MONTH dd, yyyy
        format = DateFormat.getDateInstance(DateFormat.LONG);
        System.out.println(format.format(new Date()));
        // Format in full form - DAY, MONTH dd, yyyy
        format = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(format.format(new Date()));
        // Format date from a Calendar
        format = DateFormat.getDateInstance(DateFormat.MEDIUM);
        Calendar calendar = Calendar.getInstance();
        calendar.set(2015, 10, 25);
        System.out.println(format.format(calendar.getTime()));
        
        
        System.out.println("======= END OF DATE FORMATTING =======");
    }
    
    public static void formatDateTime() {
        DateFormat format = DateFormat.getDateTimeInstance();
        System.out.println(format.format(new Date()));
        format = DateFormat.getDateTimeInstance();
        System.out.println(format.format(new Date()));
        format = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.FULL);
        System.out.println(format.format(new Date()));
        format = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.LONG, Locale.US);
        System.out.println(format.format(new Date()));
        
        System.out.println("======= END OF DATE TIME FORMATTING =======");
    }
    
    public static void formatTime() {
        DateFormat format = DateFormat.getTimeInstance();
        System.out.println(format.format(new Date()));
        format = DateFormat.getTimeInstance(DateFormat.FULL);
        System.out.println(format.format(new Date()));
        format = DateFormat.getTimeInstance(DateFormat.LONG, Locale.FRENCH);
        System.out.println(format.format(new Date()));
        
        System.out.println("======= END OF TIME FORMATTING =======");
    }
}