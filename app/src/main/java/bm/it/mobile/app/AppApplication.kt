package bm.it.mobile.app

import android.app.Application
import bm.it.mobile.app.features.client.ClientDeeplinkHandler
import bm.it.mobile.app.features.user.UserDeeplinkHandler
import bm.it.mobile.library.BMDeeplinkBuilder
import bm.it.mobile.library.BMDeeplinkHandler
import bm.it.mobile.library.BMFeatureDeeplinkHandler

class AppApplication : Application(), BMDeeplinkHandler {

    override fun onCreate() {
        super.onCreate()

        BMDeeplinkBuilder.Builder(
            context = this
        ).setupDeeplink(handler = this).build().init()
    }

    override fun setUpDeeplink(): MutableList<BMFeatureDeeplinkHandler> {
        val features = mutableListOf<BMFeatureDeeplinkHandler>()
        features.add(UserDeeplinkHandler())
        features.add(ClientDeeplinkHandler())
        return features
    }
}