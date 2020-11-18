package com.company.purchase.web.screens.order;

import com.haulmont.cuba.gui.screen.*;
import com.company.purchase.entity.Order;

@UiController("purchase_Order.browse")
@UiDescriptor("order-browse.xml")
@LookupComponent("ordersTable")
@LoadDataBeforeShow
public class OrderBrowse extends StandardLookup<Order> {
}