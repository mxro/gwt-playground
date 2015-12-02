package de.mxro.gwtplayground.internal;

import com.google.gwt.core.client.GWT;

public class PlaygroundEntryPoint {

    private final native void onLoad()/*-{
                                      //$wnd.onLoad();
                                      setTimeout(function() { $wnd.onLoad(); }, 1);
                                      }-*/;

    public void onModuleLoad() {
        GWT.create(ExportTest.class);
        // ExporterUtil.exportAll();
        onLoad();

    }

}
