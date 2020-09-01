package com.company;

public class Box {

    private int length;
    private int width;
    private int height;

    public Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public int getVolume() {
        return this.getLength() * this.getHeight() * this.getWidth();
    }
    public boolean isCube(){
        boolean result = false;
        if (length == width && width == height){
            result = true;
        }
        return result;
    }
    @Override
    public String toString() {
        return "Box{" + "\n" +
                "length=" + length + "\n" +
                "width=" + width + "\n" +
                "height=" + height + "\n" +
                "Volume=" + this.getVolume() + "\n" +
                "isCube=" + this.isCube() +
                '}';
    }
    public boolean isValid(){
        return false;       //TODO insert logic
    }

}
