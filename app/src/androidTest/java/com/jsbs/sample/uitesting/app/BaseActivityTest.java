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

package com.jsbs.sample.uitesting.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

public class BaseActivityTest {

  protected static Matcher<View> childAtPosition(final Matcher<View> parentMatcher,
      final int position) {

    return new TypeSafeMatcher<View>() {
      @Override public void describeTo(Description description) {
        description.appendText("Child at position " + position + " in parent ");
        parentMatcher.describeTo(description);
      }

      @Override public boolean matchesSafely(View view) {
        ViewParent parent = view.getParent();
        return parent instanceof ViewGroup && parentMatcher.matches(parent) && view.equals(
            ((ViewGroup) parent).getChildAt(position));
      }
    };
  }
}
