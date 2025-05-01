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

val Iconsax.Filled.ArrowLeft1: ImageVector
    get() {
        if (_ArrowLeft1 != null) {
            return _ArrowLeft1!!
        }
        _ArrowLeft1 = ImageVector.Builder(
            name = "Filled.ArrowLeft1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.19f, 2f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 2f, 2f, 4.17f, 2f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(2f, 19.83f, 4.17f, 22f, 7.81f, 22f)
                horizontalLineTo(16.18f)
                curveTo(19.82f, 22f, 21.99f, 19.83f, 21.99f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22f, 4.17f, 19.83f, 2f, 16.19f, 2f)
                close()
                moveTo(18f, 12.75f)
                horizontalLineTo(7.81f)
                lineTo(10.82f, 15.76f)
                curveTo(11.11f, 16.05f, 11.11f, 16.53f, 10.82f, 16.82f)
                curveTo(10.67f, 16.97f, 10.48f, 17.04f, 10.29f, 17.04f)
                curveTo(10.1f, 17.04f, 9.91f, 16.97f, 9.76f, 16.82f)
                lineTo(5.47f, 12.53f)
                curveTo(5.33f, 12.39f, 5.25f, 12.2f, 5.25f, 12f)
                curveTo(5.25f, 11.8f, 5.33f, 11.61f, 5.47f, 11.47f)
                lineTo(9.76f, 7.18f)
                curveTo(10.05f, 6.89f, 10.53f, 6.89f, 10.82f, 7.18f)
                curveTo(11.11f, 7.47f, 11.11f, 7.95f, 10.82f, 8.24f)
                lineTo(7.81f, 11.25f)
                horizontalLineTo(18f)
                curveTo(18.41f, 11.25f, 18.75f, 11.59f, 18.75f, 12f)
                curveTo(18.75f, 12.41f, 18.41f, 12.75f, 18f, 12.75f)
                close()
            }
        }.build()

        return _ArrowLeft1!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowLeft1: ImageVector? = null
