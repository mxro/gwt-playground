package de.mxro.gwtplayground.internal;

import delight.gwt.console.Console;

import java.util.Arrays;

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

                Console.log(Arrays.toString(e.getStackTrace()));
                // Console.log(e.toString());
                throw new RuntimeException(e);
            }

        });

    }

}
