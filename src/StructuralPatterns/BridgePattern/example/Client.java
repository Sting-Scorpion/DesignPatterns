package StructuralPatterns.BridgePattern.example;

public class Client {
    public static void main(String[] args) {
        OperatingSystem os = new Windows();
        os.setVideoFile(new AVIFile());

        os.play("Superman");
    }
}
