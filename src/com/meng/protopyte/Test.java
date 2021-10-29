package com.meng.protopyte;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Video video = new Video(1,"data");
        Video video1 = (Video) video.clone();
        System.out.println(video1.getId());

        System.out.println(video.hashCode());

        System.out.println(video1.hashCode());
    }
}
