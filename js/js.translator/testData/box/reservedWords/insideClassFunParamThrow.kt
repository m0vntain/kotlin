package foo

// NOTE THIS FILE IS AUTO-GENERATED by the generateTestDataForReservedWords.kt. DO NOT EDIT!

class TestClass {
    fun foo(`throw`: String) {
    assertEquals("123", `throw`)
    testRenamed("throw", { `throw` })
}

    fun test() {
        foo("123")
    }
}

fun box(): String {
    TestClass().test()

    return "OK"
}