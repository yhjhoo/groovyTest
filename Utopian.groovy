import java.text.DecimalFormat

/**
 * Created by yhjhoo on 4/3/17.
 *
 * 3
 * 6
 */


BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
def numberOfDigitStr = br.readLine()

int numberOfTestCases = numberOfDigitStr.toInteger()


temp = new String[numberOfTestCases]
for(i = 0; i< numberOfTestCases; i++){
    temp[i] = br.readLine()
}

initialHeight = 1
startInteger = 1
for(i = 0; i< numberOfTestCases; i++){
    cycles = temp[i].toInteger()
    startInteger = 1
    println(loop(cycles, initialHeight))
}


def loop(int cycles, currentHeight){
//    println("currentHeight: " + currentHeight)
    if(cycles <= 0 ){
        return currentHeight
    }

    if(startInteger % 2 == 1){
        currentHeight = currentHeight * 2
    }else{
        currentHeight = currentHeight + 1
    }

    cycles = cycles - 1;
    startInteger++

    if(cycles > 0){
        return loop(cycles, currentHeight)
    }

    return currentHeight

}
