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
        else if (query.toLowerCase().contains("The Great Gatsby")) {
            return "F. Scott Fitzgerald";
        }
        return "";
    }
}
