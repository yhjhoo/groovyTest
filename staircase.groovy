import java.text.DecimalFormat

/**
 * Created by yhjhoo on 4/3/17.
 *
 * 3
 * 6
 */


BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
def numberOfDigitStr = br.readLine()

int numberOfDigits = numberOfDigitStr.toInteger()



for(i = 0; i< numberOfDigits; i++){
    def str = ""
    for(j = 0; j<= i; j++){
        str = str + "#"
    }

    println(str.padLeft(numberOfDigits) )
}