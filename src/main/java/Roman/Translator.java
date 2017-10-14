package Roman;

import java.util.HashMap;
import java.util.Map;

public class Translator {
    Map<Character, Integer> romanMap = new HashMap<Character, Integer>();

    int translate(String number){
        romanMap.put('M', 1000);
        romanMap.put('D', 500);
        romanMap.put('C', 100);
        romanMap.put('L', 50);
        romanMap.put('X', 10);
        romanMap.put('V', 5);
        romanMap.put('I', 1);

        int numeroRomano = 0;

        for(int i = 0; i < number.length(); i++){
            if(i < number.length() - 1){

                if(romanMap.get(number.charAt(i)) >= romanMap.get(number.charAt(i + 1))){

                    numeroRomano += romanMap.get(number.charAt(i));
                }else{
                    numeroRomano -= romanMap.get(number.charAt(i)) - romanMap.get(number.charAt(i + 1));
                    i++;
                }
            }else{
                numeroRomano += romanMap.get(number.charAt(i));
            }
        }

        return numeroRomano;
    }


}