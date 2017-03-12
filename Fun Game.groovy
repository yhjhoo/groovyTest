/**
 * Created by yhjhoo on 5/3/17.
 */

BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
def numberOfDigitStr = br.readLine()


int numberOfTestCases = numberOfDigitStr.toInteger()

temp = new InputObj[numberOfTestCases]


for(int i = 0; i< numberOfTestCases; i++){
    temp[i] = new InputObj()
    temp[i].moves = br.readLine()
    temp[i].arrayStr1 = br.readLine()
    temp[i].arrayStr2 = br.readLine()
}


//println(temp[0].getMoves())
//println(temp[0].getArrayInt1())
//println(temp[0].getArrayInt2())

//perform(temp[0])
for(InputObj tmp : temp){
    perform(tmp)
}


def perform(InputObj obj){
//    println("---------------------")
    int moves = obj.getMoves()
    int p1Point = 0
    int p2Point = 0

    result = compareInput(obj, 0, 0, 1)

    printResult(result[0], result[1])
}

def printResult(int p1, int p2){
    if(p1 > p2){
        println("First")
    }else if (p1 < p2){
        println("Second")
    }else{
        println("Tie")
    }
}

def compareInput(InputObj obj, int p1, int p2, int currentStep){
//    println("22222-  " + currentStep)
//
//    println("33 - " + obj.getArrayInt1().get(((currentStep - 1) / 2).toInteger() ) )
//    println("33 - " + obj.getArrayInt2().get(((currentStep - 1) / 2).toInteger() ) )


    int totalMoves = obj.getMoves()

    if(currentStep % 2 == 1){
        p1 = p1 + obj.getArrayInt1().get(((currentStep - 1) / 2).toInteger() )
    }else{
        p2 = p2 + obj.getArrayInt2().get(((currentStep - 1) / 2).toInteger())
    }

//    println("44 - " + p1)
//    println("44 - " + p2)

    if(totalMoves <= currentStep){
        return [p1, p2]
    }

    currentStep++
    return compareInput(obj, p1, p2, currentStep)
}

class InputObj{
    String moves
    String arrayStr1
    String arrayStr2

    int getMoves(){
        moves.toInteger()
    }

    String[] getArrayStr1(){
        return arrayStr1.split(" ")
    }

    String[] getArrayStr2(){
        return arrayStr2.split(" ")
    }

    List getArrayInt1(){
        List<Integer> array = new ArrayList<>();
        for (String tmp : getArrayStr1() ){
            array.add(tmp.toInteger() )
        }
        array.sort().reverse()
    }


    List getArrayInt2(){
        List<Integer> array = new ArrayList<>();
        for (String tmp : getArrayStr2() ){
            array.add(tmp.toInteger() )
        }

        array.sort().reverse()
    }
}