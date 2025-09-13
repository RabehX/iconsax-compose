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


val Iconsax.Filled.Brush: ImageVector
    get() {
        if (_Brush != null) {
            return _Brush!!
        }
        _Brush = ImageVector.Builder(
            name = "Filled.Brush",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6f, 2f)
                horizontalLineTo(18f)
                curveTo(19.1f, 2f, 20f, 2.9f, 20f, 4f)
                verticalLineTo(7.32f)
                curveTo(20f, 7.87f, 19.55f, 8.32f, 19f, 8.32f)
                horizontalLineTo(5f)
                curveTo(4.45f, 8.32f, 4f, 7.87f, 4f, 7.32f)
                verticalLineTo(4f)
                curveTo(4f, 2.9f, 4.9f, 2f, 6f, 2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4f, 10.32f)
                verticalLineTo(11.88f)
                curveTo(4f, 12.96f, 4.58f, 13.96f, 5.53f, 14.49f)
                lineTo(8.49f, 16.16f)
                curveTo(9.12f, 16.51f, 9.51f, 17.18f, 9.51f, 17.9f)
                verticalLineTo(20f)
                curveTo(9.51f, 21.1f, 10.41f, 22f, 11.51f, 22f)
                horizontalLineTo(12.51f)
                curveTo(13.61f, 22f, 14.51f, 21.1f, 14.51f, 20f)
                verticalLineTo(17.9f)
                curveTo(14.51f, 17.18f, 14.9f, 16.51f, 15.53f, 16.16f)
                lineTo(18.49f, 14.49f)
                curveTo(19.43f, 13.96f, 20.02f, 12.96f, 20.02f, 11.88f)
                verticalLineTo(10.32f)
                curveTo(20.02f, 9.77f, 19.57f, 9.32f, 19.02f, 9.32f)
                horizontalLineTo(5f)
                curveTo(4.45f, 9.32f, 4f, 9.76f, 4f, 10.32f)
                close()
            }
        }.build()

        return _Brush!!
    }

@Suppress("ObjectPropertyName")
private var _Brush: ImageVector? = null
