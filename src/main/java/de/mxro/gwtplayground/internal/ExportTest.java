package de.mxro.gwtplayground.internal;

import org.timepedia.exporter.client.Export;
import org.timepedia.exporter.client.ExportPackage;
import org.timepedia.exporter.client.Exportable;
import org.timepedia.exporter.client.ExporterUtil;

import com.google.gwt.core.client.JavaScriptObject;

@ExportPackage("")
@Export
public class ExportTest implements Exportable {

    @Export
    public static void call(final JavaScriptObject func) {
        callFunc(func, null);
    }

    private final static native void callFunc(JavaScriptObject func, JavaScriptObject param)/*-{ 
                                                                                            func(param);
                                                                                            }-*/;

    @Export
    public static void test() {
        // try {
        throw new IllegalArgumentException("Exception in method.");
        // } catch (final Throwable t) {
        // throwError("Test");
        // }
    }

    @Export
    public static JavaScriptObject wrap(final JavaScriptObject obj) {
        return ExporterUtil.wrap(obj);
    }

    public ExportTest() {
        super();
    }

}
