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


val Iconsax.Filled.TimerPause: ImageVector
    get() {
        if (_TimerPause != null) {
            return _TimerPause!!
        }
        _TimerPause = ImageVector.Builder(
            name = "Filled.TimerPause",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.891f, 3.45f)
                horizontalLineTo(9.111f)
                curveTo(8.711f, 3.45f, 8.391f, 3.13f, 8.391f, 2.73f)
                curveTo(8.391f, 2.33f, 8.711f, 2f, 9.111f, 2f)
                horizontalLineTo(14.891f)
                curveTo(15.291f, 2f, 15.611f, 2.32f, 15.611f, 2.72f)
                curveTo(15.611f, 3.12f, 15.291f, 3.45f, 14.891f, 3.45f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14f, 19.968f)
                verticalLineTo(17.028f)
                curveTo(14f, 15.218f, 15.22f, 13.998f, 17.03f, 13.998f)
                horizontalLineTo(19.97f)
                curveTo(20.2f, 13.998f, 20.42f, 14.018f, 20.63f, 14.058f)
                curveTo(20.65f, 13.818f, 20.67f, 13.578f, 20.67f, 13.328f)
                curveTo(20.67f, 8.538f, 16.78f, 4.648f, 12f, 4.648f)
                curveTo(7.22f, 4.648f, 3.33f, 8.538f, 3.33f, 13.328f)
                curveTo(3.33f, 18.108f, 7.22f, 21.998f, 12f, 21.998f)
                curveTo(12.85f, 21.998f, 13.66f, 21.858f, 14.44f, 21.638f)
                curveTo(14.16f, 21.168f, 14f, 20.608f, 14f, 19.968f)
                close()
                moveTo(12.75f, 12.998f)
                curveTo(12.75f, 13.408f, 12.41f, 13.748f, 12f, 13.748f)
                curveTo(11.59f, 13.748f, 11.25f, 13.408f, 11.25f, 12.998f)
                verticalLineTo(7.998f)
                curveTo(11.25f, 7.588f, 11.59f, 7.248f, 12f, 7.248f)
                curveTo(12.41f, 7.248f, 12.75f, 7.588f, 12.75f, 7.998f)
                verticalLineTo(12.998f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.97f, 15f)
                horizontalLineTo(17.04f)
                curveTo(15.76f, 15f, 15f, 15.76f, 15f, 17.03f)
                verticalLineTo(19.97f)
                curveTo(15f, 21.24f, 15.76f, 22f, 17.04f, 22f)
                horizontalLineTo(19.97f)
                curveTo(21.24f, 22f, 22f, 21.24f, 22f, 19.97f)
                verticalLineTo(17.03f)
                curveTo(22f, 15.76f, 21.24f, 15f, 19.97f, 15f)
                close()
                moveTo(17.92f, 20.06f)
                curveTo(17.92f, 20.38f, 17.66f, 20.64f, 17.33f, 20.64f)
                curveTo(17.01f, 20.64f, 16.75f, 20.38f, 16.75f, 20.06f)
                verticalLineTo(16.94f)
                curveTo(16.75f, 16.62f, 17.01f, 16.36f, 17.33f, 16.36f)
                curveTo(17.66f, 16.36f, 17.92f, 16.62f, 17.92f, 16.94f)
                verticalLineTo(20.06f)
                close()
                moveTo(20.25f, 20.06f)
                curveTo(20.25f, 20.38f, 19.99f, 20.64f, 19.67f, 20.64f)
                curveTo(19.35f, 20.64f, 19.08f, 20.38f, 19.08f, 20.06f)
                verticalLineTo(16.94f)
                curveTo(19.08f, 16.62f, 19.35f, 16.36f, 19.67f, 16.36f)
                curveTo(19.99f, 16.36f, 20.25f, 16.62f, 20.25f, 16.94f)
                verticalLineTo(20.06f)
                close()
            }
        }.build()

        return _TimerPause!!
    }

@Suppress("ObjectPropertyName")
private var _TimerPause: ImageVector? = null
