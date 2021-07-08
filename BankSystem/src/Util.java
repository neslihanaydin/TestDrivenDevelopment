import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Util {

    public static Date StringToDate(String date){
        try{
            Date convertedDate=new SimpleDateFormat("yyyy-MM-dd").parse(date);
            return convertedDate;
        }
        catch (Exception e){
            return null;
        }
    }

    public static Date addDate(Date date, Integer addingDay){
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DATE, addingDay);
        return c.getTime();
    }

    public static String initializeDate(){
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String dateStr = dateFormat.format(date);
        return dateStr;
    }
}
