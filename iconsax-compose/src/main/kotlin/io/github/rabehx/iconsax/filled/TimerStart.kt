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


val Iconsax.Filled.TimerStart: ImageVector
    get() {
        if (_TimerStart != null) {
            return _TimerStart!!
        }
        _TimerStart = ImageVector.Builder(
            name = "Filled.TimerStart",
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
                moveTo(19.97f, 15f)
                horizontalLineTo(17.03f)
                curveTo(15.76f, 15f, 15f, 15.76f, 15f, 17.03f)
                verticalLineTo(19.97f)
                curveTo(15f, 21.24f, 15.76f, 22f, 17.03f, 22f)
                horizontalLineTo(19.97f)
                curveTo(21.24f, 22f, 22f, 21.24f, 22f, 19.97f)
                verticalLineTo(17.03f)
                curveTo(22f, 15.76f, 21.24f, 15f, 19.97f, 15f)
                close()
                moveTo(19.69f, 19.46f)
                lineTo(18.51f, 20.14f)
                curveTo(18.27f, 20.28f, 18.03f, 20.35f, 17.81f, 20.35f)
                curveTo(17.64f, 20.35f, 17.49f, 20.31f, 17.35f, 20.23f)
                curveTo(17.03f, 20.04f, 16.85f, 19.67f, 16.85f, 19.18f)
                verticalLineTo(17.82f)
                curveTo(16.85f, 17.33f, 17.03f, 16.96f, 17.35f, 16.77f)
                curveTo(17.67f, 16.58f, 18.08f, 16.62f, 18.51f, 16.86f)
                lineTo(19.69f, 17.54f)
                curveTo(20.11f, 17.79f, 20.35f, 18.13f, 20.35f, 18.5f)
                curveTo(20.35f, 18.87f, 20.12f, 19.21f, 19.69f, 19.46f)
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
        }.build()

        return _TimerStart!!
    }

@Suppress("ObjectPropertyName")
private var _TimerStart: ImageVector? = null
