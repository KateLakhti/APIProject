package api.qa.cashwise.utils;

public class APIJsonData {

    public static String createClient(String company_name, String email){
        return "{\n" +
                "  \"company_name\": \""+company_name+"\",\n" +
                "  \"client_name\": \"Kate Lakhtionova\",\n" +
                "  \"email\": \""+email+"\",\n" +
                "  \"phone_number\": \"2315467865\",\n" +
                "  \"address\": \"1235 Street\",\n" +
                "  \"tags_id\": [\n" +
                "   98\n" +
                "  ]\n" +
                "}";
    }
}
//+email+