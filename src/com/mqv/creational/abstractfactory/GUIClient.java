package com.mqv.creational.abstractfactory;

public class GUIClient {
    public static void main(String[] args) {
        var os = getOS();
        var guiClient = switch (os) {
            case MACOS -> new MacUISystemFactory();
            case WINDOW -> new WindowUISystemFactory();
            default -> null;
        };

        if (guiClient != null) {
            var button = guiClient.createButton();
            var dialog = guiClient.createDialog(450, 600);
            var text = guiClient.createText("Mai Quoc Viet");

            button.onDraw();
            dialog.onDraw();
            text.onDraw();
        } else {
            System.out.println("Your operating system is not supported to create ui component!!!!");
        }
    }

    private static OS getOS() {
        var os = System.getProperty("os.name").toLowerCase();
        if (os.contains("win")) {
            return OS.WINDOW;
        } else if (os.contains("nix") || os.contains("nux") || os.contains("aix")) {
            return OS.LINUX;
        } else if (os.contains("mac")) {
            return OS.MACOS;
        }
        return OS.UNKNOWN;
    }
}

enum OS {
    WINDOW,
    MACOS,
    LINUX,
    UNKNOWN
}