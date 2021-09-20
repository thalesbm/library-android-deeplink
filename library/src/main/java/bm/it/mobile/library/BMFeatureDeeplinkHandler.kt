package bm.it.mobile.library

import kotlin.reflect.KFunction

abstract class BMFeatureDeeplinkHandler {

    abstract fun setUpDeeplink(): Map<String, KFunction<Unit>>

}
