package org.example;
import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        GameCharacter character1 = new GameCharacter(
                "Brutus", "Warrior", 5, 120, 18, 250);
        GameCharacter character2 = new GameCharacter(
                "Elara", "Mage", 7, 80, 25, 400);

        GameCharacter character3 = new GameCharacter(
                "Rowan", "Archer", 4, 95, 16, 175);

        List<GameCharacter> characters = new ArrayList<>();

        characters.add(character1);
        characters.add(character2);
        characters.add(character3);

        System.out.println("Video Game Character Save Files");
        System.out.println("-------------------------------");
        System.out.println("\nCharacters created:");

        for (GameCharacter character : characters) {
            System.out.println(character);
        }

        try {
            FileWriter jsonWriter = new FileWriter("characters.json");
            jsonWriter.write("[\n");

            for (int i = 0; i < characters.size(); i++) {

                GameCharacter character = characters.get(i);

                jsonWriter.write("  {\n");
                jsonWriter.write("    \"name\": \""
                        + character.getName() + "\",\n");
                jsonWriter.write("    \"characterClass\": \""
                        + character.getCharacterClass() + "\",\n");
                jsonWriter.write("    \"level\": "
                        + character.getLevel() + ",\n");
                jsonWriter.write("    \"health\": "
                        + character.getHealth() + ",\n");
                jsonWriter.write("    \"attackPower\": "
                        + character.getAttackPower() + ",\n");
                jsonWriter.write("    \"gold\": "
                        + character.getGold() + "\n");

                jsonWriter.write("  }");

                if (i < characters.size() - 1) {
                    jsonWriter.write(",");
                }

                jsonWriter.write("\n");
            }

            jsonWriter.write("]\n");
            jsonWriter.close();

            System.out.println("\ncharacters.json created successfully");

        } catch (IOException e) {
            System.out.println("Error writing JSON file: "
                    + e.getMessage());
        }
        try {
            FileWriter xmlWriter = new FileWriter("characters.xml");

            xmlWriter.write("<characters>\n");

            for (GameCharacter character : characters) {

                xmlWriter.write("  <character>\n");

                xmlWriter.write("    <name>"
                        + character.getName()
                        + "</name>\n");

                xmlWriter.write("    <characterClass>"
                        + character.getCharacterClass()
                        + "</characterClass>\n");

                xmlWriter.write("    <level>"
                        + character.getLevel()
                        + "</level>\n");

                xmlWriter.write("    <health>"
                        + character.getHealth()
                        + "</health>\n");

                xmlWriter.write("    <attackPower>"
                        + character.getAttackPower()
                        + "</attackPower>\n");

                xmlWriter.write("    <gold>"
                        + character.getGold()
                        + "</gold>\n");

                xmlWriter.write("  </character>\n");
            }

            xmlWriter.write("</characters>\n");
            xmlWriter.close();

            System.out.println("characters.xml created successfully.");

        } catch (IOException e) {
            System.out.println("Error writing XML file: "
                    + e.getMessage());
        }

        System.out.println("\nReading JSON file:");

        try {
            BufferedReader jsonReader =
                    new BufferedReader(
                            new FileReader("characters.json"));

            String line;

            while ((line = jsonReader.readLine()) != null) {
                System.out.println(line);
            }

            jsonReader.close();

        } catch (IOException e) {
            System.out.println("Error reading JSON file: "
                    + e.getMessage());
        }

        System.out.println("\nReading XML file:");

        try {
            BufferedReader xmlReader =
                    new BufferedReader(
                            new FileReader("characters.xml"));

            String line;

            while ((line = xmlReader.readLine()) != null) {
                System.out.println(line);
            }

            xmlReader.close();

        } catch (IOException e) {
            System.out.println("Error reading XML file: "
                    + e.getMessage());
        }

        System.out.println("\nProgram completed successfully.");
    }
}
