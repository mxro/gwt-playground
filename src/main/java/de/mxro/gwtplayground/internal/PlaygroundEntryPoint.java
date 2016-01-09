package de.mxro.gwtplayground.internal;

import delight.gwt.console.Console;

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
        // onLoad();

        GWT.setUncaughtExceptionHandler(null);

        /*
         * GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
         * 
         * @Override public void onUncaughtException(final Throwable e) {
         * 
         * Console.log(Arrays.toString(e.getStackTrace())); //
         * Console.log(e.toString()); // throw new RuntimeException(
         * "Background excpetion", e); throwError(e.getMessage()); }
         * 
         * });
         */

        try {
            throwError("Hello!");
        } catch (final Throwable t) {
            Console.log(t.getMessage());
        }

    }

    private final static native void throwError(String message)/*-{ 
                                                               // $wnd.console.log(t);
                                                               var e = new Error(message);
                                                               
                                                               throw e;
                                                               }-*/;

}
