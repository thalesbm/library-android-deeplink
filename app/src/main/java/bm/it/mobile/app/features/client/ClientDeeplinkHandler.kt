package bm.it.mobile.app.features.client

import android.util.Log
import bm.it.mobile.library.BMFeatureDeeplinkHandler

class ClientDeeplinkHandler : BMFeatureDeeplinkHandler {

    companion object {
        private val TAG = ClientDeeplinkHandler::class.simpleName
    }

    override fun configureDeeplink(): Map<String, () -> Unit> {
        val deeplink = mutableMapOf<String, () -> Unit>()
        deeplink["client"] = ::goToClient
        deeplink["client/add"] = ::goToAdd
        deeplink["client/list"] = ::goToList
        deeplink["client/select"] = ::goToSelect
        deeplink["client/select"] = ::goToSelectById
        deeplink["client/remove"] = ::goToRemove
        return deeplink
    }

    private fun goToSelectById() {
        Log.d(TAG, "goToSelectById")
    }

    private fun goToClient() {
        Log.d(TAG, "goToClient")
    }

    private fun goToAdd() {
        Log.d(TAG, "goToAdd")
    }

    private fun goToList() {
        Log.d(TAG, "goToList")
    }

    private fun goToSelect() {
        Log.d(TAG, "goToSelect")
    }

    private fun goToRemove() {
        Log.d(TAG, "goToRemove")
    }
}
