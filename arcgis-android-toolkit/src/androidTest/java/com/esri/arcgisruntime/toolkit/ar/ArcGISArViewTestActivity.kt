/*
 * Copyright 2019 Esri
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.esri.arcgisruntime.toolkit.ar

import android.os.Bundle
import androidx.annotation.VisibleForTesting
import androidx.appcompat.app.AppCompatActivity
import com.esri.arcgisruntime.toolkit.ar.ArcGISArView
import com.esri.arcgisruntime.toolkit.test.R

/**
 * Activity used by tests to test [ArcGISArView]. An instance of ArcGISArView is inflated from an XML layout and attached
 * to the Activity.
 *
 * @since 100.6.0
 */
class ArcGISArViewTestActivity : AppCompatActivity() {

    @VisibleForTesting
    var arcGISArView: ArcGISArView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_arcgisarview_test)
        arcGISArView = findViewById(R.id.arcGISArView)
    }
}
