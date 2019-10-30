package udemy.java_programming_masterclass.section5.exercise28;

public class PaintJob {
    public static int getBucketCount(double width, double height, double arePerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || arePerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        double wallArea = width * height;
        double bucketsNeeded = wallArea / arePerBucket;
        double bucketCount = (bucketsNeeded - extraBuckets);
        return (int) Math.ceil(bucketCount);
    }

    public static int getBucketCount(double width, double height, double arePerBucket) {
        if (width <= 0 || height <= 0 || arePerBucket <= 0) {
            return -1;
        }
        double wallArea = width * height;
        double bucketCount = wallArea / arePerBucket;
        return (int) Math.ceil(bucketCount);
    }

    public static int getBucketCount(double wallArea, double arePerBucket) {
        if (wallArea <= 0 || arePerBucket <= 0) {
            return -1;
        }
        double bucketCount = wallArea / arePerBucket;
        return (int) Math.ceil(bucketCount);
    }
}

// Buchalka solution

//    public static int getBucketCount(double area, double areaPerBucket) {
//        return getBucketCount(1,area,areaPerBucket,0);
//    }
//    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
//        if (Math.min(width,Math.min(height,areaPerBucket))<=0||extraBuckets<0){
//            return -1;
//        }
//        return (int)Math.ceil((width*height)/areaPerBucket-extraBuckets);
//    }
//
//    public static int getBucketCount(double width, double height, double areaPerBucket){
//        return getBucketCount(width,height,areaPerBucket,0);
//    }


