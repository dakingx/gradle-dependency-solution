package tech.daking.version

object Versions {
    const val jdk = "1.8"

    const val compileSdk = 30
    const val minSdk = 24
    const val targetSdk = 30

    const val kotlin = "1.5.10"

    const val fragment = "1.2.5"
    const val coreKtx = "1.3.1"
    const val appcompat = "1.2.0"
    const val recyclerView = "1.1.0"
    const val constraintLayout = "2.0.4"

    const val material = "1.2.1"
    const val junit = "4.13.2"
    const val junitExt = "1.1.2"
    const val espressoCore = "3.3.0"
}

object Kt {
    const val stdlibJdk7 = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    const val stdlibJdk8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
    const val test = "org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}"
}

object AndroidX {
    const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val recyclerView = "androidx.recyclerview:recyclerview:${Versions.recyclerView}"
}

object Fragment {
    const val runtime = "androidx.fragment:fragment:${Versions.fragment}"
    const val runtimeKtx = "androidx.fragment:fragment-ktx:${Versions.fragment}"
    const val testing = "androidx.fragment:fragment-testing:${Versions.fragment}"
}

object Depends {
    const val junit = "junit:junit:${Versions.junit}"
    const val junitExt = "androidx.test.ext:junit:${Versions.junitExt}"
    const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espressoCore}"
    const val material = "com.google.android.material:material:${Versions.material}"
}
