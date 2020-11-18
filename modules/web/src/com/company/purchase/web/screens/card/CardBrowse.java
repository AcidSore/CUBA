package com.company.purchase.web.screens.card;

import com.haulmont.cuba.gui.screen.*;
import com.company.purchase.entity.Card;

@UiController("purchase_Card.browse")
@UiDescriptor("card-browse.xml")
@LookupComponent("cardsTable")
@LoadDataBeforeShow
public class CardBrowse extends StandardLookup<Card> {
}