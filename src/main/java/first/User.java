package first;

import java.time.LocalDateTime;

public interface User {
    String getEmail();
    String getCountry();
    LocalDateTime getLastActiveTime();
}