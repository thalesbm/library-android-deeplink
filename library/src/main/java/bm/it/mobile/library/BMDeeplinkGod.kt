package bm.it.mobile.library

import android.net.Uri

object BMDeeplinkGod {

    fun verifyDeeplink(deeplinkHandler: BMDeeplinkHandler?, uri: Uri) {
        deeplinkHandler?.let { d ->

            for (i in d.setupDeeplink().indices) {
                val deeplink = uri.host + (uri.path ?: "")

                val feature = d.setupDeeplink()[i]
                if (feature.configureDeeplink()[deeplink] != null) {
                    val item = feature.configureDeeplink()[deeplink]
                    item?.invoke()
                    break
                }
            }
        }
    }
}
