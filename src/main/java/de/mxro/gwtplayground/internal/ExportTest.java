package de.mxro.gwtplayground.internal;

import org.timepedia.exporter.client.Export;
import org.timepedia.exporter.client.ExportPackage;
import org.timepedia.exporter.client.Exportable;

@ExportPackage("")
@Export
public class ExportTest implements Exportable {

    @Export
    public static void test() {
        throw new RuntimeException("Exception in method.");
    }

}
