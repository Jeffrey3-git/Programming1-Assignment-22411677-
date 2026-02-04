public class Grade {
    void executeGradeReport(double score) {
        if (!validateScore(score)) {
            System.out.println("Invalid score");
            return;
        }
        char grade = calculateLetterGrade(score);
        displayPerformanceMessage(grade);
    }

    boolean validateScore(double score){
        boolean validate = (score >= 0 && score <= 100) ;
        return validate;
    }

    char calculateLetterGrade(double score){
        char grade;
        if (score >= 80) grade = 'A';
        else if (score >= 70) grade =  'B';
        else if (score >= 60) grade = 'C';
        else if (score >= 50) grade = 'D';
        else if (score >= 40) grade =  'E';
        else grade = 'F';
        return grade;
    }

    public char displayPerformanceMessage(char grade) {
        System.out.println("Final grade: " + grade);
        return grade;
    }
}
