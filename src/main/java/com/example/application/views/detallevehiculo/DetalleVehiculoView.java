package com.example.application.views.detallevehiculo;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.formlayout.FormLayout.ResponsiveStep;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.H5;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;

@PageTitle("Detalle Vehiculo")
@Route(value = "detalle-vehiculo", layout = MainLayout.class)
@Uses(Icon.class)
public class DetalleVehiculoView extends Composite<VerticalLayout> {

    public DetalleVehiculoView() {
        FormLayout formLayout3Col = new FormLayout();
        HorizontalLayout layoutRow = new HorizontalLayout();
        H3 h3 = new H3();
        H5 h5 = new H5();
        HorizontalLayout layoutRow2 = new HorizontalLayout();
        H3 h32 = new H3();
        H5 h52 = new H5();
        HorizontalLayout layoutRow3 = new HorizontalLayout();
        H3 h33 = new H3();
        H5 h53 = new H5();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        formLayout3Col.setWidth("100%");
        formLayout3Col.setResponsiveSteps(new ResponsiveStep("0", 1), new ResponsiveStep("250px", 2),
                new ResponsiveStep("500px", 3));
        layoutRow.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow);
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.getStyle().set("flex-grow", "1");
        h3.setText("Año:");
        h3.setWidth("max-content");
        h5.setText("Anio");
        h5.setWidth("max-content");
        layoutRow2.setHeightFull();
        layoutRow.setFlexGrow(1.0, layoutRow2);
        layoutRow2.addClassName(Gap.MEDIUM);
        layoutRow2.setWidth("100%");
        layoutRow2.getStyle().set("flex-grow", "1");
        h32.setText("Placa:");
        h32.setWidth("max-content");
        h52.setText("placa");
        h52.setWidth("max-content");
        layoutRow3.setHeightFull();
        layoutRow2.setFlexGrow(1.0, layoutRow3);
        layoutRow3.addClassName(Gap.MEDIUM);
        layoutRow3.setWidth("100%");
        layoutRow3.getStyle().set("flex-grow", "1");
        h33.setText("Marca:");
        h33.setWidth("max-content");
        h53.setText("Marca");
        h53.setWidth("max-content");
        getContent().add(formLayout3Col);
        getContent().add(layoutRow);
        layoutRow.add(h3);
        layoutRow.add(h5);
        layoutRow.add(layoutRow2);
        layoutRow2.add(h32);
        layoutRow2.add(h52);
        layoutRow2.add(layoutRow3);
        layoutRow3.add(h33);
        layoutRow3.add(h53);
    }
}
