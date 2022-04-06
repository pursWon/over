package com.khs.over

class Child : Parent() { // 부모 클래스를 받음
    override var openedProperty:String = "I am overrided" // override로 상속
    override fun openedMethod() {
        println("Called override function")
        println(openedProperty)
    }
}