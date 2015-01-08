package spock.android

import android.app.Activity
import android.os.Bundle
import android.util.Log

class MainActivity extends Activity {
  @Override void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.main)

    String.metaClass.shout = { ->
      delegate.toUpperCase()
    }

    Log.d("META", "shout".shout())
  }
}
