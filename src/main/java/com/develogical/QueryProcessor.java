package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("romeo and juliet")) {
            return "William Shakespeare";
        }
        else if (query.toLowerCase().contains("macbeth")) {
            return "William Shakespeare";
        }
        else if (query.toLowerCase().contains("lolita")) {
            return "Vladimir Nabokov";
        }
        else if (query.toLowerCase().contains("great gatsby")) {
            return "F. Scott Fitzgerald";
        }
        else if (query.toLowerCase().contains("the catcher in the rye")) {
            return "J.D Salinger";
        }
        else if (query.toLowerCase().contains("the stranger")) {
            return "Albert Camus";
        }
        else if (query.toLowerCase().contains("all the kings men")) {
            return "Robert Penn Warren";
        }
        return "My Top five Books of all time : 1. In Search of Lost Time by Marcel Proust\n2. Ulysses by James Joyce\n3. Don Quixote by Miguel de Cervante"+
        "\n4. The Great Gatsby by F. Scott Fitzgerald\5. One Hundred Years of Solitude by Gabriel Garcia Marquez";
    }
}
