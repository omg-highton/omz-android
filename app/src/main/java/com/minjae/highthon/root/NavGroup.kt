package com.minjae.highthon.root

sealed class NavGroup(val group: String) {

    object OnBoarding : NavGroup("onBoarding") {
//        const val AUTH_HOME = "authHome"

    }

    object Boarding : NavGroup("boarding") {
//        const val ACADEMIC_HOME = "academicHome"


    }
}