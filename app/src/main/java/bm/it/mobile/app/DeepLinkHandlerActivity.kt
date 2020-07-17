package bm.it.mobile.app

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import bm.it.mobile.app.user.AddUserActivity
import bm.it.mobile.app.user.ListUserActivity
import kotlinx.android.synthetic.main.activity_deeplink.*
import kotlin.reflect.KClass

class DeepLinkHandlerActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deeplink)

        goToUserButton.setOnClickListener {
            callDeepLink("app://user_home")
        }
    }

    override fun onResume() {
        super.onResume()
        val data: Uri? = intent?.data

        when (data?.host) {
            "user_home" -> redirectTo(HomeActivity::class)
            "add_user" -> redirectTo(AddUserActivity::class)
            "list_user" -> redirectTo(ListUserActivity::class)
        }
    }

    private fun redirectTo(to: KClass<*>) {
        startActivity(Intent(this, to.java))
        finish()
    }
}
