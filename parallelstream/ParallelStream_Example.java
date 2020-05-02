package io.dowlath.javahidden.parallelstream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStream_Example {
    public static long checkPerformanceResult(Supplier<Integer> supplier, int noOfTimes){
        long startTime = System.currentTimeMillis();
        for(int i=0;i<noOfTimes;i++){
            supplier.get();
        }
        long endTime = System.currentTimeMillis();
        return endTime-startTime;
    }
    public static int sumSequentialStream(){
        return IntStream.rangeClosed(1,100000).sum();
    }
    public static int sumParallelStream(){
        return IntStream.rangeClosed(1,100000).parallel().sum();
    }
    public static void main(String[] args) {
        System.out.println("No of Processors ... :" + Runtime.getRuntime().availableProcessors());
        System.out.println("Sequential Result ... : "+checkPerformanceResult(ParallelStream_Example::sumSequentialStream,20));
        System.out.println("Parallel Result ... : "+checkPerformanceResult(ParallelStream_Example::sumParallelStream,20));
    }
}
