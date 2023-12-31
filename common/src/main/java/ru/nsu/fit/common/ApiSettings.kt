package ru.nsu.fit.common



data class ApiSettings(
    var baseUrl: String = "http://192.168.1.39:8080",
    var userName: String = "",
    var tokens: Tokens = Tokens()
) {
    companion object {
        public const val TIME_OUT_DELAY = 15L
    }
}