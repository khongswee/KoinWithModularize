object ApplicationId {
    val id = "com.kho.koin.withmodularize"
}

object Modules {
    val app = ":app"
    val home = ":home"
    val login = ":login"
    val dataLogin = ":data_login"
    val dataHome = "data_home"
    val core = ":core"
    val navigator = ":navigator"


}

object Releases {
    val versionCode = 1
    val versionName = "1.0"
}

object Versions {
    val gradle = "3.4.1"

    val compileSdk = 28
    val minSdk = 21
    val targetSdk = 28

    val appcompat = "1.0.2"
    val design = "1.1.0-alpha06"
    val constraintLayout = "1.1.0-beta3"

    val ktx = "1.0.0-alpha1"

    val kotlin = "1.3.31"
    val retrofit = "2.5.0"
    val retrofitCoroutines = "0.9.2"
    val loggingInterceptor = "3.12.1"
    val glide = "4.9.0"
    val lifecycle = "2.0.0"
    val koin = "2.0.1"
    val gson = "2.8.5"

    val junit = "4.12"
    val assertjCore = "3.12.2"
    val mockitoKotlin = "2.1.0"
    val mockitoInline = "2.27.0"
}

object Libraries {
    val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"

    val ktx = "androidx.core:core-ktx:${Versions.ktx}"

    val coroutine = "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.0-M2"


    val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    val coroutineAdapter =
        "com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter:${Versions.retrofitCoroutines}"

    val loggingInterceptor =
        "com.squareup.okhttp3:logging-interceptor:${Versions.loggingInterceptor}"

    val glide = "com.github.bumptech.glide:glide:${Versions.glide}"

    val lifecycleExtensions = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
    val lifecycleCompiler = "androidx.lifecycle:lifecycle-compiler:${Versions.lifecycle}"


    val koinAndroid = "org.koin:koin-android:${Versions.koin}"
    val koinViewModel = "org.koin:koin-androidx-viewmodel:${Versions.koin}"

    val gson = "com.google.code.gson:gson:${Versions.gson}"
    val gsonConvert = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"

}

object SupportLibraries {
    val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    val design = "com.google.android.material:material:${Versions.design}"
    val constraintLayout = "com.android.support.constraint:constraint-layout:${Versions.constraintLayout}"

}


object TestLibraries {
    val junit = "junit:junit:${Versions.junit}"
    val assertjCore = "org.assertj:assertj-core:${Versions.assertjCore}"
    val mockitoKotlin = "com.nhaarman.mockitokotlin2:mockito-kotlin:${Versions.mockitoKotlin}"
    val mockitoInline = "org.mockito:mockito-inline:${Versions.mockitoInline}"
    val lifecycleTesting = "androidx.arch.core:core-testing:${Versions.lifecycle}"
}
