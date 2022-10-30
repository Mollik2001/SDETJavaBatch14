package ExerciseRepl;

public interface Outputs {

    double display(double result);

    }

  class Functions implements Outputs {

      @Override
      public double display(double result) {
          return 0;
      }

      double methodLabelAdding(double firstNumber, double SecondNumber) {
          return 0;
      }

      double methodLabelSubtracting(double firstNumber, double SecondNumber) {
          return 0;
      }

      double methodLabelMultiply(double firstNumber, double SecondNumber) {
          return 0;
      }

      double methodLabelDividing(double firstNumber, double SecondNumber) {
          return 0;
      }
  }
      class Te extends Functions {
          @Override
          public double display(double result) {
              return super.display(result);
          }

    /*
   - Display method to print the result parameter as shown below in Outputs.
- Adding, Subtracting, Multiply, dividing each will have the logics to do simple mathematic operation and return the result.

Step 9: Create the main method inside the main method declare below variables.
     */

          public static void main(String[] args) {
              Te testt=new Te();
             testt.display(100.00);




          }

      }



