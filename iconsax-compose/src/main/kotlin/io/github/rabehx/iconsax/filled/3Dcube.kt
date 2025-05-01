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

val Iconsax.Filled.ThreeDcube: ImageVector
    get() {
        if (_3Dcube != null) {
            return _3Dcube!!
        }
        _3Dcube = ImageVector.Builder(
            name = "Filled.3Dcube",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.33f, 5.681f)
                lineTo(13.06f, 2.301f)
                curveTo(12.4f, 1.941f, 11.6f, 1.941f, 10.94f, 2.301f)
                lineTo(4.67f, 5.681f)
                curveTo(4.21f, 5.931f, 3.93f, 6.411f, 3.93f, 6.961f)
                curveTo(3.93f, 7.501f, 4.21f, 7.991f, 4.67f, 8.241f)
                lineTo(10.94f, 11.621f)
                curveTo(11.27f, 11.801f, 11.64f, 11.891f, 12f, 11.891f)
                curveTo(12.36f, 11.891f, 12.73f, 11.801f, 13.06f, 11.621f)
                lineTo(19.33f, 8.241f)
                curveTo(19.79f, 7.991f, 20.07f, 7.511f, 20.07f, 6.961f)
                curveTo(20.07f, 6.411f, 19.79f, 5.931f, 19.33f, 5.681f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.91f, 12.79f)
                lineTo(4.07f, 9.87f)
                curveTo(3.62f, 9.65f, 3.1f, 9.67f, 2.68f, 9.93f)
                curveTo(2.25f, 10.2f, 2f, 10.65f, 2f, 11.15f)
                verticalLineTo(16.66f)
                curveTo(2f, 17.61f, 2.53f, 18.47f, 3.38f, 18.9f)
                lineTo(9.21f, 21.82f)
                curveTo(9.41f, 21.92f, 9.63f, 21.97f, 9.85f, 21.97f)
                curveTo(10.11f, 21.97f, 10.37f, 21.9f, 10.6f, 21.76f)
                curveTo(11.03f, 21.5f, 11.28f, 21.04f, 11.28f, 20.54f)
                verticalLineTo(15.03f)
                curveTo(11.29f, 14.07f, 10.76f, 13.21f, 9.91f, 12.79f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.321f, 9.93f)
                curveTo(20.891f, 9.67f, 20.371f, 9.64f, 19.931f, 9.87f)
                lineTo(14.101f, 12.79f)
                curveTo(13.251f, 13.22f, 12.721f, 14.07f, 12.721f, 15.03f)
                verticalLineTo(20.54f)
                curveTo(12.721f, 21.04f, 12.971f, 21.5f, 13.401f, 21.76f)
                curveTo(13.631f, 21.9f, 13.891f, 21.97f, 14.151f, 21.97f)
                curveTo(14.371f, 21.97f, 14.591f, 21.92f, 14.791f, 21.82f)
                lineTo(20.621f, 18.9f)
                curveTo(21.471f, 18.47f, 22.001f, 17.62f, 22.001f, 16.66f)
                verticalLineTo(11.15f)
                curveTo(22.001f, 10.65f, 21.751f, 10.2f, 21.321f, 9.93f)
                close()
            }
        }.build()

        return _3Dcube!!
    }

@Suppress("ObjectPropertyName")
private var _3Dcube: ImageVector? = null
