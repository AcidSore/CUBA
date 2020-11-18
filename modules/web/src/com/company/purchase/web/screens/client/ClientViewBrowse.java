package com.company.purchase.web.screens.client;

import com.haulmont.cuba.gui.screen.*;
import com.company.purchase.entity.Client;

@UiController("purchase_Client_View.browse")
@UiDescriptor("client-view-browse.xml")
@LookupComponent("clientsTable")
@LoadDataBeforeShow
public class ClientViewBrowse extends StandardLookup<Client> {
}