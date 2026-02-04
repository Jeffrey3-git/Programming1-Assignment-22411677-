public class Average{
    public double calculateClassAverage(double a,double b){
        double average = (a+b)/2;
        return average;
    }

    public double calculateClassAverage(double a,double b,double c){
        double average = (a+b+c)/3;
        return average;
    }

    public double calculateClassAverage(double[] array){
        double sum = 0;
        for (int i =0;i < array.length; i++){
            sum += array[i];
        }
        double average = sum/ array.length;
        return average;
    }
}
