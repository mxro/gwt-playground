package de.mxro.gwtplayground.internal;

import delight.gwt.console.Console;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.timepedia.exporter.client.ExporterUtil;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.GWT.UncaughtExceptionHandler;

public class PlaygroundEntryPoint {

    private final native void onLoad()/*-{
                                      //$wnd.onLoad();
                                      setTimeout(function() { $wnd.onLoad(); }, 1);
                                      }-*/;

    public void onModuleLoad() {
        // GWT.create(ExportTest.class);
        ExporterUtil.exportAll();
        onLoad();

        // GWT.setUncaughtExceptionHandler(null);

        GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {

            @Override
            public void onUncaughtException(final Throwable e) {

                final StringWriter sw = new StringWriter();
                final PrintWriter pw = new PrintWriter(sw);
                e.printStackTrace(pw);
                Console.log(sw.toString());
                // Console.log(e.toString());
                throw new RuntimeException(e);
            }

        });

    }

}
