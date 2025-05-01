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

package io.github.rabehx.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax

val Iconsax.Outline.BatteryDisable: ImageVector
    get() {
        if (_BatteryDisable != null) {
            return _BatteryDisable!!
        }
        _BatteryDisable = ImageVector.Builder(
            name = "Outline.BatteryDisable",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.5f, 15.25f)
                curveTo(20.09f, 15.25f, 19.75f, 14.91f, 19.75f, 14.5f)
                curveTo(19.75f, 14.09f, 20.09f, 13.75f, 20.5f, 13.75f)
                curveTo(21.09f, 13.75f, 21.22f, 13.66f, 21.23f, 13.66f)
                curveTo(21.25f, 13.6f, 21.25f, 13.25f, 21.25f, 13f)
                verticalLineTo(11f)
                curveTo(21.25f, 10.75f, 21.25f, 10.41f, 21.21f, 10.32f)
                curveTo(21.2f, 10.33f, 21.05f, 10.25f, 20.5f, 10.25f)
                curveTo(20.09f, 10.25f, 19.75f, 9.91f, 19.75f, 9.5f)
                curveTo(19.75f, 9.09f, 20.09f, 8.75f, 20.5f, 8.75f)
                curveTo(22.58f, 8.75f, 22.75f, 9.77f, 22.75f, 11f)
                verticalLineTo(13f)
                curveTo(22.75f, 14.23f, 22.58f, 15.25f, 20.5f, 15.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4.001f, 22.25f)
                curveTo(3.861f, 22.25f, 3.721f, 22.21f, 3.601f, 22.13f)
                curveTo(3.251f, 21.91f, 3.141f, 21.45f, 3.371f, 21.1f)
                lineTo(15.371f, 2.1f)
                curveTo(15.591f, 1.75f, 16.061f, 1.65f, 16.401f, 1.87f)
                curveTo(16.751f, 2.09f, 16.861f, 2.55f, 16.631f, 2.9f)
                lineTo(4.631f, 21.9f)
                curveTo(4.491f, 22.13f, 4.251f, 22.25f, 4.001f, 22.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.39f, 19.67f)
                curveTo(5.36f, 19.67f, 5.33f, 19.67f, 5.31f, 19.67f)
                curveTo(1.91f, 19.29f, 1.25f, 17.31f, 1.25f, 14f)
                verticalLineTo(10f)
                curveTo(1.25f, 5.59f, 2.59f, 4.25f, 7f, 4.25f)
                curveTo(7.41f, 4.25f, 7.75f, 4.59f, 7.75f, 5f)
                curveTo(7.75f, 5.41f, 7.41f, 5.75f, 7f, 5.75f)
                curveTo(3.43f, 5.75f, 2.75f, 6.43f, 2.75f, 10f)
                verticalLineTo(14f)
                curveTo(2.75f, 17.32f, 3.43f, 17.95f, 5.47f, 18.18f)
                curveTo(5.88f, 18.23f, 6.18f, 18.6f, 6.13f, 19.01f)
                curveTo(6.09f, 19.39f, 5.76f, 19.67f, 5.39f, 19.67f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13f, 19.75f)
                curveTo(12.59f, 19.75f, 12.25f, 19.41f, 12.25f, 19f)
                curveTo(12.25f, 18.59f, 12.59f, 18.25f, 13f, 18.25f)
                curveTo(16.57f, 18.25f, 17.25f, 17.57f, 17.25f, 14f)
                verticalLineTo(10f)
                curveTo(17.25f, 6.69f, 16.57f, 6.05f, 14.54f, 5.82f)
                curveTo(14.13f, 5.77f, 13.83f, 5.4f, 13.88f, 4.99f)
                curveTo(13.93f, 4.58f, 14.29f, 4.27f, 14.71f, 4.33f)
                curveTo(18.09f, 4.71f, 18.75f, 6.7f, 18.75f, 10f)
                verticalLineTo(14f)
                curveTo(18.75f, 18.41f, 17.41f, 19.75f, 13f, 19.75f)
                close()
            }
        }.build()

        return _BatteryDisable!!
    }

@Suppress("ObjectPropertyName")
private var _BatteryDisable: ImageVector? = null
