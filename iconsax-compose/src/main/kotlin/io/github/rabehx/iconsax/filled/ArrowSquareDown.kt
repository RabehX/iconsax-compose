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

val Iconsax.Filled.ArrowSquareDown: ImageVector
    get() {
        if (_ArrowSquareDown != null) {
            return _ArrowSquareDown!!
        }
        _ArrowSquareDown = ImageVector.Builder(
            name = "Filled.ArrowSquareDown",
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
                moveTo(16.06f, 11.17f)
                lineTo(12.53f, 14.7f)
                curveTo(12.38f, 14.85f, 12.19f, 14.92f, 12f, 14.92f)
                curveTo(11.81f, 14.92f, 11.62f, 14.85f, 11.47f, 14.7f)
                lineTo(7.94f, 11.17f)
                curveTo(7.65f, 10.88f, 7.65f, 10.4f, 7.94f, 10.11f)
                curveTo(8.23f, 9.82f, 8.71f, 9.82f, 9f, 10.11f)
                lineTo(12f, 13.11f)
                lineTo(15f, 10.11f)
                curveTo(15.29f, 9.82f, 15.77f, 9.82f, 16.06f, 10.11f)
                curveTo(16.35f, 10.4f, 16.35f, 10.87f, 16.06f, 11.17f)
                close()
            }
        }.build()

        return _ArrowSquareDown!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowSquareDown: ImageVector? = null
