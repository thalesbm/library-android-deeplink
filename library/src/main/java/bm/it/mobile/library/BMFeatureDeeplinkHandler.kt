package bm.it.mobile.library

interface BMFeatureDeeplinkHandler {

    fun configureDeeplink(): Map<String, (() -> Unit)>

}
