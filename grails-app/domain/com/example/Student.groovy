package com.example

import grails.compiler.GrailsCompileStatic


@GrailsCompileStatic
class Student {
    String name
    BigDecimal grade


    static constraints = {
    }
}
