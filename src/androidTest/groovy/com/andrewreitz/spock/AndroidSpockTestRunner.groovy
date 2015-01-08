package com.andrewreitz.spock

import android.os.Bundle
import android.support.test.runner.AndroidJUnitRunner

class AndroidSpockTestRunner extends AndroidJUnitRunner {
  @Override
  void onCreate(Bundle arguments) {
    arguments.putString("package", "com.andrewreitz.spock")
    super.onCreate(arguments)
  }
}
