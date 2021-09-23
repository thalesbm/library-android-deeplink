package bm.it.mobile.app.features.user

import android.util.Log
import bm.it.mobile.library.BMFeatureDeeplinkHandler

class UserDeeplinkHandler : BMFeatureDeeplinkHandler {

    companion object {
        private val TAG = UserDeeplinkHandler::class.simpleName
    }

    override fun configureDeeplink(): Map<String, () -> Unit> {
        val deeplink = mutableMapOf<String, () -> Unit>()
        deeplink["user"] = ::goToUser
        deeplink["user/add"] = ::goToAdd
        deeplink["user/list"] = ::goToList
        deeplink["user/select"] = ::goToSelect
        deeplink["user/select"] = ::goToSelectById
        deeplink["user/remove"] = ::goToRemove
        return deeplink
    }

    private fun goToSelectById() {
        Log.d(TAG, "goToSelectById")
    }

    private fun goToUser() {
        Log.d(TAG, "goToUser")
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
