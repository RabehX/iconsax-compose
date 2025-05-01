/*
 *
 *  * Copyright (c) 2025, Рабeх Аззам
 *  *
 *  * This file is part of Iconsax Compose.
 *  *
 *  * Iconsax Compose is free software: you can redistribute it and/or modify
 *  * it under the terms of the GNU General Public License as published by
 *  * the Free Software Foundation, either version 3 of the License, or
 *  * (at your option) any later version.
 *  *
 *  * Iconsax Compose is distributed in the hope that it will be useful,
 *  * but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  * GNU General Public License for more details.
 *  *
 *  * You should have received a copy of the GNU General Public License
 *  * along with Iconsax Compose. If not, see <https://www.gnu.org/licenses/>.
 *
 */

package io.github.rabehx.iconsax.filled


import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax


val Iconsax.Filled.Layer: ImageVector
    get() {
        if (_Layer != null) {
            return _Layer!!
        }
        _Layer = ImageVector.Builder(
            name = "Filled.Layer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.37f, 4.891f)
                lineTo(13.51f, 2.281f)
                curveTo(12.65f, 1.901f, 11.35f, 1.901f, 10.49f, 2.281f)
                lineTo(4.63f, 4.891f)
                curveTo(3.15f, 5.551f, 2.93f, 6.451f, 2.93f, 6.931f)
                curveTo(2.93f, 7.411f, 3.15f, 8.311f, 4.63f, 8.971f)
                lineTo(10.49f, 11.581f)
                curveTo(10.92f, 11.771f, 11.46f, 11.871f, 12f, 11.871f)
                curveTo(12.54f, 11.871f, 13.08f, 11.771f, 13.51f, 11.581f)
                lineTo(19.37f, 8.971f)
                curveTo(20.85f, 8.311f, 21.07f, 7.411f, 21.07f, 6.931f)
                curveTo(21.07f, 6.451f, 20.86f, 5.551f, 19.37f, 4.891f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 17.04f)
                curveTo(11.62f, 17.04f, 11.24f, 16.96f, 10.89f, 16.81f)
                lineTo(4.15f, 13.81f)
                curveTo(3.12f, 13.35f, 2.32f, 12.12f, 2.32f, 10.99f)
                curveTo(2.32f, 10.58f, 2.65f, 10.25f, 3.06f, 10.25f)
                curveTo(3.47f, 10.25f, 3.8f, 10.58f, 3.8f, 10.99f)
                curveTo(3.8f, 11.53f, 4.25f, 12.23f, 4.75f, 12.45f)
                lineTo(11.49f, 15.45f)
                curveTo(11.81f, 15.59f, 12.18f, 15.59f, 12.5f, 15.45f)
                lineTo(19.24f, 12.45f)
                curveTo(19.74f, 12.23f, 20.19f, 11.54f, 20.19f, 10.99f)
                curveTo(20.19f, 10.58f, 20.52f, 10.25f, 20.93f, 10.25f)
                curveTo(21.34f, 10.25f, 21.67f, 10.58f, 21.67f, 10.99f)
                curveTo(21.67f, 12.11f, 20.87f, 13.35f, 19.84f, 13.81f)
                lineTo(13.1f, 16.81f)
                curveTo(12.76f, 16.96f, 12.38f, 17.04f, 12f, 17.04f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.001f)
                curveTo(11.62f, 22.001f, 11.24f, 21.921f, 10.89f, 21.771f)
                lineTo(4.15f, 18.771f)
                curveTo(3.04f, 18.281f, 2.32f, 17.171f, 2.32f, 15.951f)
                curveTo(2.32f, 15.541f, 2.65f, 15.211f, 3.06f, 15.211f)
                curveTo(3.47f, 15.211f, 3.8f, 15.541f, 3.8f, 15.951f)
                curveTo(3.8f, 16.581f, 4.17f, 17.151f, 4.75f, 17.411f)
                lineTo(11.49f, 20.411f)
                curveTo(11.81f, 20.551f, 12.18f, 20.551f, 12.5f, 20.411f)
                lineTo(19.24f, 17.411f)
                curveTo(19.81f, 17.161f, 20.19f, 16.581f, 20.19f, 15.951f)
                curveTo(20.19f, 15.541f, 20.52f, 15.211f, 20.93f, 15.211f)
                curveTo(21.34f, 15.211f, 21.67f, 15.541f, 21.67f, 15.951f)
                curveTo(21.67f, 17.171f, 20.95f, 18.271f, 19.84f, 18.771f)
                lineTo(13.1f, 21.771f)
                curveTo(12.76f, 21.921f, 12.38f, 22.001f, 12f, 22.001f)
                close()
            }
        }.build()

        return _Layer!!
    }

@Suppress("ObjectPropertyName")
private var _Layer: ImageVector? = null
