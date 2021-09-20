package bm.it.mobile.library

class BMDeeplinkBuilder {

    fun analyseDeeplink(handler: BMDeeplinkHandler, deeplink: String) {

        for (i in handler.setUpDeeplink().indices) {
            val feature = handler.setUpDeeplink()[i]

            feature.configureDeeplink()[deeplink]?.let {
                it.invoke()
            }
            break
        }
    }
}
