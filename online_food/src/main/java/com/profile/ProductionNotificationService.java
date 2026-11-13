import main.java.com.NotificationService;


@Profile("prod")
@Component
public class ProductionNotificationService implements NotificationService {
        
public void sendNotification(){
        System.out.println("real customer notification message.");
}

}
