package tsukanov.data

class SomeClass (s: Int) {
    constructor(s: Int, s2: Int) : this(s)
    constructor(s: Int, s2: Int, s3: Int) : this(s, s2)

    fun someMethod() : String = "hi"
}