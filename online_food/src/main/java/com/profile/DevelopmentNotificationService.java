

@Profile("dev")
@Component
public class DevelopmentNotificationService implements NotificationService {

        public  void sendNotification(){
                System.out.println("test notification message.");
        }
        
}
