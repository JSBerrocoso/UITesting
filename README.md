# UITesting
[![Kotlin version badge](https://img.shields.io/badge/kotlin-1.1.51-blue.svg)](http://kotlinlang.org/)
[![Build Status](https://travis-ci.org/JSBerrocoso/UITesting.svg?branch=master)](https://travis-ci.org/JSBerrocoso/UITesting)
[![CircleCI](https://circleci.com/gh/JSBerrocoso/UITesting/tree/develop.svg?style=svg)](https://circleci.com/gh/JSBerrocoso/UITesting)
[![GitHub license](https://img.shields.io/badge/license-Apache%20License%202.0-blue.svg?style=flat)](http://www.apache.org/licenses/LICENSE-2.0)

This sample app is based on Espresso and others UI testing frameworks.
The app shows how to do Integration test with Espresso, in Java, in Kotlin, and other testing Kotlin libs.

Main activities were code in Kotlin. 
As tests are code in Java, and in Kotlin, we can easily see differences between both languages.

### Introduction
In this sample we have different "feature branches", showing, how we'd set up and "config" espresso test framework, as well as how to record and run instrumentation tests.

Aditionaly, we will compare this test with another testing frameworks. For example, [Kakao][kakaoRepo] testing library, created by Agoda, in Kotlin, that brings a lot of benefits, as readability, reusability and is extensibleDSL.

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

## Presentations

* [SpeakerDeck][presentationSpeackDeck]

## Video
* [Video][videoYoutube]

## Branches
In this branches, we show how setting up espresso dependencies, record with espresso recorder, create test in kotlin and show diferents with Kakao lib. 
* [feature/settings-espresso][branchSettingUpEspresso]
we show how setting up espresso dependencies.
* [feature/record-espresso-tests][branchRecordEspressoTest] we show how record with espresso recorder.
* [feature/testing-with-espresso-kotlin][TestingWithEspressoinKotlin] We show how create UI Test in Kotlin.
* [feature/testing-with-kakao][TestingWithKakao] We show how create UI Test with [Kakao][kakaoRepo] lib.
* [feature/testing-with-espresso-kotlin-pageobject][TestingWithEspressoinKotlinPageObject] We show how create with Page Object Pattern UI tests in Kotlin.
* [feature/testing-with-espresso-kotlin-idle-resources][TestingWithEspressoinKotlinIdleResources] We show how create with UI tests in Kotlin, and idle resources.


## Libraries used in this project

* [JUnit](http://junit.org/junit4/)
* [Mockito](http://site.mockito.org/)
* [Espresso](https://developer.android.com/training/testing/espresso/index.html)
* [Android JUnit Runner](https://developer.android.com/reference/android/support/test/runner/AndroidJUnitRunner.html)
* [Android JUnit Rules](https://developer.android.com/training/testing/junit-rules.html)
* [Kotlin stdlib](https://kotlinlang.org/api/latest/jvm/stdlib/index.html)
* [Kakao][kakaoRepo]


## Code style
Here you can download and install the java codestyle.
https://github.com/JSBerrocoso/java-code-styles

## Documentation
There are some links which can be useful:

* [Android Testing Support Library official documentation][androidTestingDocumentation]
* [Espresso Cheat Sheet][espressoCheatSheet]
* [Espresso Idling Resources][espressoIdlingResources]
* [Testing codelab][testingCodeLab]
* [Testing with Kotlin][testingWithKotlin]
* [Kakao - how to make UI testing great again][kakaoHowtoMakeUITesting]
* [Espresso Custom Matchers][espressoCustomMatchers]
* [Finding UI views][findingUIViews]
* [Kata Super Heroes in Kotlin][kataSuperHeroesKotlin]
* [AdapterViews and Espresso][adaptersViewsAndEspresso]
* [Kata Super Heroes in Kotlin][kataSuperHeroesKotlin]
* [AdapterViews and Espresso][adaptersViewsAndEspresso]
* [CleanGUITestArchitecture][CleanGUITestArchitectureRepo]

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
[testingCodeLab]: https://goo.gl/h5cnMW
[testingWithKotlin]: https://goo.gl/UzQSif
[kakaoHowtoMakeUITesting]: https://goo.gl/bW9Ehi
[adaptersViewsAndEspresso]: https://goo.gl/6Hb2ym
[CleanGUITestArchitectureRepo]: https://github.com/sebaslogen/CleanGUITestArchitecture
[kakaoRepo]: https://github.com/agoda-com/Kakao

[branchSettingUpEspresso]: https://github.com/JSBerrocoso/UITesting/tree/feature/settings-espresso
[branchRecordEspressoTest]: https://github.com/JSBerrocoso/UITesting/tree/feature/record-espresso-tests
[TestingWithEspressoinKotlinIdleResources]: https://github.com/JSBerrocoso/UITesting/tree/feature/testing-with-espresso-kotlin-idle-resources
[TestingWithEspressoinKotlin]: https://github.com/JSBerrocoso/UITesting/tree/feature/testing-with-espresso-kotlin
[TestingWithKakao]: https://github.com/JSBerrocoso/UITesting/tree/feature/testing-with-kakao
[TestingWithEspressoinKotlinPageObject]: https://github.com/JSBerrocoso/UITesting/tree/feature/testing-with-espresso-kotlin-pageobject
[presentationSpeackDeck]: https://speakerdeck.com/jsberrocoso/ui-testing-plus-kakao
[videoYoutube]: https://www.youtube.com/watch?v=RlvxtSK_WEU





