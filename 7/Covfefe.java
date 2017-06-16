public class Covfefe {

    public static void main(String[] args){
        String ogString = "my  coverage";
        System.out.println(ogString + " goes to " + sol1(ogString));
        ogString = "no fefe";
        System.out.println(ogString + " goes to " + sol1(ogString));
    }

    public static String sol3(String str){
        return (str.contains("coverage")) ?
            str.replaceAll("coverage","covfefe") :
            str + " covfefe";
    }

    public static String sol2(String str){
        String result = "";
        if (str.contains("coverage"))
            result = str.replaceAll("coverage", "covfefe");
        else
            result = str + " covfefe";
        return result;
        
    }

    public static String sol1(String str){
        String result = str;
        StringBuilder builder = new StringBuilder();
        
        result = str.replaceAll(" ", "#_#");
        String[] words = result.split("#");
        
        int wordCount = words.length;
        int covfefeCount = 0;
        
        for (int i = 0; i < wordCount; i++) {
            if (words[i].equals("coverage")) {
                builder.append("covfefe");
                covfefeCount++;
            } else if (words[i].equals("_")) {
                builder.append(" ");
            } else {
                builder.append(words[i]);
            }
        }

        if (covfefeCount == 0) builder.append(" covfefe");
        return builder.toString();
    }
}
