public class TextBlock {
    public static void main(String[] args) {

        String json = """
                {
                    "name": "John Doe",
                    "age": 30,
                    "city": "New York",
                    "isStudent": false,
                    "courses": [
                        "Mathematics",
                        "Computer Science",
                        "History"
                    ]
                }
                """;

        System.out.println(json);
    }
}