package bm.it.mobile.app

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*

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
}