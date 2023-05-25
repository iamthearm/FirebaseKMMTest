package com.testing.firebasekmmtest

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform