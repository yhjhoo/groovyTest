/**
 * Created by yhjhoo on 26/2/17.
 */


BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
def numberOfDigits = br.readLine()

def digits = br.readLine()

//print(numberOfDigits)
//print(digits)


def sum = 0
digits.split(" ").each {
    sum += "${it}".toBigDecimal()
}
print(sum)