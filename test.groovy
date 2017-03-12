//def username = System.console().readLine 'What is your name?'
//println "Hello $username"


BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
def numberOfDigits = br.readLine()

def digits = br.readLine()

print(numberOfDigits)
print(digits)

//
//def numberOfDigits = System.console().readLine ''
//
//def digits = System.console().readLine ''
//
//def sum = 0
//digits.split(" ").each {
//    sum += "${it}".toInteger()
//}
//print(sum)