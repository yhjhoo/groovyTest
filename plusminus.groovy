import java.text.DecimalFormat

/**
 * Created by yhjhoo on 4/3/17.
 */


BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
def numberOfDigitStr = br.readLine()

int numberOfDigits = numberOfDigitStr.toInteger()


temp = br.readLine()

String[] array = temp.split(" ")

numberOfPositive = 0
numberOfNegative = 0
numberOfZero = 0

for(i = 0; i< numberOfDigits; i++){
    digit = array[i].toInteger()

    if(digit >0 ){
        numberOfPositive++
    }else if(digit < 0 ){
        numberOfNegative++
    }else{
        numberOfZero++
    }
}

//println(numberOfDigits)
//println(numberOfPositive)
//println(numberOfNegative)
//println(numberOfZero)

DecimalFormat df = new DecimalFormat("###,##0.000000");

println(df.format(numberOfPositive / numberOfDigits));
println(df.format(numberOfNegative / numberOfDigits));
println(df.format(numberOfZero / numberOfDigits));