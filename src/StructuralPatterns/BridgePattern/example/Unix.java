package StructuralPatterns.BridgePattern.example;

public class Unix extends OperatingSystem{
    @Override
    public void play(String fileName) {
        System.out.println("[UNIX system]:");
        videoFile.decode(fileName);
    }
}
