import java.util.Scanner;
import java.util.Random;

public class EnhancedChatbot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String userInput;
        System.out.println("Hello! I'm ChatBot. How can I help you today?");
        
        // Chat loop
        while (true) {
            System.out.print("You: ");
            userInput = scanner.nextLine().toLowerCase();
            
            // Check for different responses
            if (userInput.contains("hello") || userInput.contains("hi")) {
                System.out.println("ChatBot: Hi there! How’s your day going?");
            } else if (userInput.contains("how are you")) {
                System.out.println("ChatBot: I'm just a bot, but I'm doing great! Thanks for asking.");
            } else if (userInput.contains("what's your name")) {
                System.out.println("ChatBot: I’m ChatBot, your friendly virtual assistant. What's yours?");
            } else if (userInput.contains("tell me a joke")) {
                String[] jokes = {
                    "Why did the scarecrow win an award? Because he was outstanding in his field!",
                    "I told my computer I needed a break, and now it won’t stop sending me beach pictures.",
                    "Why don't scientists trust atoms? Because they make up everything!"
                };
                System.out.println("ChatBot: " + jokes[random.nextInt(jokes.length)]);
            } else if (userInput.contains("what is your favorite color")) {
                System.out.println("ChatBot: I like blue... but, you know, I can't actually see colors.");
            } else if (userInput.contains("who made you") || userInput.contains("who created you")) {
                System.out.println("ChatBot: I was created by a clever programmer who loves making things come to life!");
            } else if (userInput.contains("tell me something interesting")) {
                String[] facts = {
                    "Did you know honey never spoils? Archaeologists have found pots of honey in ancient tombs that are over 3,000 years old!",
                    "Octopuses have three hearts! Two pump blood to the gills, and one pumps it to the rest of the body.",
                    "Bananas are berries, but strawberries aren’t! Isn’t that a twist?"
                };
                System.out.println("ChatBot: " + facts[random.nextInt(facts.length)]);
            } else if (userInput.contains("help")) {
                System.out.println("ChatBot: Sure! I can tell you a joke, share a fun fact, or just chat about simple stuff.");
            } else if (userInput.contains("exit") || userInput.contains("bye")) {
                System.out.println("ChatBot: Goodbye! It was nice chatting with you. Have a fantastic day!");
                break;
            } else {
                System.out.println("ChatBot: Hmm, I’m not sure how to respond to that. Try asking me something fun!");
            }
        }
        
        scanner.close();
    }
}
