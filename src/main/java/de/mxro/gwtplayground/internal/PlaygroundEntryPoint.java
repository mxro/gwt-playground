package de.mxro.gwtplayground.internal;

public class PlaygroundEntryPoint {

    private final native void onLoad()/*-{
                                      $wnd.onLoad();
                                      }-*/;

    public void onModuleLoad() {

        onLoad();

    }

}
