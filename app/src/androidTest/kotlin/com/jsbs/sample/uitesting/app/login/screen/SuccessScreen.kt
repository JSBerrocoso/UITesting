/*
 * Copyright 2017 JSBerrocoso
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.jsbs.sample.uitesting.app.login.screen

import com.agoda.kakao.KTextView
import com.agoda.kakao.Screen
import com.jsbs.sample.uitesting.app.R.id

class SuccessScreen : Screen<SuccessScreen>() {

  val title = KTextView {
    withId(id.title_success_screen)
  }

}