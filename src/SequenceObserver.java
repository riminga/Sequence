import java.time.LocalDateTime;
import java.time.LocalTime;

public class SequenceObserver {
    private static SequenceObserver instance;

  //  static {
   //     instance = new SequenceObserver();
   // }
    private LocalDateTime creationTime;
    private String loggerName;
    public SequenceObserver () {
        creationTime = LocalDateTime.now();
        this.loggerName = "LOGER" + creationTime.toString();
    }
    public static SequenceObserver getInstance(){
        if (instance == null) {
          instance = new SequenceObserver();
     }
        return instance;
    }
    public void info(String message){
        System.out.println(loggerName + " INFO [ " + LocalTime.now()+"] "+message);
    }

}
