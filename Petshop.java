import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Petshop {
    public static void main(String[] args){ 
        Scanner scan = new Scanner(System.in);
        ArrayList<Dog> dogList = new ArrayList<>();
        boolean continueInput = true;

        while (continueInput) {
            System.out.println("Enter the breed of dog (Pomeranian, Airedale Terrier, Bichon Frise, Doberman, Bulldog):");
            String breed = scan.nextLine();

            // Collect input and create Dog object
            Dog newDog = createDog(breed, scan);
            if (newDog != null) {
                dogList.add(newDog);
            }

            System.out.println("Do you want to input another dog? (ya/no):");
            String input = scan.nextLine().toLowerCase();
            continueInput = input.equals("ya");
        }
                // Write dog data to a text file
            writeDogDataToFile(dogList);
        }
        
            // Helper method to create a Dog object based on user input
            private static Dog createDog(String breed, Scanner scan) {
            System.out.println("Enter " + breed + " details:");
        
                System.out.println("Enter dog's name:");
                String Name = scan.nextLine();
        
                System.out.println("Enter dog's age:");
                int Age = scan.nextInt();
                scan.nextLine();
        
                System.out.println("Enter dog's size:");
                String Ukuran = scan.nextLine();
        
                System.out.println("Enter dog's color:");
                String ColorFur = scan.nextLine();
        
                System.out.println("Enter dog's type of fur:");
                String TypeoFur = scan.nextLine();
        
                System.out.println("Enter dog's gender:");
                String Gender = scan.nextLine();
        
                System.out.println("Does the dog eat (true/false):");
                boolean Makansehari = scan.nextBoolean();
                scan.nextLine();
        
                // Create a specific Dog subclass based on breed
                switch (breed) {
                    case "Airedale Terrier":
                        return new AiredaleTerrier(Name, Age, Ukuran, ColorFur, TypeoFur, Gender, Makansehari);
                    case "Bichon Frise":
                        return new BichonFrise(Name, Age, Ukuran, ColorFur, TypeoFur, Gender, Makansehari);
                    case "Doberman":
                        return new Doberman(Name, Age, Ukuran, ColorFur, TypeoFur, Gender, Makansehari);
                    case "Bulldog":
                        return new Bulldog(Name, Age, Ukuran, ColorFur, TypeoFur, Gender, Makansehari);
                    case "Pomeranian":
                        return new Pomeranian(Name, Age, Ukuran, ColorFur, TypeoFur, Gender, Makansehari);
                    default:
                        return null;
                }
            }
        
            // Helper method to write dog data to a text file
            private static void writeDogDataToFile(ArrayList<Dog> dogList) {
                try {
                    FileWriter writer = new FileWriter("dogs.txt");

                    writer.write("----------------------------------------------------------------------------------------------------------=-----------------------------------\n");
                    writer.write(String.format("| %-15s | %-10s | %-5s | %-10s | %-10s | %-10s | %-10s | %-8s | %-15s |%n",
                    "Breed", "Name", "Age", "Size", "Color", "Fur Type", "Gender", "Eats Daily", "Sudah Makan Hari Ini?"));
                    writer.write("----------------------------------------------------------------------------------------------------------=-----------------------------------\n");
                    for (Dog dog : dogList) {
                        String sudahMakanHariIni = dog.getMakanSehari() ? "Masuk kandang dan tidur" : "Mengonggong Keras";
                        switch (dog.getUkuran().toLowerCase()) {
                            case "Kecil" :
                            writer.write(String.format("| %-15s | %-10s | %-5d | %-10s | %-10s | %-10s | %-10s | %-8s | %-15s |%n",dog.getClass().getSimpleName(), dog.getName(), dog.getAge(),dog.getUkuran(), dog.getColorFur(), dog.getTypeoFur(), dog.getGender(), dog.getMakanSehari() ? "1 Kali makan" : "1 Kali makan", sudahMakanHariIni));;
                                break;
                            case "kecil" :
                                writer.write(String.format("| %-15s | %-10s | %-5d | %-10s | %-10s | %-10s | %-10s | %-8s | %-15s |%n",dog.getClass().getSimpleName(), dog.getName(), dog.getAge(),dog.getUkuran(), dog.getColorFur(), dog.getTypeoFur(), dog.getGender(), dog.getMakanSehari() ? "1 Kali makan" : "1 Kali makan", sudahMakanHariIni));;
                                break;
                            case "Sedang":
                                writer.write(String.format("| %-15s | %-10s | %-5d | %-10s | %-10s | %-10s | %-10s | %-8s | %-15s |%n",dog.getClass().getSimpleName(), dog.getName(), dog.getAge(),dog.getUkuran(), dog.getColorFur(), dog.getTypeoFur(), dog.getGender(), dog.getMakanSehari() ? "2 Kali makan" : "2 Kali makan", sudahMakanHariIni));;
                                break;
                            case "sedang":
                                writer.write(String.format("| %-15s | %-10s | %-5d | %-10s | %-10s | %-10s | %-10s | %-8s | %-15s |%n",dog.getClass().getSimpleName(), dog.getName(), dog.getAge(),dog.getUkuran(), dog.getColorFur(), dog.getTypeoFur(), dog.getGender(), dog.getMakanSehari() ? "2 Kali makan" : "2 Kali makan", sudahMakanHariIni));;
                                break;
                            case "Besar":
                                writer.write(String.format("| %-15s | %-10s | %-5d | %-10s | %-10s | %-10s | %-10s | %-8s | %-15s |%n",dog.getClass().getSimpleName(), dog.getName(), dog.getAge(),dog.getUkuran(), dog.getColorFur(), dog.getTypeoFur(), dog.getGender(), dog.getMakanSehari() ? "3 Kali makan" : "3 Kali makan", sudahMakanHariIni));;
                                break;
                            case "besar":
                                writer.write(String.format("| %-15s | %-10s | %-5d | %-10s | %-10s | %-10s | %-10s | %-8s | %-15s |%n",dog.getClass().getSimpleName(), dog.getName(), dog.getAge(),dog.getUkuran(), dog.getColorFur(), dog.getTypeoFur(), dog.getGender(), dog.getMakanSehari() ? "3 Kali makan" : "3 Kali makan", sudahMakanHariIni));;
                                break;
                            default:
                                System.out.printf("| %-15s | %-10s | %-10s | %-15s | %-15s | %-10s | %-15s | %-15s | \n", dog.getClass().getSimpleName(), dog.getName(), dog.getAge(), dog.getUkuran(), dog.getColorFur(), dog.getTypeoFur(), dog.getGender(), dog.getMakanSehari() ? "Ya" : "Tidak", sudahMakanHariIni);
                                break;
                        }
                        writer.write("----------------------------------------------------------------------------------------------------=-----------------------------------\n");


                    }
                    writer.close();
                    System.out.println("Dog data saved to dogs.txt");
                } catch (IOException e) {
                    System.out.println("Error writing to file: " + e.getMessage());
            }

            System.out.println("Reading dog data from dogs.txt and displaying as a table:");
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.printf("| %-15s | %-10s | %-10s | %-15s | %-15s | %-10s | %-15s | %-15s | %-20s | \n",
                "Breed", "Name", "Age", "Size", "Color", "Fur Type", "Gender", "Eats Daily", "Sudah Makan Hari Ini?");
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------");
            for (Dog dog : dogList) {
            String sudahMakanHariIni = dog.getMakanSehari() ? "Masuk kandang dan tidur" : "Mengonggong Keras";
            switch (dog.getUkuran()) {
                case "Kecil" :
                    System.out.printf("| %-15s | %-10s | %-10s | %-15s | %-15s | %-10s | %-15s | %-15s | %-20s |\n", dog.getClass().getSimpleName(), dog.getName(), dog.getAge(), dog.getUkuran(), dog.getColorFur(), dog.getTypeoFur(), dog.getGender(), dog.getMakanSehari() ? "1 Kali makan" : "1 Kali makan", sudahMakanHariIni);
                    break;
                case "kecil" :
                    System.out.printf("| %-15s | %-10s | %-10s | %-15s | %-15s | %-10s | %-15s | %-15s | %-20s |\n", dog.getClass().getSimpleName(), dog.getName(), dog.getAge(), dog.getUkuran(), dog.getColorFur(), dog.getTypeoFur(), dog.getGender(), dog.getMakanSehari() ? "1 Kali makan" : "1 Kali makan", sudahMakanHariIni);
                    break;
                case "Sedang":
                    System.out.printf("| %-15s | %-10s | %-10s | %-15s | %-15s | %-10s | %-15s | %-15s | %-20s |\n", dog.getClass().getSimpleName(), dog.getName(), dog.getAge(), dog.getUkuran(), dog.getColorFur(), dog.getTypeoFur(), dog.getGender(), dog.getMakanSehari() ? "2 Kali makan" : "2 Kali makan", sudahMakanHariIni);
                    break;
                case "sedang":
                    System.out.printf("| %-15s | %-10s | %-10s | %-15s | %-15s | %-10s | %-15s | %-15s | %-20s |\n", dog.getClass().getSimpleName(), dog.getName(), dog.getAge(), dog.getUkuran(), dog.getColorFur(), dog.getTypeoFur(), dog.getGender(), dog.getMakanSehari() ? "2 Kali makan" : "2 Kali makan", sudahMakanHariIni);
                    break;
                case "Besar":
                    System.out.printf("| %-15s | %-10s | %-10s | %-15s | %-15s | %-10s | %-15s | %-15s | %-20s | \n", dog.getClass().getSimpleName(), dog.getName(), dog.getAge(), dog.getUkuran(), dog.getColorFur(), dog.getTypeoFur(), dog.getGender(), dog.getMakanSehari() ? "3 Kali makan" : "3 Kali makan", sudahMakanHariIni);
                    break;
                case "besar":
                    System.out.printf("| %-15s | %-10s | %-10s | %-15s | %-15s | %-10s | %-15s | %-15s | %-20s |\n", dog.getClass().getSimpleName(), dog.getName(), dog.getAge(), dog.getUkuran(), dog.getColorFur(), dog.getTypeoFur(), dog.getGender(), dog.getMakanSehari() ? "3 Kali makan" : "3 Kali makan", sudahMakanHariIni);
                    break;
                default:
                    System.out.printf("| %-15s | %-10s | %-10s | %-15s | %-15s | %-10s | %-15s | %-15s | %-20s |\n", dog.getClass().getSimpleName(), dog.getName(), dog.getAge(), dog.getUkuran(), dog.getColorFur(), dog.getTypeoFur(), dog.getGender(), dog.getMakanSehari() ? "Ya" : "Tidak", sudahMakanHariIni);
                    break;
            }
            printDivider();
        }   
    }
    private static void printDivider() {
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------");
    }
 }
        

    

