package ExerciseRepl;

class Countries {
    String nameOfTheCountry;
    String capital;
    long populationSize;

    Countries(String nameOfTheCountry, String capital, long populationSize) {
        this.nameOfTheCountry = nameOfTheCountry;
        this.capital = capital;
        this.populationSize = populationSize;
    }

   public void printInfo() {
        System.out.println("The capital of " + nameOfTheCountry + " is " + capital + " and the population is " + populationSize);
    }

    }

