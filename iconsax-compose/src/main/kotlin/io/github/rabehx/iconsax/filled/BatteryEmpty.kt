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


val Iconsax.Filled.BatteryEmpty: ImageVector
    get() {
        if (_BatteryEmpty != null) {
            return _BatteryEmpty!!
        }
        _BatteryEmpty = ImageVector.Builder(
            name = "Filled.BatteryEmpty",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.419f, 9f)
                curveTo(20.279f, 8.99f, 20.099f, 8.98f, 19.899f, 8.98f)
                curveTo(19.509f, 8.98f, 19.199f, 9.29f, 19.199f, 9.68f)
                verticalLineTo(14.33f)
                curveTo(19.199f, 14.72f, 19.509f, 15.031f, 19.899f, 15.031f)
                curveTo(20.099f, 15.031f, 20.269f, 15.021f, 20.439f, 15.01f)
                curveTo(21.999f, 14.83f, 21.999f, 13.731f, 21.999f, 12.931f)
                verticalLineTo(11.071f)
                curveTo(21.999f, 10.271f, 21.999f, 9.17f, 20.419f, 9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.93f, 4.789f)
                horizontalLineTo(7.35f)
                curveTo(3.25f, 4.789f, 2f, 6.039f, 2f, 10.139f)
                verticalLineTo(13.859f)
                curveTo(2f, 17.959f, 3.25f, 19.209f, 7.35f, 19.209f)
                horizontalLineTo(12.93f)
                curveTo(17.03f, 19.209f, 18.28f, 17.959f, 18.28f, 13.859f)
                verticalLineTo(10.139f)
                curveTo(18.28f, 6.039f, 17.03f, 4.789f, 12.93f, 4.789f)
                close()
                moveTo(7.1f, 14.179f)
                curveTo(7.02f, 14.519f, 6.71f, 14.749f, 6.37f, 14.749f)
                curveTo(6.31f, 14.749f, 6.25f, 14.739f, 6.19f, 14.729f)
                curveTo(5.79f, 14.629f, 5.54f, 14.219f, 5.64f, 13.819f)
                curveTo(5.94f, 12.629f, 5.94f, 11.369f, 5.64f, 10.179f)
                curveTo(5.54f, 9.779f, 5.78f, 9.369f, 6.19f, 9.269f)
                curveTo(6.59f, 9.169f, 7f, 9.419f, 7.1f, 9.819f)
                curveTo(7.46f, 11.249f, 7.46f, 12.749f, 7.1f, 14.179f)
                close()
            }
        }.build()

        return _BatteryEmpty!!
    }

@Suppress("ObjectPropertyName")
private var _BatteryEmpty: ImageVector? = null
