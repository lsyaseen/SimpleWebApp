package com.develogical.app;

public class QueryProcessor {
    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.toLowerCase().contains("someone")) {
            return "someone else (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.toLowerCase().contains("ada")) {
            return "Augusta Ada King, Countess of Lovelace (0 December 1815 – 27 November 1852) " +
                    "was an English mathematician and writer, chiefly known for her work on " +
                    "Charles Babbage's proposed mechanical general-purpose computer, the Analytical Engine.";
        }
        return "";
    }
}
