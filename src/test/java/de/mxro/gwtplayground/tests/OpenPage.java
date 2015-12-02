package de.mxro.gwtplayground.tests;

import de.mxro.process.Spawn;

public class OpenPage {

    public static void main(final String[] args) {

        Spawn.sh("/opt/google/chrome/google-chrome --allow-file-access-from-files "
                + "file:///data/databases/git/appjangle-client/appjangle-javascript-local/src/main/webapp/page.html");

    }

}
