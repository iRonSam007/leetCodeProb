//Dependencies:
TOML file :-----------------------------------------------------------------------------------
[Versions]
retrofit = "2.9.0"
okhttp = "4.10.0"
coroutines = "1.7.3"
lifecycle = "2.6.1"

[Libraries]
# Retrofit for networking
retrofit = { group = "com.squareup.retrofit2", name = "retrofit", version.ref = "retrofit" }
retrofitGson = { group = "com.squareup.retrofit2", name = "converter-gson", version.ref = "retrofit" }

# OkHttp for HTTP client
okhttp = { group = "com.squareup.okhttp3", name = "okhttp", version.ref = "okhttp" }

# Kotlin Coroutines for asynchronous programming
coroutinesCore = { group = "org.jetbrains.kotlinx", name = "kotlinx-coroutines-core", version.ref = "coroutines" }
coroutinesAndroid = { group = "org.jetbrains.kotlinx", name = "kotlinx-coroutines-android", version.ref = "coroutines" }

# Lifecycle ViewModel for architecture components
lifecycleViewmodel = { group = "androidx.lifecycle", name = "lifecycle-viewmodel-ktx", version.ref = "lifecycle" }
lifecycleRuntime = { group = "androidx.lifecycle", name = "lifecycle-runtime-ktx", version.ref = "lifecycle" }

# Lifecycle ViewModel fro Compose
androidx-lifecycle-viewmodel-compose = { group = "androidx.lifecycle", name = "lifecycle-viewmodel-compose", version = "2.6.0" }

# Dagger hilt libs
hilt-android = { version = "2.52", module = "com.google.dagger:hilt-android" }
hilt-android-compiler = { version = "2.52", module = "com.google.dagger:hilt-android-compiler" }
hilt-lifecycle-viewmodel = { version = "1.0.0-alpha03", module = "androidx.hilt:hilt-lifecycle-viewmodel" }
hilt-compiler = { version = "1.0.0", module = "androidx.hilt:hilt-compiler" }
hilt-navigation-compose = { version = "1.0.0", module = "androidx.hilt:hilt-navigation-compose" }

[Plugins]
kotlin-kapt = "id 'kotlin-kapt'"
dagger-hilt-android = { id = "com.google.dagger.hilt.android", version = "2.52" }


build.gradle.kts:---------------------------------------------------------------------
Android{}
   buildFeatures { viewBinding = true }
   buildFeatures { compose = true }

Dependencies{}
    // Retrofit and Gson Converter
    implementation(libs.retrofit)
    implementation(libs.retrofitGson)

    // OkHttp and logging interceptor
    implementation(libs.okhttp)

    // Coroutines for background work
    implementation(libs.coroutinesCore)
    implementation(libs.coroutinesAndroid)

    // Lifecycle components
    implementation(libs.lifecycleViewmodel)
    implementation(libs.lifecycleRuntime)

    // Lifecycle viewmodel compose
    implementation(libs.androidx.lifecycle.viewmodel.compose)






    #Build: Add dependencies verions
    daggerHilt = "2.44"
    retrofit = "2.9.0"
    coroutines = "1.6.4"
    okhttp = "4.9.3"
    
    
    #Build: Add dependencies
    dagger-hilt-android = { group = "com.google.dagger", name = "hilt-android", version.ref = "daggerHilt" }
    dagger-hilt-compiler = { group = "com.google.dagger", name = "hilt-compiler", version.ref = "daggerHilt" }
    retrofit = { group = "com.squareup.retrofit2", name = "retrofit", version.ref = "retrofit" }
    retrofit-gson = { group = "com.squareup.retrofit2", name = "converter-gson", version.ref = "retrofit" }
    okhttp = { group = "com.squareup.okhttp3", name = "okhttp", version.ref = "okhttp" }
    coroutines-core = { group = "org.jetbrains.kotlinx", name = "kotlinx-coroutines-core", version.ref = "coroutines" }
    coroutines-android = { group = "org.jetbrains.kotlinx", name = "kotlinx-coroutines-android", version.ref = "coroutines" }
    
    
    #Build: Add hilt and kapt plugin
    hilt = { id = "com.google.dagger.hilt.android", version.ref = "daggerHilt" }
    kotlin-kapt = { id = "org.jetbrains.kotlin.kapt", version.ref = "kotlin" }
    
    
    
    ===========================================================================
        //Build: apply hilt plugins in project level kts
        alias(libs.plugins.hilt) apply false
        alias(libs.plugins.kotlin.kapt) apply false
    
    
    =====================================================================
    //Build: apply hilt plugin alias in app module kts
        alias(libs.plugins.hilt)
        alias(libs.plugins.kotlin.kapt)
    
    
    //Build: implement dependencies
        implementation(libs.dagger.hilt.android)
        kapt(libs.dagger.hilt.compiler)
    
        implementation(libs.retrofit)
        implementation(libs.retrofit.gson)
        implementation(libs.okhttp)
    
        implementation(libs.coroutines.core)
        implementation(libs.coroutines.android)
    
    
    //Build: Apply KAPT type errors corrections for Hilt
    kapt {
        correctErrorTypes = true
    }




- A **project manager (chef de projet)** is primarily responsible for the overall management of the project, including 
        - timelines
        - budgets
        - resources
        - communication with stakeholders. 
They focus on ensuring the project is delivered successfully according to plan.


- A **tech lead** (technical lead) is more focused on the technical aspects of the project. They 
        - guide the development team
        - make key technical decisions
        - set coding standards
        - ensure the quality of the technical solution. 
        - mentors the development team and ensures that technical challenges are addressed effectively.

In summary:
- **Project Manager** = Focus on project management, coordination, deadlines, and client needs.
- **Tech Lead** = Focus on technical direction, code quality, and team guidance on technical matters.




Android developper skill set:
=> Kotlin and Java programming languages.
=> Object-oriented programming and advanced concepts like Generics and Lambda expressions.
=> Understanding of the lifecycle of different Android instances and activities.
=> Clean Architecture (Repository, Services, Mappers, LiveData, etc.) and the MVVM design pattern.
=> Reactive programming (Coroutines, RXJava/RxKotlin).
=> Dependency injection (Koin, Dagger, etc.).
=> Unit testing (PowerMock, EasyMock, Mockito, Robolectric).
=> Code debugging tools.
=> Familiarity with Git, Postman, JIRA, Confluence.
=> Agile SCRUM Framework.



/* =====================================================================================================================
===============================================  B A S I C   Kotlin  ===================================================
========================================================================================================================
======================================================================================================================*/
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> iRonMan once said, simple is acheivable <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<


//Here: 0 - syntax======================================================================================================
fun main(args: Array<String>){                      //Was mandatory for main to be declared with variables, no longer now

//Here: 1 - Outputs:====================================================================================================
        println("printing and insert a new line")
        print("printing without inserting a new line")


//Here: 2 - Comments:===================================================================================================
        //This is a one line comment
        /* This is a multiline comments
        Adding more  bla bla
        to explain something
        bla bla bla just in the begining of a file
        */


//Here: 3 - Variables:==================================================================================================
        var namo = "Issam"                              // Type not specified AND value modifiable
        val lame = "Issam"                              // Type not specified AND value not modifiable
        val birthday: Int = 32                          // Type specified
        var mValue: String
        mValue = "Assigned value latly"                 //Variable decalared without assigning value, (Type need to be specifed, and only for "var" variables: Error for "val")


//Here: 4 - Data types:=================================================================================================
        //Strings   :
        val myText = "Texts me baby"

        //Characters: (Kotling does not allow ASCII as Java; 66 output B while here output Error)
        val letter = 'D'

        //Booleans
        val mBoolean = true

        //Numbers: Integer types
        val mByte: Byte = 12                //Byte:  -128 .. 127
        val mShort: Short = 12              //Short: -32k .. 32k
        val mInt: Int = 5                   //Int:   -2B  .. 2B
        val mLong: Long= 1200000L           //Long:  -9k Quadrillion ... +9k Quadrillion  :                     (L is optional)

        //Numbers: Floating point types (number with decimal)
        val mFloat: Float = 4.1F             //Float: precision after the point is   => 6 or 7 decimal digits   (F is a must)
        val double: Double = 5.65            //Double: precision after the point is  => 15 digits

        //Numbers: Floating scientific numbers
        val fSiencNum: Float = 35E3F             // e or E to indicate the power of 10
        val dSiencNum: Float = 35E3              // e or E to indicate the power of 10

        //Type conversion: Numeric type conversion is diff than JAVA: Int cannot be converted to a Long implicit: need to use functions:
        val x: Int = 5
        val y: Long = x
        println(y)                  //Error: type mismatch
        // Instead use toByte(), toShort(), toInt(), toLong(), toFloat(), toDouble(), toChar()
        val x: Int = 5
        val y: Long = x.toLong()
        println(y)                  //no Error


//Here: 5 - Operators: Arithmetic, assignment, comparison, logical =====================================================
        var x= 5
        x +=5

//Here: 6 - Strings ====================================================================================================
        var txt1= "Issam"
        var txt2= "Ossam"
        println(txt1[0])                        //First element
        var l :Int = txt1.length                //Get the length property (your string is an object has properties and functions)
        println(txt1.uppercase())               //apply string function upperCase, lowerCase
        println(txt1.compareTo(txt2))           //Output O if equals
        println(txt1.indexOf("a"))              //Output 3
        println(txt1 + txt2)                    //Concatenation
        println(txt1.plus(txt2))                //concatenation by plus function
        println("My Name is $txt1 and brother is $txt2") //String templates/interpolation : adding vars in strings


//Here: 7 - if .. else
        var lena:Int = 8
        if( lena > 9) {
                println("true")
        } else if(lena == 7){
                println("between")
        } else{
                println("Not true")
        }
        //Use if else as expression: else is required in this case
        val time = 15
        val greeting = if (time > 18){ "Good evening" }else{"good morning"}
        val greeting_ = if (time> 18) "Good morning" else "Good evening"               //with ommiting the curly braces for simple if..lese
        println(greeting)


//Here: 8 - when: {Similar to switch in Java (easy for handling many if..else expression)}
        val day = 5
        var result = when(day){
                1 -> "Monday"
                2 -> "Tuesday"
                3 -> "Wednsday"
                4 -> "Thursday"
                5 -> "Friday"  //This code block will be executed
                6 -> "Saturday"
                7 -> "Sunday"
                else -> "Invalid number"
        }
        println(result)

//Here: 9 while: classic
        var i = 2
        while(i < 5){
                i++
                println(i)
        }

        do{
                print(i)
                i--
        }while(i > 0)


//Here: 10 - Break/continue:
        var i = 0
        while(i < 10){
                i ++
                if (i==5){
                        continue
                }
                if (i==8 ){
                        break
                }
        }

//Here: 11 - Arrays:
        val mCars = arrayOf("VW", "Audi", "Ford", "BM")
        println(mCars[0])
        mCars[1] = "Audi RS7"
        println(mCars.size)
        if("VW" in mCars){
                println("element is in")
        }
        for (elem in mCars){
                print(elem)
        }


//Here: 12 - for loop : unlike Java there is no traditional "for" loop in kotlin
// instead it is used to loop through arrays, ranges, and other thinks that contains a
// countable number of values:
        for (elem in mCars){
                print(elem)
        }

        
//Here: 13 - ranges: can be create dwith ".."
for (mChars in 'a'..'x'){
        println(mChars)
}

for (mNumb in 1..50){
        println("nums")
}

        
//Here: 13 - Functions
        //Creation: two parameters with return type Int
        fun myFunction(mPara: String, age: Int): Int{
                println("testing this function param1 = $mPara and param2 = $age")
                return age+5
        }
        //Calling:
        var res = myFunction("sam", 5)

        //shorter syntax for return values: use "=" instead of {... return ...} without specifying the return type
        fun mFunc(iss: Int, y:Int ) = iss+y
        val resol = mFunc(2, 3)


//Here: 14 - OOP: OOP is all about creating objects that contains both data and methods:
/*      => faster and easier to execute
        => clear structure
        => code Dry "Don't repeat yourself"
        => Easy to maintain and debug
        => Re-usable code
        */

//Here: 15 - Classes/Objects
/*      => Class is template for objects
        => Object is an instance of a class
        => Object inherit all the variables and methods from the class {Properties and functions}*/
        class Car {
                var brand = ""
                var model = ""
                var year = 0
        }
        val car1 = Car()
        car1.year= 2018
        car1.brand = "Audi"
        

//Here: 16 - Constructors, when defining the class use () for constructor()
        class Wagen(brand: String, model: String, year:Int){
        }
        val car3 = Wagen("BM", "M5", 2020)

        
//Here: 17 - Class functions// methods
        class Vagen(brand: String, model: String, year:Int){
                fun ignite(ad : String){
                        println("Wroom ! $ad")
                }
        }
        val car4 = Vagen("BM", "M5", 2020)
        car4.ignite("my Car")

        
//Here: 18 - Inheritance 
/*
        => SuperClass (Parent)  : class being inherited from; need to use "open" keyword
            because classes are final by default in Kotlin
        => SubClass (child)     : class that inherit from another class
*/
        //super class:
        open class A{
                val x = 5
        }
        //sub class
        class B: A() {
                fun mFunct(){
                        prinln(x) //x is inherited from superclass A
                }
        }

        val bObject = B()
        bObject.mFunct()
}
















/* =====================================================================================================================
=============================================  A D V A N C E D   Kotlin  ===============================================
========================================================================================================================
======================================================================================================================*/

//Here: 1 - Null Safe: //=>What: A feature help prevent null pointer exception 
                       //=>How : Incorporate nullability directly into the type system*/

// A - Nullable and Non-nullable types: 
        //In kotlin types are non-nullable by default. Variables cannot hold a null value unless explicitly specified
        var nullableString1: String = "Hello"
        nullableString1 = null // compile-time error
        var nullableString2: String? ="Hello"
        nullableString2 = null //Allowed

// B - Safe Calls(?.): used to safely access properties and methods of a nullable object.
        // If the object is null, the call will return null instead of throwing an NPE
        val length: Int? = nullableString?.length

//C - Elvis Operator(?:): provides a default value to return if the expression to the left is null
        val length: Int = nullableString1?.length ?:8

//D - Safe Casts (as?): attempts to cast a value to a specified type, returning null if the cast is not possible
        val number: Int? = input as? Int

//E - Non-Null Assertion(!!): converts any value to a non-null type, throwing an NPE if the value is null
        val length: Int = nullableString!!.length // This will throw an NPE if nullableString is null

//F - Let Function: often used in conjunction with safe calls to execute a block of code only if the variable is not null
        nullabelString?.let{println(it.length) }

//G - Late initialized properties (lateinit):
    //For properties that cannot be initialized in the constructor,
    //you can use lateinit to declare them, ensuring they are initialized before use
    lateinit var lateInitVar: String
    fun initialize(){
            lateInitVar = "Initialized"
    }

    fun printlateInitVar() {
            if(::lateInitVar.isInitialized){
                    print(lateInitVar)
            }
    }

//H - Nullable types in collections: Collections can hold nullable types, and Kotlin provides extension functions to handle such cases
    val list: List<String?> = listOf("a", null, "b")
    for (item in list){
            item?.let {println(it)} // Only prints non-null items
    }





//Here: 2 - User inputs: readline() ====================================================================================
    fun main(){
            println("input something")
            var name = readLine()
            prinln("Hello $name !")
    }



//Here: 3 - Handling exceptions ========================================================================================
//Ensure that your application can handle error gracefully
// A - Try-Catch block:
    fun main() {
            try {
                    val result = 10 / 0             // This will throw an ArithmeticException
            } catch (e: ArithmeticException) {
                    println("ArithmeticException caught: ${e.message}")
            }
    }
// B - Multiple Catch blocks
    fun main() {
            try {
                    val list = listOf(1, 2, 3)
                    println(list[5]) // This will throw an IndexOutOfBoundsException
            } catch (e: ArithmeticException) {
                    println("ArithmeticException caught: ${e.message}")
            } catch (e: IndexOutOfBoundsException) {
                    println("IndexOutOfBoundsException caught: ${e.message}")
            }
    }

// C - Finally Block
    fun main() {
            try {
                    val result = 10 / 0
            } catch (e: ArithmeticException) {
                    println("ArithmeticException caught: ${e.message}")
            } finally {
                    println("This is the finally block, which always executes.")
            }
    }

// D - Throwing Exceptions (Exception thrown explicitly)
    fun checkAge(age: Int) {
            if (age < 18) {
                    throw IllegalArgumentException("Age must be at least 18")
            }
            println("Age is valid")
    }
    fun main() {
            try {
                    checkAge(16)
            } catch (e: IllegalArgumentException) {
                    println("IllegalArgumentException caught: ${e.message}")
            }
    }

// E - Custom exceptions
    class CustomException(message: String) : Exception(message)
    fun main() {
            try {
                    throw CustomException("This is a custom exception")
            } catch (e: CustomException) {
                    println("CustomException caught: ${e.message}")
            }
    }

// F - Utility functions:
//Require(): verify args
    fun validateAge(age: Int) {
            require(age >= 18) { "Age must be at least 18" }
            println("Age is valid: $age")
    }
    fun main() {
            try {
                    validateAge(20) // This will pass
                    validateAge(16) // This will throw an IllegalArgumentException
            } catch (e: IllegalArgumentException) {
                    println(e.message)
            }
    }

//check(): verify internal state
    class Person(private var name: String?) {
            fun initializeName(newName: String) {
                    name = newName
            }
            fun printName() {
                    checkNotNull(name) { "Name has not been initialized" }
                    println(name)
            }
    }
    fun main() {
            val person = Person(null)
            try {
                    person.printName() // This will throw an IllegalStateException
            } catch (e: IllegalStateException) {
                    println(e.message)
            }
            person.initializeName("John")
            person.printName() // This will print "John"
    }

//assert(): making assertions
    fun calculateSquare(number: Int): Int {
            val result = number * number
            assert(result >= 0) { "Result should never be negative" }
            return result
    }
    fun main() {
            val positiveResult = calculateSquare(4) // This will pass
            println("Square of 4 is $positiveResult")

            val negativeResult = calculateSquare(-4) // This will pass because square of -4 is also positive
            println("Square of -4 is $negativeResult")

            val zeroResult = calculateSquare(0) // This will pass because square of 0 is 0
            println("Square of 0 is $zeroResult")
    }




//Here: 4 - Collections: List, ArrayList; Set, HashSet; Map, HashMap; Iterators ========================================
Immutable vs Mutable in Kotlin
        Mutability of variable :
        val(like final in java) the reference of the variable cannot be reassigned[immutable], but the object it refers to is mutable
                var mlist = mutableListOf(1, 2, 3)
                mlist = anotherList     // Error
                mlist.add(5)            //not Error

        Mutability of collections:
                List (Immutable): Read-only operations like get.
                MutableList: Allows modification like add, remove.

        Strings are immutable in Java & Kotlin. => Modifications create new String objects.
                => By default:
                -> Collection in Java are mutable
                -> Collection in Kotlin are immutable: List, Set, Map

Collections in Kotlin: 
        Basic: List, Set, Map // MutableList, MutableSet, MutableMap
                => By default they are immutable, 
                we can use the mutable foctory method like (exampe map): mutableMapOf, hashMapOf, linkedMapOf, sortedMapOf. that are backed by 
                Java collections: HashMap, LinkedHashMap, TreeMap. 

        Special: Range, Sequence, Array, Deque.

        Use cases:
                -> "List" : Duplication of element, Insertion order forcely maintained 
                -> "Set"  : Uniqueness of elements, order may or may not matter
                -> "Map"  : Key value data, uniquness of keys
                Mutable version:
                -> "List": choice based on performance: "MutableList", "ArrayList"{use it when u really want arrayList performance.}
                -> "Set" && "Map": choice based on order and perf(mostly hashMap for perf)
                        => "MutableMap": default mutable map with insertion order preserved.
                                Suitable for most use cases.
                        => "HashMap": Performant order not preserved
                                Good for large datasets, insertion order is irrelevant.
                        => "LinkedMap": Explicitly preserve the insertion order.
                                Useful when you need predictability in the order of elements.

//A - List and ArrayList: List is readOnly collection, while ArrayList(The underlying Java class for kotlin mutable version of list) is a mutable collection 
    fun main() {
        // Immutable List
            val immutableList: List<String> = listOf("Apple", "Banana", "Cherry")
            println("Immutable List: $immutableList")

        // Mutable ArrayList
            val mutableList: ArrayList<String> = arrayListOf("Dog", "Cat", "Bird")
            println("Mutable List before modification: $mutableList")
            mutableList.add("Fish")
            println("Mutable List after modification: $mutableList")}


//B - Set and HashSet: Set is a collection of unique elements, while HashSet is a mutable version:
    fun main() {
        // Immutable Set
            val immutableSet: Set<String> = setOf("Red", "Green", "Blue")
            println("Immutable Set: $immutableSet")

        // Mutable HashSet
            val mutableSet: HashSet<String> = hashSetOf("Circle", "Square", "Triangle")
            println("Mutable Set before modification: $mutableSet")
            mutableSet.add("Rectangle")
            println("Mutable Set after modification: $mutableSet")}

//C - Map and HashMap: Map is a collection of key-value pairs, while HashMap is a mutable version
    fun main() {
        // Immutable Map
            val immutableMap: Map<Int, String> = mapOf(1 to "One", 2 to "Two", 3 to "Three")
            println("Immutable Map: $immutableMap")

        // Mutable HashMap
            val mutableMap: HashMap<Int, String> = hashMapOf(1 to "Apple", 2 to "Banana")
            println("Mutable Map before modification: $mutableMap")
            mutableMap[3] = "Cherry"
            println("Mutable Map after modification: $mutableMap")
            mutableMap.put(1, "Apple")
    }

//D - Iterators: Iterators are used to traverse collections.
fun main() {
        val list = listOf("Kotlin", "Java", "Python")
        val iterator = list.iterator() //Same for list, set map: set.iterator()

        println("List Iteration:")
        while (iterator.hasNext()) {
                println(iterator.next())
        }
}


//Here: 5 - Lambda functions =================================================================================================
/* Concise way to represent a function; short and throwaway function that is passed as arguments
        to higher order function or used in collections transformations:*/
        //.map .filter .forEach .apply .buildString

//A - Basic syntax:
    val lambdaFunction  : (InputType) -> ReturnType = {parameterName: InputType -> functionBody }
    val add2integers    : (Int, Int) -> Int         = {inp1: Int, inp2: Int -> inp1+inp2}                      //example
    val add2Integers_simpl                          = {inp1:Int, inp2:Int -> inp1 + inp2}                      //Simple way
    

//B - Using lambda functions with higher order functions// Collections applications:
        //Using lambda functions: with higher order functions: "map"
        val numbers = listOf(1, 2, 3, 4)
        val doubled = numbers.map { it*2} //maps apply lambda function what is between "{..}" equivalent to {it -> it * 2} as map iterate over it: "it" iterated element
        println(doubled) // Output: [2, 4, 6, 8, 10]

        //Using lambda functions: with higher order functions: "filter"
        val numbers = listOf(1, 2, 3, 4, 5)
        val evens = numbers.filter { it % 2 == 0 }
        println(evens) // Output: [2, 4]

        //Using lambda functions: with higher order functions: "forEach"
        val names = listOf("Abella", "Kendra", "AJ", "Daisy")
        names.forEach { println(it)}



//C - Lambda with receivers: allow you to call methods on receiver object without referencing it explicitly:
/* In a lambda with a receiver, the receiver object is implicitly available inside the lambda,
and you can call its methods or access its properties directly without needing to qualify
them with the receiver object name */
        //Example: "apply"
        data class Person(var name: String, var age: Int)
        val person = Person("Issam", 28).apply{
                name = "ABIDA"
                age = 1996
        }
        // Example: buildString
        val result = buildString {
                append("Issam doing")
                append("this shit")
        }
//To do: review labda with receivers applications with DSL and builders pattern:

//D - Returning values from lambda:
        val sum: {a: Int, b: Int -> a + b}
        println(sum(5,3))
        



//E - Lambda as parameters: //Most use case
        fun performOperation(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
                return(operation(a, b))
        }
        val result = performOperation(5, 6){x, y -> x*y}

//F - Capturing variables: Lambdas can capture variables from the enclosing scope
fun main(){
        var counter = 0
        val increment = {counter +=1}
        increment()
        increment()
        print(counter) //output: 2
}











//Here: 6 - Packages =========================================================================================================
/*In Kotlin, packages are used to organize code into namespaces, which helps manage large codebases and avoid name conflicts */

//A - Package Declaration: 
        //The package declaration specifies the namespace for the file.
        //It is usually the first statement in the Kotlin file.
        //The package name typically follows the reverse domain name notation:
        // code file placed in : src/main/kotlin/com/example/utils/MathUtils.kt ==> Package will be declared as follow
        package com.example.utils
        fun add(a: Int, b: Int): Int { return a + b }
        fun subtract(a: Int, b: Int): Int { return a - b }
        object MathConstants {
                const val PI = 3.1
                const val E  = 2.71
        }

//B - Default Package: 
        //If a file does not include a package declaration, it is placed in a default unnamed package.
        // code file placed in: src/com/example/app/Main.kt
        package com.example.app                     //Decalration
        import com.example.utils.add                //Import function add
        import com.example.utils.subtract           //Import function substract
        import com.example.utils*                   //Importing all members (wild)
        import come.example.utils.MathConstatnts.PI // Kotlin support import of object member

        fun main() {
                val sum = add(3, 4)
                val difference = subtract(10, 5)
                println("Sum: $sum")
                println("Difference: $difference")
        }


/*C - Package Scope/ Visibility modifiers: 
        Classes, funs and props, defined in a package are accessible to other files in the same package.
        Access to these members from other packages depends on their visibility modifiers: "public", "internal", "private" */
        //1 - Public: member is accessible from everywhere
        //2 - internal: withing the same module
        //3 - protected: withing the same class and its subclasses
        //4 - private: withing the same file

        package com.example
        //access within the same module
        internal class InternalClass {
                fun internalFunction(){
                        println("Internal function")
                }
        }
        //Access Within the same file
        private class privateClass(){
                fun privateFunction(){
                        println("private function")
                }
        }

        fun main(){
                val internalz = InternalClass()
                internalz.internalFunction() //Accessible
                val privatez = privateClass() //Error cannot access
        }


//D - Top level declaration: Kotlin allows functions and properties to be declared at the top level of a file, meaning they are not inside any class.
        package com.example
        fun add(a: Int, b: Int): Int = a+b
        class BiBilcal{}
        fun main(){}

//E - module is a set of Kotlin files compiled together,
/*
        => Android project: a module can be an application module, a library module, or a test module,
        each defined by its own build.gradle file.
        => Gradle project:
        my-multi-module-project/
        ├── build.gradle.kts    //Root project
        //plugins {}
        //allprojects {}
        ├── settings.gradle.kts
        |       //rootProject.name = "my-multi-module-project"
        |       //include("module1", "module2")
        ├── module1/
        │       └── build.gradle.kts
        //plugins {}
        //dependencies {implementation(kotlin("stdlib"))}
        └── module2/
        └── build.gradle.kts
        //plugins {}
        //dependencies {implementation(project(":module1"))implementation(kotlin("stdlib"))}    
*/




//Here: 7 - Interfaces =======================================================================================================
// contains abstract methods(without implementations) and concrete methods (with implementation)
// => allow to define a contract that class can implement
// => a class or an object can inherit interfaces, thereby inheriting the abstract methods and providing implementations for them

//A - Interface Declaration:
        interface MyInterface {
                fun abstractMethod()
                fun concreteMethod(){
                        println("bla bla")
                }
                val propertyWithImplementation: String
                        get() = "Property with default implementation" //Custom getter for this property// Kotlin shit :)

                val abstractProperty : String
        }

//B - Implementing an interface: Must provide implemntation for all abstract members:
        class MyClass: MyInterface, InterfaceB {
                override fun abstractMethod() {
                        print("my abstract method is implmented")
                }
                override val abstractProperty: String = "plan"
        }

//C - Interface can inherite from other interface:
        interface BaseInterface{
                fun abstractBaseFun()
        }
        interface derivedInterface: BaseInterface{
                fun abstractDerived()
        }
        class MyClass: derivedInterface{
                override fun abstractDerived() {
                        print("bla")
                }

                override fun abstractBaseFun() {
                        print("sss")
                }
        }

//D - interface with default implementation for some of its members:
        interface MyInterface {
                fun methodWithDefault() {
                        println("Default implementation")
                }
        }
        class MyClass : MyInterface {
        // No need to override methodWithDefault() unless customization is needed
        }
        fun main() {
                val myClass = MyClass()
                myClass.methodWithDefault() // Output: Default implementation
        }

//E - Interface usage in function parameters and return types:
/*The second common usage for interface(alongside used as a contracts) is:
Usage of interfaces as parameters types and return types, this allow functions to accept and return any
instance of a class that implements the interface: */
        interface Printer {
                fun print(message: String)
        }
        class PrintConsole : Printer {
                override fun print(message: String){
                        println(message + "Console")
                }
        }

        class PrintBox : Printer{
                override fun print(message: String){
                        println(message + "Box")
                }
        }

        fun printerFunction(print: Printer, message: String){
                print.prin(message)
        }

        fun main(){
                val box = PrintBox()
                val consol = PrintConsole()
                printerFunction(box, "This message is printerd with box class instance/ using interface as a general paramter ")
                printerFunction(consol, "This message is printerd with box class instance/ using interface as a general paramter ")
        }









//Here: 8 - Standard functions================================================================================================
/*
In kotlin, they belong to a group "scope functions": execute a block of code withing the context of an object
        =>let   : return: results of lambda block  context: it     Nullable types, transformation, and chaining
        =>run   : return: results of lambda block  context: this   Executing multiple statements and returning a computed result
        =>with  : return: results of lambda block  context: this   like run but u can pass the object as an argument
        =>apply : return: original object          context: this   Configuring or initializing objects
        =>also  : return: original object          context: it     Additional operations while keeping the original object intact
*/

//a - let       : used for scoping and null safety
        val name: String? = "Kotlin"
        val length = name?.let {
                println("Name is $it")
                it.length
        }
        println(length) // Output: 6

//b - run
        val length = "Kotlin".run {
                println("Name is $this")
                this.length
        }
        println(length) // Output: 6


//c - with
        val length = with("Kotlin") {
                println("Name is $this")
                this.length
        }
        println(length) // Output: 6


//d - apply
        val person = Person().apply {
                name = "John"
                age = 30
        }
        println(person) // Output: Person(name=John, age=30)

//e - also
        val person = Person().also {
                it.name = "John"
                it.age = 30
        }
        println(person) // Output: Person(name=John, age=30)



//f - takeIf    : returns the object if it satisfies the given predicate, otherwise it returns null
        val number = 10
        val result = number.takeIf { it > 5 }
        println(result) // Output: 10

        val result2 = number.takeIf { it > 15 }
        println(result2) // Output: null


//g - takeUnless: opposite of takeIf
        val number = 10
        val result = number.takeUnless { it > 15 }
        println(result) // Output: 10

        val result2 = number.takeUnless { it > 5 }
        println(result2) // Output: null


//H - repeat    : The repeat function executes the given block of code a specified number of times.
        repeat(3) {
                println("Hello")
        }
        // Output:
        // Hello
        // Hello
        // Hello


//I - lazy      : used for lazy initalization, what is between {} will be executed only at axecution time // not not after compilation time
        val lazyValue: String by lazy {
                println("Computed!")
                "Hello"
        }
        println(lazyValue) // Output: Computed! Hello
        println(lazyValue) // Output: Hello

//J - Example in chains:
        data class Person(var name: String, var age: Int)

        val person = Person("Jane", 25)
                .also { println("Initial person: $it") }
                .apply { age += 5 }
                .let {
                        println("After applying age: $it")
                        it.name = "Jane Doe"
                        it
                }
                .run {
                        println("After changing name: $this")
                        this
                }

        println("Final person: $person")
        // Output:
        // Initial person: Person(name=Jane, age=25)
        // After applying age: Person(name=Jane, age=30)
        // After changing name: Person(name=Jane Doe, age=30)
        // Final person: Person(name=Jane Doe, age=30)






//Here: 9 - Other types of classes ===========================================================================================
//Every Kotlin class implicitly inherits from "Any"
//a - Data Classes: Data classes are intended to hold data.
        // They automatically generate useful methods like equals(), hashCode(), toString(), copy(), and componentN() functions.
        data class User(val name: String, val age: Int)
        fun main() {
                val user1 = User("Alice", 30)
                val user2 = User("Alice", 30)
                println(user1 == user2) // Output: true
                println(user1)          // Output: User(name=Alice, age=30)
                val user3 = user1.copy(name = "Bob")
                println(user3)          // Output: User(name=Bob, age=30)
        }


//b - Sealed classes: Sealed classes represent restricted class hierarchies, where a value can have one of the specified types. 
        //They are used for representing algebraic data types, particularly in cases where the type can be one of a limited number 
        //of possibilities.
        sealed class Result {
                data class Success(val data: String) : Result()
                data class Error(val exception: Throwable) : Result()
        }

        fun handleResult(result: Result) {
                when (result) {
                        is Result.Success -> println("Success: ${result.data}")
                        is Result.Error -> println("Error: ${result.exception.message}")
                }
        }

        fun main() {
                val successResult = Result.Success("Kotlin")
                val errorResult = Result.Error(Exception("Something went wrong"))

                handleResult(successResult)  // Output: Success: Kotlin
                handleResult(errorResult)    // Output: Error: Something went wrong
        }


//C - Enum: Enum classes are used to define a set of constants. They are particularly useful for representing 
        //fixed sets of related constants, such as days of the week, directions, or states.
        enum class Direction {
                NORTH, SOUTH, EAST, WEST
        }

        fun main() {
                val direction = Direction.NORTH
                println(direction) // Output: NORTH

                for (dir in Direction.values()) {
                        println(dir)
                }
                // Output:
                // NORTH
                // SOUTH
                // EAST
                // WEST
        }


//d - Inline classes: Inline classes are used to create type-safe wrappers around primitive types or other types without the 
        //overhead of additional heap allocations.
        @JvmInline
        value class Email(val value: String)

        fun main() {
                val email = Email("example@example.com")
                println(email.value) // Output: example@example.com
        }



//e - Object declarations: Object declarations define a singleton. This is useful when you need a class with only one instance, 
        //such as for utility classes or singletons.
        object Logger {
                fun log(message: String) {
                        println("Log: $message")
                }
        }

        fun main() {
                Logger.log("This is a log message") // Output: Log: This is a log message
        }



//f - Abstract classes: Abstract classes are classes that cannot be instantiated on their own and must be subclassed. 
        //They can contain abstract members (which have no implementation) and non-abstract members (which have an implementation).
        abstract class Animal(val name: String) {
                abstract fun makeSound()

                fun printName() {
                        println("Animal name: $name")
                }
        }

        class Dog(name: String) : Animal(name) {
                override fun makeSound() {
                        println("Woof!")
                }
        }

        fun main() {
                val dog = Dog("Buddy")
                dog.printName()  // Output: Animal name: Buddy
                dog.makeSound()  // Output: Woof!
        }


//g - Classes with private constructor:
/* this type of classes are used by making its primary constructor a private, which means:
        the class cannot be instantiated directly from outside the class. 
        This is a common pattern in specific scenarios, such as when you want to control instance creation 
        through factory methods or enforce the singleton pattern. */
                //Example: instance of MyClass will be created withing the class itself using factory method create() from companion object, 
                //which is a singleton object associated with the class
                class MyClass private constructor(name: String): MyClass{
                        companion object {
                                fun create(naame: String): MyClass {
                                        return MyClass(name)
                                }
                        }

                        fun println() {
                                println("name: $name")
                        }
                }

                fun main(){
                        val instance = MyClass.create("Namiq") 
                        instance.printName()
                }


/* Detailed example of the use of companion object:
Companion object (equicalent to static in Java) : Is a special kind of object declaration inside a class that allows you to 
define functions and properties that belong to the class itself rather than to instances of the class. like static in Java it gives: 
        2 - Accessing a member without creating instance
        1 - Creating instance using companion object's factory method */
                // Here: Static in Java
                public class MyClass {
                        //Static field
                        private static String greeting = "Hello";

                        //Static method
                        public static String greet(){
                                return greeting;
                        } 

                        //Static factory method
                        public static MyClass create(){
                                return new MyClass():
                        }

                        // method for the instantiated object:
                        public void printGreeting() {
                                system.out.prinln(greeting);
                        }
                }
                public static void main(String[] args){
                        MyClass.greet()                         // accessing static method withou creating instance
                        MyClass objecto = MyClass.create();     // creating an instance using the static factory method (Won't be possible without static in Java)
                }

                //Here: Companion object in Kotlin
                class MyClass private constructor(){
                        //Companion object members <=> static like members
                        companion object {
                                private val greeting = "Hello"
                                fun greet(): String{
                                        return greeting
                                }
                                fun create():MyClass { //factory method
                                        return MyClass()
                                }
                        }
                        //Instance method
                        fun prinName(){
                                prinln(greeting)
                        }
                }

                fun main(){
                        println(MyClass.greet())        //Accessing a member without creating instance
                        val instance = MyClass.create   //Creating instance using companion object's factory method
                }





//Here: 10 - Extension: =========================================================================================================
/*
Extensions in Kotlin provide a way to add new functionality to existing classes without modifying their source code. 
This feature can be used to extend libraries or third-party classes, as well as your own classes. Kotlin supports both extension functions and extension properties.
*/

//A - Extension Functions: An extension function allows you to add a new function to an existing class.
        fun ClassName.functionName(parameters): ReturnType {
                // function body
        }
        //Example:
        fun String.isPalindrome(): Boolean {
                val reversed = this.reversed()
                return this == reversed
        }

        fun main() {
                val word = "madam"
                println(word.isPalindrome()) // Output: true, standard String class does not have this method 
        }

//B - Extension Properties: An extension property allows you to add a new property to an existing class.
        val ClassName.propertyName: PropertyType
                get() = // property getter implementation

        //Example:
        val String.lastChar: Char
                get() = this[this.length - 1]

        fun main() {
                val word = "Kotlin"
                println(word.lastChar) // Output: n
        }

//C - Extensions Are Static: kotlin translate extention function call into a static function call, with receiever object as parameter, without modifing the class.
        open class Shape
        class Rectangle : Shape()

        fun Shape.getName() = "Shape"
        fun Rectangle.getName() = "Rectangle" 
        fun printClassName(shape: Shape) {
                println(shape.getName())
        }

        fun main() {
                val rectangle: Shape = Rectangle()      // => static type is "Shape", runtime type is "Rectangle"           
                printClassName(rectangle)               // => static type will be used for calling extention functions => outpute : shape 
        }



//D : Nullable Receiver: You can define extension functions and properties on nullable types.
        fun String?.isNullOrEmpty(): Boolean {
                return this == null || this.isEmpty()
        }
        fun main() {
                val nullString: String? = null
                println(nullString.isNullOrEmpty()) // Output: true

                val emptyString = ""
                println(emptyString.isNullOrEmpty()) // Output: true

                val nonEmptyString = "Kotlin"
                println(nonEmptyString.isNullOrEmpty()) // Output: false
        }


//E - Extension Functions in Generic Classes
        fun <T> List<T>.secondOrNull(): T? {
                return if (this.size >= 2) this[1] else null
        }
        fun main() {
                val list = listOf(1, 2, 3)
                println(list.secondOrNull()) // Output: 2

                val shortList = listOf(1)
                println(shortList.secondOrNull()) // Output: null
        }

//F - Member Extensions: An extension function can also be defined inside a class. 
        //Such an extension function can access the members of the class it's defined within.
        class User(val name: String) {
                fun printName() {
                        println(name)
                }

                fun String.greet() {    // Extention of String defined inside this class
                        println("Hello, $this! My name is $name.")
                }

                fun useExtension() {
                        name.greet()    //This calls the String.greet() extension function
                }
        }

        fun main() {
                val user = User("Alice")
                user.useExtension() // Output: Hello, Alice! My name is Alice.
        }


//G - Extensions and Companion Objects: If you add companion object to your Class, you can apply the "Call withou instance" on your CO extended functions
        class MyClass {
                companion object {
                        // Companion object content
                }
        }

        fun MyClass.Companion.sayHello() {
                println("Hello from the companion object!")
        }

        fun main() {
                MyClass.sayHello() // Output: Hello from the companion object!
        }






//Here: 11 - Generics ============================================================================================
/* Generics in Kotlin provide a way to create classes, interfaces, and functions that can operate on types specified 
only at the time of their instantiation or usage. This allows for code reusability and type safety. 
        - **Generic Classes**           : Classes that can operate on types specified at the time of instantiation.
        - **Generic Functions**         : Functions that can operate on types specified at the time of invocation.
        - **Constraints**               : Restricting the types that can be used as type parameters.
        - **Generic Extensions**        : Extension functions with generic types.
        - **Variance**                  : Control how subtypes of a generic type can be substituted (covariant, contravariant).
        - **Type Projections**          : Flexibility and safety when dealing with producer and consumer types.
        - **Reified Type Parameters**   : Allow access to the actual type arguments at runtime in inline functions.
*/

//A - Generic Classes : You can define a class with type parameters.
        class Box<T>(val value: T)
        fun main() {
                val intBox = Box(1)
                val stringBox = Box("Kotlin")
                println(intBox.value)    // Output: 1
                println(stringBox.value) // Output: Kotlin
        }


//B - Generic Functions : You can define functions with type parameters.
        fun <T> functionName(param: T): ReturnType
        fun <T> toList(vararg elements: T): List<T> {
                return elements.toList()
        }
        fun main() {
                val intList = toList(1, 2, 3)
                val stringList = toList("a", "b", "c")

                println(intList) // Output: [1, 2, 3]
                println(stringList) // Output: [a, b, c]
        }

//C - Constraints : You can restrict the types that can be used as type parameters by using constraints.
        fun <T: SomeType> functionName(param: T): ReturnType
        fun <T: Number> sum(a: T, b: T): Double {
                return a.toDouble() + b.toDouble()
        }
        fun main() {
                println(sum(1, 2)) // Output: 3.0
                println(sum(1.5, 2.3)) // Output: 3.8
        }


//D - Generic extensions : You can define extensions with generic types.
        fun <T> List<T>.printAll() {
                forEach { println(it) } //Here: List is a class but with <T> becames generic class, and i'm defining an extention .printAll() in which i used a lambda function forEach()
        }
        fun main() {
                val list = listOf(1, 2, 3)
                list.printAll() // Output: 1, 2, 3
        }


//E - Variance : Kotlin supports variance to provide more flexibility and type safety. There are three kinds of variance annotations:
        /* variances in kotlin allow a safer and flexible code, helping cathcing potential type mismatch at compile time, thereby reducing runtime errors
                => By controlling how types relate to each other, you can ensure that your generic classes and functions are used 
                correctly in different contexts, preventing common type errors that might occur in other programming languages, 3 types of variance:
                => Covariance           : "out" => subType can feed a superType: Giving a subType "Doge" where a superType "Animal" is expected 
                => Contravariance       : "In"  => superType can feed a subType: giving a SuperType "Animal" where a subtype "Doge" is expected  
                => Inavriance           :       => No subTyping relationship is allowed between different generic instantiation
        */
        //E - 1 Covariant (`out`) The type parameter is only produced and can be used as a return type. It is safe to read from.
                // `T` is a generic type, and `out` makes `Producer` covariant
                class Producer<out T>(private val value: T) {
                        fun produce(): T {
                                return value
                        }
                }
                open class Animal
                class Dog : Animal()

                fun main() {
                        val dogProducer: Producer<Dog> = Producer(Dog())

                        // Thanks to `out`, `Producer<Dog>` can be assigned to a `Producer<Animal>`
                        val animalProducer: Producer<Animal> = dogProducer //Expected a superType: Animal, feeded by a subType: Doge

                        // Now we can use `animalProducer` to produce an `Animal`
                        val animal: Animal = animalProducer.produce()
                        println(animal)
                }


        //E -2 Contravariant (`in`) : The type parameter is only consumed and can be used as a parameter type. It is safe to write to.
                // `T` is a generic type, and `in` makes `Consumer` contravariant
                class Consumer<in T> {
                        fun consume(item: T) {
                                println("Consuming $item")
                        }
                }
                open class Animal
                class Dog : Animal()
                fun main() {
                        // `Consumer<Animal>` can consume any subtype of Animal, like Dog
                        val animalConsumer: Consumer<Animal> = Consumer()

                        // Thanks to `in`, `Consumer<Animal>` can be assigned to `Consumer<Dog>`
                        val dogConsumer: Consumer<Dog> = animalConsumer

                        // Now we can use `dogConsumer` to consume a Dog
                        dogConsumer.consume(Dog()) // Output: Consuming Dog
                }

        //E - 3 Invariant: with no variance annotation. The type parameter is invariant: the default behavior in Kotlin 
                class Container<T>(val value: T)
        


//F - Type Projections : Type projections provide a way to use generics with more flexibility and safety.
        // Ensuring Type Safety   : They prevent you from performing unsafe operations on generic types when the exact type isn't known, ensuring that your code remains type-safe.
        // Dealing with Variance  : They allow you to handle different types of variance at the usage site, giving you flexibility without sacrificing safety.
        // Working with Libraries : When using generic types in libraries or frameworks where the exact types are not known or should not be restricted, type projections allow safe and flexible interaction with these types.

        //F - 1 Out-projection (`out T`): Allows reading from a generic type but prevents writing. Used when you only need to consume data.
                fun printAnimals(animals: List<out Animal>) {
                        // Here 1 : Covariant =>  with "out", can pass subType when expecting superType
                        // Here 2 : Type projection => We can read elements as Animals
                                // We cannot add anything to the list, not even null, because the actual type might be more specific
                                // animals.add(Animal()) // Error: Out-projected type 'List<out Animal>' prohibits the use of 'fun add(element: E): Boolean'
                        for (animal in animals) {
                                println(animal)
                        }
                }
                fun main() {
                        val dogs: List<Dog> = listOf(Dog(), Dog()) 
                        printAnimals(dogs)  
                }
        
        //F - 2 In-projection (`in T`) Allows writing to a generic type but prevents reading. Used when you only need to produce data.
                fun addDogToList(dogs: MutableList<in Dog>) {                         
                        //Here 1 : Contravariant => with "In", can pass superType when expecting SubType 
                        //Here 2 : Type Projection => We can add elements of type Dog (or any subtype) to the list
                                // We cannot read elements as Dogs because the list might actually hold more general types
                                // val dog: Dog = dogs[0] // Error: Out-projected type 'MutableList<in Dog>' prohibits the use of 'fun get(index: Int): E'
                        dogs.add(Dog())
                }
                fun main() {
                        val animals: MutableList<Animal> = mutableListOf()
                        addDogToList(animals)  
                }



        //F - 3 Star-projection (`*`) : A special type of projection in Kotlin that is used when you don’t care about the exact type parameter but need to use the generic type in a restricted way.
                // The only thing you can assume is that the elements are of type `Any?`.
                // You can iterate over the items and treat them as `Any?`, but you cannot safely add new items to the list.
                fun printItems(items: List<*>) {
                        // We can read elements as `Any?`, because `*` means "unknown type"
                        for (item in items) {
                                println(item)  
                                // We only know that item is of type Any?
                                // We cannot add anything to the list, not even null
                                // items.add(null) => Error: Out-projected type 'List<*>' prohibits the use of 'fun add(element: E): Boolean'
                        }
                }
                fun main() {
                        val mixedItems: List<Any> = listOf("string", 42, true)
                        printItems(mixedItems)  // This works, but we don't know the exact type of items inside the list
                }









//J - Reified Type Parameters : allow you to access the actual type arguments at runtime. This is only available for inline functions.
        Normally, in Java and Kotlin, generic type information is erased at runtime due to a concept called **type erasure**. 
        This means that you cannot directly access or inspect the type parameter of a generic class or function at runtime. 
        However, Kotlin provides a way around this limitation with **reified** type parameters, but only within **inline functions**.

        //Inline Functions and Reified Type Parameters
        In Kotlin, a function marked with `inline` can have reified type parameters. When you use `reified`, the compiler will keep the type information at runtime, 
        allowing you to perform operations like checking the type, casting, or even creating instances of the type.

        //How to Use Reified Type Parameters: To declare a reified type parameter, you need to do the following:
                inline fun <reified T> isInstance(value: Any): Boolean {
                        return value is T
                }
                fun main() {
                        val string = "Hello, World!"
                        val result = isInstance<String>(string)  // true
                        println(result)
                }
                // `inline`     : The function is marked as `inline`, meaning that the compiler will replace the function call with the actual code during compilation. This allows the type information to be retained.
                // `reified T`  : By making `T` reified, you can perform type checks (e.g., `is T`) and other operations that require knowledge of the actual type at runtime.
                // Usage     : The `isInstance` function can now check whether the given value is of the specific type `T`.


        //Usage 1 : Type Checking and Casting: Reified type parameters make it easy to perform type checks and casting within generic functions:
                inline fun <reified T> castOrNull(value: Any): T? {
                        return if (value is T) value else null
                        }
                fun main() {
                        val number: Any = 42
                        val string: String? = castOrNull<String>(number)  // null, because number is not a String
                        val int: Int? = castOrNull<Int>(number)  // 42, because number is an Int
                        println(string)  // Output: null
                        println(int)     // Output: 42
                }


        //Usage 2 : Creating Instances of Generic Types: You can even create instances of generic types using reified type parameters:
                inline fun <reified T> createInstance(): T? {
                        return try {
                                T::class.java.getDeclaredConstructor().newInstance()
                        } catch (e: Exception) {
                                null
                        }
                }
                fun main() {
                        val instance: String? = createInstance<String>()
                        println(instance)  // Output: "" (an empty string, since it's the default constructor output)
                }

        //Usage 3 : Filtering Collections by Type: Reified type parameters are particularly useful for filtering collections by type:
                inline fun <reified T> List<Any>.filterByType(): List<T> { //extention of List class defined as an inline function
                        return this.filterIsInstance<T>()
                }
                fun main() {
                        val mixedList: List<Any> = listOf(1, "Hello", 2.0, "World", 3)
                        val strings: List<String> = mixedList.filterByType<String>()
                        println(strings)  // Output: [Hello, World]
                }

        // Benefits of Reified Type Parameters
                1. **Runtime Type Information**: Allows you to retain and use the actual type information at runtime, enabling operations like type checking, casting, and reflection.
                2. **Simplified Code**: Eliminates the need to pass a `Class<T>` object or use complex reflection code to achieve the same functionality.
                3. **Flexibility**: Provides more flexibility in working with generics, making your code more powerful and concise.

        // Limitations
                - **Inline Requirement**: Reified type parameters can only be used in `inline` functions. This means they are not available for regular functions or classes.
                - **Increased Code Size**: Since inline functions are inlined at each call site, overuse of inline functions can lead to an increase in the size of the compiled code.







//Here: 12 - Other concepts: lateinit =============================================================================================
/* 
=> In Kotlin, the `lateinit` keyword is used to declare a non-null variable that will be initialized later. 
        // This keyword is only applicable to `var` properties and cannot be used with `val` properties or primitive types.
=> It is useful when you cannot initialize the variable at the point of declaration but you are certain it will be 
        // initialized before it is used. Common use cases include dependency injection, unit testing, and Android views.
*/
        //Example : Without `lateinit`:
                class MyClass {
                        var name: String? = null
                        fun initialize() {
                                name = "Kotlin"
                        }
                        fun printName() {
                                println(name?.length)   // Safe call because name can be null
                        }
                }
                fun main() {
                        val myClass = MyClass()
                        myClass.initialize()
                        myClass.printName() // Output: 6
                }
        //Example : With `lateinit`:
                class MyClass {
                        lateinit var name: String       // No need for it to be declared nullable 
                        fun initialize() {
                                name = "Kotlin"
                        }
                        fun printName() {
                                println(name.length)    // No need for safe call because name is guaranteed to be non-null after initialization
                        }
                }
                fun main() {
                        val myClass = MyClass()
                        myClass.initialize()
                        myClass.printName() // Output: 6
                }


        //NB: 1 Cannot Use with `val` or Primitive Types:
                lateinit val name: String // Error: lateinit modifier is not allowed on immutable properties
                lateinit var age: Int     // Error: 'lateinit' modifier is not allowed on properties of primitive types


        //NB: 2 Check Initialization: You can check if a `lateinit` property has been initialized using the `::propertyName.isInitialized` property reference.
                if (::name.isInitialized) {
                        println("Name is initialized")
                } else {
                        println("Name is not initialized")
                }

        //NB: 3 Accessing Before Initialization: If you try to access a `lateinit` property before it has been initialized, it will throw an `UninitializedPropertyAccessException`.
                fun printName() {
                        if (::name.isInitialized) {
                                println(name)
                        } else {
                                println("Name is not initialized")
                        }
                }





//Here: 13 - Other concepts: Casting =============================================================================================
Casting in Kotlin is used to convert a variable from one type to another. There are two main types of casting in Kotlin: 
safe casting** and **unsafe casting**. Kotlin also provides the `is` operator to check the type of a variable before casting


// Unsafe Casting : Unsafe casting is done using the `as` operator. If the cast is not possible, an exception (`ClassCastException`) is thrown.
        fun main() {
                val obj: Any = "Kotlin"
                val str: String = obj as String // Casting done
                val num: Int = obj as Int       // Casting not done and Throws ClassCastException
        }

//Safe Casting : Safe casting is done using the `as?` operator. If the cast is not possible, it returns `null` instead of throwing an exception.
        fun main() {
                val obj: Any = "Kotlin"
                val str: String? = obj as? String    //Casting done
                val num: Int? = obj as? Int          //Casting not done, bit no exception, num will be null
        }

//Type Checking with `is` : Before casting, it's often useful to check if the variable is of the expected type using the `is` operator. This can help avoid `ClassCastException`.
        fun printLength(obj: Any) {
                if (obj is String) {
                        println("The length of the string is ${obj.length}")
                } else {
                        println("Not a string")
                }
        }
        fun main() {
                printLength("Hello, Kotlin!")   // Output: The length of the string is 14
                printLength(1234)               // Output: Not a string
        }








//Here: 14 - Other concepts: lazy ==================================================================
In Kotlin, the `lazy` delegate is a feature that allows you to initialize a property only when it is accessed for the first time. 
This is known as lazy initialization, and it can be useful when the initialization of a property is resource-intensive or when the 
property might not always be used. Also it is a thread safe implementation



// Syntax: val propertyName: Type by lazy { initializer }
        // The `lazy` function takes a lambda expression that provides the initial value for the property.
        // The property is only initialized once, and subsequent accesses to the property will return the cached value.

//Example of `lazy`
        class MyClass {
        // Lazy initialization of a property
        val greeting: String by lazy {
                println("Initializing greeting...")
                "Hello, Kotlin!"
        }
        }
        fun main() {
                val myClass = MyClass()
                // The greeting property is not initialized yet
                println("Before accessing greeting")
                // Access the lazy property for the first time
                println(myClass.greeting)       // Output: Initializing greeting...
                                                // Hello, Kotlin!
                // Access the lazy property for the second time:
                println(myClass.greeting)  // Output: Hello, Kotlin!
        }

// Use Cases for `lazy`
        - **Expensive Computations**: When the initialization of a property is resource-intensive or time-consuming, and you want to delay it until the property is actually needed.
        - **Conditional Initialization**: When a property may not be used in all cases, using `lazy` can help avoid unnecessary computations or resource allocation.
        - **Thread Safety**: The default `lazy` initialization mode is thread-safe. Kotlin uses a synchronization mechanism to ensure that the property is initialized only once, even if accessed by multiple threads.

// `lazy` Initialization Modes
Kotlin provides three modes for `lazy` initialization:
        // 1. **SYNCHRONIZED (default)**: Ensures thread-safety by using synchronization. This is the default mode. 
                val property: String by lazy(LazyThreadSafetyMode.SYNCHRONIZED) { "Hello" }

        //2. **PUBLICATION**: Multiple threads can initialize the property simultaneously, but only the first computed value will be used. This mode may be slightly faster than `SYNCHRONIZED`.        
                val property: String by lazy(LazyThreadSafetyMode.PUBLICATION) { "Hello" }

        //3. **NONE**: No thread-safety guarantees. Use this if you are sure that the property will only be accessed from a single thread.
                val property: String by lazy(LazyThreadSafetyMode.NONE) { "Hello" }






//Here: 15 - Coroutines && Asynchronous programming ========================================================================================================
/*
        Kotlin coroutines provide a way to write asynchronous, non-blocking code in a sequential style. 
        They are part of the Kotlin standard library, they make asynchronous programming easier by:
        => removing the need for callback-based code, 
        => Simplifying complex asynchronous workflows, and improving readability.

*/

//A - Key Concepts of Coroutines
        1. **Coroutine**        : A coroutine is a concurrency design pattern that you can use on Android to simplify code that executes asynchronously.
                                        => Think about its as a: Lightweight thread that can be suspended and resumed.
        2. **CoroutineScope     : Defines a scope for new coroutines. Every coroutine builder `launch` or `async` is an extension on `CoroutineScope`.
                                        => Defines the lifecycle of coroutines.
        3. **Coroutine Context  : Includes a job and a dispatcher. It defines the behavior of a coroutine, such as where it runs and in what thread.
        4. **Dispatcher**       : Determines the thread used by the coroutine. Common dispatchers include `Dispatchers.Main`, `Dispatchers.IO`, and `Dispatchers.Default`.
        5. **Job**              : A cancellable thing with a life-cycle that culminates in its completion.


//B - Coroutine Builders
        //launch: This builder is used to start a new coroutine without blocking the current thread. It returns a `Job` object.
        import kotlinx.coroutines.*
        fun main(){
                runBlocking {
                        val job = launch {
                                delay(1000L)
                                println("World!")
                        }
                        println("Hello,")
                        job.join()   //This will Wait for the coroutine to finsh //It is a suspend function ==> used with runBlocking, meaniong, it will block main()
        }

        //async: This builder is used to start a new coroutine and returns a `Deferred` object, which has a `await()` method to get the result.
        import kotlinx.coroutines.*
        fun main(){
                runBlocking {
                        val deferred = async {
                                delay(1000L)
                                "World!"
                        }
                        println("Hello,")
                        println(deferred.await()) // Waits for the result
        }
        
        //B - Plus: For Information Only:
                //To cancel a job that is still running
                        job.cancel() 
                //Sometimes, the job is heavy, it cannot be canceled easily => Coroutine is busy for executing the job 
                //That it doesn't find time to check cancellation ==> We can check mannually if the coroutine is still active: 
                        if(isActive) inside coroutine builder 
                //Or u can use a time based cancellation:
                val job = coroutineScope.launch(Dispatchers.Default){
                        log.d("This is ")
                        withTimeout(1000){
                                for(i in 10..100){
                                        if(isActive){
                                        HeavyProcessingFunc(i)
                                        }
                                }
                        }
                }





/*C - Coroutine Scope: A `CoroutineScope` keeps track of all coroutines started in that scope and provides structured concurrency, we can use:
        => CoroutineScope       : General-purpose scope with customizable context.
        => GlobalScope          : Used for application-wide coroutines. //It is an object of coroutineScope, no invoke function, so use it to launch coroutine independent of any scope, tied to the entire app lifesycle
        => runBlocking          : Blocking scope, often used in main() or tests.
        => MainScope            : Typically used in UI components on the Main thread.
        => ViewModelScope       : Android-specific, tied to ViewModel lifecycle.
        => lifecycleScope       : Android-specific, tied to Activity/Fragment lifecycle.
        => supervisorScope      : Allows independent failure handling for child coroutines.
        => Custom Scope         : Define your own coroutine scope with specific contexts as needed.
        
In brief:
        Callable Scopes (coroutineScope, supervisorScope ): These are suspending functions, so you can use them with a lambda block
                like coroutineScope { ... }.
        Non-Callable Scopes (GlobalScope, MainScope, ViewModelScope): These are either objects or properties, so they cannot be invoked with a block.
                like: GlobalScop.launch(){}

        */
        fun main(){
                runBlocking {
                        launch(Dispatchers.Default) { //This willm be executed in thread 
                                delay(1000L)
                                println("Task from runBlocking")
                        }
                        launch(Dispatchers.IO){
                                //
                        }

                coroutineScope { 
                        launch { //This willm be executed in thread 
                                delay(1500L)
                                println("Task from nested launch")
                        }
                        delay(500L)
                        println("Task from coroutine scope") // This line will be printed before the nested launch
                }

                GlobalScope.launch(Dispatchers.maon){ //This willm be executed in thread 
                                //do some suspend shit
                                delay(1000L)
                        }
                }

                lifecycleScope.launch(){
                        while(true){
                                delay(100L)
                                Log.d(TAG, "This is messing the point")
                        }

                }



                println("Coroutine scope is over") // This line is not printed until the nested launch completes
        }


//D - Dispatchers: Kotlin provides several dispatchers to control the threading of coroutines.
        1 **Dispatchers.Main**       : Use this to run coroutines on the main thread, typically used for UI interactions.
        2 **Dispatchers.IO**         : Use this for I/O operations like reading from disk or network operations.
        3 **Dispatchers.Default**    : Use this for CPU-intensive operations.
        4 **Dispatchers.Unconfined** : Not confined to any specific thread. Inherits the thread from the caller.
        5 **newThreadByMe**          : Creat your own thread as a context
        
        //Example: runBlocking
        fun main(){
                runBlocking {
                        launch(Dispatchers.Main) {
                                println("Main dispatcher - runs on the main thread")
                        }

                        launch(Dispatchers.IO) {
                                println("IO dispatcher - runs on a background thread")
                        }

                        launch(Dispatchers.Default) {
                                println("Default dispatcher - runs on a background thread")
                        }

                        launch(Dispatchers.Unconfined) {
                                println("Unconfined dispatcher - inherits the caller thread")
                        }
        }

      

//E - Structured Concurrency: ensures that new coroutines are only launched in a specific scope, making it easier to manage their lifecycle and avoid memory leaks.
        suspend fun concurrentSum(): Int {
                coroutineScope {
                        val one = async { doSomethingUsefulOne() }
                        val two = async { doSomethingUsefulTwo() }
                        one.await() + two.await()
        }}
        suspend fun doSomethingUsefulOne(): Int {
                delay(1000L)
                return 13
        }

        suspend fun doSomethingUsefulTwo(): Int {
                delay(1000L)
                return 29
        }

        fun main(){
                runBlocking {
                        println("The answer is ${concurrentSum()}")
        }
        }






//F - Handling Exceptions: Kotlin coroutines handle exceptions in a structured way. You can catch exceptions in a coroutine by 
        //1 - Using `try-catch` blocks 
        //2 - using a `CoroutineExceptionHandler`.
        fun main(){
                runBlocking {
                        val handler = CoroutineExceptionHandler { 
                                _, exception -> println("Caught $exception")
                        }

                        val job = GlobalScope.launch(handler) {         //Pass the exceptionHandler instance to launch builder
                                throw AssertionError("My Custom Assertion Error")
                        }
                        job.join()
        }



        





//Here: 16 - Usage of Flows:====================================================================================================================================
Key Concept: Leverage the power of coroutines, by offering periodic emitting of values, handle stream of data asyncly offering Transformation, Filtering, Handling errors       

**Flow**                  : A cold, asynchronous stream that emits multiple values sequentially.
**Cold Stream**           : A Flow is a cold stream, meaning that it does not produce values until it is collected. This is in contrast to hot streams, which start emitting values as soon as they are created.
**Asynchronous**          : Flows are built on coroutines, allowing them to be non-blocking and to work seamlessly with other asynchronous operations.
**Sequential Emission**   : Flows emit values one after another, making them suitable for operations that need to be performed on each emitted value.

**Backpressure Handling** : Flows are designed to handle backpressure gracefully, meaning they can handle cases where the consumer is slower than the producer.
**Operators**             : You can transform, filter, and combine flows using a variety of operators like `map`, `filter`, `zip`, and `combine`.
**Error Handling**        : Flows support error handling using `catch` and `onCompletion`.
**Context Awareness**     : Flows can run on specific dispatchers using `flowOn`.
**Hot Flows**             : `SharedFlow` and `StateFlow` provide hot flow capabilities, emitting values immediately to subscribers.


//A - Basic Flow Example: Let's start with a simple example of a flow that emits a sequence of integers:
        fun simpleFlow(): Flow<Int> = flow {
                for (i in 1..5) {
                        delay(100) // Simulate some work
                        emit(i)    // Emit the next value
                }
        }

        fun main() = runBlocking {
                simpleFlow().collect 
                        { value ->
                                println(value)
                        }
        }

**Explanation**:
- **`flow {}`**: The `flow` builder is used to create a flow. Inside this block, you can emit values using the `emit()` function.
- **`delay(100)`**: Delays are used here to simulate asynchronous work.
- **`collect {}`**: The `collect` function is used to start the flow and receive the emitted values. It is a suspending function, meaning it runs in a coroutine and collects values sequentially.



### Operators in Flow: Kotlin Flow provides a rich set of operators to transform, filter, and combine flows.

#### 1. **Transformation Operators**
        //**`map`**: Transforms each emitted value.
        fun main() = runBlocking {
                simpleFlow()
                        .map { it * 2 }  // Multiply each value by 2
                        .collect { 
                                value -> println(value)
                        }
                }
        }

        //**`filter`**: Filters emitted values based on a predicate.
        fun main() = runBlocking {
                simpleFlow()
                        .filter { it % 2 == 0 }  // Only allow even numbers
                        .collect { value ->
                        println(value)
                        }
        }

        //**`transform`**: Provides more control over the emitted values, allowing you to emit different values or even multiple values for each input.
        fun main() = runBlocking {
                simpleFlow()
                        .transform { value ->
                                emit(value * 2)
                                emit(value * 3)
                        }
                        .collect { value ->
                                println(value)
                        }
        }

        //onEach:
        private fun collectFlow() {
                countDownFlow.onEach {
                        timo -> println("Collected value before mapping tranformation: $timo")
                }.launchIn(viewModelScope)
        }




#### 2. **Terminal Operators**
        - **`collect`**: Collects the flow and triggers the emission of values.  
        - **`toList`**: Converts the flow into a list.
                fun main(){
                        runBlocking {
                                val result = simpleFlow().toList()
                                println(result)  // Output: [1, 2, 3, 4, 5]
                        }
                }

        - **`first`**: Retrieves the first value emitted by the flow.
                fun main() = runBlocking {
                        val firstValue = simpleFlow().first()
                        println(firstValue)  // Output: 1
                }


#### 3. **Combining Flows**
- **`zip`**: Combines two flows into a single flow by applying a function to each pair of values.
        fun main() = runBlocking {
        val flow1 = flowOf(1, 2, 3)
        val flow2 = flowOf("a", "b", "c")
        
        flow1.zip(flow2) { a, b -> "$a -> $b" }
                .collect { value ->
                println(value)  // Output: 1 -> a, 2 -> b, 3 -> c
                }
        }

- **`combine`**: Combines two flows and emits a new value whenever any of the flows emit a value.
        fun main() = runBlocking {
                val flow1 = flowOf(1, 2, 3).onEach { delay(300) }
                val flow2 = flowOf("a", "b", "c").onEach { delay(400) }
        
        flow1.combine(flow2) { a, b -> "$a -> $b" }
                .collect { value ->
                println(value)  // Output: 1 -> a, 2 -> a, 2 -> b, 3 -> b, 3 -> c
                }
        }


### Flow Builders: Kotlin provides several flow builders to create flows:
        1. **`flow {}`**: The most common flow builder, which allows emitting multiple values.
                fun simpleFlow(): Flow<Int> = flow {
                        emit(1)
                        emit(2)
                        emit(3)
                }
   
        2. **`flowOf(vararg values)`**: Creates a flow from a fixed set of values.
                val flow = flowOf(1, 2, 3)

        3. **`asFlow()`**: Converts a collection or range into a flow.
                val flow = listOf(1, 2, 3).asFlow()

### Handling Errors in Flow: Flows have built-in support for error handling with operators like `catch` and `onCompletion`:
        - **`catch {}`**: Catches exceptions that occur in the upstream flow and allows you to handle them.
                fun main() = runBlocking {
                simpleFlow()
                        .map { check(it != 3) { "Value cannot be 3" } }
                        .catch { e -> println("Caught exception: $e") }
                        .collect { value ->
                        println(value)
                        }
                }

        - **`onCompletion {}`**: Executes a block of code when the flow completes, whether successfully or due to an error.
                fun main() = runBlocking {
                simpleFlow()
                        .onCompletion { println("Flow completed") }
                        .collect { value -> println(value)
                        }
                }

### Flow Context and Dispatchers
        Flows are context-aware, and you can specify which coroutine dispatcher they run on using the `flowOn` operator:
                fun main() = runBlocking {
                simpleFlow()
                        .flowOn(Dispatchers.Default)  // Run flow on Default dispatcher
                        .collect { 
                                value -> println("Collected on ${Thread.currentThread().name}: $value")
                        }
                }


### Hot Flows (SharedFlow and StateFlow): While `Flow` is cold by default, Kotlin also provides **hot flows** like `SharedFlow` and `StateFlow`:
        - **`SharedFlow`**: A hot flow that can emit values to multiple subscribers simultaneously.
        - **`StateFlow`**: A special kind of `SharedFlow` that holds a single updatable value and always replays the latest value to new subscribers.








//Here: 16 - Usage of Firebase ========================================================================================================================
Using Firebase in an app involves several steps, starting from setting up Firebase in the Firebase console to integrating its services into your app. Here's a step-by-step guide to help you through the process:

### 1. **Set Up Firebase in the Firebase Console**
   - **Create a Firebase Project:**
     1. Go to the [Firebase Console](https://console.firebase.google.com/).
     2. Click on "Add Project" and follow the instructions to create a new project.
     3. Configure Google Analytics if needed (this is optional but recommended for analytics features).
   
   - **Register Your App:**
     1. In your Firebase project, click on the "Add App" button.
     2. Choose the platform (iOS, Android, or Web) for your app.
     3. Follow the instructions to register your app (you'll need the package name for Android, bundle ID for iOS, etc.).
     4. Download the `google-services.json` (Android) or `GoogleService-Info.plist` (iOS) file and add it to your project.

### 2. **Add Firebase SDK to Your App**
   - **For Android:**
     1. Open your `build.gradle` files (both at the project and app levels).
     2. Add the classpath to the `google-services` plugin in the project-level `build.gradle`:
        ```gradle
        buildscript {
            dependencies {
                classpath 'com.google.gms:google-services:4.3.14' // Update to the latest version
            }
        }
        ```
     3. Apply the plugin and add Firebase dependencies in the app-level `build.gradle`:
        ```gradle
        apply plugin: 'com.google.gms.google-services'
        dependencies {
            implementation platform('com.google.firebase:firebase-bom:31.1.1') // Add Firebase BoM
            implementation 'com.google.firebase:firebase-analytics'
            // Add other Firebase products as needed
        }
        ```

   - **For iOS:**
     1. Install CocoaPods if not already installed:
        ```sh
        sudo gem install cocoapods
        ```
     2. Navigate to your iOS project directory and run:
        ```sh
        pod init
        ```
     3. Add Firebase dependencies to your `Podfile`:
        ```ruby
        platform :ios, '10.0'
        pod 'Firebase/Analytics'
        # Add other Firebase pods as needed
        ```
     4. Install the pods by running:
        ```sh
        pod install
        ```
     5. Open the `.xcworkspace` file to work on your project in Xcode.

   - **For Web:**
     1. Install Firebase using npm:
        ```sh
        npm install firebase
        ```
     2. Import and configure Firebase in your JavaScript file:
        ```javascript
        import { initializeApp } from "firebase/app";
        import { getAnalytics } from "firebase/analytics";

        const firebaseConfig = {
            apiKey: "YOUR_API_KEY",
            authDomain: "YOUR_PROJECT_ID.firebaseapp.com",
            projectId: "YOUR_PROJECT_ID",
            storageBucket: "YOUR_PROJECT_ID.appspot.com",
            messagingSenderId: "YOUR_MESSAGING_SENDER_ID",
            appId: "YOUR_APP_ID",
            measurementId: "YOUR_MEASUREMENT_ID"
        };

        const app = initializeApp(firebaseConfig);
        const analytics = getAnalytics(app);
        ```

### 3. **Initialize Firebase in Your App**
   - **For Android and iOS:**
     - Firebase will automatically initialize when you start your app if you've followed the steps above.
   
   - **For Web:**
     - The initialization is done in your script as shown in the code snippet above.

### 4. **Use Firebase Services**
   - Depending on the Firebase services you want to use (e.g., Authentication, Firestore, Realtime Database, Cloud Functions, etc.), you'll need to import the relevant SDKs and implement them in your app:
     - **Authentication:**
       ```javascript
       import { getAuth, signInWithEmailAndPassword } from "firebase/auth";

       const auth = getAuth();
       signInWithEmailAndPassword(auth, email, password)
           .then((userCredential) => {
               const user = userCredential.user;
           })
           .catch((error) => {
               console.error(error);
           });
       ```
     - **Firestore:**
       ```javascript
       import { getFirestore, doc, setDoc } from "firebase/firestore";

       const db = getFirestore();
       await setDoc(doc(db, "users", "user-id"), {
           firstName: "John",
           lastName: "Doe"
       });
       ```
     - **Realtime Database:**
       ```javascript
       import { getDatabase, ref, set } from "firebase/database";

       const database = getDatabase();
       set(ref(database, 'users/' + userId), {
           username: "JohnDoe",
           email: "john@example.com"
       });
       ```

### 5. **Test Your Implementation**
   - Run your app and test the Firebase functionalities you've implemented.
   - Use Firebase Console to monitor events, data, and any other features you’ve set up.

### 6. **Deploy Your App**
   - Deploy your app following the standard procedures for your platform.
   - If you're using Firebase Hosting, you can deploy directly from the Firebase CLI.

### 7. **Monitor and Optimize**
   - Use Firebase Analytics, Performance Monitoring, and other tools to monitor app performance and usage.
   - Optimize based on the insights you gather.

This process will give you a fully functional Firebase integration in your app. Depending on your needs, you can integrate more Firebase services by following the official documentation.






//Here: 16 - Usage of retrofit: ========================================================================================================================
Retrofit is a popular HTTP client library in Android that simplifies network requests and API integration. It is commonly used to interact with RESTful web services. Let's walk through a basic example of how to use Retrofit in an Android application to perform a simple GET request.

// ### Step 1: Add Dependencies
First, add the required dependencies in your `build.gradle` file:


dependencies {
    implementation 'com.squareup.retrofit2:retrofit:2.9.0'
    implementation 'com.squareup.retrofit2:converter-gson:2.9.0'
    // Optional: For logging network requests
    implementation 'com.squareup.okhttp3:logging-interceptor:4.9.1'
}


// ### Step 2: Define the API Interface
Create an interface that defines the endpoints of the API. For example: 
if you're working with a REST API that provides a list of users, the interface might look like this:
        import retrofit2.Call
        import retrofit2.http.GET

        // Data class for the API response
        data class User(val id: Int, val name: String, val username: String, val email: String)

        // Retrofit API interface
        interface ApiService {
        @GET("users")
        fun getUsers(): Call<List<User>>
        }


// ### Step 3: Create a Retrofit Instance
Create a Retrofit instance in your application. This is typically done in a singleton or a `Service` class.
        import retrofit2.Retrofit
        import retrofit2.converter.gson.GsonConverterFactory

        object RetrofitInstance {

        private const val BASE_URL = "https://jsonplaceholder.typicode.com/"

        val apiService: ApiService by lazy {
                Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(ApiService::class.java)
        }
        }


// ### Step 4: Make a Network Request
Now, you can use the `apiService` to make network requests. For example, you could make a GET request to retrieve a list of users:
        import android.os.Bundle
        import android.util.Log
        import androidx.appcompat.app.AppCompatActivity
        import retrofit2.Call
        import retrofit2.Callback
        import retrofit2.Response

        class MainActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)

                // Making the network request
                RetrofitInstance.apiService.getUsers().enqueue(object : Callback<List<User>> {
                override fun onResponse(call: Call<List<User>>, response: Response<List<User>>) {
                        if (response.isSuccessful) {
                        val users = response.body()
                        users?.forEach {
                                Log.d("MainActivity", "User: ${it.name}, Email: ${it.email}")
                        }
                        } else {
                        Log.e("MainActivity", "Request failed with code: ${response.code()}")
                        }
                }

                override fun onFailure(call: Call<List<User>>, t: Throwable) {
                        Log.e("MainActivity", "Network request failed: ${t.message}")
                }
                })
        }
        }


// ### Step 5: Run the App
When you run the app, it will make a GET request to `https://jsonplaceholder.typicode.com/users` and log the list of users to the console.


### Explanation
- **`ApiService` Interface**: This defines the endpoints you want to interact with. Each method in the interface corresponds to an API endpoint, and the annotations (`@GET`, `@POST`, etc.) specify the type of HTTP request.  
- **`RetrofitInstance` Object**: This object sets up the Retrofit instance. It includes the base URL of the API and any converters (e.g., Gson) that you want to use to automatically parse the JSON responses into Kotlin data classes.
- **`enqueue` Method**: This method makes an asynchronous request. The `onResponse` method is called when the request is successful, and `onFailure` is called if there is an error.

### Optional: Adding a Logging Interceptor
To log the HTTP requests and responses, you can add an interceptor:

        import okhttp3.OkHttpClient
        import okhttp3.logging.HttpLoggingInterceptor

        object RetrofitInstance {

        private const val BASE_URL = "https://jsonplaceholder.typicode.com/"

        private val loggingInterceptor = HttpLoggingInterceptor().apply {
                level = HttpLoggingInterceptor.Level.BODY
        }

        private val client = OkHttpClient.Builder()
                .addInterceptor(loggingInterceptor)
                .build()

        val apiService: ApiService by lazy {
                Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(ApiService::class.java)
        }
        }


### Summary

- **Retrofit** simplifies making network requests and parsing JSON responses into Kotlin objects.
- You define your API endpoints in an interface using Retrofit annotations like `@GET`, `@POST`, etc.
- Use Retrofit’s `enqueue` method to make asynchronous requests, and handle the response in the `onResponse` and `onFailure` callbacks.
- You can add logging or other interceptors to customize and debug your network requests.









//Here: Usage of Room ===========================================================================================================================================
Room is an ORM (Object-Relational Mapping) library for Android that provides an abstraction layer over SQLite. 
        It simplifies database management and data persistence by allowing developers to interact with the database 
        using Java/Kotlin objects instead of raw SQL queries.

Lets use Room in an Android application to create a database, define entities, and perform CRUD (Create, Read, Update, Delete) operations.

//A - Add Dependencies:
        //First, add the necessary Room dependencies to your `build.gradle` file:
                dependencies {
                implementation 'androidx.room:room-runtime:2.5.0'
                kapt 'androidx.room:room-compiler:2.5.0'
                implementation 'androidx.room:room-ktx:2.5.0' // For Kotlin Coroutines support
                }

        //If you’re using Kotlin, make sure to include the `kapt` plugin at the top of your `build.gradle` file:
                apply plugin: 'kotlin-kapt'

//B - Define the Entity: An entity represents a table in the Room database. Each field in the entity corresponds to a column in the table.
        import androidx.room.Entity
        import androidx.room.PrimaryKey

        @Entity(tableName = "users")                    //Add annotation that this data class is an Entity (Table)
        data class User(
                @PrimaryKey(autoGenerate = true)        //Add annotation that this is a Primary Key 
                val id: Int = 0,
                val name: String,
                val email: String
        )

//C - Create the DAO (Data Access Object): The DAO is an interface that provides methods for accessing the database. Each method typically represents a database operation.
        import androidx.room.Dao
        import androidx.room.Insert
        import androidx.room.Query

        @Dao                                            //Add annotation that this is a Data access object
        interface UserDao {
                @Insert                                 //Add annotation that following fun defines the SQL "Insert" operation
                suspend fun insertUser(user: User)
                
                @Query("SELECT * FROM users")           //Add annotation that following fun defines the querry "SELECT * FROM users"
                suspend fun getAllUsers(): List<User>

                @Query("DELETE FROM users")             //Add annotation that following fun defines thge SQL Delete operation
                suspend fun deleteAllUsers()
        }


//D - Create the Database: The database class is an abstract class that extends `RoomDatabase`. It serves as the main access point to the database.
        import android.content.Context
        import androidx.room.Database
        import androidx.room.Room
        import androidx.room.RoomDatabase

        @Database(entities = [User::class], version = 1)                // Add annotation that follwoing class  is a room database, Entities = [User::Class], list of all tables/entities that this database will handle
        abstract class AppDatabase : RoomDatabase() {                   // abstract so, this class cannot be dierctly instantiated, it must be implemented by Room
                abstract fun userDao(): UserDao                         // To reurns qn instqnce of our DAO interface where, entity operation methods are defined, Room provide the implementation when database is created
                
                // Singleton Pattern implementation acheived: Only 1 instance is created at a time and it held in volatile variable(uptodate and consisten across threads)
                        //1-volatile: visible to all threads and always up to date 
                        //2-instantiation in synchronized: making sure only one instance ill be created, 
                companion object {                                              //Static member of class "AppDatabase"                     
                        @Volatile                                               //This annotation so that the following var "INSTANCVE" is always up to date and consistent across all threads
                        private var INSTANCE: AppDatabase? = null               //nullable var typed AppDatabase, so it can hold its instance which is a singleton "One instance exist at a time"
                        fun getDatabase(context: Context): AppDatabase {        //fun to get the singleton instance of the class AppDartabase
                                return INSTANCE ?: synchronized(this) {         //Elvis, if not null return its value if null return results of Synchronized: this one esures thread safety, so other threads don't run this block in parallel
                                        val instance = Room.databaseBuilder(    //Room.databasebuilder needs: context + typeof database ::class + name of database,  
                                                context.applicationContext,     
                                                AppDatabase::class.java,
                                                "user_database"
                                                ).build()
                                        INSTANCE = instance
                                instance
                                }
                        }
                }
        }

//E - Use the Database in an Activity or ViewModel : 
        // Now that everything is set up, you can use the database to perform operations. Typically, you'll use the database in a `ViewModel` for separation of concerns, 
        // but for simplicity, let's show an example in an `Activity`.

        import android.os.Bundle
        import androidx.appcompat.app.AppCompatActivity
        import androidx.lifecycle.lifecycleScope
        import kotlinx.coroutines.launch

        class MainActivity : AppCompatActivity() {

                private lateinit var database: AppDatabase
                private lateinit var userDao: UserDao

                override fun onCreate(savedInstanceState: Bundle?) {
                        super.onCreate(savedInstanceState)
                        setContentView(R.layout.activity_main)

                        // Initialize the database and DAO
                        database = AppDatabase.getDatabase(this)
                        userDao = database.userDao()

                        // Insert a new user
                        val user = User(name = "John Doe", email = "johndoe@example.com")
                        lifecycleScope.launch {
                                userDao.insertUser(user)
                        }

                        // Get all users
                        lifecycleScope.launch {
                                val users = userDao.getAllUsers()
                                users.forEach {
                                        println("User: ${it.name}, Email: ${it.email}")
                                }
                        }

                        // Delete all users
                        lifecycleScope.launch {
                                userDao.deleteAllUsers()
                        }
                }
                }

//F - When you run the application, the following will happen:
        1. The database will be initialized.
        2. A new user will be inserted into the database.
        3. All users in the database will be retrieved and printed to the console.
        4. All users will then be deleted from the database.

### Explanation
- **Entity**            : The `User` class is marked with the `@Entity` annotation to define a table. Each field in the class represents a column in the table.
- **DAO**               : The `UserDao` interface provides methods for interacting with the `users` table. The methods are annotated with `@Insert`, `@Query`, etc., to define SQL operations.
- **Database**          : The `AppDatabase` class is the main access point for the underlying SQLite database. The `getDatabase()` method ensures that the database instance is a singleton, preventing multiple instances from being created.
- **LifecycleScope**    : `lifecycleScope` is used to launch coroutines tied to the lifecycle of the `Activity`. This ensures that the database operations are performed asynchronously and do not block the main thread.





//Here: Usage of MVVM: ===============================================================================================================
The Model-View-ViewModel (MVVM) architectural pattern is widely used in Android development to separate concerns, improve code maintainability, 
and allow for better testing. MVVM divides the code into three key components:
        - **Model**     : Represents the data or business logic. It handles data operations like fetching data from a database or a network
        - **View**      : The UI layer that displays data to the user. It observes data changes and updates the UI accordingly.
        - **ViewModel** : Acts as a bridge between the Model and the View. It holds and manages UI-related data, transforming it for display in the View.


Let's build a simple example using MVVM in Kotlin. The example will display a list of users fetched from a local database using Room.
        - **Model**     : Represents your data (in this case, the `User` entity and `UserRepository`).
        - **ViewModel** : Acts as a mediator between the View and the Model, holding and managing UI-related data.
        - **View**      : Observes data from the ViewModel and updates the UI accordingly (here, `MainActivity` with a `RecyclerView`).
//First: add dependencies:
        dependencies {
        implementation "androidx.room:room-runtime:2.5.2"
        kapt "androidx.room:room-compiler:2.5.2"
        implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2"
        implementation "androidx.lifecycle:lifecycle-livedata-ktx:2.6.2"
        implementation 'androidx.recyclerview:recyclerview:1.3.1'
        implementation 'androidx.appcompat:appcompat:1.7.1'
        }


//A - Model: represents the data and business logic of the application
        //A-1: Entiry: represent the structure of data stored in database
                @Entity(tableName = "users")
                data class User(
                        @PrimaryKey(autoGenerate = true) 
                        val id: Int,
                        @ColumnInf(name = "name")
                        val name: String
                )

        //A-2: DAO: Provides method to interact with the table in the database, CRUD operations
                @Dao
                interface UserDao {
                        @Insert
                        suspend fun insert(user: User)

                        @Query("SELECT * FROM users")
                        suspend fun getAllUsers(): List<User>
                }

        //A-3: AppDatabase: manage database singleton instance and provides access to DAOs
                @Database(entities = [User::class], version = 1)
                abstract AppDatabase : RoomDatabase() {
                        abstract fun userDao(): UserDao

                        companion object {
                                @volmtile
                                private var INSTANCE: AppDatabase? = null

                                fun getDatabase(context: Context): AppDatabase{
                                        return INSTANCE ?: synchronized(this){
                                                val instance = Room.databaseBuilder(
                                                        context.applicationContext,
                                                        AppDatabase::class.java,
                                                        "user_database"
                                                ).build()
                                                INSTANCE = instance
                                                instance
                                        }
                                }
                        }
                }
        //A-4: UserRepository: Acts as a mediator between the ViewModel and the data source(like Room, fit also for remote data)
                // It abstracts the data operations from DAO and proviode a clean API for data access
                class UserRepository(private val userDao: UserDao ){ 
                        suspend fun insert(user: User){
                                userDao.insert(user)
                        }
                        suspend fun getAllUsers(): List<User> {
                                return userDao.getAllUsers()
                        }
                }
                //NB: You can pass database instance as paramter as well, and access Dao function from there. I think this the best approch so that the usage of the single instance of DB make sense. 
                        // => restrict usage through singleton of db 


//B - ViewModel : Acts as a bridge between the model and the view, Provides data to the view and react to user interactions by updating the model
        //B-1: UserViewModel from ViewModel: The UserViewModel holds the logic for accessing and manipulating user data. It interacts with the UserRepository to fetch data and exposes it to the View via LiveData. This ensures the View can observe data changes and update itself automatically
                class UserViewModel(private val repository: UserRepository): ViewModel(){
                        private val _users = MutableLiveData<List<Users>>()
                        val users: LiveData<List<Users>> = _users               //Mutable for outside read

                        fun getAllUsers(){
                                vieModelScope.launch{
                                        _users.value = repository.getAllUsers()
                                }
                        }

                        fun insertUser(user: User){
                                viewModelScope.launch{
                                        repository.insert(user)
                                        getAllUsers()
                                }
                        }
                }
                //ALL about executing your repo functions inside a coroutine scope

        //B-2: UserViewModelFactory: create an instance of userViewModel with the UserRepository dependency injected
                class UserViewModelFactory(private val repository: UserRepository): ViewModelProvider.Factory {
                        override fun <T : ViewModel> create (modelClass: Class<T>): T {
                                if(modelClass.isAssignableFrom(UserViewModel::class.java)){
                                        @SUPRESS("UNCHECKED_CAST")              //Supress the warning about safe cast,cz we casting UserViewModel(repository) as T
                                        return UserViewModel(repository) as T
                                }
                                throw IllegalArgumentException("Unknown ViewModel class")
                        }
                }       
                //=> OverAll, create a viewModel instance if the repo passed to creat() parameter with the class of ViewModel class we intend to instantiate 
                // ViewModelProvider.Factory is an interface in Android that allows for the creation of ViewModel instances.
                        
                //In Android, ViewModels are typically created and managed by the system, especially when using architecture components like ViewModelProvider. When a ViewModel has dependencies that need to be injected (like a UserRepository in this case), you need a custom way to create it because the system's default mechanism doesn't know how to provide these dependencies.
                //The UserViewModelFactory solves this problem by creating UserViewModel instances with the necessary dependencies injected, making sure that the ViewModel is properly configured and ready to use.
                


//C - View: The View is responsible for the UI and interacts with the user
        //C-1: Activity.kt: display list of users, and interacts with user, Observes data changes from ViewModel and update UI accordingtly
                class MainActivity : AppCompatActivity() {
                                private lateinit var binding: ActivityMainBinding
                                private val userViewModel: UserViewModel by viewModels <UserViewModel> {                //Here: it will ask for lazy get() extention but it does only need to specify type of viewmodels <UserViewModel>
                                        UserViewModelFactory(UserRepository( AppDatabase.getDatabase(this).userDao() )) //A Factory instatntiation won't be needed if viewmodel constructor has no paramters
                                }
                                override fun onCreate(savedInstanceState: Bundle?) {
                                        super.onCreate(savedInstanceState)
                                        binding = ActivityMainBinding.inflate(layoutInflater)
                                        setContentView(binding.root)

                                        binding.recyclerView.layoutManager = LinearLayoutManager(this)

                                        userViewModel.users.observe(this, Observer { 
                                                users -> binding.recyclerView.adapter = UserAdapter(users)
                                        })

                                        binding.addUserButton.setOnClickListener {
                                                val newUser = User(0, "User ${System.currentTimeMillis()}")
                                                userViewModel.insertUser(newUser)
                                        }
                                        userViewModel.getAllUsers()
                                }
                        }
        //C-2: Activity layout : UI elements: Button + RecyclerView 
                <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
                        android:layout_width="match_parent"
                        android:layout_height="match_parent"
                        android:orientation="vertical">

                        <Button
                                android:id="@+id/addUserButton"
                                android:layout_width="wrap_content"
                                android:layout_height="wrap_content"
                                android:text="Add User" />

                        <androidx.recyclerview.widget.RecyclerView
                                android:id="@+id/recyclerView"
                                android:layout_width="match_parent"
                                android:layout_height="match_parent" />
                </LinearLayout>


        //C-3: Apdater: Handles the presentation of the user data in the recyclerView
                class UserAdapter(private val users: List<User>) : RecyclerView.Adapter<UserAdapter.UserViewHolder>() {
                        // RecyclerView adapter to bind the user data to the UI
                }

       




//Here: Dependency injections: ===============================================================================
Kodein is a popular dependency injection (DI) framework for Kotlin. It’s lightweight, easy to use, and supports both Android and pure Kotlin projects. Here’s how you can set up and use Kodein for dependency injection in an Android project.

### 1. **Add Kodein to Your Project**

First, you'll need to add Kodein dependencies to your `build.gradle` file.

#### For Gradle (Groovy DSL):
In your app-level `build.gradle` file, add the following dependencies:

```groovy
dependencies {
    implementation "org.kodein.di:kodein-di:7.18.0"          // Core Kodein dependency
    implementation "org.kodein.di:kodein-di-framework-android-x:7.18.0" // Kodein for AndroidX
}
```

Make sure to sync your project after adding the dependencies.

### 2. **Setting Up Kodein in Your Application Class**

To use Kodein throughout your application, you typically set it up in your `Application` class.

#### Step-by-Step Guide:

1. **Create a Custom Application Class**:

```kotlin
import android.app.Application
import org.kodein.di.DI
import org.kodein.di.bind
import org.kodein.di.instance
import org.kodein.di.provider
import org.kodein.di.android.x.androidXModule

class MyApplication : Application(), DIAware {
    override val di = DI.lazy {
        import(androidXModule(this@MyApplication))

        // Bind your dependencies here
        bind<SomeRepository>() with provider { SomeRepositoryImpl(instance()) }
        bind<MyViewModelFactory>() with provider { MyViewModelFactory(instance()) }
    }
}
```

2. **Register Your Custom Application Class** in `AndroidManifest.xml`:

```xml
<application
    android:name=".MyApplication"
    ... >
</application>
```

### 3. **Injecting Dependencies**

Once Kodein is set up in your `Application` class, you can inject dependencies into your Activities, Fragments, or ViewModels.

#### Example in an Activity:

```kotlin
import org.kodein.di.DIAware
import org.kodein.di.android.closestDI
import org.kodein.di.instance

class MainActivity : AppCompatActivity(), DIAware {
    override val di by closestDI() // This will find the closest DI container

    private val someRepository: SomeRepository by instance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Use your injected repository
        someRepository.doSomething()
    }
}
```

#### Example in a ViewModel:

For ViewModels, you can create a `ViewModelFactory` to inject dependencies:

```kotlin
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MyViewModelFactory(private val someRepository: SomeRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MyViewModel::class.java)) {
            return MyViewModel(someRepository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}

class MyViewModel(private val someRepository: SomeRepository) : ViewModel() {
    // Your ViewModel logic here
}
```

Then, inject the `ViewModel` in your `Activity` or `Fragment`:

```kotlin
class MainActivity : AppCompatActivity(), DIAware {
    override val di by closestDI()

    private val viewModelFactory: MyViewModelFactory by instance()
    private lateinit var viewModel: MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this, viewModelFactory).get(MyViewModel::class.java)

        // Use your ViewModel
        viewModel.someMethod()
    }
}
```

### 4. **Advanced Usage: Scopes and Multibindings**

Kodein also supports advanced features like scoping and multibindings. These allow you to control the lifecycle of your dependencies and bind multiple implementations to the same interface.

#### Scopes:
You can define a scope (like `singleton`, `instance`, `provider`) to control how instances are created and managed:

```kotlin
bind<SomeRepository>() with singleton { SomeRepositoryImpl(instance()) }
```

#### Multibindings:
Kodein supports binding multiple implementations to the same type. This is useful for plugins or features where you may have multiple implementations of the same interface.

### Summary:

- **Set Up Kodein** in your `Application` class.
- **Inject Dependencies** into your Activities, Fragments, or ViewModels using `DIAware` and `instance()`.
- **Use Scopes** to manage the lifecycle of your dependencies.
- Kodein is **lightweight** and integrates well with Android’s architecture components, making it a good choice for dependency injection in Kotlin-based Android projects.










//Here: Usage of MVP: ============================================================================================================ mvvm, mvp, mvi
The Model-View-Presenter (MVP) architecture is another design pattern commonly used in Android development. It helps to separate the business logic, UI logic, and data handling, making the code more modular, testable, and maintainable. MVP divides the code into three main components:

- **Model**: Manages the data and business logic of the application.
- **View**: Handles the presentation layer, i.e., the UI components and interactions with the user.
- **Presenter**: Acts as a mediator between the View and Model. It retrieves data from the Model and updates the View accordingly.

Let's walk through a simple example using MVP to display a list of users.

### 1. Define the Model

The Model layer in MVP is responsible for data operations. This might involve fetching data from a database, making a network request, or handling any other business logic.

```kotlin
data class User(val id: Int, val name: String, val email: String)

interface UserRepository {
    fun getUsers(): List<User>
}

class UserRepositoryImpl : UserRepository {
    override fun getUsers(): List<User> {
        // Simulate fetching data from a data source (e.g., database, network, etc.)
        return listOf(
            User(1, "John Doe", "john@example.com"),
            User(2, "Jane Doe", "jane@example.com")
        )
    }
}
```

### 2. Define the View

The View in MVP is responsible for displaying data and handling user interactions. It provides methods that the Presenter can call to update the UI.

```kotlin
interface UserView {
    fun showUsers(users: List<User>)
    fun showError(message: String)
}
```

### 3. Define the Presenter

The Presenter handles the communication between the View and the Model. It retrieves data from the Model and instructs the View on how to display it.

```kotlin
class UserPresenter(private val view: UserView, private val repository: UserRepository) {

    fun loadUsers() {
        try {
            val users = repository.getUsers()
            if (users.isNotEmpty()) {
                view.showUsers(users)
            } else {
                view.showError("No users found")
            }
        } catch (e: Exception) {
            view.showError("Failed to load users")
        }
    }
}
```

### 4. Implement the View (Activity)

In the View layer (typically an `Activity` or `Fragment`), you implement the `UserView` interface and handle the UI interactions.

```kotlin
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), UserView {

    private lateinit var presenter: UserPresenter
    private lateinit var userTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userTextView = findViewById(R.id.userTextView)

        // Initialize the repository and presenter
        val repository = UserRepositoryImpl()
        presenter = UserPresenter(this, repository)

        // Load users
        presenter.loadUsers()
    }

    override fun showUsers(users: List<User>) {
        userTextView.text = users.joinToString(separator = "\n") { "${it.name} (${it.email})" }
    }

    override fun showError(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
```

### 5. Layout File (`activity_main.xml`)

Here's a simple layout file with a `TextView` to display the list of users.

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="16dp">

    <TextView
        android:id="@+id/userTextView"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:textSize="18sp" />
</LinearLayout>
```

### 6. Running the Application

When you run the application, the following will happen:
1. The `MainActivity` (View) will create a `UserPresenter` and call `loadUsers()`.
2. The `UserPresenter` will fetch the user data from the `UserRepository`.
3. The `UserPresenter` will then instruct the `MainActivity` to display the list of users or show an error message if something goes wrong.

### Explanation

- **Model**: The `User` data class and `UserRepositoryImpl` represent the Model layer. The repository fetches the data that the Presenter will use.
  
- **View**: The `MainActivity` implements the `UserView` interface. It provides the methods that the Presenter uses to update the UI.

- **Presenter**: The `UserPresenter` class handles the logic of fetching data from the Model and instructing the View on how to display it. It has no direct reference to Android UI classes, making it easy to test.

### Summary

MVP is a design pattern that separates concerns, allowing for more modular and testable code. It clearly defines the responsibilities of each layer:

- **Model** handles the data and business logic.
- **View** displays data and handles user interactions.
- **Presenter** acts as a mediator between the Model and the View, controlling the flow of data.

Using MVP, you can build more maintainable and testable Android applications.







//Here: Usage of MVI: ============================================================================================================ mvvm, mvp, mvi
The Model-View-Intent (MVI) architectural pattern is a reactive architecture that aims to simplify complex user interfaces by representing the state of the view in a single, immutable data object. This state is updated in response to user actions (Intents) and data changes. MVI is particularly well-suited for managing UI states in complex applications, such as those with multiple possible states, nested views, or asynchronous data loading.

Here’s how MVI breaks down:

- **Model**: Represents the state of the View and the business logic that transforms Intents into ViewStates.
- **View**: Displays the state and sends user interactions to the ViewModel as Intents.
- **Intent**: Represents user actions or events that trigger a change in the ViewState.

Let’s walk through an example of a simple MVI implementation in Kotlin to fetch and display a list of users.

### 1. Define the Model (ViewState)

The ViewState represents the entire UI state at any given moment. It’s an immutable data class.

```kotlin
data class UserViewState(
    val isLoading: Boolean = false,
    val users: List<User> = emptyList(),
    val error: String? = null
)
```

### 2. Define the Intent

Intents are user actions or events that affect the ViewState. They are often represented as sealed classes.

```kotlin
sealed class UserIntent {
    object LoadUsers : UserIntent()
    data class RefreshUsers(val forceRefresh: Boolean) : UserIntent()
}
```

### 3. Define the Model (Repository)

The repository is responsible for fetching the data. This could be from a network, database, or any other source.

```kotlin
class UserRepository {
    fun fetchUsers(): List<User> {
        // Simulate fetching users
        return listOf(
            User(1, "John Doe", "john@example.com"),
            User(2, "Jane Doe", "jane@example.com")
        )
    }
}
```

### 4. Create the ViewModel

The ViewModel handles the business logic, transforming Intents into ViewStates. It interacts with the Model (repository) to fetch data and updates the ViewState.

```kotlin
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class UserViewModel(private val repository: UserRepository) : ViewModel() {

    private val _viewState = MutableStateFlow(UserViewState())
    val viewState: StateFlow<UserViewState> = _viewState

    fun processIntent(intent: UserIntent) {
        when (intent) {
            is UserIntent.LoadUsers -> loadUsers()
            is UserIntent.RefreshUsers -> loadUsers(intent.forceRefresh)
        }
    }

    private fun loadUsers(forceRefresh: Boolean = false) {
        viewModelScope.launch {
            _viewState.update { it.copy(isLoading = true, error = null) }

            try {
                val users = repository.fetchUsers()
                _viewState.update { it.copy(isLoading = false, users = users) }
            } catch (e: Exception) {
                _viewState.update { it.copy(isLoading = false, error = "Failed to load users") }
            }
        }
    }
}
```

### 5. Implement the View (Activity)

The View observes the ViewModel's ViewState and updates the UI accordingly. It also sends user actions (Intents) to the ViewModel.

```kotlin
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private val userViewModel: UserViewModel by viewModels { UserViewModelFactory(UserRepository()) }

    private lateinit var progressBar: ProgressBar
    private lateinit var userTextView: TextView
    private lateinit var retryButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        progressBar = findViewById(R.id.progressBar)
        userTextView = findViewById(R.id.userTextView)
        retryButton = findViewById(R.id.retryButton)

        retryButton.setOnClickListener {
            userViewModel.processIntent(UserIntent.LoadUsers)
        }

        lifecycleScope.launch {
            userViewModel.viewState.collect { viewState ->
                render(viewState)
            }
        }

        userViewModel.processIntent(UserIntent.LoadUsers)
    }

    private fun render(viewState: UserViewState) {
        progressBar.visibility = if (viewState.isLoading) View.VISIBLE else View.GONE
        userTextView.text = viewState.users.joinToString("\n") { "${it.name} (${it.email})" }
        retryButton.visibility = if (viewState.error != null) View.VISIBLE else View.GONE

        viewState.error?.let { error ->
            userTextView.text = error
        }
    }
}
```

### 6. Layout File (`activity_main.xml`)

Here’s a simple layout file with a `ProgressBar`, a `TextView`, and a `Button` for retrying the action.

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="16dp">

    <ProgressBar
        android:id="@+id/progressBar"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:visibility="gone" />

    <TextView
        android:id="@+id/userTextView"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:textSize="18sp"
        android:paddingTop="16dp" />

    <Button
        android:id="@+id/retryButton"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Retry"
        android:visibility="gone"
        android:paddingTop="16dp" />
</LinearLayout>
```

### Explanation

1. **ViewState**: Represents the entire state of the UI. This is a single source of truth for the View.
2. **Intent**: Captures user actions or events. For example, the `LoadUsers` intent triggers loading user data.
3. **Repository**: Provides data to the ViewModel. This could be from a network, database, etc.
4. **ViewModel**: Handles the business logic. It processes Intents and updates the ViewState based on data from the Repository.
5. **View**: Observes the ViewState and updates the UI accordingly. It sends Intents to the ViewModel to trigger data changes.

### Summary

MVI is a powerful pattern that provides a clear, reactive way to manage complex UIs by treating the UI state as a single, immutable source of truth. This pattern can be particularly useful in scenarios where your UI has a lot of different states or complex flows, as it simplifies the logic by centralizing state management.











//Here: Which design pattern to use=====================================================================================================
Choosing between MVI, MVVM, and MVP depends on your application's complexity, requirements, and development preferences:
        - **MVVM**: Use for apps with complex UIs and asynchronous data handling. It works well with Android's Architecture Components (e.g., LiveData, ViewModel) and data binding.
        - **MVP**: Best for smaller projects or when you need clear separation of UI and logic without data binding. It’s easy to test but can lead to complex Presenters.
        - **MVI**: Ideal for highly interactive apps with complex UI states. It offers predictable state management and is suited for reactive programming but can be more complex to implement.


### 1. **Model-View-ViewModel (MVVM)**
- **When to Use**: 
  - Ideal for medium to large-scale applications with complex UIs.
  - When you need to separate concerns between UI logic and business logic.
  - Works well with data-binding frameworks, making it easier to automatically update the UI when the data changes.
  - Often preferred in Android development due to built-in support with Android Architecture Components like LiveData and ViewModel.

- **Pros**:
  - Clear separation of concerns.
  - Easy to test ViewModel since it’s decoupled from the View.
  - Good for applications that require a lot of asynchronous operations (e.g., fetching data from a network).

- **Cons**:
  - Can become complex if not well-structured, especially in very large projects.
  - Requires more boilerplate code compared to other patterns.

### 2. **Model-View-Presenter (MVP)**
- **When to Use**:
  - Suitable for small to medium-sized applications or projects where the UI logic is relatively simple.
  - When you want full control over the UI layer without relying on data-binding.
  - Good for legacy projects or when working with non-Android frameworks.

- **Pros**:
  - Clear separation between the View and the business logic.
  - Easier to unit test the Presenter since it’s completely independent of Android framework classes.
  - Well-suited for scenarios where the View is not heavily tied to the Android framework.

- **Cons**:
  - Can lead to a "God Presenter" where the Presenter becomes too large and complex.
  - Requires more manual wiring between the View and Presenter.

### 3. **Model-View-Intent (MVI)**
- **When to Use**:
  - Best for complex applications with a lot of UI states and interactions.
  - When you want to ensure that your UI state is predictable and can be reproduced easily.
  - Suitable for reactive programming environments, where you can leverage streams and immutability.

- **Pros**:
  - Single source of truth for the UI state, making it easier to debug and test.
  - Promotes immutability and a clear data flow, which can reduce bugs.
  - Handles complex UI interactions more gracefully.

- **Cons**:
  - Can introduce a steep learning curve due to its reactive nature and immutability requirements.
  - May be overkill for simple applications, leading to unnecessary complexity.
  - Requires careful management of the ViewState to avoid performance issues.







//Here: 17 - Android Coroutines: using retrofit and MVVM =========================================================================
Using Kotlin coroutines with Retrofit and the MVVM (Model-View-ViewModel) architecture is a common and effective way to manage 
network operations in Android applications. Below is a step-by-step guide to setting up an Android project with Retrofit, coroutines, 
and MVVM.


// 2. Data Classes: Create a data class to model the JSON response. For example, if you are fetching a list of posts:
        data class Post(
                val userId: Int,
                val id: Int,
                val title: String,
                val body: String
        )

// 3. Retrofit Service Interface: Define a Retrofit service interface to describe the API endpoints:
        import retrofit2.http.GET
        interface ApiService {
                @GET("posts")
                suspend fun getPosts(): List<Post>
        }

// 4. Retrofit Instance: Create a singleton Retrofit instance:
        import retrofit2.Retrofit
        import retrofit2.converter.gson.GsonConverterFactory
        object RetrofitInstance {
                private const val BASE_URL = "https://jsonplaceholder.typicode.com/"
                val api: ApiService by lazy {
                        Retrofit.Builder()
                                .baseUrl(BASE_URL)
                                .addConverterFactory(GsonConverterFactory.create())
                                .build()
                                .create(ApiService::class.java)
                }
        }

// 5. Repository: Create a repository to handle data operations:
        class PostRepository {
                private val api = RetrofitInstance.api

                suspend fun getPosts(): List<Post> {
                        return api.getPosts()
                }
        }

// 6. ViewModel: Create a ViewModel to hold and manage UI-related data:
        import androidx.lifecycle.MutableLiveData
        import androidx.lifecycle.ViewModel
        import androidx.lifecycle.viewModelScope
        import kotlinx.coroutines.launch

        class PostViewModel : ViewModel() {

                private val repository = PostRepository()
                val posts = MutableLiveData<List<Post>>()
                val error = MutableLiveData<String>()

                fun fetchPosts() {
                        viewModelScope.launch {
                                try {
                                        val result = repository.getPosts()
                                        posts.postValue(result)
                                } catch (e: Exception) {
                                        error.postValue(e.message)
                                }
                        }
                }
        }

// 7. Activity: Observe the LiveData objects in your Activity and update the UI accordingly:
        import android.os.Bundle
        import android.widget.Toast
        import androidx.activity.viewModels
        import androidx.appcompat.app.AppCompatActivity
        import androidx.lifecycle.Observer
        import androidx.recyclerview.widget.LinearLayoutManager
        import androidx.recyclerview.widget.RecyclerView

        class MainActivity : AppCompatActivity() {

                private val postViewModel: PostViewModel by viewModels()
                private lateinit var recyclerView: RecyclerView
                private lateinit var postAdapter: PostAdapter

                override fun onCreate(savedInstanceState: Bundle?) {
                        super.onCreate(savedInstanceState)
                        setContentView(R.layout.activity_main)

                        recyclerView = findViewById(R.id.recyclerView)
                        recyclerView.layoutManager = LinearLayoutManager(this)
                        postAdapter = PostAdapter()
                        recyclerView.adapter = postAdapter

                        postViewModel.posts.observe(this, Observer { posts ->
                                postAdapter.submitList(posts)
                        })

                        postViewModel.error.observe(this, Observer { message ->
                                Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
                        })

                        postViewModel.fetchPosts()
                }
        }

// 8. RecyclerView Adapter: Create a RecyclerView adapter to display the data:
        import android.view.LayoutInflater
        import android.view.View
        import android.view.ViewGroup
        import android.widget.TextView
        import androidx.recyclerview.widget.DiffUtil
        import androidx.recyclerview.widget.ListAdapter
        import androidx.recyclerview.widget.RecyclerView

        class PostAdapter : ListAdapter<Post, PostAdapter.PostViewHolder>(DiffCallback()) {

                override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
                        val view = LayoutInflater.from(parent.context)
                                .inflate(R.layout.item_post, parent, false)
                        return PostViewHolder(view)
                }

                override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
                        val post = getItem(position)
                        holder.bind(post)
                }

                class PostViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
                        private val titleTextView: TextView = itemView.findViewById(R.id.postTitle)
                        private val bodyTextView: TextView = itemView.findViewById(R.id.postBody)

                        fun bind(post: Post) {
                                titleTextView.text = post.title
                                bodyTextView.text = post.body
                        }
                }

                class DiffCallback : DiffUtil.ItemCallback<Post>() {
                        override fun areItemsTheSame(oldItem: Post, newItem: Post): Boolean {
                                return oldItem.id == newItem.id
                        }

                        override fun areContentsTheSame(oldItem: Post, newItem: Post): Boolean {
                                return oldItem == newItem
                        }
                }
        }

// 9. Layout Files: 
        // activity_main.xml
        <?xml version="1.0" encoding="utf-8"?>
        <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="vertical"
        tools:context=".MainActivity">

        <androidx.recyclerview.widget.RecyclerView
        android:id="@+id/recyclerView"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_margin="16dp"/>
        </LinearLayout>
        
        // item_post.xml
        <?xml version="1.0" encoding="utf-8"?>
        <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="vertical"
        android:padding="16dp">

        <TextView
        android:id="@+id/postTitle"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textStyle="bold"
        android:textSize="16sp"
        android:textColor="@android:color/black"/>

        <TextView
        android:id="@+id/postBody"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="4dp"/>
        </LinearLayout>

        - **Dependencies**: Add necessary dependencies for coroutines, Retrofit, and lifecycle components.
        - **Data Classes**: Create data classes to model your JSON responses.
        - **Retrofit Service Interface**: Define the API endpoints.
        - **Retrofit Instance**: Create a singleton instance of Retrofit.
        - **Repository**: Handle data operations and provide a clean API to the ViewModel.
        - **ViewModel**: Hold UI-related data and handle business logic.
        - **Activity**: Observe LiveData from the ViewModel and update the UI.
        - **RecyclerView Adapter**: Display data in a RecyclerView.








// New way to add dependencies to android app: =================================================================================================
The dependencies in `build.gradle` file are managed via a centralized dependency management system (likely using `Version Catalogs`). 
        To add the necessary Jetpack Compose ViewModel dependency, you’ll need to reference it in your `libs.XXX` notation or add it directly.

Add the `lifecycle-viewmodel-compose` dependency to the `libs.versions.toml` {This file contains the version catalog for your dependencies.}:
        androidx-lifecycle-viewmodel-compose = { group = "androidx.lifecycle", name = "lifecycle-viewmodel-compose", version = "2.6.0" }
Then in your `build.gradle` file, reference it using:
        implementation(libs.androidx.lifecycle.viewmodel.compose)

Make sure you're using the `viewModel` function correctly inside a composable function:
        @Composable
        fun MyScreen() {
                val viewModel: MainViewModel = viewModel() // Requires the correct import
        }





//Here: 19 : the application of kotlin in web development: ktor framework ======================================================================= Beta or Alpha not stable yet
/*Example: building a web server application on linux using kotlin:
    => install SDKMAN:
        curl -s "https://get.sdkman.io" | bash
        source "$HOME/.sdkman/bin/sdkman-init.sh"
    => install a specific gradle version // oudated versions available on linux repo: apt list -a gradle
        sdk install gradle 5.6.4
    => set a specific gradle version for usage //u can also use default
        sdk use gradle 7.3
    => install specific java version
        sdk install java 11.0.24-tem
    => set a specific Java version as default
        sdk default java 11.0.24-tem

    => create build.gradle.kts configs:
        -> plugin : to run the app, jvm kotlin
        -> application: main class
        -> dependencies: should be compatible with Java/kotlin and gradle used
    => add src files to project:
        src/main/kotlin/com/example/app.kt

    => cd to project root folder:
        -> Initialize the gradle:
            gradle init
        -> Generate gradle wrapper if it was not generated "gradlew" with gradle specific version
            gradle wrapper --gradle-version 6.8.3
        -> build by gradle wrapper:
            ./gradlew build
        -> run you application
            ./gradlew run
*/


//Kotlin profiles:
As a Kotlin tech lead at Softylines, I lead the development of innovative mobile applications using Compose UI and Kotlin. I collaborate with a team of talented 
developers, designers, and product managers to deliver high-quality products that meet the needs and expectations of our clients and users. I also mentor and coach 
junior developers, sharing my knowledge and experience in mobile development. In addition to my work at Softylines, I am an active open source contributor and a library author. 

I have created and maintained several popular libraries that help other developers use Kotlin and Compose more effectively. I am passionate about learning new technologies and skills and 
applying them to solve real-world problems. My goal is to become a leader and an innovator in the mobile development industry.




PokedexPokedex
Pokedex - a Kotlin Multiplatform app, built with Compose multiplatform, Coroutines, Flow, Koin, Ktor, SqlDelight, Decompose, MVIKotlin, and Material 3 based on MVI architecture

Pokedex - a Kotlin Multiplatform app, built with Compose multiplatform, Coroutines, Flow, Koin, Ktor, SqlDelight, Decompose, MVIKotlin, and Material 3 based on MVI architecture






//Here: Android dev basics==================================================================================================================================================================
# Activities
# Broadcasts
# Foreground services
# Content Providers


# Tasks
In Android development, understanding **tasks**, **back stack**, and **launch modes** is crucial for managing how activities are launched, navigated, and how they interact with each other. Here’s a detailed explanation of each:

### 1. **Tasks**
- **Definition:** A task is a collection of activities that users interact with when performing a certain job. Typically, each task is a stack of activities.
- **Task Behavior:** When a new activity is started, it’s pushed onto the task’s stack, and the previous activity remains below it. Users can navigate back through the stack, popping each activity off, using the Back button.

### 2. **Back Stack**
- **Definition:** The back stack is a last-in-first-out (LIFO) structure that keeps track of the sequence of activities a user has visited within a task.
- **Activity Management:** When an activity is started, it’s placed on top of the stack. Pressing the Back button removes the current activity from the stack and shows the previous one.
- **Example:** If Activity A starts Activity B, and B starts Activity C, the back stack will be [A, B, C]. Pressing the Back button will pop Activity C off the stack, returning the user to Activity B.

### 3. **Launch Modes**
Launch modes define how a new instance of an activity is associated with a task and how it is managed within the back stack. There are four main launch modes:

#### a. **Standard (default)**
   - **Behavior:** Every time an activity is launched, a new instance is created, and it is pushed onto the back stack.
   - **Example:** If Activity A starts Activity B twice, the back stack will have two instances of Activity B, i.e., [A, B, B].

#### b. **SingleTop**
   - **Behavior:** If an instance of the activity is already at the top of the back stack, no new instance is created. Instead, the existing instance receives the intent in `onNewIntent()`.
   - **Example:** If Activity A starts Activity B, and then B starts itself, only one instance of Activity B is at the top of the stack, i.e., [A, B].

#### c. **SingleTask**
   - **Behavior:** If an instance of the activity exists anywhere in the back stack, it is brought to the foreground, and all activities above it are cleared. If no instance exists, a new one is created.
   - **Example:** If Activity A starts Activity B, and then Activity C starts Activity B with `singleTask`, B will be brought to the front, and C will be removed from the stack, i.e., [A, B].

#### d. **SingleInstance**
   - **Behavior:** The activity is always the only instance in a separate task. Any time the activity is launched, it is brought to the foreground, and any activities above it in its task are cleared.
   - **Use Case:** Ideal for activities like a home screen or a dialer that should always be the only instance and in their own task.
   - **Example:** If Activity B is launched with `singleInstance`, it will run in a separate task, and any subsequent calls to launch it will bring the same instance to the foreground.

### 4. **Task Affinities**
   - **Definition:** Task affinity determines the natural grouping of activities within tasks. Activities with the same affinity will tend to be in the same task.
   - **Custom Affinities:** By default, all activities in an app have the same affinity, but you can assign different affinities using the `android:taskAffinity` attribute in the manifest. This allows for more control over how tasks are structured.

### 5. **Task and Back Stack Manipulation**
   - **Flags:** You can manipulate how activities are placed in the back stack using intent flags like:
     - `FLAG_ACTIVITY_NEW_TASK`: Causes the activity to start in a new task.
     - `FLAG_ACTIVITY_CLEAR_TOP`: If the activity is already running in the task, all other activities above it will be closed, and this intent will be delivered to the activity as a new intent.
     - `FLAG_ACTIVITY_NO_HISTORY`: The activity is not kept in the back stack, and it’s destroyed as soon as the user navigates away from it.

### 6. **Examples and Common Use Cases**
   - **Login Screens (SingleTask):** When the user logs in, you might want to clear the back stack to prevent the user from navigating back to the login screen.
   - **Notification Handling (SingleTop):** When a notification launches an activity that may already be running, you often want to bring that existing instance to the foreground rather than creating a new one.

Understanding these concepts helps ensure that your app behaves as expected when users navigate through it, especially in complex scenarios involving multiple activities and tasks.






# ViewModels

#  Contexts

# Intents


# WorkManager

# Uris



4. Core Components of an Android App
        => Activities: The entry point for interacting with the user, representing a single screen.
        => Fragments: Reusable portions of the UI within an activity.
        => Services: Background processes that can run independently of the UI.
        => Broadcast Receivers: Components that respond to broadcast messages from other applications or the system.
        => Content Providers: Manage shared data between applications.

5. User Interface (UI) Design
        => Layouts: Define the structure of the UI using XML files. Common layouts include LinearLayout, RelativeLayout, ConstraintLayout, and FrameLayout.
        => Views and Widgets: UI elements like TextView, Button, ImageView, RecyclerView, etc.
        => Material Design: Google’s design language that provides guidelines for UI/UX, ensuring consistency across apps.
6. Navigation
        => Intents: Used for navigating between different activities or apps.
        => Navigation Component: A part of Android Jetpack that simplifies navigation within an app, especially with complex navigation patterns.
7. Data Storage and Management
        => SharedPreferences: For storing simple key-value pairs.
        => SQLite Database: For storing structured data in a local database.
        => Room Database: An abstraction layer over SQLite, part of Android Jetpack, which provides an easier way to manage databases.
        => Content Providers: For sharing data between apps.
Networking: Using libraries, to handle API requests 
        => Retrofit 
        => Volley 
        => OkHttp 
8. Lifecycle Management
        => Activity Lifecycle: Understanding the lifecycle of an activity (onCreate, onStart, onResume, onPause, onStop, onDestroy).
        => Fragment Lifecycle: Similar to the activity lifecycle but with additional callbacks.
        => ViewModel: Part of Android Jetpack, it helps manage UI-related data in a lifecycle-conscious way.
9. Testing
        => Unit Testing: Writing tests for individual components using JUnit.
        => UI Testing: Testing user interactions using tools like Espresso or UI Automator.
        => Instrumentation Testing: Testing with the Android framework using AndroidJUnitRunner.









Here: JetPack Compose overview:=========================================================================================================================================
To master Jetpack Compose as an Android developer, focus on the following key areas:


//Here: In Compose, a State object holds data that can trigger recomposition when its value changes.

### 1. **Fundamentals of Compose**
   - **Composable Functions**   : Learn how to create reusable UI elements using `@Composable` annotation.
   - **Modifiers**              : Understand how to modify UI elements, set padding, margins, size, and layout properties.
   - **State Management**       : Master `State`, `remember`, and `mutableStateOf` for managing UI states.

### 2. **Layouts and UI Elements**
   - **Column, Row, Box**       : Understand these basic layout components for arranging elements on the screen.
   - **LazyColumn/LazyRow**     : Learn how to handle large lists efficiently, similar to RecyclerView in traditional Android UI.
   - **ConstraintLayout**       : Explore complex UI layouts that require more control over element positioning.
   - **Scaffold**               : Learn the basic screen structure with top bars, floating action buttons (FAB), and snackbars.

### 3. **Material Design**
   - **Material Components**    : Buttons, TextFields, Sliders, Checkboxes, RadioButtons, etc.
   - **Theming**                : Learn how to use `MaterialTheme` for creating consistent themes with typography, colors, and shapes.
   - **Dark Mode Support**      : Enable dark mode themes and handle system-wide theme changes.
   - **Icons and Images**       : Work with vector images, icons, and image handling using Compose.

### 4. **Navigation**
   - **Jetpack Navigation**     : Learn how to use `NavHost`, `NavController`, and `rememberNavController` for in-app navigation.
   - **Passing Arguments**      : Understand how to pass data between different composables during navigation.
   
### 5. **State and Side Effects**
   - **State Hoisting**         : Understand state hoisting and how to pass and manage state between parent and child composables.
   - **Effect Handlers**        : Learn `LaunchedEffect`, `DisposableEffect`, `SideEffect`, and `rememberCoroutineScope` for side effects management and asynchronous operations.

### 6. **Animations**
   - **Basic Animations**       : Work with `animate*AsState` for animating size, color, position, etc.
   - **Transition API**         : Learn how to animate between composable states using `updateTransition`.
   - **Gesture Animations**     : Handle gestures (drag, scroll, pinch) and use them in animations.

### 7. **Performance Optimization**
   - **Recomposition**                   : Understand when recomposition happens and how to optimize it.
   - **Skipping Unnecessary Recomposition: Learn techniques like using `remember` and `key` to avoid recomposing unchanged elements.

### 8. **Testing**
   - **Unit Testing**                   : Test individual composable functions using `@Test` annotations.
   - **UI Testing**                     : Use Compose testing APIs like `composeTestRule`, `onNodeWithText`, and `performClick` for UI automation.

### 9. **Interoperability with View System**
   - **Compose in Views**               : Embed composable functions inside existing views using `ComposeView`.
   - **View in Compose**                : Use `AndroidView` to embed traditional Android Views into a Compose layout.

### 10. **Handling System Events**
   - **Lifecycles**                     : Handle lifecycle events using `rememberLifecycleOwner` and lifecycle observers.
   - **Permissions**                    : Request runtime permissions in Compose using the `Accompanist Permissions` library.
   - **Handling Configuration Changes** : Manage screen orientation and other configuration changes with Compose.

### 11. **Custom Views**
   - **Custom Composables**             : Create your own custom composables for advanced UI requirements.
   - **Canvas**                         : Work with `Canvas` to draw shapes and custom graphics in Compose.

### 12. **Libraries and Extensions**
   - **Accompanist**                    : Explore Accompanist for additional features like insets, Coil image loading, and animations.
   - **Paging and Hilt**                : Learn to integrate Paging and Hilt with Jetpack Compose for stateful and dependency-managed apps.

### 13. **Migration from XML to Compose**
   - Understand how to migrate existing XML layouts to Jetpack Compose gradually in a project.

