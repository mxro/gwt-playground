package de.mxro.gwtplayground.internal;

public class PlaygroundEntryPoint {

    private final native Object createError()/*-{
                                             return new Error();
                                             }-*/;

    private final native boolean isError(Object obj)/*-{
                                                    return obj instanceof Error;
                                                    }-*/;

    private final static native void log(String message)/*-{ 
                                                        $wnd.console.log(message);
                                                        
                                                        }-*/;

    public void onModuleLoad() {

        final Object error = createError();

        if (isError(error)) {
            log("Was an error!");
        }

    }

}
