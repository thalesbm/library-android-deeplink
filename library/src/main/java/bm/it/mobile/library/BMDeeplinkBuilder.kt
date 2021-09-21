package bm.it.mobile.library

import android.content.Context
import android.util.Log

class BMDeeplinkBuilder private constructor() {

    companion object {
        private val TAG = BMDeeplinkBuilder::class.simpleName
        private var deeplinkHandler: BMDeeplinkHandler? = null
    }

    data class Builder(
        val context: Context,
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

                for (i in d.setUpDeeplink().indices) {
                    val feature = d.setUpDeeplink()[i]

                    if (feature.configureDeeplink()[deeplink] != null) {
                        val item = feature.configureDeeplink()[deeplink]
                        Log.d(TAG, "deeplink $deeplink found and method will be invoke")
                        item?.invoke()
                        break
                    }
                }
            }
        }
    }
}
