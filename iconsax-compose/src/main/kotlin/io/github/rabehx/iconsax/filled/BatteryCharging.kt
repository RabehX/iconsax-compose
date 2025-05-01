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


val Iconsax.Filled.BatteryCharging: ImageVector
    get() {
        if (_BatteryCharging != null) {
            return _BatteryCharging!!
        }
        _BatteryCharging = ImageVector.Builder(
            name = "Filled.BatteryCharging",
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
                moveTo(12.53f, 13.679f)
                curveTo(12.51f, 13.719f, 12.48f, 13.759f, 12.45f, 13.789f)
                lineTo(10.58f, 15.979f)
                curveTo(10.43f, 16.149f, 10.22f, 16.239f, 10.01f, 16.239f)
                curveTo(9.84f, 16.239f, 9.66f, 16.179f, 9.52f, 16.059f)
                curveTo(9.21f, 15.789f, 9.17f, 15.319f, 9.44f, 14.999f)
                lineTo(11.24f, 12.889f)
                curveTo(11.25f, 12.859f, 11.24f, 12.829f, 11.22f, 12.799f)
                curveTo(11.2f, 12.759f, 11.16f, 12.739f, 11.11f, 12.739f)
                horizontalLineTo(9.12f)
                curveTo(8.53f, 12.739f, 8.01f, 12.439f, 7.71f, 11.929f)
                curveTo(7.42f, 11.419f, 7.42f, 10.819f, 7.71f, 10.309f)
                lineTo(9.42f, 8.049f)
                curveTo(9.67f, 7.719f, 10.14f, 7.649f, 10.47f, 7.899f)
                curveTo(10.8f, 8.149f, 10.87f, 8.619f, 10.62f, 8.949f)
                lineTo(8.97f, 11.139f)
                curveTo(9f, 11.099f, 9f, 11.139f, 9.02f, 11.189f)
                curveTo(9.04f, 11.229f, 9.08f, 11.249f, 9.13f, 11.249f)
                horizontalLineTo(11.14f)
                curveTo(11.73f, 11.249f, 12.25f, 11.549f, 12.55f, 12.059f)
                curveTo(12.82f, 12.569f, 12.82f, 13.169f, 12.53f, 13.679f)
                close()
            }
        }.build()

        return _BatteryCharging!!
    }

@Suppress("ObjectPropertyName")
private var _BatteryCharging: ImageVector? = null
