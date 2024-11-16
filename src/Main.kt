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


fun _twoSumTest(){
    println("Problem solved: =====================================")
    var x1: IntArray = intArrayOf(2, 7, 11, 15)
    var y1: Int = 9
    var value1: IntArray? = twoSum(x1, y1)
    println("expecting <<[0, 1] >> : output = " + value1?.joinToString())
}

fun main(){
    _twoSumTest()
}