package StructuralPatterns.BridgePattern.example;

public abstract class OperatingSystem {
    protected VideoFile videoFile;

    public void setVideoFile(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    public abstract void play(String fileName);
}
