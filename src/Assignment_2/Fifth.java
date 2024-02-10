package Assignment_2;
import java.util.*;
public class Fifth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your height (in inches): ");
        float heightInInches = scanner.nextFloat();

        System.out.print("Enter your weight (in pounds): ");
        float weightInPounds = scanner.nextFloat();
        BMICalculator(heightInInches, weightInPounds);
    }
    public static void BMICalculator(float heightInInches, float weightInPounds) {

        float heightInMeters = heightInInches * 0.0254f;
        float weightInKg = weightInPounds * 0.453592f;

        float bmi = weightInKg / (heightInMeters * heightInMeters);

        if (bmi <= 16.00) {
            System.out.println("Your BMI is " + bmi + ". You are in the starvation category.");
        } else if (bmi <= 16.99) {
            System.out.println("Your BMI is " + bmi + ". You are in the emaciation category.");
        } else if (bmi <= 18.49) {
            System.out.println("Your BMI is " + bmi + ". You are in the underweight category.");
        } else if (bmi <= 22.99) {
            System.out.println("Your BMI is " + bmi + ". You are in the normal, low range category.");
        } else if (bmi <= 24.99) {
            System.out.println("Your BMI is " + bmi + ". You are in the normal high range category.");
        } else if (bmi <= 27.49) {
            System.out.println("Your BMI is " + bmi + ". You are in the overweight low range category.");
        } else if (bmi <= 29.99) {
            System.out.println("Your BMI is " + bmi + ". You are in the overweight high range category.");
        } else if (bmi <= 34.99) {
            System.out.println("Your BMI is " + bmi + ". You are in the 1st degree obesity category.");
        } else if (bmi <= 39.99) {
            System.out.println("Your BMI is " + bmi + ". You are in the 2nd degree obesity category.");
        } else {
            System.out.println("Your BMI is " + bmi + ". You are in the 3rd degree obesity category.");
        }
    }
}






