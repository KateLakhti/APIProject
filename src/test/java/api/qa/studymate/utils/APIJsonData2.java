package api.qa.studymate.utils;

public class APIJsonData2 {
    public static String createStudent(String name, String lastName, String phone, String email, String groupId, String studyFormat) {
        return "{\n" +
                "  \"name\": \""+name+"\",\n" +
                "  \"lastName\": \""+lastName+"\",\n" +
                "  \"phoneNumber\": \""+phone+"\",\n" +
                "  \"email\": \""+email+"\",\n" +
                "  \"groupId\": "+1+",\n" +
                "  \"studyFormat\": \""+studyFormat+"\"\n" +
                "}";
    }
}
