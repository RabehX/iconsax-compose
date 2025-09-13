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


val Iconsax.Filled.Crown1: ImageVector
    get() {
        if (_Crown1 != null) {
            return _Crown1!!
        }
        _Crown1 = ImageVector.Builder(
            name = "Filled.Crown1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 5.71f)
                verticalLineTo(15.29f)
                curveTo(22f, 18.049f, 19.76f, 20.289f, 17f, 20.289f)
                horizontalLineTo(7f)
                curveTo(6.54f, 20.289f, 6.1f, 20.229f, 5.67f, 20.11f)
                curveTo(5.05f, 19.94f, 4.85f, 19.149f, 5.31f, 18.69f)
                lineTo(15.94f, 8.06f)
                curveTo(16.16f, 7.84f, 16.49f, 7.79f, 16.8f, 7.85f)
                curveTo(17.12f, 7.91f, 17.47f, 7.82f, 17.72f, 7.58f)
                lineTo(20.29f, 5f)
                curveTo(21.23f, 4.06f, 22f, 4.37f, 22f, 5.71f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.64f, 7.36f)
                lineTo(4.17f, 17.83f)
                curveTo(3.69f, 18.309f, 2.89f, 18.19f, 2.57f, 17.59f)
                curveTo(2.2f, 16.91f, 2f, 16.119f, 2f, 15.29f)
                verticalLineTo(5.71f)
                curveTo(2f, 4.37f, 2.77f, 4.06f, 3.71f, 5f)
                lineTo(6.29f, 7.59f)
                curveTo(6.68f, 7.97f, 7.32f, 7.97f, 7.71f, 7.59f)
                lineTo(11.29f, 4f)
                curveTo(11.68f, 3.61f, 12.32f, 3.61f, 12.71f, 4f)
                lineTo(14.65f, 5.94f)
                curveTo(15.03f, 6.33f, 15.03f, 6.97f, 14.64f, 7.36f)
                close()
            }
        }.build()

        return _Crown1!!
    }

@Suppress("ObjectPropertyName")
private var _Crown1: ImageVector? = null
