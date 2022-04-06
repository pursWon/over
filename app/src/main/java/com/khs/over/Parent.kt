package com.khs.over

open class Parent {
    var notOpened:String = "This is not" //open 키워드가 없는 멤버는 재정의 할 수 없다.
    open var openedProperty:String = "This is overradable"
    open fun openedMethod() {
        println(openedProperty)
        println(openedMethod())
    }
}