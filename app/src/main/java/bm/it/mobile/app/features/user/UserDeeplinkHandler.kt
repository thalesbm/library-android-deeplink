package bm.it.mobile.app.features.user

import bm.it.mobile.library.BMFeatureDeeplinkHandler
import kotlin.reflect.KFunction

class UserDeeplinkHandler : BMFeatureDeeplinkHandler() {

    override fun setUpDeeplink(): Map<String, KFunction<Unit>> {
        val deeplink = mutableMapOf<String, KFunction<Unit>>()
        deeplink["user/add"] = ::goToAdd
        deeplink["user/list"] = ::goToList
        deeplink["user/select"] = ::goToSelect
        deeplink["user/remove"] = ::goToRemove
        return deeplink
    }

    private fun goToAdd() {

    }

    private fun goToList() {

    }

    private fun goToSelect() {

    }

    private fun goToRemove() {

    }
}
