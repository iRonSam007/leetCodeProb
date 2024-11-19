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


fun removeDuplicatesArray__test(){
    var x: IntArray = intArrayOf(1, 1, 2)
    val output: Int = removeDuplicatesArray(x)
    println("expecting << 2 >> : output = " + output.toString())
}

fun removeDuplicatesArray(x: IntArray): Int{
    val xSet = mutableSetOf<Int>()
    for(elem in x){
        xSet.add(elem)
    }
    return xSet.size
}

fun main(){
    //twoSum__test()
    //isPalindrome__test()
    //isValidParentheses__test()
    removeDuplicatesArray__test()
}