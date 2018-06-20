package com.kodillla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface OrderRepository {

    boolean createOrder(User user, LocalDateTime dateOfOrder, int itemID);
}
