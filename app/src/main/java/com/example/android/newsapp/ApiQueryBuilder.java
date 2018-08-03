package com.example.android.newsapp;


public class ApiQueryBuilder {

    /**
     * This section is informed by the app built by Stephen Wood - https://github.com/doowtnehpets/BitBacklashNewsfeed
     */
    // sections
    public static final String CULTURE = "&section=culture", SCIENCE = "&section=science",
            TRAVEL_UK = "&tag=travel/uk", TECH = "&tag=technology/technology", INTRO = "";

    // API query base note it is ordered by latest publications w/size limit of 3 articles
    public static final String API_URL =
            "https://content.guardianapis.com/search?q=editions?q=uk&order-by=newest&page-size=4&show-fields=thumbnail%2Cbyline";

    // decided against hiding this information for now
    private static final String API_KEY = "&api-key=f33fec42-5b38-4790-a4b7-960bdea7b568";

    /**
     * mimics the way QueryUtils reads an InputStream  - see method QueryUtils.readInputStream
     * @param tag
     * @return
     */
    public static String apiQuery(String tag) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(API_URL);
        if (tag != null){
            stringBuilder.append(tag);
        }
        stringBuilder.append(API_KEY);

        return stringBuilder.toString();
    }
}
