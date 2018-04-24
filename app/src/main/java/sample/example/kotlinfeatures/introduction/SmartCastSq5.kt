package sample.example.kotlinfeatures.introduction

class SmartCastSq5 {

    val obj: Any? = 10

    fun smartCastSample() {
        if (obj is String) {
            obj.plus("20")
            obj.length
            obj.capitalize()
        } else if (obj is Int) {
            obj.compareTo(10)
            obj.inc()
            obj.plus(1)
            obj.minus(1)
            obj.div(1)
            obj.times(1)
            obj.rem(1)
        }
    }

    fun smartCastForNullCheck() {
        //With smart cast
        if (obj != null) {
            obj.hashCode()
        }

        //Without smart cast
        obj?.hashCode()
    }
}