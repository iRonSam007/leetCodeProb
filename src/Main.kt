import java.lang.classfile.components.ClassPrinter.ListNode
import java.util.LinkedList
import kotlin.math.min

fun twoSum__test(){
    println("Problem solved: =====================================")
    var x: IntArray = intArrayOf(2, 7, 11, 15)
    var y: Int = 9
    var value: IntArray? = twoSum(x, y)
    println("expecting << [0, 1] >> : output = " + value?.joinToString())
}
fun twoSum(nums: IntArray, target: Int): IntArray? {
    for(i in 0..(nums.size-2)){
        for(k in i+1 .. nums.size){
            if(nums[i]+nums[k] == target){
                return intArrayOf(i, k)
            }
        }
    }
    return null
}


fun isPalindrome__test(){
    var x: Int = 121
    var output: Boolean = isPalindrome(x)
    println("expecting << True >> : output = " + output.toString())
}
fun isPalindrome(x: Int): Boolean{
    if (x.toString() == x.toString().reversed()) return true
    return false
}


fun isValidParentheses__test(){
    val x : String = "()[{}]{}"
    val output: Boolean = isValidParentheses(x)
    println("expecting << True >> : output = " + output.toString())
}
fun isValidParentheses(x: String): Boolean {
    val mutableX = x.toMutableList()
    if (x.length % 2 != 0) return false
    else if (x.length == 0) return true
    else {
        for (i in 0..(x.length - 2)) {
            if (x[i] == '(') {
                for (k in (i + 1)..(x.length - 1)) {
                    if (x[k] == ')') {
                        mutableX.remove('(') //remove the first
                        mutableX.remove(')')
                        continue
                    }
                }
            } else if (x[i] == '{') {
                for (k in (i + 1)..(x.length - 1)) {
                    if (x[k] == '}') {
                        mutableX.remove('{')
                        mutableX.remove('}')
                        continue
                    }
                }
            } else if (x[i] == '[') {
                for (k in (i + 1)..(x.length - 1)) {
                    if (x[k] == ']') {
                        mutableX.remove('[')
                        mutableX.remove(']')
                        continue
                    }
                }
            }
        }
    }
    return mutableX.isEmpty()
}


fun removeDuplicatesArray__test() {
    var x: IntArray = intArrayOf(1, 1, 2)
    val output: Int = removeDuplicatesArray1(x)
    println("expecting << 2 >> : output = " + output.toString())
}
fun removeDuplicatesArray(x: IntArray): Int{
    val xSet = mutableSetOf<Int>()
    for(elem in x){
        xSet.add(elem)
    }
    return xSet.size
}
fun removeDuplicatesArray1(x: IntArray): Int {
    if (x.isEmpty()) return 0
    var slow: Int = 0
    for(fast in 0..x.size-1){
        if( x[fast] != x[slow] ){
            slow ++
            x[slow]=x[fast]
        }
    }
    return slow + 1
}

fun maxProfit__test(){
    var x: IntArray = intArrayOf(7, 1, 5, 3, 6, 4)
    val output: Int = maxProfit(x)
    println("expecting << 5 >> : output = " + output.toString())
}
fun maxProfit(x: IntArray): Int{
    var lowestBuy : Int= Int.MAX_VALUE
    var biggestSell: Int= Int.MIN_VALUE
    var buyIndex: Int = 0
    for(i in 0..x.size-1){
        if(x[i] < lowestBuy ) {
            lowestBuy = x[i]
            buyIndex = i
        }
        if(i > buyIndex  && x[i] > biggestSell){
            biggestSell = x[i]
        }
    }
    return biggestSell - lowestBuy
}


fun tableDecimalAdd__test(){
    var x1: List<Int> = listOf(2, 4, 9)
    var x2: List<Int> = listOf(5, 6, 4)
    val output: LinkedList<Int> = tableDecimalAdd(x1, x2)
    println("expecting << [7, 0, 4, 1] >> : output = " + output.toString())
}
fun tableDecimalAdd(x1: List<Int>, x2: List<Int>): LinkedList<Int>{
    val l: Int = min(x1.size, x2.size)
    val sum : LinkedList<Int> = LinkedList<Int>()
    var rest: Int = 0
    for (i in 0..l-1){
        if (x1[i] + x2[i] + rest < 10){
            sum.add(x1[i] + x2[i] + rest)
            rest = 0
        }
        else {
            sum.add(x1[i] + x2[i] + rest - 10)
            rest = 1
        }
    }
    if (rest !=0){
        sum.add(1)
    }
    return sum
}


fun longestSubstringLength__Test(){
    val x: String = "abcabcbb"
    val output: Int = longestSubstringLength(x)
    println("Expecting << 3 >> : Output = $output")
}

fun longestSubstringLength(x: String): Int {
    var longestLengts : MutableList<Int> = mutableListOf()
    var LLUS: String = ""   //LastLongestUniqueString
    for(i in 0..x.length-1){
        if (x[i]  !in LLUS){
            LLUS = LLUS + x[i]
        }
        else {
            longestLengts.add(LLUS.length)
            LLUS = x[i].toString()
        }
    }
    return longestLengts.max()
}


fun main(){
    //twoSum__test()
    //isPalindrome__test()
    //isValidParentheses__test()
    //removeDuplicatesArray__test()
    //maxProfit__test()
    //tableDecimalAdd__test()
    longestSubstringLength__Test()


}