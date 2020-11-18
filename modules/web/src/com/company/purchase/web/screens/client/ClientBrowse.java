package com.company.purchase.web.screens.client;

import com.haulmont.cuba.gui.screen.*;
import com.company.purchase.entity.Client;

@UiController("purchase_Client.browse")
@UiDescriptor("client-browse.xml")
@LookupComponent("clientsTable")
@LoadDataBeforeShow
public class ClientBrowse extends StandardLookup<Client> {
}