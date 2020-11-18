package com.company.purchase.web.screens.client;

import com.haulmont.cuba.gui.screen.*;
import com.company.purchase.entity.Client;

@UiController("purchase_Client.edit")
@UiDescriptor("client-edit.xml")
@EditedEntityContainer("clientDc")
@LoadDataBeforeShow
public class ClientEdit extends StandardEditor<Client> {
}