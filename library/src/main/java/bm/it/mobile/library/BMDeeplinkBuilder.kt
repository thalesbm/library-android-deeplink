package bm.it.mobile.library

import android.net.Uri

class BMDeeplinkBuilder private constructor() {

    companion object {
        private var deeplinkHandler: BMDeeplinkHandler? = null
    }

    data class Builder(
        var handler: BMDeeplinkHandler? = null,
        var deeplinkUri: Uri? = null
    ) {

        fun setupDeeplink(handler: BMDeeplinkHandler) = apply { this.handler = handler }

        fun redirectTo(deeplinkUri: Uri?) = apply { this.deeplinkUri = deeplinkUri }

        fun build() = apply { BMDeeplinkBuilder() }

        fun init() {
            handler?.let {
                deeplinkHandler = it
            }

            deeplinkUri?.let {
                BMDeeplinkGod.verifyDeeplink(deeplinkHandler, it)
            }
        }
    }
}

