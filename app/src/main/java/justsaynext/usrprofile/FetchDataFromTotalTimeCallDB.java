package justsaynext.usrprofile;

import java.util.Date;

/**
 * Created by lenovo on 29-04-2016.
 */
public class FetchDataFromTotalTimeCallDB {
    Date date;
    Integer number;
    String callType;
    Integer callDuration;

    public FetchDataFromTotalTimeCallDB()
    {

    }
    public FetchDataFromTotalTimeCallDB(Date date, Integer number, String callType, Integer callDuration)
    {
        this.date=date;
        this.number=number;
        this.callType=callType;
        this.callDuration=callDuration;


    }
}
