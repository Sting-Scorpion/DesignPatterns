package StructuralPatterns.BridgePattern.example;

public class RMVBFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("++ rmvb file: " + fileName);
    }
}
