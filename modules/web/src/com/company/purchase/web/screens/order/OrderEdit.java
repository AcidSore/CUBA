package com.company.purchase.web.screens.order;

import com.haulmont.cuba.gui.screen.*;
import com.company.purchase.entity.Order;

@UiController("purchase_Order.edit")
@UiDescriptor("order-edit.xml")
@EditedEntityContainer("orderDc")
@LoadDataBeforeShow
public class OrderEdit extends StandardEditor<Order> {
}