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


val Iconsax.Filled.BatteryDisable: ImageVector
    get() {
        if (_BatteryDisable != null) {
            return _BatteryDisable!!
        }
        _BatteryDisable = ImageVector.Builder(
            name = "Filled.BatteryDisable",
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
                moveTo(18.279f, 10.141f)
                verticalLineTo(13.861f)
                curveTo(18.279f, 16.81f, 15.879f, 19.211f, 12.929f, 19.211f)
                horizontalLineTo(9.259f)
                curveTo(8.469f, 19.211f, 7.989f, 18.34f, 8.409f, 17.681f)
                lineTo(15.669f, 6.201f)
                curveTo(16.029f, 5.63f, 16.839f, 5.581f, 17.289f, 6.09f)
                curveTo(18.009f, 6.92f, 18.279f, 8.21f, 18.279f, 10.141f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.4f, 1.87f)
                curveTo(16.05f, 1.65f, 15.59f, 1.75f, 15.37f, 2.1f)
                lineTo(13.66f, 4.81f)
                curveTo(13.43f, 4.8f, 13.19f, 4.79f, 12.93f, 4.79f)
                horizontalLineTo(7.35f)
                curveTo(3.25f, 4.79f, 2f, 6.04f, 2f, 10.14f)
                verticalLineTo(13.86f)
                curveTo(2f, 16.91f, 2.7f, 18.37f, 4.74f, 18.92f)
                lineTo(3.37f, 21.1f)
                curveTo(3.15f, 21.45f, 3.25f, 21.91f, 3.6f, 22.13f)
                curveTo(3.72f, 22.21f, 3.86f, 22.25f, 4f, 22.25f)
                curveTo(4.25f, 22.25f, 4.49f, 22.13f, 4.63f, 21.9f)
                lineTo(16.63f, 2.9f)
                curveTo(16.86f, 2.55f, 16.75f, 2.09f, 16.4f, 1.87f)
                close()
            }
        }.build()

        return _BatteryDisable!!
    }

@Suppress("ObjectPropertyName")
private var _BatteryDisable: ImageVector? = null
