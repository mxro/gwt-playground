package de.mxro.gwtplayground.internal;

import org.timepedia.exporter.client.ExporterUtil;

public class PlaygroundEntryPoint {

    private final native void onLoad()/*-{
                                      //$wnd.onLoad();
                                      setTimeout(function() { $wnd.onLoad(); }, 1);
                                      }-*/;

    public void onModuleLoad() {
        // GWT.create(ExportTest.class);
        ExporterUtil.exportAll();
        onLoad();

    }

}
