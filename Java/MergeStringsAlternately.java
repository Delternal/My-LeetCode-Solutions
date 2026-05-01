public class MergeStringsAlternately {

    public String mergeAlternately_v1(String word1, String word2) {
        int i;
        String word3 = "";

        int menor = Math.min(word1.length(), word2.length());

        for(i = 0; i < menor; i++){
            word3 += word1.charAt(i);
            word3 += word2.charAt(i);
        }

        if(word1.length() > word2.length()){
            word3 += word1.substring(i);
        }
        else{
            word3 += word2.substring(i);
        }

        return word3;

    }
    
    public static  String mergeAlternately_v2(String word1, String word2){
        StringBuilder word3 = new StringBuilder();
        int i = 0;

        while(word1.length() > i || word2.length() > i){
            if(word1.length() > i){
                word3 = word3.append(word1.charAt(i));
            }
            if(word2.length() > i){
                word3 = word3.append(word2.charAt(i));
            }
            System.out.println(word3);

            i++;
        }
        
        return word3.toString();
    }
}
