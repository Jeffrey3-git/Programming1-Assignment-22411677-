public class Main {
    public static void main(String[] args){

        Grade studentGrade = new Grade();
        studentGrade.executeGradeReport(73);

        Average report = new Average();
        System.out.println("The average of two is: " + report.calculateClassAverage(98,58));
        System.out.println("The average of three is: " + report.calculateClassAverage(93,93,52));
        double[] scores = {56,76,99,87,96};
        System.out.println("The average of the array is: " + report.calculateClassAverage(scores));

    }
}