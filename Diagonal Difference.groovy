/**
 * Created by yhjhoo on 26/2/17.
 */
BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
def numberOfDigitStr = br.readLine()


//println(numberOfDigitStr)

int numberOfDigits = numberOfDigitStr.toInteger()

int diff1 = 0
int diff2 = 0

for (i = 0; i < numberOfDigits; i++) {
    temp = br.readLine()
    digit_arr = temp.split(" ")
    diff1 = diff1 + digit_arr[i].toInteger()
    diff2 = diff2 + digit_arr[numberOfDigits - i- 1].toInteger()
}


println(Math.abs(diff1 - diff2) )
//
//digit_1_arr =  digit_1.split(" ")
//digit_2_arr =  digit_2.split(" ")
//digit_3_arr =  digit_3.split(" ")
////
////digit_1_arr.each {
////    println("fff: ${it}")
////}
//
//diff1 = digit_1_arr[0].toInteger() + digit_2_arr[1].toInteger() + digit_3_arr[2].toInteger()
//diff2 = digit_3_arr[0].toInteger() + digit_2_arr[1].toInteger() + digit_1_arr[2].toInteger()
//
//
////println("diff1: ${diff1}")
////println("diff2: ${diff2}")
//
//println(Math.abs(diff1 - diff2) )