package StructuralPatterns.BridgePattern.example;

public class AVIFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("++ avi video: "+ fileName);
    }
}
