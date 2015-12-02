package de.mxro.gwtplayground.internal;

import org.timepedia.exporter.client.ExporterUtil;

import com.google.gwt.core.client.GWT;

public class PlaygroundEntryPoint {

    private final native void onLoad()/*-{
                                      //$wnd.onLoad();
                                      setTimeout(function() { $wnd.onLoad(); }, 1);
                                      }-*/;

    public void onModuleLoad() {
        // GWT.create(ExportTest.class);
        ExporterUtil.exportAll();
        onLoad();

        GWT.setUncaughtExceptionHandler(null);

        // GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
        //
        // @Override
        // public void onUncaughtException(final Throwable e) {
        // // Console.log(e.toString());
        // throw new RuntimeException(e);
        // }
        //
        // });

    }

}
