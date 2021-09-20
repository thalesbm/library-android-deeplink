package bm.it.mobile.app

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import bm.it.mobile.app.commons.BaseActivity
import bm.it.mobile.app.features.user.views.AddUserActivity
import bm.it.mobile.app.features.user.views.ListUserActivity
import kotlin.reflect.KClass

class HomeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
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