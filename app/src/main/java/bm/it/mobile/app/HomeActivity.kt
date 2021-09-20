package bm.it.mobile.app

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import bm.it.mobile.app.commons.BaseActivity
import bm.it.mobile.app.features.user.views.AddUserActivity
import bm.it.mobile.app.features.user.views.ListUserActivity
import kotlinx.android.synthetic.main.activity_home.*
import kotlin.reflect.KClass

class HomeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        goToListUserButton.setOnClickListener {
            callDeepLink("app://list_user")
        }

        goToAddUserButton.setOnClickListener {
            callDeepLink("app://add_user")
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