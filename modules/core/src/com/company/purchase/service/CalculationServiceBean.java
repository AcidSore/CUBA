package com.company.purchase.service;

import com.company.purchase.entity.Card;
import com.company.purchase.entity.Client;
import com.company.purchase.entity.Order;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service(CalculationService.NAME)
public class CalculationServiceBean implements CalculationService {
    private static final BigDecimal SMALL = BigDecimal.valueOf(5000);
    private static final BigDecimal MIDDLE = BigDecimal.valueOf(5000);
    private static final BigDecimal BIG = BigDecimal.valueOf(5000);

    @Override
    public Card recalculateCostAndDiscount(Order order) {
        Client client = order.getClient();
        Card card = client.getCardId();
        card.setTotalCost(card.getTotalCost().add(order.getCost()));
        if(card.getTotalCost().compareTo(SMALL) < 0){
            card.setDiscount(BigDecimal.valueOf(0));
        }
        else{
            if(card.getTotalCost().compareTo(SMALL) > 0 & card.getTotalCost().compareTo(MIDDLE) <= 0){
                card.setDiscount(BigDecimal.valueOf(0.05));
            }
            else {
                if(card.getTotalCost().compareTo(BIG) > 0){
                    card.setDiscount(BigDecimal.valueOf(0.1));
                }
            }
        }
        return card;
    }
}