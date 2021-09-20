package bm.it.mobile.library

abstract class BMFeatureDeeplinkHandler {

    abstract fun configureDeeplink(): Map<String, (() -> Unit)>

}
