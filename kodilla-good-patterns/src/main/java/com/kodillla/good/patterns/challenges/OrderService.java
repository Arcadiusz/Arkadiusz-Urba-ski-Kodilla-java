package com.kodillla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface OrderService {

    boolean order(User user, LocalDateTime dateOfOrder, int itemID );

}
