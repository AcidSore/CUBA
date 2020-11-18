package com.company.purchase.web.screens.card;

import com.haulmont.cuba.gui.screen.*;
import com.company.purchase.entity.Card;

@UiController("purchase_Card.edit")
@UiDescriptor("card-edit.xml")
@EditedEntityContainer("cardDc")
@LoadDataBeforeShow
public class CardEdit extends StandardEditor<Card> {
}