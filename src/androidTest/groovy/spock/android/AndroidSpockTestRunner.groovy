package spock.android

import android.os.Bundle
import android.support.test.runner.AndroidJUnitRunner

class AndroidSpockTestRunner extends AndroidJUnitRunner {
  @Override
  void onCreate(Bundle arguments) {
    arguments.putString("package", "spock.android")
    super.onCreate(arguments)
  }
}
