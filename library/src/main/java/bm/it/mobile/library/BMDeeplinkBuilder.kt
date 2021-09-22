package bm.it.mobile.library

import android.util.Log

class BMDeeplinkBuilder private constructor() {

    companion object {
        private val TAG = BMDeeplinkBuilder::class.simpleName
        private var deeplinkHandler: BMDeeplinkHandler? = null
    }

    data class Builder(
        var handler: BMDeeplinkHandler? = null,
        var deeplink: String? = null
    ) {

        fun setupDeeplink(handler: BMDeeplinkHandler) = apply { this.handler = handler }

        fun redirectTo(deeplink: String?) = apply { this.deeplink = deeplink }

        fun build() = apply { BMDeeplinkBuilder() }

        fun init() {
            handler?.let {
                deeplinkHandler = it
            }

            deeplink?.let {
                verifyDeeplink()
            }
        }

        private fun verifyDeeplink() {
            deeplinkHandler?.let { d ->

                for (i in d.setupDeeplink().indices) {
                    val feature = d.setupDeeplink()[i]

                    if (feature.configureDeeplink()[deeplink] != null) {
                        val item = feature.configureDeeplink()[deeplink]
                        Log.d(TAG, "deeplink $deeplink has been found and method will be called")
                        item?.invoke()
                        break
                    }
                }
            }
        }
    }
}
