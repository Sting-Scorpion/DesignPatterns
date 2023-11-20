package StructuralPatterns.BridgePattern.example;

public class Windows extends OperatingSystem{
    @Override
    public void play(String fileName) {
        System.out.println("[Windows system]:");
        videoFile.decode(fileName);
    }
}
