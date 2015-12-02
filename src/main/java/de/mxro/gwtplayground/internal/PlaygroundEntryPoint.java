package de.mxro.gwtplayground.internal;

public class PlaygroundEntryPoint {

    private final native void onLoad()/*-{
                                      $wnd.onLoad();
                                      //setTimeout(function() { $wnd.onLoad(); }, 1);
                                      }-*/;

    public void onModuleLoad() {

        onLoad();

    }

}
