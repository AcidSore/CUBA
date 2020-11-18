package com.company.purchase.service;

import com.company.purchase.entity.Card;
import com.company.purchase.entity.Order;

public interface CalculationService {
    String NAME = "purchase_CalculationService";
    Card recalculateCostAndDiscount(Order order);
}