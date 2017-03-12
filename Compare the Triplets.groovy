/**
 * Created by yhjhoo on 26/2/17.
 */

BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
a = br.readLine()
b = br.readLine()

alicePoint = 0
bobPoint = 0


a1 = a.split(" ")
b1 = b.split(" ")

def compare(first, second){
    if(first != second){
        if(first > second ){
            alicePoint = alicePoint + 1
        }else{
            bobPoint = bobPoint + 1
        }
    }
}

compare(a1[0].toInteger(), b1[0].toInteger())
compare(a1[1].toInteger(), b1[1].toInteger())
compare(a1[2].toInteger(), b1[2].toInteger())

print(alicePoint + " " + bobPoint)