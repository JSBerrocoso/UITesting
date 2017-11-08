# UITesting
[![Kotlin version badge](https://img.shields.io/badge/kotlin-1.1.51-blue.svg)](http://kotlinlang.org/)

This is a sample app to use espresso and others platforms to testing UI.
The app show how to do Integration test with Espresso.

The main screens was written in Kotlin, and the tests was written in Java and Kotlin to see the diferences

### Introduction
In this sample we have to show how we setup and config espresso test framework to record and run instrumentation tests.
Also, we compare with another testing framework. In this case, [Kakao](https://github.com/agoda-com/Kakao/) by Agoda, written in kotlin, that it get a lot of benefits, readability, reusability and this is extensibleDSL.

## Getting started
This repository contains an Android application to do login or signin in a sample app.

This Application is based on four Activities:
* ``LoginActivity`` showing a form with two editext to complete with data.

![login_screen][login_screen]

* ``SignUpActivity`` showing a form with several fields to complete with data.

![signin_screen][signin_screen]

* ``MessageActivity`` showing a success message.

![success_screen][success_screen]

* ``ErrorActivity`` showing a error message.



## Code style

Here you can download and install the java codestyle.
https://github.com/JSBerrocoso/java-code-styles

## Documentation
There are some links which can be useful to finish these tasks:

* [Kata Super Heroes in Kotlin][kataSuperHeroesKotlin]
* [Android Testing Support Library official documentation][androidTestingDocumentation]
* [Espresso Cheat Sheet][espressoCheatSheet]
* [Espresso Idling Resources][espressoIdlingResources]
* [Espresso Custom Matchers][espressoCustomMatchers]
* [Finding UI views][findingUIViews]
* [Espresso Test Toolbar Title][toolbarMatcher]

## Libraries used in this project

* [JUnit](http://junit.org/junit4/)
* [Mockito](http://site.mockito.org/)
* [Espresso](https://developer.android.com/training/testing/espresso/index.html)
* [Android JUnit Runner](https://developer.android.com/reference/android/support/test/runner/AndroidJUnitRunner.html)
* [Android JUnit Rules](https://developer.android.com/training/testing/junit-rules.html)
* [Kotlin stdlib](https://kotlinlang.org/api/latest/jvm/stdlib/index.html)


## License


    Copyright 2017 JSBerrocoso

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.



[login_screen]: ./art/login_screen.png
[signin_screen]: ./art/signin_screen.png
[success_screen]: ./art/success_screen.png
[espresso]: https://google.github.io/android-testing-support-library/docs/
[dagger2]: http://google.github.io/dagger/
[testDoubles]: http://www.martinfowler.com/bliki/TestDouble.html
[androidTestingDocumentation]: https://google.github.io/android-testing-support-library
[espressoCheatSheet]: https://google.github.io/android-testing-support-library/docs/espresso/cheatsheet/index.html
[espressoIdlingResources]: http://dev.jimdo.com/2014/05/09/wait-for-it-a-deep-dive-into-espresso-s-idling-resources/
[espressoCustomMatchers]: http://blog.xebia.com/android-custom-matchers-in-espresso/
[findingUIViews]: http://www.adavis.info/2015/12/testing-tricks-2-finding-ui-views.html?utm_source=Android+Weekly&utm_campaign=9ed0cecaff-Android_Weekly_186&utm_medium=email&utm_term=0_4eb677ad19-9ed0cecaff-337845529
[toolbarMatcher]: http://blog.sqisland.com/2015/05/espresso-match-toolbar-title.html
[daggermock]: https://github.com/fabioCollini/DaggerMock
[kataSuperHeroesKotlin]: https://github.com/Karumi/KataSuperHeroesKotlin

