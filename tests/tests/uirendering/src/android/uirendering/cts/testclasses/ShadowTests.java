/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package android.uirendering.cts.testclasses;

import android.graphics.Color;
import android.graphics.Point;
import android.uirendering.cts.bitmapverifiers.SamplePointVerifier;

import com.android.cts.uirendering.R;

import android.test.suitebuilder.annotation.SmallTest;
import android.uirendering.cts.testinfrastructure.ActivityTestBase;

public class ShadowTests extends ActivityTestBase {
    @SmallTest
    public void testShadowLayout() {
        createTest()
                .addLayout(R.layout.simple_shadow_layout, null, true/* HW only */)
                .runWithVerifier(
                new SamplePointVerifier(
                        new Point[] {
                                // view area
                                new Point(25, 64),
                                new Point(64, 64),
                                // shadow area
                                new Point(25, 65),
                                new Point(64, 65)
                        },
                        new int[] {
                                Color.WHITE,
                                Color.WHITE,
                                Color.rgb(215, 215, 215),
                                Color.rgb(215, 215, 215),
                        }));
    }
}
