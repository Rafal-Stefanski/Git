package udemy.java_programming_masterclass.section5.exercise28;

public class PaintJob {
    public static int getBucketCount(double width, double height, double arePerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || arePerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        return (int) Math.ceil(((width * height) / arePerBucket) - extraBuckets);
    }

    public static int getBucketCount(double width, double height, double arePerBucket) {
        return getBucketCount(width, height, arePerBucket, 0);
    }

    public static int getBucketCount(double wallArea, double arePerBucket) {
        return getBucketCount(1, wallArea, arePerBucket, 0);

    }
}

