/*
 * Decompiled with CFR 0_123.
 */
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class RoomEscape2 {
    public static void main(String[] args) {
        String him_her;
        String hes_shes;
        String Hes_Shes;
        String his_her;
        String His_Her;
        String he_she;
        String himself_herself;
        String He_She;
        String Him_Her;
        Scanner s = new Scanner(System.in);
        String flashlight_name = "NA";
        String flashlight_location = "NA";
        boolean flashlight = false;
        boolean done = false;
        boolean key = false;
        boolean batteries = false;
        boolean painting_down = false;
        boolean safe_found = false;
        boolean paper = false;
        boolean sign = false;
        System.out.println();
        System.out.println("Welcome to Room Escape 2!");
        System.out.println();
        System.out.println("What is your name?");
        String user = s.nextLine();
        System.out.println();
        System.out.println("Are you a boy or a girl?");
        String sex = s.nextLine();
        System.out.println();
        if (sex.equalsIgnoreCase("boy")) {
            he_she = " he ";
            his_her = " his ";
            hes_shes = " he's ";
            him_her = " him ";
            himself_herself = " himself";
            He_She = "He ";
            His_Her = "His ";
            Hes_Shes = "He's ";
            Him_Her = "Him ";
        } else {
            he_she = " she ";
            his_her = " her ";
            hes_shes = " she's ";
            him_her = " her ";
            himself_herself = " herself";
            He_She = "She ";
            His_Her = "Her ";
            Hes_Shes = "She's ";
            Him_Her = "Her ";
        }
        System.out.println(String.valueOf(user) + " looks around the room, but sees nothing");
        System.out.println(String.valueOf(He_She) + "figures out that the lights are off.");
        System.out.println();
        System.out.println(String.valueOf(He_She) + "stands up, but bumps" + his_her + "head on the ceiling");
        System.out.println("After feeling around slowly with" + his_her + "hands," + he_she + "figures out the room is small, and contains a sign, a door,\na box, an envelope, and a painting.");
        while (!done) {
            System.out.println("What would you like to examine?");
            System.out.println("(sign, door, box, envelope, painting, self)");
            String decision = s.nextLine();
            System.out.println();
            if (decision.equalsIgnoreCase("sign")) {
                if (flashlight && !batteries) {
                    System.out.println(String.valueOf(user) + " pulls out " + flashlight_name + " but has no batteries for it!");
                }
                if (!flashlight) {
                    System.out.println(String.valueOf(user) + " examines the sign, but can't because it's too dark");
                }
                if (flashlight && batteries) {
                    System.out.println(String.valueOf(user) + " pulls " + flashlight_name + " out of" + his_her + flashlight_location + " to read the sign!");
                    System.out.println(String.valueOf(He_She) + "sees 3 numbers scattered around the sign, \"89\", \"4\", and \"55\".");
                    sign = true;
                }
            }
            if (decision.equalsIgnoreCase("door")) {
                if (!key) {
                    System.out.println(String.valueOf(user) + " jiggles the handle, but it's no use. " + He_She + "needs a key to unlock it.");
                }
                if (key) {
                    done = true;
                }
            }
            if (decision.equalsIgnoreCase("box")) {
                if (!flashlight) {
                    System.out.println("After a couple minutes of flipping the box around, " + user + " finally finds an opening and tears it open.");
                    System.out.println(String.valueOf(He_She) + "finds a flashlight inside! (batteries not included)");
                    if (batteries) {
                        System.out.println("Good thing " + user + " found batteries for it ;)");
                    }
                    System.out.println("What would you like to to name the flashlight?");
                    System.out.println("(Treat the flashlight like a person, with a person's name)");
                    flashlight_name = s.nextLine();
                    System.out.println();
                    System.out.println("Where would you like to store the flashlight?");
                    System.out.println("EX- In" + his_her + "\"pocket\"");
                    System.out.println("You can get creative with this one");
                    flashlight_location = s.nextLine();
                    System.out.println();
                    flashlight = true;
                } else {
                    System.out.println(String.valueOf(user) + " already found his good buddy " + flashlight_name + " the flashlight in the box.\nThere's nothing else in it.");
                }
            }
            if (decision.equalsIgnoreCase("envelope")) {
                if (!batteries) {
                    System.out.println(String.valueOf(user) + " opens the envelope after painstakingly finding the opening in the dark.");
                    System.out.println(String.valueOf(He_She) + " opened it and found batteries inside!");
                    if (flashlight) {
                        System.out.println("Good thing " + user + " has " + flashlight_name + " to put these in!");
                    }
                    System.out.println();
                    batteries = true;
                    System.out.println("Also," + he_she + "found a short poem on a piece of paper in the envelope, it reads:");
                    System.out.println("\"Outside bears a feast");
                    System.out.println("but not for the latest");
                    System.out.println("go greatest to least");
                    System.out.println("then least to greatest\"");
                    System.out.println("You take the paper with you, just in case.");
                    paper = true;
                }
                if (batteries) {
                    System.out.println(String.valueOf(user) + " checks the envelope again but there's nothing inside.");
                }
            }
            if (decision.equalsIgnoreCase("painting")) {
                if (!flashlight) {
                    System.out.println(String.valueOf(user) + " cannot appreciate let alone examine artwork with no lightsource.");
                }
                if (flashlight && !batteries) {
                    System.out.println("Maybe if " + user + " had some batteries to put in " + flashlight_name + he_she + "could see the painting");
                }
                if (flashlight && batteries && !painting_down) {
                    System.out.println(String.valueOf(user) + " sees the painting with " + flashlight_name + " and appreciates the artwork of his century.");
                }
                if (flashlight && batteries && !safe_found) {
                    System.out.println("Wait a second, using " + flashlight_name + ", " + user + " notices that the painting is only hanging from a nail.");
                    System.out.println("Does" + he_she + "want to take down the painting?(y/n)");
                    String painting_choice = s.nextLine();
                    if (painting_choice.equalsIgnoreCase("y")) {
                        System.out.println(String.valueOf(user) + " took the painting down");
                        if (!safe_found) {
                            System.out.println(String.valueOf(He_She) + "found a hidden 10-digit safe behind the painting!");
                        }
                        System.out.println("Would you like to attempt the code of the safe?(y/n)");
                        String code_attempt = s.nextLine();
                        if (code_attempt.equalsIgnoreCase("y")) {
                            while (code_attempt.equalsIgnoreCase("y")) {
                                String code;
                                System.out.println("Enter your 10-digit code-");
                                if (sign) {
                                    System.out.println(String.valueOf(user) + " recalls the 3 different numbers: \"89\", \"4\", and \"55\"");
                                    System.out.println();
                                }
                                if (paper) {
                                    System.out.println(String.valueOf(user) + " pulls the poem out of" + his_her + "pokcet.");
                                    System.out.println("\"go greatest to least, then least to greatest\"");
                                }
                                if ((code = s.nextLine()).equals("8955445589")) {
                                    System.out.println(String.valueOf(user) + " entered the right code! " + He_She + "found a key inside!");
                                    code_attempt = "n";
                                    key = true;
                                    continue;
                                }
                                System.out.println("Incorrect. Try again?(y/n)");
                                code_attempt = s.nextLine();
                            }
                        }
                        System.out.println(String.valueOf(user) + " hung the painting back up over the safe");
                    }
                }
            }
            if (!decision.equalsIgnoreCase("self")) continue;
            if (flashlight && !batteries) {
                System.out.println(String.valueOf(user) + " says: \"" + flashlight_name + " sure could use some batteries! Then I could see my beautiful self!\"");
            }
            if (!flashlight) {
                System.out.println(String.valueOf(user) + " cannot see anything. But I'm sure" + he_she + "looks FABULOUS.");
            }
            if (!flashlight || !batteries) continue;
            System.out.println(String.valueOf(user) + " pulls " + flashlight_name + " out of" + his_her + flashlight_location + " to examine" + himself_herself + "!");
            System.out.println(String.valueOf(He_She) + "looks down at" + himself_herself + ": \"Woah! I look grea-!...oh. nevermind I look like a piece of poo.\nGlad I examined myself.\"");
        }
        System.out.println("Congradulations, thank you for playing, and have a nice day ;)");
        System.out.println("\t\t-Matt McDade");
    }
}
