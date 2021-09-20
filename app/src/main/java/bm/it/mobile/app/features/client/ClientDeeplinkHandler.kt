package bm.it.mobile.app.features.client

import bm.it.mobile.library.BMFeatureDeeplinkHandler

class ClientDeeplinkHandler: BMFeatureDeeplinkHandler() {

    override fun configureDeeplink(): Map<String, () -> Unit> {
        val deeplink = mutableMapOf<String, () -> Unit>()
        deeplink["client/add"] = ::goToAdd
        deeplink["client/list"] = ::goToList
        deeplink["client/select"] = ::goToSelect
        deeplink["client/remove"] = ::goToRemove
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
