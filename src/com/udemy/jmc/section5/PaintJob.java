package com.udemy.jmc.section5;

public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int numberOfBuckets){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || numberOfBuckets < 0){
            return -1;
        }
        double areaToPain = width * height;
        int bucketsNeeded = 0;
        while(areaToPain > 0.0){
            areaToPain -= areaPerBucket;
            bucketsNeeded++;
        }
        if(bucketsNeeded - numberOfBuckets > 0){
            return bucketsNeeded - numberOfBuckets;
        } else {
            return 0;
        }
    }
    public static int getBucketCount(double width, double height, double areaPerBucket){
        return getBucketCount(width, height, areaPerBucket, 0);
    }

    public static int getBucketCount(double areaOfWall, double areaPerBucket){
        if (areaOfWall <= 0 || areaPerBucket <= 0){
            return -1;
        }
        int bucketsNeeded = 0;
        while(areaOfWall > 0.0){
            areaOfWall -= areaPerBucket;
            bucketsNeeded++;
        }
        return bucketsNeeded;
    }
}